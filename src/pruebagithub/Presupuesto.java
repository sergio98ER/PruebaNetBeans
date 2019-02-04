/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

/**
 *
 * @author Sergio
 */
public class Presupuesto {
    private String cliente, descripcion;
    private double importe;
    
    public Presupuesto (){
        cliente = "";
        descripcion ="";
        importe = 0.0;
    }
    public Presupuesto(String cliente, String descripcion, double importe) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCliente() {
        return cliente;
    }

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
    
}
