import java.util.Scanner;
public class DongulerOrnek5 {

	public static void main(String[] args) {
		// Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� "For D�ng�s�" kullanarak yap�n�z
		// example : x ^ y
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x say�s�n� giriniz : ");
		int x = input.nextInt();
		
		System.out.print("y say�s�n� giriniz : ");
		int y = input.nextInt();
		
		// x ^ y
		
		int total = 1;
		for(int i=1; i<=y; i++) {
			total = total * x;
		}
		
		System.out.println(x + " uzeri " + y + " = " +total);

	}

}
