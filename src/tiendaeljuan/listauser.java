/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaeljuan;

import javax.swing.JOptionPane;

/**
 *
 * @author Brando
 */
public class listauser {
    public static user cab;
    
    public listauser () { cab=null; }
    
    public user buscar_email(String email){
        user u = cab;
        if(cab == null)
            return null;
        else{
            while (u != null){
                if ((u.email).equals(email))
                    return u;
                else
                    u=u.sig;
            }
            return null;
        }
    }
    
    public user nuevo_user(String nombre, String apellido, String email, String contraseña){
        user info, p;
        String mail;
        if (nombre.equals("") || apellido.equals("") || email.equals("") || contraseña.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return null;
        }else{
            do{
                mail = email;
                p = buscar_email(mail);
                if(p != null){
                    JOptionPane.showMessageDialog(null, "Ya existe una cuenta con ese email, ingrese uno diferente!");
                    return null;
                }
            }while(p != null);
            if(p == null){
                info = new user(nombre, apellido, mail, contraseña);
                return info;
            }else{
                return null;
            }
        }
    }
    
    public void añadir_lista(String nombre, String apellido, String email, String contraseña){
        user info = nuevo_user(nombre, apellido, email, contraseña);
        if(cab != null){
            info.sig = cab;
            cab = info;
        }else{
            cab = info;
        }
    }
    
    public user login(String nombre, String contraseña){
        user p = cab;
        if(cab == null)
            return null;
        else{
            while(p != null){
                if((p.nombre).equals(nombre) && (p.contraseña).equals(contraseña))
                    return p;
                else
                    p=p.sig;
            }
            return null;
        }
    }
}
