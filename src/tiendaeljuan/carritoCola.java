/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaeljuan;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Brando
 */
public class carritoCola {
    
    public static Queue<producto> cola;
    
    public carritoCola(){
        this.cola = new LinkedList<>();
    }
    
    public void añadirAlCarrito(producto p){
        cola.add(p);
    }

}
