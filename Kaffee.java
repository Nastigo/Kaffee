
import Prog1Tools.IOTools;
public class Kaffee {

	public static void main(String[] args) {
		double zt, kt;  // zt-Zimmertemperatur, kt-kaffeetemperatur
		int i;
		kt=IOTools.readDouble("Anfangstemperatur des Kaffee: ");
		
		if (kt<0||kt>100) {
			System.out.println("Nur Werte zwischen 0 und 100 Grad Celsius");
		}
		
		else {
			i=1;
			
			do {
			zt=21;
			
			System.out.printf("%-3d",i);
			System.out.printf(". Minute    ");
			System.out.printf("Anfangstemp: ");
			System.out.printf("%.2f",kt);
			System.out.printf("  ");
			
			kt=kt+(zt-kt)*0.1;
			System.out.printf("akt.Kaffeetemp: ");
			System.out.printf("%.2f",kt);
			System.out.println();
			i++; //i=i+1
	    	}
			
			while(kt-zt>=0.5);
		}
		
    }
}
