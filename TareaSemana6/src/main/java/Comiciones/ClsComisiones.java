/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comiciones;

import java.util.*;
import modelos.MdVendedores;

/**
 *
 * @author HP
 */
public class ClsComisiones {
   public List<MdVendedores> Todos = new ArrayList<MdVendedores>();
    Scanner t = new Scanner(System.in);
    
    private MdVendedores ingresoData(){
        MdVendedores vende = new MdVendedores();
        System.out.println("Ingresa Nombre");
        vende.nombre = t.nextLine();
        System.out.println("Ingresa Enero");
        vende.enero = t.nextDouble();
        System.out.println("Ingresa Febrero");
        vende.febrero = t.nextDouble();
        System.out.println("Ingresa Marzo");
        vende.marzo = t.nextDouble();
        Todos.add(vende);
        return vende;
    }
  
    private void dataGeneral(){
        for(MdVendedores ele : Todos){
            System.out.println("Nombre = "+ele.nombre);
            System.out.println("Enero = " + ele.enero);
            System.out.println("Febrero = "+ele.febrero);
            System.out.println("Marzo = "+ele.marzo);
            
            

            //System.out.println("El promedio de enero es: "+Promedio);
        }
        System.out.println("-------------------");
    }
    
    private void calculos (){
        
        double TotalPersona = 0.00;
        double GranTotal = 0.00;
        double totalpormesEne = 0.00;
        double totalpormesFeb = 0.00;
        double totalpormesMar = 0.00;
        double PromedioEne = 0.00;
        double PromedioFeb = 0.00;
        double PromedioMar = 0.00;
        double PromedioTotal = 0.00;
            for(MdVendedores obje : Todos){
                GranTotal += obje.enero+obje.febrero+obje.marzo;
                totalpormesEne += obje.enero;
                totalpormesFeb += obje.febrero;
                totalpormesMar += obje.marzo;
                TotalPersona = obje.enero+obje.febrero+obje.marzo;
                PromedioEne += obje.enero/Todos.size();
                PromedioFeb += obje.febrero/Todos.size();
                PromedioMar += obje.marzo/Todos.size();
                PromedioTotal += (obje.enero+obje.febrero+obje.marzo)/3;
            
                    System.out.println("las ventas de "+obje.nombre+" son = "+TotalPersona);
            }
                    System.out.println("El Total de Todas las ventas es = "+GranTotal);
                    System.out.println("El total de enero es = "+totalpormesEne);
                    System.out.println("El total de febrero es = "+totalpormesFeb);
                    System.out.println("El total de marzo es = "+totalpormesMar);
                    System.out.println("El Promedio de ventas de Enero es = "+PromedioEne);
                    System.out.println("El Promedio de ventas de Febrero es = "+PromedioFeb);
                    System.out.println("El Promedio de ventas de Marzo es = "+PromedioMar);
                    System.out.println("El Promedio de ventas Total es = "+PromedioTotal);
                    
    }
    
    private void modificaData (){
        
    }
    
    private void ventamayor(){
        
    }
    
    private void mayor3meses() {
        
    }
    
    private void busquedaporcantidad() {
        for(MdVendedores ele : Todos){
        Scanner t = new Scanner(System.in);
        double venta = 0;
        int indice = 0;
        System.out.println("Ingrese la cantidad que quiere buscar");
        venta = t.nextDouble();
        indice =  Todos.indexOf(venta);
        if(indice != -1){
            System.out.println("el dato esta en "+(indice + ele.nombre));
        }else{
            System.out.println("El dato no se encuentra");
        }
        
        }
    }
    
    public void consultaData (){
        String op = "";
        do {
             System.out.println("1: Quien vendio Mas y menos");
             System.out.println("2: Quien vendio mas en los 3 meses");
             System.out.println("3: Buscar por la cantidad de venta");
             System.out.println("4: Reporte Genera;l");
             System.out.println("5: Salir");
             op = t.nextLine();
             
             switch(op){
                 case "1": ventamayor();
                 break;
                 case "2": mayor3meses();
                 break;
                 case "3": busquedaporcantidad();
                 break;
                 case "4": dataGeneral();
                           calculos();
                 break;
             }
         } while (!op.equals("5"));
    }
    
    public void menu (){
        String opc = "";
         do {
             System.out.println("1: Ingrese Informacion");
             System.out.println("2: Consultar Informacion");
             System.out.println("3: Editar informacion");
             System.out.println("4: salir");
             opc = t.nextLine();
             
             switch(opc){
                 case "1": ingresoData();
                 break;
                 case "2": consultaData();
                 break;
                 case "3": modificaData();
                 break;
             }
         } while (!opc.equals("4"));
}
    
}
