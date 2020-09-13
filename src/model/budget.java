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
			System.out.println("Procede a ingresar el tipo de la Obra " + (i + 1));
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
		System.out.println("Ingrese el valor unitario de " + materialslabOne[m] + " en " + HOMECENTER);
		pricehomecenterlabOne[m] = sc.nextInt();
		}
		return pricehomecenterlabOne;
	}
	public static int [] setpricewarecenterlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int n = 0;
		int[] pricewarecenterlabOne = new int[quantMaterials[0]];
		for(n = 0; n<pricewarecenterlabOne.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabOne[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabOne[n] = sc.nextInt();
		}
		return pricewarecenterlabOne;
	}
	public static int [] setpricewareneighlabOne(Scanner sc,int[] quantMaterials,String [] materialslabOne){
		int o = 0;
		int[] pricewareneighlabOne = new int[quantMaterials[0]];
		for(o = 0; o<pricewareneighlabOne.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabOne[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabOne[o] = sc.nextInt();
		}
		return pricewareneighlabOne;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 2 ----------------------------------------------------------
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
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[m] + " en " + HOMECENTER);
		pricehomecenterlabTwo[m] = sc.nextInt();
		}
		return pricehomecenterlabTwo;
	}
	public static int [] setpricewarecenterlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int n = 0;
		int[] pricewarecenterlabTwo = new int[quantMaterials[1]];
		for(n = 0; n<pricewarecenterlabTwo.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabTwo[n] = sc.nextInt();
		}
		return pricewarecenterlabTwo;
	}
	public static int [] setpricewareneighlabTwo(Scanner sc,int[] quantMaterials,String [] materialslabTwo){
		int o = 0;
		int[] pricewareneighlabTwo = new int[quantMaterials[1]];
		for(o = 0; o<pricewareneighlabTwo.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabTwo[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabTwo[o] = sc.nextInt();
		}
		return pricewareneighlabTwo;
	}
	//-----------------------------------------array materiales, cantidad y precio de la labor 3 ----------------------------------------------------------
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
		System.out.println("Ingrese el valor unitario de " + materialslabThree[m] + " en " + HOMECENTER);
		pricehomecenterlabThree[m] = sc.nextInt();
		}
		return pricehomecenterlabThree;
	}
	public static int [] setpricewarecenterlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int n = 0;
		int[] pricewarecenterlabThree = new int[quantMaterials[2]];
		for(n = 0; n<pricewarecenterlabThree.length; n++){
		System.out.println("Ingrese el valor unitario de " + materialslabThree[n] + " en " + CENTER_HARDWARE_STORE);
		pricewarecenterlabThree[n] = sc.nextInt();
		}
		return pricewarecenterlabThree;
	}
	public static int [] setpricewareneighlabThree(Scanner sc,int[] quantMaterials,String [] materialslabThree){
		int o = 0;
		int[] pricewareneighlabThree = new int[quantMaterials[2]];
		for(o = 0; o<pricewareneighlabThree.length; o++){
		System.out.println("Ingrese el valor unitario de " + materialslabThree[o] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
		pricewareneighlabThree[o] = sc.nextInt();
		}
		return pricewareneighlabThree;
	}
	//-------------------------------------------------------Show materials--------------------------------------------------------------------
	public static void showMaterials(String [] labours, String [] materialslabOne, String [] materialslabTwo, String [] materialslabThree){
		int a = 0, b = 0, c = 0;
		System.out.println("Los materiales ingresados para la Obra " + labours[0] + " fueron:");
		for(a = 0 ; a<materialslabOne.length ; a++){
			System.out.println(materialslabOne[a] + " " );	
		}
		System.out.println("Los materiales ingresados para la Obra " + labours[1] + " fueron:");
		for(b = 0 ; b<materialslabTwo.length ; b++){
			System.out.println(materialslabTwo[b] + " " );	
		}
		System.out.println("Los materiales ingresados para la Obra " + labours[2] + " fueron:");
		for(c = 0 ; c<materialslabThree.length ; c++){
			System.out.println(materialslabThree[c] + " " );	
		}
	}
	//-----------------------------------------------------Results--------------------------------------------------------------------------------------------------
	/*public static void totaltopay(){	
		//---------------------------------------total for each hardware-------------------------------------------------
		System.out.println("----------------Hemos generado los siguentes valores totales----------------");	
		System.out.println("----------------HOMECENTER----------------");	
		System.out.println("Total a Pagar materiales: $" + ());
		
		System.out.println("Total a Pagar materiales en Ferreteria del centro: $" + ());
		System.out.println("Total a Pagar materiales en Ferreteria del barrio: $" + ());
	}*/
	//--------------------------------------------------Domicilio----------------------------------------------------------------------------
    public static int[] priceDelivery (Scanner sc, int totalmaterialsHomecenter, int totalmaterialsWarecenter, int totalmaterialsWareneigh){
		   int pricedeliveryHomecenter = 0 , pricedeliveryWarecenter = 0, pricedeliveryWareneigh = 0;
		   int g = 0;
	       System.out.println("Para finalizar solo indicanos en que zona se encuentra ubicado tu inmueble. Elige una opcion: ");
		   System.out.println("1-NORTE");
		   System.out.println("2-CENTRO");
		   System.out.println("3-SUR");
		   int zone = sc.nextInt();
		   if(totalmaterialsHomecenter<80000  && zone==1){
			   pricedeliveryHomecenter = 120000;
		   }else if(totalmaterialsHomecenter<300000  && zone==1){
			   pricedeliveryHomecenter = 28000;
		   }else if(totalmaterialsHomecenter<80000  && zone==2){
			   pricedeliveryHomecenter = 50000;
		   }else if(totalmaterialsHomecenter<300000  && zone==2){
			   pricedeliveryHomecenter = 0;
		   }else if(totalmaterialsHomecenter<80000  && zone==3){
			   pricedeliveryHomecenter = 120000;
		   }else if(totalmaterialsHomecenter<300000  && zone==3){
			   pricedeliveryHomecenter = 55000;
		   }
		   if(totalmaterialsWarecenter<80000  && zone==1){
			   pricedeliveryWarecenter = 120000;
		   }else if(totalmaterialsWarecenter<300000  && zone==1){
			   pricedeliveryWarecenter = 28000;
		   }else if(totalmaterialsWarecenter<80000  && zone==2){
			   pricedeliveryWarecenter = 50000;
		   }else if(totalmaterialsWarecenter<300000  && zone==2){
			   pricedeliveryWarecenter = 0;
		   }else if(totalmaterialsWarecenter<80000  && zone==3){
			   pricedeliveryWarecenter = 120000;
		   }else if(totalmaterialsWarecenter<300000  && zone==3){
			   pricedeliveryWarecenter = 55000;
		   }
		   if(totalmaterialsWareneigh<80000  && zone==1){
			   pricedeliveryWareneigh = 120000;
		   }else if(totalmaterialsWareneigh<300000  && zone==1){
			   pricedeliveryWareneigh = 28000;
		   }else if(totalmaterialsWareneigh<80000  && zone==2){
			   pricedeliveryWareneigh = 50000;
		   }else if(totalmaterialsWareneigh<300000  && zone==2){
			   pricedeliveryWareneigh = 0;
		   }else if(totalmaterialsWareneigh<80000  && zone==3){
			   pricedeliveryWareneigh = 120000;
		   }else if(totalmaterialsWareneigh<300000  && zone==3){
			   pricedeliveryWareneigh = 55000;
		   }
		   if(totalmaterialsHomecenter>=300000){
			   pricedeliveryHomecenter = 0;
		   }
		   if(totalmaterialsWarecenter>=300000){
			   pricedeliveryWarecenter = 0;
		   }
		   if(totalmaterialsWareneigh>=300000){
			   pricedeliveryWareneigh = 0;
		   }
			 int [] delivery ={pricedeliveryHomecenter,pricedeliveryWarecenter,pricedeliveryWareneigh};   
             return delivery;
     }
	//-----------------------------------------------receipt for each hardware store----------------------------------------------
        public static int payatHomecenter (String [] labours,int[] quantMaterials, String[] materialslabOne, int[] quantmaterialslabOne, int[] pricehomecenterlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricehomecenterlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricehomecenterlabThree){
	       	System.out.println("----------------Hemos generado los siguentes resultados----------------");	
			int d = 0,e = 0, f = 0;
		    int [] totalhomecenterlabourOne = new int[quantMaterials[0]];
			int [] totalhomecenterlabourTwo = new int[quantMaterials[1]];
			int [] totalhomecenterlabourThree = new int[quantMaterials[2]];
			int totalmaterialsHomecenter = 0,sumhomecenterlabourOne = 0, sumhomecenterlabourTwo = 0, sumhomecenterlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + " .Se registro lo siguente:");

		    for(d = 0; d<totalhomecenterlabourOne.length; d++){
			totalhomecenterlabourOne [d] = (quantmaterialslabOne[d]*pricehomecenterlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + ". Con un valor total en " + HOMECENTER + " de $" + totalhomecenterlabourOne[d]);
		     sumhomecenterlabourOne += totalhomecenterlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + " .Se registro lo siguente:");
		    for(e = 0; e<totalhomecenterlabourTwo.length; e++){
			 totalhomecenterlabourTwo [e] = (quantmaterialslabTwo[e]*pricehomecenterlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + ". Con un valor total en " + HOMECENTER + " de $" + totalhomecenterlabourTwo[e]);
		     sumhomecenterlabourTwo += totalhomecenterlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + " .Se registro lo siguente:");
			for(f = 0; f<totalhomecenterlabourThree.length; f++){
			 totalhomecenterlabourThree [f] = (quantmaterialslabThree[f]*pricehomecenterlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + ". Con un valor total en " + HOMECENTER + " de $" + totalhomecenterlabourThree[f]);
		     sumhomecenterlabourThree += totalhomecenterlabourThree[f];
		     }	 
			 totalmaterialsHomecenter = (sumhomecenterlabourOne+sumhomecenterlabourTwo+sumhomecenterlabourThree);
			 return totalmaterialsHomecenter;
        }
		public static int payatWarecenter (String [] labours,int[] quantMaterials, String [] materialslabOne, int[] quantmaterialslabOne, int[] pricewarecenterlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricewarecenterlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricewarecenterlabThree){
			int d = 0,e = 0, f = 0;
		    int [] totalwarecenterlabourOne = new int[quantMaterials[0]];
			int [] totalwarecenterlabourTwo = new int[quantMaterials[1]];
			int [] totalwarecenterlabourThree = new int[quantMaterials[2]];
			int totalmaterialsWarecenter = 0,sumwarecenterlabourOne = 0, sumwarecenterlabourTwo = 0, sumwarecenterlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + " .Se registro lo siguente:");
		    for(d = 0; d<totalwarecenterlabourOne.length; d++){
		     totalwarecenterlabourOne [d] = (quantmaterialslabOne[d]*pricewarecenterlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + ". Con un valor total en " + CENTER_HARDWARE_STORE + " de $" + totalwarecenterlabourOne [d]);
		     sumwarecenterlabourOne += totalwarecenterlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + " .Se registro lo siguente:");
		    for(e = 0; e<totalwarecenterlabourTwo.length; e++){
		     totalwarecenterlabourTwo [e] = (quantmaterialslabTwo[e]*pricewarecenterlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + ". Con un valor total en " + CENTER_HARDWARE_STORE + " de $" + totalwarecenterlabourTwo[e]);
		     sumwarecenterlabourTwo += totalwarecenterlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + " .Se registro lo siguente:");
			for(f = 0; f<totalwarecenterlabourThree.length; f++){
		     totalwarecenterlabourThree [f] = (quantmaterialslabThree[f]*pricewarecenterlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + ". Con un valor total en " + CENTER_HARDWARE_STORE + " de $" + totalwarecenterlabourThree[f]);
		     sumwarecenterlabourThree += totalwarecenterlabourThree[f];
		     }	 
			 totalmaterialsWarecenter = (sumwarecenterlabourOne + sumwarecenterlabourTwo + sumwarecenterlabourThree);
			 return totalmaterialsWarecenter;
        }
		  public static int payatWareneigh (String [] labours,int[] quantMaterials, String [] materialslabOne, int[] quantmaterialslabOne, int[] pricewareneighlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricewareneighlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricewareneighlabThree){
			int d = 0,e = 0, f = 0;
		    int [] totalwareneighlabourOne = new int[quantMaterials[0]];
			int [] totalwareneighlabourTwo = new int[quantMaterials[1]];
			int [] totalwareneighlabourThree = new int[quantMaterials[2]];
			int totalmaterialsWareneigh = 0,sumwareneighlabourOne = 0, sumwareneighlabourTwo = 0, sumwareneighlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + " .Se registro lo siguente:");
		    for(d = 0; d<totalwareneighlabourOne.length; d++){
		     totalwareneighlabourOne [d] = (quantmaterialslabOne[d]*pricewareneighlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + ". Con un valor total en " + NEIGHBORHOOD_HARDWARE_STORE + " de $" + totalwareneighlabourOne[d]);
		     sumwareneighlabourOne += totalwareneighlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + " .Se registro lo siguente:");
		    for(e = 0; e<totalwareneighlabourTwo.length; e++){
		     totalwareneighlabourTwo [e] = (quantmaterialslabTwo[e]*pricewareneighlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + ". Con un valor total en " + NEIGHBORHOOD_HARDWARE_STORE + " de $" + totalwareneighlabourTwo[e]);
		     sumwareneighlabourTwo += totalwareneighlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + " .Se registro lo siguente:");
			for(f = 0; f<totalwareneighlabourThree .length; f++){
		     totalwareneighlabourThree [f] = (quantmaterialslabThree[f]*pricewareneighlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + ". Con un valor total en " + NEIGHBORHOOD_HARDWARE_STORE + " de $" + totalwareneighlabourThree[f]);
		     sumwareneighlabourThree += totalwareneighlabourThree[f];
		     }	 
			 totalmaterialsWareneigh = (sumwareneighlabourOne + sumwareneighlabourTwo + sumwareneighlabourThree);
			 return totalmaterialsWareneigh;
        }
		
		}		
