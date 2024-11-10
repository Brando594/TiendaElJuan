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
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Brando
 */
public class PrincipalController implements Initializable {
    
    public static carritoCola cola1 = new carritoCola();
    public static deseosCola cola2 = new deseosCola();
    public static String user_activo; 
    
    @FXML
    private Button deseos, carrito, historial, btnP1, btnP2, btnP3, btnP4,btnP5, btnP6, btnBack;
    
    public static String nombre, descripcion, imagen;
    public static float precio;
    
    public void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(deseos)){
            loadStage("/tiendaeljuan/deseos.fxml", e);
        }
        if(evt.equals(carrito)){
            loadStage("/tiendaeljuan/carrito.fxml", e);
        }
        if(evt.equals(historial)){
            loadStage("/tiendaeljuan/historial.fxml", e);
        }
        if(evt.equals(btnP1)){
            nombre = "Apple IPhone 16 Pro (128 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 8 GB\n" +
                            "Diseñado para Apple Intelligence\n" +
                            "Potencia al extremo\n" +
                            "Un estudio de grabación en tu bolsillo\n" +
                            "Control de la cámara. Un dedo para dominarlo todo\n" +
                            "Resistente. Imponente. Titanio";
            imagen = "tiendaeljuan/images/iphone16pro.jpg";
            precio = 5299900;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnP2)){
            nombre = "Apple IPhone 12 Pro (256 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 4 GB\n" +
                            "Pantalla Super Retina XDR de 6.1 pulgadas. (1)\n" +
                            "Ceramic Shield, más resistente que cualquier vidrio de smartphone.\n" +
                            "Chip A14 Bionic, el más rápido en un smartphone.\n" +
                            "Sistema avanzado de dos cámaras de 12 MP (ultra gran angular y gran angular), modo Noche, Deep Fusion, HDR Inteligente 3 y grabación de video 4K HDR en Dolby Vision.\n" +
                            "Cámara frontal TrueDepth de 12 MP con modo Noche y grabación de video 4K HDR en Dolby Vision.\n" +
                            "Resistencia al agua IP68, la mejor de la industria. (4)\n" +
                            "Compatibilidad con accesorios MagSafe, que se acoplan fácilmente a tu iPhone y permiten una carga inalámbrica más rápida. (3)\n" +
                            "iOS 14 con widgets rediseñados en la pantalla de inicio, nueva Biblioteca de Apps, App Clips, y mucho más.";
            imagen = "tiendaeljuan/images/iphone12pro.jpg";
            precio = 4299000;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnP3)){
            nombre = "Apple IPhone 13 Pro (256 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 8 GB\n" +
                            "Diseñado para Apple Intelligence\n" +
                            "Potencia al extremo\n" +
                            "Un estudio de grabación en tu bolsillo\n" +
                            "Control de la cámara. Un dedo para dominarlo todo\n" +
                            "Resistente. Imponente. Titanio";
            imagen = "tiendaeljuan/images/iphone13pro.jpg";
            precio = 3000000;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnP4)){
            nombre = "Apple IPhone 15 Pro Max (256 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 8 GB\n" +
                            "Diseño resistente y ligero\n" +
                            "Pantalla Super Retina XDR con ProMotion con frecuencia de actualización hasta 120 Hz\n" +
                            "La Dynamic Island muestra alertas y actividades en vivo al instante\n" +
                            "Sistema de cámaras pro de super alta resolución\n" +
                            "Botón de acción personalizable para ir a tu funcionalidad favorita\n" +
                            "Con conector USB-C y WiFi 6 con el doble de velocidad\n" +
                            "Funcionalidad esencial de seguridad con detección de choques para pedir ayuda\n" +
                            "Con tecnologías de privacidad que te ayudan a mantener el control de tus datos";
            imagen = "tiendaeljuan/images/iphone15promax.jpg";
            precio = 7500000;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnP5)){
            nombre = "Apple IPhone 11 (64 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 4 GB\n" +
                            "Pantalla LCD Liquid Retina HD de 6.1 pulgadas. (3)\n" +
                            "Clasificación IP68 de resistencia al agua y al polvo (hasta 30 minutos a una profundidad máxima de 2 metros). (1)\n" +
                            "Sistema de dos cámaras de 12 MP (ultra gran angular y gran angular) con modo Noche, modo Retrato y video 4K de hasta 60 cps.\n" +
                            "Cámara frontal TrueDepth de 12 MP con modo Retrato, video 4K y video en cámara lenta.\n" +
                            "Face ID para una autenticación segura y Apple Pay.\n" +
                            "Chip A13 Bionic con Neural Engine de tercera generación.\n" +
                            "Carga rápida.\n" +
                            "Carga inalámbrica. (4)\n" +
                            "iOS 14 con widgets rediseñados en la pantalla de inicio, nueva Biblioteca de Apps, App Clips y mucho más.";
            imagen = "tiendaeljuan/images/iphone11.jpg";
            precio = 1500000;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnP6)){
            nombre = "Apple IPhone 14 Pro (256 GB)";
            descripcion = "Lo que tienes que saber de este producto\n" +
                            "Memoria RAM: 6 GB\n" +
                            "Pantalla Super Retina XDR de 6.1 pulgadas(2), siempre activa con tecnología ProMotion.\n" +
                            "Dynamic Island, una forma nueva y mágica de interactuar con tu iPhone.\n" +
                            "Cámara gran angular de 48MP para una resolución hasta 4 veces mayor.\n" +
                            "Modo Cine ahora en 4K Dolby Vision de hasta 30cps.\n" +
                            "Modo Acción para lograr videos estables, aún con cámara en mano.\n" +
                            "Detección de Choques(1), una funcionalidad de seguridad que pide ayuda cuando tú no puedes.\n" +
                            "Batería para todo el día y hasta 23 horas de reproducción de video.(3)\n" +
                            "A16 Bionic, el chip de smartphone en su máxima expresión. Red 5G ultrarrápida.(4)\n" +
                            "Ceramic Shield y resistencia al agua, características de durabilidad líderes en la industria.(5)\n" +
                            "iOS 16 ofrece aún más opciones de personalización y más formas de comunicarse y compartir.(6)";
            imagen = "tiendaeljuan/images/iphone14pro.jpg";
            precio = 4500000;
            loadStage("/tiendaeljuan/muestraproducto.fxml", e);
        }
        if(evt.equals(btnBack)){
            loadStage("/tiendaeljuan/login.fxml", e);
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
    
}
