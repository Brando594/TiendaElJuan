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
import javax.swing.JOptionPane;

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
    
    public String url1,url2, url3, url4, url5, url6;
    
    public void llenar_carrito(){
        vaciar_carrito();
        int boton = 1;
        for (producto p : PrincipalController.cola1.get_carrito()) {
            if (p.comprador.equals(LoginController.mail_user)){
                switch (boton){
                    case 1:
                        lb1.setText(p.getNombre());
                        cant1.setText("Cantidad: "+p.getCantidad());
                        btn1.setText("$" + p.getPrecio() + "\nOpciones");
                        url1 = p.getFoto();
                        Image image1 = new Image(p.getFoto());
                        img1.setImage(image1);
                        break;
                    case 2:
                        lb2.setText(p.getNombre());
                        cant2.setText("Cantidad: "+p.getCantidad());
                        btn2.setText("$" + p.getPrecio() + "\nOpciones");
                        url2 = p.getFoto();
                        Image image2 = new Image(p.getFoto());
                        img2.setImage(image2);
                        break;
                    case 3:
                        lb3.setText(p.getNombre());
                        cant3.setText("Cantidad: "+p.getCantidad());
                        btn3.setText("$" + p.getPrecio() + "\nOpciones");
                        url3 = p.getFoto();
                        Image image3 = new Image(p.getFoto());
                        img3.setImage(image3);
                        break;
                    case 4:
                        lb4.setText(p.getNombre());
                        cant4.setText("Cantidad: "+p.getCantidad());
                        btn4.setText("$" + p.getPrecio() + "\nOpciones");
                        url4 = p.getFoto();
                        Image image4 = new Image(p.getFoto());
                        img4.setImage(image4);
                        break;
                    case 5:
                        lb5.setText(p.getNombre());
                        cant5.setText("Cantidad: "+p.getCantidad());
                        btn5.setText("$" + p.getPrecio() + "\nOpciones");
                        url5 = p.getFoto();
                        Image image5 = new Image(p.getFoto());
                        img5.setImage(image5);
                        break;
                    case 6:
                        lb6.setText(p.getNombre());
                        cant6.setText("Cantidad: "+p.getCantidad());
                        btn6.setText("$" + p.getPrecio() + "\nOpciones");
                        url6 = p.getFoto();
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
        if(evt.equals(btn1)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb1.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb1.getText());
                    llenar_carrito();
                    break;
            }
        }
        if(evt.equals(btn2)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb2.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb2.getText());
                    llenar_carrito();
                    break;
            }
        }
        if(evt.equals(btn3)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb3.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb3.getText());
                    llenar_carrito();
                    break;
            }
        }
        if(evt.equals(btn4)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb4.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb4.getText());
                    llenar_carrito();
                    break;
            }
        }
        if(evt.equals(btn5)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb5.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb5.getText());
                    llenar_carrito();
                    break;
            }
        }
        if(evt.equals(btn6)){
            String[] opciones = {"Comprar", "Eliminar"};
            int opc = JOptionPane.showOptionDialog(null, "Que desea hacer con el producto?", "Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc){
                case 0:
                    PrincipalController.cola1.comprar_nombre(lb6.getText());
                    llenar_carrito();
                    break;
                case 1:
                    PrincipalController.cola1.eliminar_nombre(lb6.getText());
                    llenar_carrito();
                    break;
            }
        }
    }
    
    public void vaciar_carrito(){
        lb1.setText("");
        cant1.setText("");
        btn1.setText("");
        img1.setImage(null);
        
        lb2.setText("");
        cant2.setText("");
        btn2.setText("");
        img2.setImage(null);
        
        lb3.setText("");
        cant3.setText("");
        btn3.setText("");
        img3.setImage(null);
        
        lb4.setText("");
        cant4.setText("");
        btn4.setText("");
        img4.setImage(null);
        
        lb5.setText("");
        cant5.setText("");
        btn5.setText("");
        img5.setImage(null);
        
        lb6.setText("");
        cant6.setText("");
        btn6.setText("");
        img6.setImage(null);
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
