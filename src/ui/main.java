package ui;
import model.*;
import java.util.Scanner;
public class Main{
       private final static String HOMECENTER = "HomeCenter";
	   private final static String CENTER_HARDWARE_STORE = "Ferreteria del centro";
	   private final static String NEIGHBORHOOD_HARDWARE_STORE = "Ferreteria del barrio";
       public static void main (String[] varela){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Bienvenido a su aplicativo en donde podra identificar la mejor cotizacion para la remodelacion de su vivienda");	
           String [] labours  = {"Negra", "Blanca", "Pintura"};	
           int [] quantMaterials = setquantArray(sc,labours);
		   String [] materialslabOne  = setmaterialslabOne(sc,labours,quantMaterials);
		   int [] quantmaterialslabOne = setquantmaterialslabOne(sc,quantMaterials,materialslabOne);
		   int [] pricehomecenterlabOne = setpricehomecenterlabOne(sc,quantMaterials,materialslabOne);
		   int [] pricewarecenterlabOne = setpricewarecenterlabOne(sc,quantMaterials,materialslabOne);
		   int [] pricewareneighlabOne = setpricewareneighlabOne(sc,quantMaterials,materialslabOne);
		   String [] materialslabTwo  = setmaterialslabTwo(sc,labours,quantMaterials);
		   int [] quantmaterialslabTwo = setquantmaterialslabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricehomecenterlabTwo = setpricehomecenterlabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricewarecenterlabTwo = setpricewarecenterlabTwo(sc,quantMaterials,materialslabTwo);
		   int [] pricewareneighlabTwo = setpricewareneighlabTwo(sc,quantMaterials,materialslabTwo);
		   String [] materialslabThree = setmaterialslabThree(sc,labours,quantMaterials);
		   int [] quantmaterialslabThree = setquantmaterialslabThree(sc,quantMaterials,materialslabThree);
		   int [] pricehomecenterlabThree = setpricehomecenterlabThree(sc,quantMaterials,materialslabThree);
		   int [] pricewarecenterlabThree = setpricewarecenterlabThree(sc,quantMaterials,materialslabThree);
		   int [] pricewareneighlabThree = setpricewareneighlabThree(sc,quantMaterials,materialslabThree);		   
		   showResults(sc,labours, materialslabOne, materialslabTwo, materialslabThree, quantMaterials, quantmaterialslabOne, pricehomecenterlabOne, pricewarecenterlabOne, pricewareneighlabOne, quantmaterialslabTwo, pricehomecenterlabTwo, pricewarecenterlabTwo, pricewareneighlabTwo, quantmaterialslabThree, pricehomecenterlabThree, pricewarecenterlabThree, pricewareneighlabThree);
		   System.out.println("Gracias por usar nuestros servicios"); 
	   }
       public static void showResults(Scanner sc, String [] labours, String [] materialslabOne, String [] materialslabTwo, String [] materialslabThree, int [] quantMaterials, int [] quantmaterialslabOne, int [] pricehomecenterlabOne, int [] pricewarecenterlabOne, int [] pricewareneighlabOne, int [] quantmaterialslabTwo, int [] pricehomecenterlabTwo, int [] pricewarecenterlabTwo, int [] pricewareneighlabTwo, int [] quantmaterialslabThree, int [] pricehomecenterlabThree, int [] pricewarecenterlabThree, int [] pricewareneighlabThree){
		   System.out.println("Para finalizar solo indicanos en que zona de la ciudad se encuentra ubicado tu inmueble. Elige una opcion: \n 1-NORTE \n 2-CENTRO \n 3-SUR");
		   int zone = sc.nextInt();
		   System.out.println("---------------------------------------Materiales Suministrados-----------------------------------");
		   budget.showMaterials(labours,materialslabOne,materialslabTwo,materialslabThree);
		   System.out.println("-------------------------------Hemos generado los siguentes resultados----------------------------");	
		   System.out.println("-------------------------Recibo Homecenter-----------------------------");
		   int totalmaterialsHomecenter = budget.payatHomecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricehomecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricehomecenterlabTwo,materialslabThree,quantmaterialslabThree,pricehomecenterlabThree);
		   System.out.println("---------------------Recibo Ferreteria del Centro----------------------");	
		   int totalmaterialsWarecenter = budget.payatWarecenter(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewarecenterlabOne,materialslabTwo,quantmaterialslabTwo,pricewarecenterlabTwo,materialslabThree,quantmaterialslabThree,pricewarecenterlabThree);
		   System.out.println("-------------------Recibo Ferreteria del Barrio------------------------");
		   int totalmaterialsWareneigh = budget.payatWareneigh(labours,quantMaterials,materialslabOne,quantmaterialslabOne,pricewareneighlabOne,materialslabTwo,quantmaterialslabTwo,pricewareneighlabTwo,materialslabThree,quantmaterialslabThree,pricewareneighlabThree);
		   int [] delivery = budget.priceDelivery(totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh, zone);
		   System.out.println("----------------------------Hemos generado los siguentes valores totales---------------------------");
		   budget.totaltoPay(labours,delivery,totalmaterialsHomecenter,totalmaterialsWarecenter,totalmaterialsWareneigh);
		   System.out.println("--------------------------------PERO ESPERA TE RECOMENDAMOS ESTO-----------------------------------");
		   budget.bestPrices(labours, materialslabOne, materialslabTwo, materialslabThree, quantMaterials, quantmaterialslabOne, pricehomecenterlabOne, pricewarecenterlabOne, pricewareneighlabOne, quantmaterialslabTwo, pricehomecenterlabTwo, pricewarecenterlabTwo, pricewareneighlabTwo, quantmaterialslabThree, pricehomecenterlabThree, pricewarecenterlabThree, pricewareneighlabThree);
	   }
	/**
	* Gets the quantity of materials for each labour <br>
    * <b> pre: </b> The quantity have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the quantity entered by console for each labour. <br>	
	* @param sc object is initialized
	* @param labours Labours Array != null
	* @return quantMaterials
	*/
	public static int[] setquantArray (Scanner sc,String [] labours){
		int j = 0;
		int[] quantMaterials = new int[labours.length];
		for(j = 0; j<labours.length ; j++){
		System.out.println("Ingresa la cantidad de materiales que necesitas para la obra " + labours[j]);
		quantMaterials[j] = sc.nextInt();
		}
		return quantMaterials;
	}
	/**
	* Gets the names of the materials for the first labour <br>
    * <b> pre: </b> The names can not be empty <br>
    * <b> post: </b> It has been created an array type String with the names of the materials entered by console for the first labour. <br>	
	* @param sc object is initialized
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @return materialslabOne
	*/
	public static String [] setmaterialslabOne(Scanner sc,String [] labours,int[] quantMaterials){
		int k = 0;
		String[] materialslabOne = new String[quantMaterials[0]];
		sc.nextLine();
		for(k = 0; k<materialslabOne.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[0]);
		materialslabOne[k] = sc.nextLine();
		}
		return materialslabOne;
	}
	/**
	* Gets the quantity for each material in the first labour <br>
    * <b> pre: </b> The quantity have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the quantity entered by console for each material in the first labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @return quantmaterialslabOne
	*/
	public static int [] setquantmaterialslabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int l = 0;
		int[] quantmaterialslabOne = new int[quantMaterials[0]];
		for(l = 0; l<quantmaterialslabOne.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabOne[l] + " que necesitas");
		quantmaterialslabOne[l] = sc.nextInt();
		}
		return quantmaterialslabOne;
	}
	/**
	* Gets the price at homecenter for each material in the first labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at homecenter entered by console for each material in the first labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @return pricehomecenterlabOne
	*/
	public static int [] setpricehomecenterlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int m = 0;
		int[] pricehomecenterlabOne = new int[quantMaterials[0]];
		for(m = 0; m<pricehomecenterlabOne.length; m++){
		System.out.println("Ingrese el valor unitario de " + materialslabOne[m] + " en " + HOMECENTER);
		pricehomecenterlabOne[m] = sc.nextInt();
		}
		return pricehomecenterlabOne;
	}
	/**
	* Gets the price at center hardware store for each material in the first labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at center hardware store entered by console for each material in the first labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @return pricewarecenterlabOne
	*/
	public static int [] setpricewarecenterlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int n = 0;
		int[] pricewarecenterlabOne = new int[quantMaterials[0]];
		for(n = 0; n<pricewarecenterlabOne.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabOne[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabOne[n] = sc.nextInt();
		}
		return pricewarecenterlabOne;
	}
	/**
	* Gets the price at neighborhood hardware store for each material in the first labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at neighborhood hardware store entered by console for each material in the first labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @return pricewareneighlabOne
	*/
	public static int [] setpricewareneighlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int o = 0;
		int[] pricewareneighlabOne = new int[quantMaterials[0]];
		for(o = 0; o<pricewareneighlabOne.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabOne[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabOne[o] = sc.nextInt();
		}
		return pricewareneighlabOne;
	}
	/**
	* Gets the names of the materials for the second labour <br>
    * <b> pre: </b> The names can not be empty <br>
    * <b> post: </b> It has been created an array type String with the names of the materials entered by console for the second labour. <br>	
	* @param sc object is initialized
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @return materialslabTwo
	*/
		public static String [] setmaterialslabTwo(Scanner sc,String [] labours,int[] quantMaterials){
		int k = 0;
		String[] materialslabTwo = new String[quantMaterials[1]];
		sc.nextLine();
		for(k = 0; k<materialslabTwo.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[1]);
		materialslabTwo[k] = sc.nextLine();
		}
		return materialslabTwo;
	}
	/**
	* Gets the quantity for each material in the second labour <br>
    * <b> pre: </b> The quantity have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the quantity entered by console for each material in the second labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @return quantmaterialslabTwo
	*/
	public static int [] setquantmaterialslabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int l = 0;
		int[] quantmaterialslabTwo = new int[quantMaterials[1]];
		for(l = 0; l<quantmaterialslabTwo.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabTwo[l] + " que necesitas");
		quantmaterialslabTwo[l] = sc.nextInt();
		}
		return quantmaterialslabTwo;
	}
	/**
	* Gets the price at homecenter for each material in the second labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at homecenter entered by console for each material in the second labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @return pricehomecenterlabTwo
	*/
	public static int [] setpricehomecenterlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int m = 0;
		int[] pricehomecenterlabTwo = new int[quantMaterials[1]];
		for(m = 0; m<pricehomecenterlabTwo.length; m++){
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[m] + " en " + HOMECENTER);
		pricehomecenterlabTwo[m] = sc.nextInt();
		}
		return pricehomecenterlabTwo;
	}
	/**
	* Gets the price at center hardware store for each material in the second labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at center hardware store entered by console for each material in the second labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @return pricewarecenterlabTwo
	*/
	public static int [] setpricewarecenterlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int n = 0;
		int[] pricewarecenterlabTwo = new int[quantMaterials[1]];
		for(n = 0; n<pricewarecenterlabTwo.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabTwo[n] = sc.nextInt();
		}
		return pricewarecenterlabTwo;
	}
	/**
	* Gets the price at neighborhood hardware store for each material in the second labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at neighborhood hardware store entered by console for each material in the second labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @return pricewareneighlabTwo
	*/
	public static int [] setpricewareneighlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int o = 0;
		int[] pricewareneighlabTwo = new int[quantMaterials[1]];
		for(o = 0; o<pricewareneighlabTwo.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabTwo[o] = sc.nextInt();
		}
		return pricewareneighlabTwo;
	}
	/**
	* Gets the names of the materials for the third labour <br>
    * <b> pre: </b> The names can not be empty <br>
    * <b> post: </b> It has been created an array type String with the names of the materials entered by console for the thrid labour. <br>	
	* @param sc object is initialized
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @return materialslabThree
	*/
		public static String [] setmaterialslabThree(Scanner sc,String [] labours,int[] quantMaterials){
		int k = 0;
		String[] materialslabThree = new String[quantMaterials[2]];
		sc.nextLine();
		for(k = 0; k<materialslabThree.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[2]);
		materialslabThree[k] = sc.nextLine();
		}
		return materialslabThree;
	}
	/**
	* Gets the quantity for each material in the third labour <br>
    * <b> pre: </b> The quantity have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the quantity entered by console for each material in the third labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @return quantmaterialslabThree
	*/
	public static int [] setquantmaterialslabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int l = 0;
		int[] quantmaterialslabThree = new int[quantMaterials[2]];
		for(l = 0; l<quantmaterialslabThree.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabThree[l] + " que necesitas");
		quantmaterialslabThree[l] = sc.nextInt();
		}
		return quantmaterialslabThree;
	}
    /**
	* Gets the price at homecenter for each material in the third labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at homecenter entered by console for each material in the third labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @return pricehomecenterlabThree
	*/
	public static int [] setpricehomecenterlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int m = 0;
		int[] pricehomecenterlabThree = new int[quantMaterials[2]];
		for(m = 0; m<pricehomecenterlabThree.length; m++){
		System.out.println("Ingrese el valor unitario de " + materialslabThree[m] + " en " + HOMECENTER);
		pricehomecenterlabThree[m] = sc.nextInt();
		}
		return pricehomecenterlabThree;
	}
	/**
	* Gets the price at center hardware store for each material in the third labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at center hardware storeentered by console for each material in the third labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @return pricewarecenterlabThree
	*/
	public static int [] setpricewarecenterlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int n = 0;
		int[] pricewarecenterlabThree = new int[quantMaterials[2]];
		for(n = 0; n<pricewarecenterlabThree.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabThree[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabThree[n] = sc.nextInt();
		}
		return pricewarecenterlabThree;
	}
	/**
	* Gets the price at neighborhood hardware store for each material in the third labour <br>
    * <b> pre: </b> The price have to be a positive integer number <br>
    * <b> post: </b> It has been created an array type Int with the price at neighborhood hardware store entered by console for each material in the third labour. <br>	
	* @param sc object is initialized
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @return pricewareneighlabThree
	*/
	public static int [] setpricewareneighlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int o = 0;
		int[] pricewareneighlabThree = new int[quantMaterials[2]];
		for(o = 0; o<pricewareneighlabThree.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabThree[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabThree[o] = sc.nextInt();
		}
		return pricewareneighlabThree;
	}
 
}