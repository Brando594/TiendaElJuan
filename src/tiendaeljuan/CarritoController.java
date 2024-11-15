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
public class CarritoController implements Initializable {
    
    @FXML
    private Label lb1, lb2, lb3, lb4, lb5, lb6,
            cant1, cant2, cant3, cant4, cant5, cant6;
    
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6;
    
    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btnBack;
    
    public void llenar_carrito(){
        int boton = 1;
        for (producto p : PrincipalController.cola1.get_carrito()) {
            if (p.comprador.equals(LoginController.mail_user)){
                switch (boton){
                    case 1:
                        lb1.setText(p.getNombre());
                        cant1.setText("Cantidad: "+p.getCantidad());
                        btn1.setText("$" + p.getPrecio() + "\nComprar");
                        Image image1 = new Image(p.getFoto());
                        img1.setImage(image1);
                        break;
                    case 2:
                        lb2.setText(p.getNombre());
                        cant2.setText("Cantidad: "+p.getCantidad());
                        btn2.setText("$" + p.getPrecio() + "\nComprar");
                        Image image2 = new Image(p.getFoto());
                        img2.setImage(image2);
                        break;
                    case 3:
                        lb3.setText(p.getNombre());
                        cant3.setText("Cantidad: "+p.getCantidad());
                        btn3.setText("$" + p.getPrecio() + "\nComprar");
                        Image image3 = new Image(p.getFoto());
                        img3.setImage(image3);
                        break;
                    case 4:
                        lb4.setText(p.getNombre());
                        cant4.setText("Cantidad: "+p.getCantidad());
                        btn4.setText("$" + p.getPrecio() + "\nComprar");
                        Image image4 = new Image(p.getFoto());
                        img4.setImage(image4);
                        break;
                    case 5:
                        lb5.setText(p.getNombre());
                        cant5.setText("Cantidad: "+p.getCantidad());
                        btn5.setText("$" + p.getPrecio() + "\nComprar");
                        Image image5 = new Image(p.getFoto());
                        img5.setImage(image5);
                        break;
                    case 6:
                        lb6.setText(p.getNombre());
                        cant6.setText("Cantidad: "+p.getCantidad());
                        btn6.setText("$" + p.getPrecio() + "\nComprar");
                        Image image6 = new Image(p.getFoto());
                        img6.setImage(image6);
                        break;
                }
                boton++;
                if (boton > 6) break;
            }
        }
    }
    public void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnBack)){
            loadStage("/tiendaeljuan/principal.fxml", e);
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenar_carrito();
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
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
}
