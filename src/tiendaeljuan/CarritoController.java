/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package tiendaeljuan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Brando
 */
public class CarritoController implements Initializable {
    
    @FXML
    private Label lb1, lb2, lb3, lb4, lb5, lb6;
    
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6;
    
    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    
    public void llenar_carrito(){
        int boton = 1;
        for (producto p : PrincipalController.cola1.get_carrito()) {
            if (p.comprador.equals(LoginController.mail_user)){
                switch (boton){
                    case 1:
                        lb1.setText(p.getNombre());
                        btn1.setText("$" + p.getPrecio() + "\nComprar");
                        Image image1 = new Image(p.getFoto());
                        img1.setImage(image1);
                        break;
                    case 2:
                        lb2.setText(p.getNombre());
                        btn2.setText("$" + p.getPrecio() + "\nComprar");
                        Image image2 = new Image(p.getFoto());
                        img2.setImage(image2);
                        break;
                    case 3:
                        lb3.setText(p.getNombre());
                        btn3.setText("$" + p.getPrecio() + "\nComprar");
                        Image image3 = new Image(p.getFoto());
                        img3.setImage(image3);
                        break;
                    case 4:
                        lb4.setText(p.getNombre());
                        btn4.setText("$" + p.getPrecio() + "\nComprar");
                        Image image4 = new Image(p.getFoto());
                        img4.setImage(image4);
                        break;
                    case 5:
                        lb5.setText(p.getNombre());
                        btn5.setText("$" + p.getPrecio() + "\nComprar");
                        Image image5 = new Image(p.getFoto());
                        img5.setImage(image5);
                        break;
                    case 6:
                        lb6.setText(p.getNombre());
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenar_carrito();
        // TODO
    }    
    
}
