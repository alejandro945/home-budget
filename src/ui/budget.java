import java.util.Scanner;
public class system{
	private final static int BLACK_LABOUR_VALUE = 1300000;
	private final static int WHITE_LABOUR_VALUE = 2600000;
	private final static int PAINT_LABOUR_VALUE = 980000;
	private final static String HOMECENTER = "HomeCenter";
	private final static String CENTER_HARDWARE_STORE = "Ferreteria del centro";
	private final static String NEIGHBORHOOD_HARDWARE_STORE = "Ferreteria del barrio";
	public static void main(String [] args){
		int i, j, k, choiceStart, quantMaterial, quantLabours;
		int [] choiceLabour = new int [3];
		String []  blackMaterial, whiteMaterial, paintMaterial;
        String choice = "";
		Scanner sc = new Scanner(System.in);
		//------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Bienvenido a su aplicativo en donde podra identificar la mejor cotizacion para la remodelacion de su vivienda");
		System.out.println("Cuentanos cuantas obras vas a realizar?");
		quantLabours = sc.nextInt();
		System.out.println("Tenemos los siguientes tipos de obras: NEGRA, BLANCA Y PINTURA. Ahora, ingresa los nombres de estas " + quantLabours + " obras.");
		String [] labours = new String [quantLabours];
		sc.nextLine();
		for(i=0 ; i<quantLabours ; i++){
			
			labours[i] = sc.nextLine();
		}
		for(i=0 ; i<labours.length ; i++){
		System.out.println("Ingresa la cantidad de materiales que necesitas para la obra " + labours[i]);
		quantMaterial = sc.nextInt();
		sc.nextLine();
		for(j = 0; j<quantMaterial ; j++ ){
		if(labours[i].equalsIgnoreCase("NEGRA")){
			System.out.println("Ahora procede a ingresar el material " + (j + 1) + " que necesitas para la obra " + labours[j]);
			blackMaterial = new String[quantMaterial];
			blackMaterial[j] = sc.nextLine();
			System.out.println("Ingrese la cantidad de " + blackMaterial[j] + " que necesitas");
			double [] blackQuantity = new double[quantMaterial];
			blackQuantity [j] = sc.nextDouble();
			System.out.println("Ingrese el valor de " + blackMaterial[j] + " en " + HOMECENTER);
			int [] blackhomePrices = new int[quantMaterial];
			blackhomePrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + blackMaterial[j] + " en " + CENTER_HARDWARE_STORE);
			int [] blackcenterPrices = new int[quantMaterial];
			blackcenterPrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + blackMaterial[j] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
			int [] blackneighPrices = new int[quantMaterial];
			blackneighPrices[j] = sc.nextInt();
			sc.nextLine();
		}if(labours[i].equalsIgnoreCase("BLANCA")){
			System.out.println("Ahora procede a ingresar el material " + (j + 1) + " que necesitas para la obra " + labours[j]);
			whiteMaterial = new String[quantMaterial];
			whiteMaterial[j] = sc.nextLine();
			System.out.println("Ingrese la cantidad de " + whiteMaterial[j] + " que necesitas");
			double [] whiteQuantity = new double[quantMaterial];
			whiteQuantity[j] = sc.nextDouble();
			System.out.println("Ingrese el valor de " + whiteMaterial[j] + " en " + HOMECENTER);
			int [] whitehomePrices = new int[quantMaterial];
			whitehomePrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + whiteMaterial[j] + " en " + CENTER_HARDWARE_STORE);
			int [] whitecenterPrices = new int[quantMaterial];
			whitecenterPrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + whiteMaterial[j] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
			int [] whiteneighPrices = new int[quantMaterial];
			whiteneighPrices[j] = sc.nextInt();
			sc.nextLine();
		}if(labours[i].equalsIgnoreCase("PINTURA")){
			System.out.println("Ahora procede a ingresar el material " + (j + 1) + " que necesitas para la obra " + labours[j]);
			paintMaterial = new String[quantMaterial];
			paintMaterial[j] = sc.nextLine();
			System.out.println("Ingrese la cantidad de " + paintMaterial[j] + " que necesitas");
			double [] paintQuantity = new double[quantMaterial];
			paintQuantity [j] = sc.nextDouble();
			System.out.println("Ingrese el valor de " + paintMaterial[j] + " en " + HOMECENTER);
			int [] painthomePrices = new int[quantMaterial];
			painthomePrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + paintMaterial[j] + " en " + CENTER_HARDWARE_STORE);
			int [] paintcenterPrices = new int[quantMaterial];
			paintcenterPrices[j] = sc.nextInt();
			System.out.println("Ingrese el valor de " + paintMaterial[j] + " en " + NEIGHBORHOOD_HARDWARE_STORE);
			int [] paintneighPrices = new int[quantMaterial];
			paintneighPrices[j] = sc.nextInt();
			sc.nextLine();
		}
		if(choiceLabour[0] == 1 || choiceLabour[1] == 1 || choiceLabour[2] == 1){
				System.out.println("Los productos ingresados para la Obra Negra son: ");
	        for(k = 0 ; k<quantMaterial; k++){
	            System.out.println(blackMaterial[k]);
			}
			}if(choiceLabour[0] == 2 || choiceLabour[1] == 2 || choiceLabour[2] == 2){
				System.out.println("Los productos ingresados para la Obra Blanca son: ");
	        for(k = 0 ; k<quantMaterial; k++){
	            System.out.println(whiteMaterial[k]);
			}
			}if(choiceLabour[0] == 3 || choiceLabour[1] == 3 || choiceLabour[2] == 3){
				System.out.println("Los productos ingresados para la Pintura son: ");
	        for(k = 0 ; k<quantMaterial ; k++){
	            System.out.println(paintMaterial[k]);
			}
			}
		
		}		
	}
			System.out.println("Gracias por usar nuestros servicios");
	}
}