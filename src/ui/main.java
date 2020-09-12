package ui;
import model.*;
import java.util.Scanner;
public class main{
       public static void main (String[] varela){
		   Scanner sc = new Scanner(System.in);
	       String [] labours  = budget.getLabours(sc);
		   int [] quantMaterials = budget.setquantArray(sc,labours);
		   String [] materialslabOne  = budget.setmaterialslabOne(sc,labours,quantMaterials);
		   int [] quantmaterialslabOne = budget.setquantmaterialslabOne(sc,quantMaterials,materialslabOne);
		   int [] pricehomecenterlabOne = budget.setpricehomecenterlabOne(sc,quantMaterials,materialslabOne);
		   int [] pricewarecenterlabOne = budget.setpricewarecenterlabOne(sc,quantMaterials,materialslabOne);
		   int [] pricewareneighlabOne = budget.setpricewareneighlabOne(sc,quantMaterials,materialslabOne);
		   for(int i=0;i<materialslabOne.length;i++){
			   System.out.print(materialslabOne[i]);
		   }
		  System.out.println("Gracias por usar nuestros servicios"); 
	   }
 
}