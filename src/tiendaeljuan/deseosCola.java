package tiendaeljuan;


import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class deseosCola {
        
    public static Queue<producto> cola;
    
    public deseosCola(){
        this.cola = new LinkedList<>();
    }
    
    public Queue<producto> get_deseos() {
        return cola;
    }
    
    public void agregarProducto(producto prod) {
        boolean existe = false;

        for (producto p : cola) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(LoginController.mail_user)) {  
                JOptionPane.showMessageDialog(null, "Este producto ya se encuentra en deseos");
                existe = true;
            }
        }

        if (!existe && prod.comprador.equals(LoginController.mail_user)) {
            cola.add(prod);
            JOptionPane.showMessageDialog(null, "Producto agregado a deseos: " + prod.getNombre());
        }
    }

    public void eliminarDeDeseos(String nombreProducto) {
        for (producto elim : cola){
            if(elim.nombre.equals(nombreProducto)){
                cola.remove(elim);
                break;
            }
        }
    }

    public void comprar_nombre(String nombreProducto) {
        producto productoComprado = null;
        for (producto prod : cola) {
            if (prod.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoComprado = prod;
                break;
            }
        }

        if (productoComprado != null) {
            JOptionPane.showMessageDialog(null, "Comprando producto: " + productoComprado.getNombre() + " - Precio: $" + productoComprado.getPrecio());
            if(productoComprado.cantidad == 1){
                PrincipalController.pila.añadirHistorial(productoComprado);
                cola.remove(productoComprado);
            }else{
                PrincipalController.pila.añadirHistorial(productoComprado);
                productoComprado.cantidad -= 1;
            }
        }
    }
}
