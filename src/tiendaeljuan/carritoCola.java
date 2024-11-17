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

    public Queue<producto> get_carrito() {
        return cola;
    }
    
    public void añadir_al_carrito(producto prod) {
        boolean existe = false;

        for (producto p : cola) {
            if (p.getNombre().equals(prod.getNombre()) && p.comprador.equals(LoginController.mail_user)) {  
                p.setCantidad(p.getCantidad() + 1);  
                existe = true;
                JOptionPane.showMessageDialog(null, "Producto agregado al carrito: " + prod.getNombre());
                break;
            }
        }

        if (!existe && prod.comprador.equals(LoginController.mail_user)) {
            cola.add(prod);
            JOptionPane.showMessageDialog(null, "Producto agregado al carrito: " + prod.getNombre());
        }
    }
    
    public producto buscar_nombre(String nombreProducto) {
        for (producto prod : cola) {
            if (prod.getNombre().equals(nombreProducto)) {
                return prod;
            }
        }
        return null;  
    }

    public void eliminar_nombre(String nombreProducto) {
        for (producto elim : cola){
            if(elim.nombre.equals(nombreProducto)){
                if(elim.cantidad == 1){
                    cola.remove(elim);
                    JOptionPane.showMessageDialog(null, "Producto eliminado!");
                }else{
                    elim.cantidad -=1;
                    JOptionPane.showMessageDialog(null, "Producto eliminado!");
                }
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
