/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.clases;

/**
 *
 * @author luciano.echevarne
 */
public class Cliente {
    String nombre;
    String apellido;
    String ciudad;
    String dni;
    String direccion;

    public Cliente(String nombre, String apellido, String ciudad, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     @Override
  public String toString() {
    return "Datos: " + nombre + "|" +apellido+"|" +ciudad+ "|"+dni+"|"+direccion;
  }
}