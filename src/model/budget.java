package model;
public class budget{
    private final static int ROUGH_CONSTRUCTION_VALUE = 1300000;
	private final static int FINAL_CONSTRUCTION_VALUE = 2600000;
	private final static int PAINT_LABOUR_VALUE = 980000;
	private final static String HOMECENTER = "HomeCenter";
	private final static String CENTER_HARDWARE_STORE = "Ferreteria del centro";
	private final static String NEIGHBORHOOD_HARDWARE_STORE = "Ferreteria del barrio";
	/**
	* Shows previously entered materials for each labour <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show all the materials entered by console <br>
	* @param labours Labours Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @param materialslabThree Names of the material Array for the third labour !=null
	*/
	public static void showMaterials(String [] labours, String [] materialslabOne, String [] materialslabTwo, String [] materialslabThree){
		int a = 0, b = 0, c = 0;
		System.out.println("Para la Obra " + labours[0] + " fueron:");
		for(a = 0 ; a<materialslabOne.length ; a++){
			System.out.println(materialslabOne[a] + " " );	
		}
		System.out.println("Para la Obra " + labours[1] + " fueron:");
		for(b = 0 ; b<materialslabTwo.length ; b++){
			System.out.println(materialslabTwo[b] + " " );	
		}
		System.out.println("Para la Obra " + labours[2] + " fueron:");
		for(c = 0 ; c<materialslabThree.length ; c++){
			System.out.println(materialslabThree[c] + " " );	
		}
	}
	/**
	* Creates the homecenter total articles invoice for each labour <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show the articles, quantity and total price for each labour at Homecenter <br>
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @param quantmaterialslabOne Positive integer number which is != 0 and String
	* @param pricehomecenterlabOne Positive integer number which is != String
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @param quantmaterialslabTwo Positive integer number which is != 0 and String
	* @param pricehomecenterlabTwo Positive integer number which is != String
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @param quantmaterialslabThree Positive integer number which is != 0 and String
	* @param pricehomecenterlabThree Positive integer number which is != String
	* @return totalmaterialsHomecenter
	*/
        public static int payatHomecenter (String [] labours,int[] quantMaterials, String[] materialslabOne, int[] quantmaterialslabOne, int[] pricehomecenterlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricehomecenterlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricehomecenterlabThree){
			int d = 0,e = 0, f = 0;
		    int [] totalhomecenterlabourOne = new int[quantMaterials[0]];
			int [] totalhomecenterlabourTwo = new int[quantMaterials[1]];
			int [] totalhomecenterlabourThree = new int[quantMaterials[2]];
			int totalmaterialsHomecenter = 0,sumhomecenterlabourOne = 0, sumhomecenterlabourTwo = 0, sumhomecenterlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + ".Se registro lo siguente:");
		    for(d = 0; d<totalhomecenterlabourOne.length; d++){
			totalhomecenterlabourOne [d] = (quantmaterialslabOne[d]*pricehomecenterlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + "---total de $" + totalhomecenterlabourOne[d]);
		     sumhomecenterlabourOne += totalhomecenterlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + ".Se registro lo siguente:");
		    for(e = 0; e<totalhomecenterlabourTwo.length; e++){
			 totalhomecenterlabourTwo [e] = (quantmaterialslabTwo[e]*pricehomecenterlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + "---total de $" + totalhomecenterlabourTwo[e]);
		     sumhomecenterlabourTwo += totalhomecenterlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + ".Se registro lo siguente:");
			for(f = 0; f<totalhomecenterlabourThree.length; f++){
			 totalhomecenterlabourThree [f] = (quantmaterialslabThree[f]*pricehomecenterlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + "---total de $" + totalhomecenterlabourThree[f]);
		     sumhomecenterlabourThree += totalhomecenterlabourThree[f];
		     }	 
			 totalmaterialsHomecenter = (sumhomecenterlabourOne+sumhomecenterlabourTwo+sumhomecenterlabourThree);
			 return totalmaterialsHomecenter;
        }
    /**
	* Creates the Center hardware store total articles invoice for each labour <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show the articles, quantity and total price for each labour at Center hardware store <br>
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @param quantmaterialslabOne Positive integer number which is != 0 and String
	* @param pricewarecenterlabOne Positive integer number which is != String
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @param quantmaterialslabTwo Positive integer number which is != 0 and String
	* @param pricewarecenterlabTwo Positive integer number which is != String
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @param quantmaterialslabThree Positive integer number which is != 0 and String
	* @param pricewarecenterlabThree Positive integer number which is != String
	* @return totalmaterialsWarecenter
	*/
		public static int payatWarecenter (String [] labours,int[] quantMaterials, String [] materialslabOne, int[] quantmaterialslabOne, int[] pricewarecenterlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricewarecenterlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricewarecenterlabThree){
			int d = 0,e = 0, f = 0;
		    int [] totalwarecenterlabourOne = new int[quantMaterials[0]];
			int [] totalwarecenterlabourTwo = new int[quantMaterials[1]];
			int [] totalwarecenterlabourThree = new int[quantMaterials[2]];
			int totalmaterialsWarecenter = 0,sumwarecenterlabourOne = 0, sumwarecenterlabourTwo = 0, sumwarecenterlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + ".Se registro lo siguente:");
		    for(d = 0; d<totalwarecenterlabourOne.length; d++){
		     totalwarecenterlabourOne [d] = (quantmaterialslabOne[d]*pricewarecenterlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + "---total de $" + totalwarecenterlabourOne [d]);
		     sumwarecenterlabourOne += totalwarecenterlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + ".Se registro lo siguente:");
		    for(e = 0; e<totalwarecenterlabourTwo.length; e++){
		     totalwarecenterlabourTwo [e] = (quantmaterialslabTwo[e]*pricewarecenterlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + "---total de $" + totalwarecenterlabourTwo[e]);
		     sumwarecenterlabourTwo += totalwarecenterlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + ".Se registro lo siguente:");
			for(f = 0; f<totalwarecenterlabourThree.length; f++){
		     totalwarecenterlabourThree [f] = (quantmaterialslabThree[f]*pricewarecenterlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + "---total de $" + totalwarecenterlabourThree[f]);
		     sumwarecenterlabourThree += totalwarecenterlabourThree[f];
		     }	 
			 totalmaterialsWarecenter = (sumwarecenterlabourOne + sumwarecenterlabourTwo + sumwarecenterlabourThree);
			 return totalmaterialsWarecenter;
        }
    /**
	* Creates the Neighborhood hardware store total articles invoice for each labour <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show the articles, quantity and total price for each labour at Neighborhood hardware store <br>
	* @param labours Labours Array != null
	* @param quantMaterials Quantity of Materials Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @param quantmaterialslabOne Positive integer number which is != 0 and String
	* @param pricewareneighlabOne Positive integer number which is != String
	* @param materialslabTwo Names of the material Array for the second labour !=null
	* @param quantmaterialslabTwo Positive integer number which is != 0 and String
	* @param pricewareneighlabTwo Positive integer number which is != String
	* @param materialslabThree Names of the material Array for the third labour !=null
	* @param quantmaterialslabThree Positive integer number which is != 0 and String
	* @param pricewareneighlabThree Positive integer number which is != String
	* @return totalmaterialsWareneigh
	*/
		  public static int payatWareneigh (String [] labours,int[] quantMaterials, String [] materialslabOne, int[] quantmaterialslabOne, int[] pricewareneighlabOne,String [] materialslabTwo, int[] quantmaterialslabTwo, int[] pricewareneighlabTwo,String [] materialslabThree, int[] quantmaterialslabThree, int[] pricewareneighlabThree){	
			int d = 0,e = 0, f = 0;
		    int [] totalwareneighlabourOne = new int[quantMaterials[0]];
			int [] totalwareneighlabourTwo = new int[quantMaterials[1]];
			int [] totalwareneighlabourThree = new int[quantMaterials[2]];
			int totalmaterialsWareneigh = 0,sumwareneighlabourOne = 0, sumwareneighlabourTwo = 0, sumwareneighlabourThree = 0;
			System.out.println("Para la Obra " + labours[0] + ".Se registro lo siguente:");
		    for(d = 0; d<totalwareneighlabourOne.length; d++){
		     totalwareneighlabourOne [d] = (quantmaterialslabOne[d]*pricewareneighlabOne[d]);
		     System.out.println(quantmaterialslabOne[d] + " de " + materialslabOne[d] + "---total de $" + totalwareneighlabourOne[d]);
		     sumwareneighlabourOne += totalwareneighlabourOne[d];
		    }
		    System.out.println("Para la Obra " + labours[1] + ".Se registro lo siguente:");
		    for(e = 0; e<totalwareneighlabourTwo.length; e++){
		     totalwareneighlabourTwo [e] = (quantmaterialslabTwo[e]*pricewareneighlabTwo[e]);
		     System.out.println(quantmaterialslabTwo[e] + " de " + materialslabTwo[e] + "---total de $" + totalwareneighlabourTwo[e]);
		     sumwareneighlabourTwo += totalwareneighlabourTwo[e];
		    }
			System.out.println("Para la Obra " + labours[2] + ".Se registro lo siguente:");
			for(f = 0; f<totalwareneighlabourThree .length; f++){
		     totalwareneighlabourThree [f] = (quantmaterialslabThree[f]*pricewareneighlabThree[f]);
		     System.out.println(quantmaterialslabThree[f] + " de " + materialslabThree[f] + "---total de $" + totalwareneighlabourThree[f]);
		     sumwareneighlabourThree += totalwareneighlabourThree[f];
		     }	 
			 totalmaterialsWareneigh = (sumwareneighlabourOne + sumwareneighlabourTwo + sumwareneighlabourThree);
			 return totalmaterialsWareneigh;
        }
	/**
	* Gets the delivery prices for each hardware store <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It has been created an array type Int with the delivery prices for each hardware store. <br>
	* @param totalmaterialsHomecenter Type int != String or simbols entered by console
	* @param totalmaterialsWarecenter Type int != String or simbols entered by console
	* @param totalmaterialsWareneigh  Type int != String or simbols entered by console
	* @param zone Option zone 1 <= zone <=3
	* @return delivery
	*/
    public static int[] priceDelivery (int totalmaterialsHomecenter, int totalmaterialsWarecenter, int totalmaterialsWareneigh, int zone){
		   int pricedeliveryHomecenter = 0 , pricedeliveryWarecenter = 0, pricedeliveryWareneigh = 0;
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
	/**
	* Gets the total prices for each hardware store <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show the values ​​to pay for each hardware store including workforce and delivery prices. <br>
    * @param labours Labours Array != null
	* @param delivery Delivery Array != null
	* @param totalmaterialsHomecenter Type int != String or simbols entered by console
	* @param totalmaterialsWarecenter Type int != String or simbols entered by console
	* @param totalmaterialsWareneigh  Type int != String or simbols entered by console
	*/
	public static void totaltoPay(String[] labours, int[] delivery, int totalmaterialsHomecenter, int totalmaterialsWarecenter, int totalmaterialsWareneigh){	
		//---------------------------------------total for each hardware store-------------------------------------------------	
		System.out.println("----------------Valor a pagar en " + HOMECENTER + "------------------------------");	
		System.out.println("Total a Pagar Materiales: ------$" + totalmaterialsHomecenter);
		System.out.println("Total a Pagar Obra " + labours[0] +": -----$" + ROUGH_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[1] +": -----$" + FINAL_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[2] +": -----$" + PAINT_LABOUR_VALUE);
		System.out.println("Total a Pagar Domicilio: --------$" + delivery[0]);
		System.out.println("-----------NETO A PAGAR:-------- $" + (totalmaterialsHomecenter+ROUGH_CONSTRUCTION_VALUE+FINAL_CONSTRUCTION_VALUE+PAINT_LABOUR_VALUE+delivery[0]));
		System.out.println("----------------Valor a pagar en " + CENTER_HARDWARE_STORE + "------------------");	
		System.out.println("Total a Pagar Materiales: -----$" + totalmaterialsWarecenter);
		System.out.println("Total a Pagar Obra " + labours[0] +": -----$" + ROUGH_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[1] +": -----$" + FINAL_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[2] +": -----$" + PAINT_LABOUR_VALUE);
		System.out.println("Total a Pagar Domicilio: --------$" + delivery[1]);
		System.out.println("-----------NETO A PAGAR:-------- $" + (totalmaterialsWarecenter+ROUGH_CONSTRUCTION_VALUE+FINAL_CONSTRUCTION_VALUE+PAINT_LABOUR_VALUE+delivery[1]));
		System.out.println("----------------Valor a pagar en " + NEIGHBORHOOD_HARDWARE_STORE + "--------------------");	
		System.out.println("Total a Pagar Materiales: -----$" + totalmaterialsWareneigh);
		System.out.println("Total a Pagar Obra " + labours[0] +": -----$" + ROUGH_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[1] +": -----$" + FINAL_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[2] +": -----$" + PAINT_LABOUR_VALUE);
		System.out.println("Total a Pagar Domicilio: --------$" + delivery[2]);
		System.out.println("-----------NETO A PAGAR:-------- $" + (totalmaterialsWareneigh+ROUGH_CONSTRUCTION_VALUE+FINAL_CONSTRUCTION_VALUE+PAINT_LABOUR_VALUE+delivery[2]));
	}
	/**
	* Shows the best prices in any of the hardware stores for each material and the best value to pay. It should be noted that this method does not include the delivery prices <br>
	* <b> pre: </b> <br>
	* <b> post: </b> It will show the best prices for each material and the best value to pay including workforce prices. <br>
    * @param labours Labours Array != null
	* @param materialslabOne Names of the material Array for the first labour !=null
	* @param materialslabTwo Names of the material Array for the first labour !=null
	* @param materialslabThree Names of the material Array for the first labour !=null
	* @param quantMaterials Quantity of Materials Array != null
	* @param quantmaterialslabOne Positive integer number which is != 0 and String
	* @param pricehomecenterlabOne Positive integer number which is != String
	* @param pricewarecenterlabOne Positive integer number which is != String
	* @param pricewareneighlabOne Positive integer number which is != String
	* @param quantmaterialslabTwo Positive integer number which is != 0 and String
	* @param pricehomecenterlabTwo Positive integer number which is != String
	* @param pricewarecenterlabTwo Positive integer number which is != String
	* @param pricewareneighlabTwo Positive integer number which is != String
	* @param quantmaterialslabThree Positive integer number which is != 0 and String
	* @param pricehomecenterlabThree Positive integer number which is != String
	* @param pricewarecenterlabThree Positive integer number which is != String
	* @param pricewareneighlabThree Positive integer number which is != String
	*/
    public static void bestPrices(String[] labours, String [] materialslabOne, String [] materialslabTwo, String [] materialslabThree, int[] quantMaterials, int[] quantmaterialslabOne, int[] pricehomecenterlabOne, int[] pricewarecenterlabOne,int[] pricewareneighlabOne, int[] quantmaterialslabTwo, int[] pricehomecenterlabTwo, int[] pricewarecenterlabTwo, int[] pricewareneighlabTwo, int[] quantmaterialslabThree, int[] pricehomecenterlabThree, int[] pricewarecenterlabThree, int[] pricewareneighlabThree){
		int bestPrice = 0,totalbestlabourOne = 0, totalbestlabourTwo = 0, totalbestlabourThree = 0, h = 0, p = 0, q = 0, r = 0, s = 0, t = 0;
		int[] bestpricelabourOne = new int[quantMaterials[0]];
		String [] bestwarelabourOne = new String[quantMaterials[0]];
		int[] bestpricelabourTwo = new int[quantMaterials[1]];
		String[] bestwarelabourTwo = new String[quantMaterials[1]];
		int[] bestpricelabourThree = new int[quantMaterials[2]];
		String[] bestwarelabourThree = new String[quantMaterials[2]];
		for(h = 0; h<materialslabOne.length ; h++){
			if(pricehomecenterlabOne[h]<=pricewarecenterlabOne[h] && pricehomecenterlabOne[h]<=pricewareneighlabOne[h]){
				bestpricelabourOne [h] = (pricehomecenterlabOne[h]*quantmaterialslabOne[h]);
				bestwarelabourOne [h] = HOMECENTER;
			}else if(pricewarecenterlabOne[h]<=pricewareneighlabOne[h]){
				bestpricelabourOne [h] = (pricewarecenterlabOne[h]*quantmaterialslabOne[h]);
				bestwarelabourOne [h] = CENTER_HARDWARE_STORE;
			}else{
				bestpricelabourOne [h] = (pricewareneighlabOne[h]*quantmaterialslabOne[h]);
				bestwarelabourOne [h] = NEIGHBORHOOD_HARDWARE_STORE;
			}
		}
		for(p = 0; p<materialslabTwo.length ; p++){
			if(pricehomecenterlabTwo[p]<=pricewarecenterlabTwo[p] && pricehomecenterlabTwo[p]<=pricewareneighlabTwo[p]){
				bestpricelabourTwo [p] = (pricehomecenterlabTwo[p]*quantmaterialslabTwo[p]);
				bestwarelabourTwo [p] = HOMECENTER;
			}else if(pricewarecenterlabTwo[p]<=pricewareneighlabTwo[p]){
				bestpricelabourTwo [p] = (pricewarecenterlabTwo[p]*quantmaterialslabTwo[p]);
				bestwarelabourTwo [p] = CENTER_HARDWARE_STORE;
			}else{
				bestpricelabourTwo [p] = (pricewareneighlabTwo[p]*quantmaterialslabTwo[p]);
				bestwarelabourTwo [p] = NEIGHBORHOOD_HARDWARE_STORE;
			}
		}
		for(q = 0; q<materialslabThree.length ; q++){
			if(pricehomecenterlabThree[q]<=pricewarecenterlabThree[q] && pricehomecenterlabThree[q]<=pricewareneighlabThree[q]){
				bestpricelabourThree [q] = (pricehomecenterlabThree[q]*quantmaterialslabThree[q]);
				bestwarelabourThree [q] = HOMECENTER;
			}else if(pricewarecenterlabThree[q]<=pricewareneighlabThree[q]){
				bestpricelabourThree [q] = (pricewarecenterlabThree[q]*quantmaterialslabThree[q]);
				bestwarelabourThree [q] = CENTER_HARDWARE_STORE;
			}else{
				bestpricelabourThree [q] = (pricewareneighlabThree[q]*quantmaterialslabThree[q]);
				bestwarelabourThree [q] = NEIGHBORHOOD_HARDWARE_STORE;
			}
		}
		System.out.println("--------------------En la Obra " + labours[0] + "--------------------");
		for(r = 0; r<materialslabOne.length ; r++){
			System.out.println("El material: " + materialslabOne[r] + " es mejor comprarlo en " + bestwarelabourOne[r] + " con un valor total de $" + bestpricelabourOne[r]);
			totalbestlabourOne += bestpricelabourOne[r];
		}
		System.out.println("--------------------En la Obra " + labours[1] + "--------------------");
		for(s = 0; s<materialslabTwo.length ; s++){
			System.out.println("El material: " + materialslabTwo[s] + " es mejor comprarlo en " + bestwarelabourTwo[s] + " con un valor total de $" + bestpricelabourTwo[s]);
			totalbestlabourTwo += bestpricelabourTwo[s];
		}
		System.out.println("--------------------En la Obra " + labours[2] + "--------------------");
		for(t = 0; t<materialslabThree.length ; t++){
			System.out.println("El material: " + materialslabThree[t] + " es mejor comprarlo en " + bestwarelabourThree[t] + " con un valor total de $" + bestpricelabourThree[t]);
			totalbestlabourThree += bestpricelabourThree[t];
		}
		bestPrice = (totalbestlabourOne+totalbestlabourTwo+totalbestlabourThree);
		System.out.println("-------------------------------Y PAGARIAS ESTO:-------------------------------");
		System.out.println("Total a Pagar Materiales: ------$" + bestPrice);
		System.out.println("Total a Pagar Obra " + labours[0] +": -----$" + ROUGH_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[1] +": -----$" + FINAL_CONSTRUCTION_VALUE);
		System.out.println("Total a Pagar Obra " + labours[2] +": -----$" + PAINT_LABOUR_VALUE);
		System.out.println("-------NETO A PAGAR SIN DOMICILIO:-------- $" + (bestPrice+ROUGH_CONSTRUCTION_VALUE+FINAL_CONSTRUCTION_VALUE+PAINT_LABOUR_VALUE));
	}
		}		