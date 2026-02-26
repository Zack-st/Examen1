
package examen1;
import javax.swing.JOptionPane;

public class Examen1 {

  public static void main(String[] args) {
  
    double porDia= 20300;
    int vehiReg;
    int dias;
    boolean seguro= true;
    double subtotal;
    boolean gps= false;
    double total;
    
    vehiReg= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos vehiculos desea registrar"));
    dias= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias"));
    
  
    //Datos del cliente
    CLiente c1 = new CLiente();
    c1.setNombre("Carlos");
    c1.setCedula(111111);
    c1.setCategoria("VIP");
    c1.setMesRegistro("febrero");
    
    //Calculo
    double costoB=porDia*dias;
    if (dias>7){
        double desc= costoB*0.15;
      if (seguro=true){
          subtotal= costoB+5000+desc;
      } if (gps=true){
          subtotal= 2000*dias;
      }
      else {
      subtotal= costoB+5000;
    }if (gps=true){
          subtotal= 2000*dias;}}
    
     //Descuento por VIP
     total= subtotal*0.5;
    
    //Resumen final
    
     System.out.println("================================"+ 
    "\nRESUMEN FINAL DE ALQUILERES"+ "\n================================");
      System.out.println("Cliente: "+c1.Nombre);
      System.out.println("Cedula: "+c1.cedula);
      System.out.println("Categoria: "+c1.getCategoria());
      System.out.println("Mes de Registro: "+c1.mesRegistro);
      
      System.out.println("================================");
      System.out.println("Cantidad de vehiculos registrados: "+vehiReg);
      System.out.println("Subtotal antes de descuento VIP: "+subtotal);
      System.out.println("====== Aplicando beneficios VIP ======"+subtotal);
      System.out.println("Total a pagar: "+ total);
      
    
    
  }
  }
