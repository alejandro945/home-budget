package model;
import java.util.Scanner;
public class budget{
    //--------------------------------------------Object---------------------------------------------------------------------------------------
	Scanner sc = new Scanner(System.in);
    //------------------------------------------------Const-------------------------------------------------------------------------------------
    private final static int BLACK_LABOUR_VALUE = 1300000;
	private final static int WHITE_LABOUR_VALUE = 2600000;
	private final static int PAINT_LABOUR_VALUE = 980000;
	private final static String HOMECENTER = "HomeCenter";
	private final static String CENTER_HARDWARE_STORE = "Ferreteria del centro";
	private final static String NEIGHBORHOOD_HARDWARE_STORE = "Ferreteria del barrio";
    //----------------------------------------------Methods-------------------------------------------------------------------------------------
	//--------------------------------------------Labours array -------------------------------------------------------------------------------
	public static String [] getLabours (Scanner sc){
		int quantLabours;
		int i = 0;
		System.out.println("Bienvenido a su aplicativo en donde podra identificar la mejor cotizacion para la remodelacion de su vivienda");
		System.out.println("Cuentanos cuantas obras vas a realizar?");
		quantLabours = sc.nextInt();
		System.out.println("Tenemos los siguientes tipos de obras disponibles: NEGRA, BLANCA Y PINTURA. Ahora, ingresa los nombres de estas " + quantLabours + " obras.");
		String [] labours = new String [quantLabours];
		sc.nextLine();
		for(i=0 ; i<quantLabours ; i++){
			labours[i] = sc.nextLine();
		}
		return labours;
	}
	//----------------------------------------------------- Quantity of materials for each labour array-----------------------------------------------
	public static int[] setquantArray (Scanner sc,String [] labours){
		int j = 0;
		int[] quantMaterials = new int[labours.length];
		for(j = 0; j<labours.length ; j++){
		System.out.println("Ingresa la cantidad de materiales que necesitas para la obra " + labours[j]);
		quantMaterials[j] = sc.nextInt();
		}
		return quantMaterials;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 1 ----------------------------------------------------------
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
	public static int [] setquantmaterialslabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int l = 0;
		int[] quantmaterialslabOne = new int[quantMaterials[0]];
		for(l = 0; l<quantmaterialslabOne.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabOne[l] + " que necesitas");
		quantmaterialslabOne[l] = sc.nextInt();
		}
		return quantmaterialslabOne;
	}
	public static int [] setpricehomecenterlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int m = 0;
		int[] pricehomecenterlabOne = new int[quantMaterials[0]];
		for(m = 0; m<pricehomecenterlabOne.length; m++){
		System.out.println("Ingrese el valor de " + materialslabOne[m] + " en " + HOMECENTER);
		pricehomecenterlabOne[m] = sc.nextInt();
		}
		return pricehomecenterlabOne;
	}
	public static int [] setpricewarecenterlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int n = 0;
		int[] pricewarecenterlabOne = new int[quantMaterials[0]];
		for(n = 0; n<pricewarecenterlabOne.length; n++){
		System.out.println("Ingrese el valor de " + materialslabOne[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabOne[n] = sc.nextInt();
		}
		return pricewarecenterlabOne;
	}
	public static int [] setpricewareneighlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int o = 0;
		int[] pricewareneighlabOne = new int[quantMaterials[0]];
		for(o = 0; o<pricewareneighlabOne.length; o++){
		System.out.println("Ingrese el valor de " + materialslabOne[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabOne[o] = sc.nextInt();
		}
		return pricewareneighlabOne;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 2 ----------------------------------------------------------
		public static String [] setmaterialslabTwo(Scanner sc,String [] labours,int[] quantMaterials){
		int k = 0;
		String[] materialslabTwo = new String[quantMaterials[1]];
		for(k = 0; k<materialslabTwo.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[k]);
		materialslabTwo[k] = sc.nextLine();
		}
		return materialslabTwo;
	}
	public static int [] setquantmaterialslabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int l = 0;
		int[] quantmaterialslabTwo = new int[quantMaterials[1]];
		for(l = 0; l<quantmaterialslabTwo.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabTwo[l] + " que necesitas");
		quantmaterialslabTwo[l] = sc.nextInt();
		}
		return quantmaterialslabTwo;
	}
	public static int [] setpricehomecenterlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int m = 0;
		int[] pricehomecenterlabTwo = new int[quantMaterials[1]];
		for(m = 0; m<pricehomecenterlabTwo.length; m++){
		System.out.println("Ingrese el valor de " + materialslabTwo[m] + " en " + HOMECENTER);
		pricehomecenterlabTwo[m] = sc.nextInt();
		}
		return pricehomecenterlabTwo;
	}
	public static int [] setpricewarecenterlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int n = 0;
		int[] pricewarecenterlabTwo = new int[quantMaterials[1]];
		for(n = 0; n<pricewarecenterlabTwo.length; n++){
		System.out.println("Ingrese el valor de " + materialslabTwo[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabTwo[n] = sc.nextInt();
		}
		return pricewarecenterlabTwo;
	}
	public static int [] setpricewareneighlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int o = 0;
		int[] pricewareneighlabTwo = new int[quantMaterials[1]];
		for(o = 0; o<pricewareneighlabTwo.length; o++){
		System.out.println("Ingrese el valor de " + materialslabTwo[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabTwo[o] = sc.nextInt();
		}
		return pricewareneighlabTwo;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 3 ----------------------------------------------------------
		public static String [] setmaterialslabThree(Scanner sc,String [] labours,int[] quantMaterials){
		int k = 0;
		String[] materialslabThree = new String[quantMaterials[2]];
		for(k = 0; k<materialslabThree.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[k]);
		materialslabThree[k] = sc.nextLine();
		}
		return materialslabThree;
	}
	public static int [] setquantmaterialslabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int l = 0;
		int[] quantmaterialslabThree = new int[quantMaterials[2]];
		for(l = 0; l<quantmaterialslabThree.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabThree[l] + " que necesitas");
		quantmaterialslabThree[l] = sc.nextInt();
		}
		return quantmaterialslabThree;
	}
	public static int [] setpricehomecenterlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int m = 0;
		int[] pricehomecenterlabThree = new int[quantMaterials[2]];
		for(m = 0; m<pricehomecenterlabThree.length; m++){
		System.out.println("Ingrese el valor de " + materialslabThree[m] + " en " + HOMECENTER);
		pricehomecenterlabThree[m] = sc.nextInt();
		}
		return pricehomecenterlabThree;
	}
	public static int [] setpricewarecenterlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int n = 0;
		int[] pricewarecenterlabThree = new int[quantMaterials[2]];
		for(n = 0; n<pricewarecenterlabThree.length; n++){
		System.out.println("Ingrese el valor de " + materialslabThree[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabThree[n] = sc.nextInt();
		}
		return pricewarecenterlabThree;
	}
	public static int [] setpricewareneighlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int o = 0;
		int[] pricewareneighlabThree = new int[quantMaterials[2]];
		for(o = 0; o<pricewareneighlabThree.length; o++){
		System.out.println("Ingrese el valor de " + materialslabThree[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabThree[o] = sc.nextInt();
		}
		return pricewareneighlabThree;
	}
		}		
