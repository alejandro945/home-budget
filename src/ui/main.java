package ui;
import model.*;
import java.util.Scanner;
public class Main{
       public static void main (String[] varela){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Bienvenido a su aplicativo en donde podra identificar la mejor cotizacion para la remodelacion de su vivienda");		   
		   getandshowData(sc);
		   System.out.println("Gracias por usar nuestros servicios"); 
	   }
	   public static void getandshowData(Scanner sc){
		   System.out.println("Tenemos materiales para los siguientes tipos de obras: NEGRA, BLANCA Y PINTURA. Pilas ingrese los nombres respectivamente de acuerdo con su necesidad.");
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
		   System.out.println("-------------------------------Materiales Suministrados----------------------------");
		   budget.showMaterials(labours,materialslabOne,materialslabTwo,materialslabThree);
		   System.out.println("-------------------------------Hemos generado los siguentes resultados----------------------------");	
		   System.out.println("-------------------------Recibo Homecenter-----------------------------");
		   int totalmaterialsHomecenter = budget.payatHomecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricehomecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricehomecenterlabTwo,materialslabThree,quantmaterialslabThree,pricehomecenterlabThree);
		   System.out.println("---------------------Recibo Ferreteria del Centro----------------------");	
		   int totalmaterialsWarecenter = budget.payatWarecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewarecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricewarecenterlabTwo,materialslabThree,quantmaterialslabThree,pricewarecenterlabThree);
		   System.out.println("-------------------Recibo Ferreteria del Barrio------------------------");
		   int totalmaterialsWareneigh = budget.payatWareneigh(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewareneighlabOne,materialslabTwo,quantmaterialslabTwo,pricewareneighlabTwo,materialslabThree,quantmaterialslabThree,pricewareneighlabThree);
		   System.out.println("Para finalizar solo indicanos en que zona de la ciudad se encuentra ubicado tu inmueble. Elige una opcion: ");
		   System.out.println("1-NORTE");
		   System.out.println("2-CENTRO");
		   System.out.println("3-SUR");
		   int zone = sc.nextInt();
		   int [] delivery = budget.priceDelivery(sc,totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh, zone);
		   System.out.println("----------------------------Hemos generado los siguentes valores totales---------------------------");
		   budget.totaltoPay(labours,delivery,totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh);
		   System.out.println("--------------------------------PERO ESPERA TE RECOMENDAMOS ESTO-----------------------------------");
		   budget.bestPrices(labours, materialslabOne, materialslabTwo, materialslabThree, quantMaterials, quantmaterialslabOne, pricehomecenterlabOne, pricewarecenterlabOne, pricewareneighlabOne, quantmaterialslabTwo, pricehomecenterlabTwo, pricewarecenterlabTwo, pricewareneighlabTwo, quantmaterialslabThree, pricehomecenterlabThree, pricewarecenterlabThree, pricewareneighlabThree);
	   }
 
}