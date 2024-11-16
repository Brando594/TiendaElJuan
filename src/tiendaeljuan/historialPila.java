/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaeljuan;

import java.util.Stack;

/**
 *
 * @author Brando
 */
public class historialPila {
    public static Stack<producto> pila;
    
    public historialPila(){
        this.pila = new Stack();
    }
    
    public void añadirHistorial (producto prod){
        boolean existe = false;
        
        for (producto p : pila) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(LoginController.mail_user)) {  
                p.setCantidad(p.getCantidad() + 1);  
                existe = true;
                break;
            }
        }
        if (!existe && prod.comprador.equals(LoginController.mail_user)) {
            pila.push(prod);
        }
    }
    
    public Stack<producto> getHistorial() {
        return pila;
    }
}
