/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

/**
 * Descripcion esto es una clase de un presupuesto.
 * @author Sergio
 */
public class Presupuesto {
    private String cliente, descripcion;
    private double importe;
    
    /**
     * CONSTRUCTOR POR DEFECTO
     */
    public Presupuesto (){
        cliente = "";
        descripcion ="";
        importe = 0.0;
    }
    /**
     * Constructor con parámetros
     * @param cliente Nombre Cliente
     * @param descripcion Descripcion del presupuesto que quiere el cliente
     * @param importe Importe del presupuesto
     */
    public Presupuesto(String cliente, String descripcion, double importe) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }
    /**
     * Devuelve el nombre del cliente
     * @return Nombre del cliente
     */
    public String getCliente() {
        return cliente;
    }
    /**
     * Modifica el nombre del cliente
     * @param cliente Nuevo nombre del cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    @Override
    /**
     * to String muestra toda la informacion
     */
    public String toString() {
        return "Presupuesto{" + "cliente=" + cliente + ", descripcion=" + descripcion + ", importe=" + importe + '}';
    }
    
}
