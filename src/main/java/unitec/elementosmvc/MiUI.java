
package unitec.elementosmvc;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.tags.form.ButtonTag;

@SpringUI
public class MiUI extends UI{
    //ponemos como atributo el repo
    @Autowired RepositorioMensaje repoMensa;

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        Label etiqueta=new Label("Bienvenidirijillo");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);
        
        TextField texto = new TextField();
        texto.setPlaceholder("Cuerpo del mensaje");
        Button boton = new Button("Guardar Mensaje");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        
        //manejamos el evento de tipo button
        boton.addClickListener(algo->{
             String cuerpo = texto.getValue();
             //guardamos
             repoMensa.save(new Mensaje (cuerpo));
             //Le cominicamos al usuario con un mensaje
             Notification.show("Mensaje Guardado",Notification.Type.ERROR_MESSAGE);
        });
        
        //caso 2 :Buscar todos
        
        Grid<Mensaje> grid = new Grid<>();
        grid.setItems(repoMensa.findAll());

grid.addColumn(Mensaje::getId).setCaption("ID");
grid.addColumn(Mensaje::getCuerpo).setCaption("Cuerpo");
/*grid.addColumn("ID");
grid.addColumn("Cuerpo");*/
        
        
        
        layout.addComponent(etiqueta);
        layout.addComponent(texto);
        layout.addComponent(boton);
        //Agregamos nuestra componente  a nuesto layout
        layout.addComponent(grid);
        
        setContent(layout);
        
        
         
        
        
        
    }
    
}
