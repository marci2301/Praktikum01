
public class Uhrzeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variablen
	
				
				StdOut.println("Geben Sie in diesem Programm zwei Uhrzeiten ein! ");
				StdOut.println("Die zweite Uhrzeit muss groesser sein als die erste! ");				
				
				//Uhrzeiten einlesen
				
				StdOut.print("Geben Sie die Stunden erste Uhrzeit ein: ");
				int huhr1 = StdIn.readInt();
				StdOut.print("Geben Sie die Minuten erste Uhrzeit ein: ");
				int muhr1 = StdIn.readInt();
				
			
				StdOut.print("Geben Sie die Stunden zweite Uhrzeit ein: ");
				int huhr2 = StdIn.readInt();
				StdOut.print("Geben Sie die Minuten zweite Uhrzeit ein: ");
				int muhr2 = StdIn.readInt();
					
				//Berechnung
				
				int huhr3 = (huhr2 - huhr1)*60;
				int muhr3 = muhr2 - muhr1;
				
				int gesamt = huhr3 + muhr3;
				int gesMin = gesamt%60;
				int gesStu = gesamt/60;
				
				//Ausgabe
				
				//StdOut.println("Abstand zwischen den Uhrzeiten in Minuten: " +uhrStunEr1 );
				//StdOut.println("Minuten: " +uhrMinEr1);
				
				
				StdOut.println("Abstand zwischen den Uhrzeiten in Minuten betraegt: " +gesamt);
				
				StdOut.println("Anzeige in Stunden & Minuten: " + gesStu + ":" + gesMin + "h");
		
		
		
	}
}
