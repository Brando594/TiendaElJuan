/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaeljuan;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Brando
 */
public class carritoCola {
    
    public static Queue<producto> cola;
    
    public carritoCola(){
        this.cola = new LinkedList<>();
    }
    
    public void agregarProducto(producto prod) {
        cola.add(prod);
        JOptionPane.showMessageDialog(null, "Producto añadido con exito!");
    }

    public void eliminarDelCarrito(String nombreProducto) {
        for (producto elim : cola){
            if(elim.nombre.equals(nombreProducto)){
                cola.remove(elim);
                break;
            }
        }
    }

    // Método para comprar un producto específico por su nombre
    public void Comprar(String nombreProducto) {
        producto productoComprado = null;
        for (producto prod : cola) {
            if (prod.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoComprado = prod;
                break;
            }
        }
    }

}
