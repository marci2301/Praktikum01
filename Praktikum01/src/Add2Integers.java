
public class Add2Integers {

	public static void main(String[] args) {

		StdOut.println("Diese Programm addiert zwei ganze Zahlen.");
		StdOut.print("Bitte erste Zahl eingeben: ");
		int n1 = StdIn.readInt();
		StdOut.print("Bitte zweite Zahl eingeben: ");
		int n2 = StdIn.readInt();
		int sum = n1 + n2;
		StdOut.println("Die Summe ist " + sum + ".");
		
	}
}
