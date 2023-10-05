/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocia;


public class Empleado { 
    
    //Atributos
    
    public String Nombre;
    public String Codigo;
    public int Año_Ingreso; 
    
    //Constructor No Parametrizado

    public Empleado() {
    }
    
    //Constructor Parametrizado

    public Empleado(String Nombre, String Codigo, int Año_Ingreso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Año_Ingreso = Año_Ingreso;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setAño_Ingreso(int Año_Ingreso) {
        this.Año_Ingreso = Año_Ingreso;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getAño_Ingreso() {
        return Año_Ingreso;
    }

   
    
    
    
    
}
