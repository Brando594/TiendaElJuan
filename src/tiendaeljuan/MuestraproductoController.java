/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tiendaeljuan;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Brando
 */
public class MuestraproductoController implements Initializable {
    
    @FXML
    private ImageView img;
    
    @FXML
    private Label nom, pre, desc;
    
    @FXML
    private Button btnDes, btnCar, btnCom, btnBack;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnBack)){
            loadStage("/tiendaeljuan/principal.fxml", e);
        }
        if(evt.equals(btnCar)){
            producto p = new producto(PrincipalController.nombre, PrincipalController.imagen, PrincipalController.user_activo, PrincipalController.precio);
            PrincipalController.cola1.agregarProducto(p);
        }
        if(evt.equals(btnDes)){
            producto p = new producto(PrincipalController.nombre, PrincipalController.imagen, PrincipalController.user_activo, PrincipalController.precio);
            PrincipalController.cola2.agregarProducto(p);
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nom.setText(PrincipalController.nombre);
        desc.setText(PrincipalController.descripcion);
        pre.setText("$" + PrincipalController.precio);
        Image ima = new Image(PrincipalController.imagen);
        img.setImage(ima);
        // TODO
    }    
    private void loadStage(String url, Event event){
        
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });
        }catch ( IOException ex){
            Logger.getLogger(MuestraproductoController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
}
