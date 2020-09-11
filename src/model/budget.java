package model;
import java.util.Scanner;
public class budget{
    //--------------------------------------------Object----------------------------------------------------------------
	Scanner sc = new Scanner(System.in);
    //------------------------------------------------Const------------------------------------------------------------
    private final static int BLACK_LABOUR_VALUE = 1300000;
	private final static int WHITE_LABOUR_VALUE = 2600000;
	private final static int PAINT_LABOUR_VALUE = 980000;
	private final static String HOMECENTER = "HomeCenter";
	private final static String CENTER_HARDWARE_STORE = "Ferreteria del centro";
	private final static String NEIGHBORHOOD_HARDWARE_STORE = "Ferreteria del barrio";
    //----------------------------------------------Methods-------------------------------------------------------------------------------------
	//--------------------------------------------array labores-----------------------------------------
	public static String [] getLabours (sc){
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
	//-----------------------------------------------------array cantidad materiales para cada obra----------------------------
	public static int[] setquantArray (sc,labours){
		int j = 0;
		int[] quantMaterials = new int[labours.length];
		for(j = 0; j<labours.length ; j++){
		System.out.println("Ingresa la cantidad de materiales que necesitas para la obra " + labours[j]);
		quantMaterials[j] = sc.nextInt();
		}
		return quantMaterials;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 1 ----------------------------------------------------------
	public static String [] setmaterialslabOne(sc,labours,quantMaterials){
		int k = 0;
		String[] materialslabOne = new String[quantMaterials[0]];
		for(k = 0; k<materialslabOne.length; k++){
		System.out.println("Ahora procede a ingresar el material " + (k + 1) + " que necesitas para la obra " + labours[k]);
		materialslabOne[k] = sc.nextLine();
		}
		return materialslabOne;
	}
	public static int [] setquantmaterialslabOne(sc,quantMaterials,materialslabOne){
		int l = 0;
		int[] quantmaterialslabOne = new int[quantMaterials[0]];
		for(l = 0; l<quantmaterialslabOne.length; l++){
		System.out.println("Ingrese la cantidad de " + materialslabOne[l] + " que necesitas");
		quantmaterialslabOne[l] = sc.nextInt();
		}
		return quantmaterialslabOne;
	}
	public static int [] setpricehomecenterlabOne(sc,quantMaterials,materialslabOne){
		int m = 0;
		int[] pricehomecenterlabOne = new int[quantMaterials[0]];
		for(m = 0; m<pricehomecenterlabOne.length; m++){
		System.out.println("Ingrese el valor de " + materialslabOne[m] + " en " + HOMECENTER);
		pricehomecenterlabOne[m] = sc.nextInt();
		}
		return pricehomecenterlabOne;
	}
	public static int [] setpricewarecenterlabOne(sc,quantMaterials,materialslabOne){
		int n = 0;
		int[] pricewarecenterlabOne = new int[quantMaterials[0]];
		for(n = 0; n<pricewarecenterlabOne.length; n++){
		System.out.println("Ingrese el valor de " + materialslabOne[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabOne[n] = sc.nextInt();
		}
		return pricewarecenterlabOne;
	}
	public static int [] setpricewareneighlabOne(sc,quantMaterials,materialslabOne){
		int o = 0;
		int[] pricewareneighlabOne = new int[quantMaterials[0]];
		for(o = 0; o<pricewareneighlabOne.length; o++){
		System.out.println("Ingrese el valor de " + materialslabOne[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabOne[o] = sc.nextInt();
		}
		return pricewareneighlabOne;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 2 ----------------------------------------------------------
	
	
	
		}		
