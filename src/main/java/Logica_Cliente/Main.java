/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocia.Empleado;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        //Declarando e inicializando variables
        
            int opc=0;
            boolean bandera_ciclo=true;
            Scanner scan = new Scanner(System.in);
            String nombre="", codigo="",id="";
            int cantidad=0, año_ingreso=0,bandera=0,bandera_agregar=0;
            
            
            ArrayList<Empleado> listaempleados= new ArrayList<>();
            Empleado objempleado;
            Empleado objempleado1= new Empleado("Felipe", "12345", 1999);
            Empleado objempleado2= new Empleado("Jhon", "56789", 2000);
            Empleado objempleado3= new Empleado("Nicolas", "13579", 2006);
            listaempleados.add(objempleado1);
            listaempleados.add(objempleado2);
            listaempleados.add(objempleado3);
            
            //Agregar Variables para algoritmos
       
       
             //Creando menu de opciones
             
            do{
                System.out.println("1. Registrar Empleado");
            System.out.println("2. Editar Empleado");
            System.out.println("3. Consultar Empleado");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Salir");
           
            System.out.println("Digite la opcion");
            opc= scan.nextInt();
           
            switch(opc){
                    case 1:
                        
                        //Algoritmo en lenguaje JAVA Registrar
                        
                        System.out.println("Digite la cantidad de empleados a registrar");
                        cantidad= scan.nextInt();
                        scan.nextLine();
                   
                    do{
                        for (int i = 0; i < cantidad; i++) {
                        scan.nextLine();
                        System.out.println("Digite el nombre del empleado");
                        nombre= scan.nextLine();
                        char[] caracteres = nombre.toCharArray();
                        for (int j = 0; j < caracteres.length; j++) {
                           if (Character.isDigit(caracteres[j])) {
                            System.out.println("El carácter '" + caracteres[j] + "' es un numero.");
                            bandera_agregar+= 1;
                        } else {
                            System.out.println("El carácter '" + caracteres[j] + "' es una letra.");
                            
                        }

                        }
                        if(bandera_agregar == 0){
                             System.out.println("Digite el codigo del empleado");
                            codigo= scan.nextLine();
                            System.out.println("Digite el año de ingreso del empleado");
                            año_ingreso= scan.nextInt();
                            objempleado= new Empleado(nombre, codigo, año_ingreso);
                            listaempleados.add(objempleado);
                            bandera_ciclo=false;
                            
                        }else{
                            System.out.println(bandera_agregar);
                            System.out.println("ingrese un nombre valido");
                            
                            
                            bandera_agregar=0;
                            
                        }
                        
                       

                   }
                        
                    }
                    while(bandera_ciclo);
                    break;
                    case 2:
                        
                        //Algoritmo en lenguaje JAVA Editar
                        
                    scan.nextLine();
                    System.out.println("Digite el id del empleado a modificar");
                    id=scan.nextLine();
                    for (int i = 0; i < listaempleados.size(); i++) {
                        if(listaempleados.get(i).getCodigo().equals(id))
                        {
                            bandera=1;
                            scan.nextLine();
                            System.out.println("Digite el nombre del empleado");
                            nombre= scan.nextLine();
                            System.out.println("Digite el codigo del empleado");
                            codigo= scan.nextLine();
                            System.out.println("Digite el año de ingreso del empleado");
                            año_ingreso= scan.nextInt();
                           
                            listaempleados.get(i).setNombre(nombre);
                            listaempleados.get(i).setCodigo(codigo);
                            listaempleados.get(i).setAño_Ingreso(año_ingreso);
                           
                        }
                        }
                        if (bandera==0) {
                            System.out.println("El id del empleado no existe");
                        }
                    break;
                    case 3:
                        //Algoritmo en lenguaje JAVA Consultar
                        
                        scan.nextLine();
                        System.out.println("Digite el codigo del empleado a buscar");
                        id=scan.nextLine();
                        double startTime = System.currentTimeMillis();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(id))
                            {
                                bandera=1;
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());

                            }
                        }
                        if (bandera==0) {
                            System.out.println("El id del empleado no existe");
                        }  
                        
                    break;
                    case 4:
                        //Algoritmo en lenguaje JAVA Mostrar
                        if (listaempleados.size()>0) {
                            
                        
                        for (int i = 0; i < listaempleados.size(); i++) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_Ingreso());
                            }
                        }else
                        {
                            System.out.println("No hay empleados registrados");
                        }
                    break;
                    case 5:
                        //Algoritmo en lenguaje JAVA Eliminar
                        scan.nextLine();
                        System.out.println("Digite el codigo del empleado a buscar");
                        id=scan.nextLine();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(id))
                            {
                                bandera=1;
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                listaempleados.remove(i);

                            }
                            }
                        if (bandera==0) {
                            System.out.println("El id del empleado no existe");
                        }  
                    break;
                    case 6:
                        //Algoritmo en lenguaje JAVA Salir
                    break;
                    default: System.out.println("Opcion no valida para el menu");
            }
            
            }
            while(opc!=6);
    }
    
}
