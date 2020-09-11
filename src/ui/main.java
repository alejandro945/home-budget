package ui;
import model.*;
import java.util.Scanner;
public class main{
       public static void main (String[] varela){
		   Scanner sc = new Scanner(System.in);
	       String [] labours  = budget.getLabours(sc);
		   int [] quantMaterials = budget.setquantArray(sc,labours);
		  System.out.println("Gracias por usar nuestros servicios"); 
	   }
 
}