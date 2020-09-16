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
		   String [] materialslabTwo  = budget.setmaterialslabTwo(sc,labours,quantMaterials);
		   int [] quantmaterialslabTwo = budget.setquantmaterialslabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricehomecenterlabTwo = budget.setpricehomecenterlabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricewarecenterlabTwo = budget.setpricewarecenterlabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricewareneighlabTwo = budget.setpricewareneighlabTwo(sc,quantMaterials,materialslabTwo);
		   String [] materialslabThree = budget.setmaterialslabThree(sc,labours,quantMaterials);
		   int [] quantmaterialslabThree = budget.setquantmaterialslabThree(sc,quantMaterials,materialslabThree);
		   int [] pricehomecenterlabThree = budget.setpricehomecenterlabThree(sc,quantMaterials,materialslabThree);
		   int [] pricewarecenterlabThree = budget.setpricewarecenterlabThree(sc,quantMaterials,materialslabThree);
		   int [] pricewareneighlabThree = budget.setpricewareneighlabThree(sc,quantMaterials,materialslabThree);
		   int totalmaterialsHomecenter = budget.payatHomecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricehomecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricehomecenterlabTwo,materialslabThree,quantmaterialslabThree,pricehomecenterlabThree);
		   int totalmaterialsWarecenter = budget.payatWarecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewarecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricewarecenterlabTwo,materialslabThree,quantmaterialslabThree,pricewarecenterlabThree);
		   int totalmaterialsWareneigh = budget.payatWareneigh(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewareneighlabOne,materialslabTwo,quantmaterialslabTwo,pricewareneighlabTwo,materialslabThree,quantmaterialslabThree,pricewareneighlabThree);
		   int [] delivery = budget.priceDelivery(sc,totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh);
		   budget.showMaterials(labours,materialslabOne,materialslabTwo,materialslabThree);
		   budget.totaltoPay(labours,delivery,totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh);
		 System.out.println("Gracias por usar nuestros servicios"); 
	   }
 
}