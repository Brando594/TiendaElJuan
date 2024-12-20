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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brando
 */
public class LoginController implements Initializable {
    
    public static String mail_user;
    
    @FXML
    private Button btnCrear, btnLogin;
    
    @FXML
    private TextField mail;
    
    @FXML
    private PasswordField pass;
    
    public void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnCrear)){
            loadStage("/tiendaeljuan/registro.fxml", e);
        }
        if(evt.equals(btnLogin)){
            user log = RegistroController.lista.login(mail.getText(), pass.getText());
            if(log != null){
                mail_user = mail.getText();
                JOptionPane.showMessageDialog(null, "Logueo exitoso!");
                loadStage("/tiendaeljuan/principal.fxml", e);
            }else{
                JOptionPane.showMessageDialog(null, "Datos erroneos!");
                mail.setText("");
                pass.setText("");
            }
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
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE,null, ex);
        }     
    }
    
}
