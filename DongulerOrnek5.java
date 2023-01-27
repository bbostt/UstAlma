import java.util.Scanner;
public class DongulerOrnek5 {

	public static void main(String[] args) {
		// Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý "For Döngüsü" kullanarak yapýnýz
		// example : x ^ y
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("x sayýsýný giriniz : ");
		int x = input.nextInt();
		
		System.out.print("y sayýsýný giriniz : ");
		int y = input.nextInt();
		
		// x ^ y
		
		int total = 1;
		for(int i=1; i<=y; i++) {
			total = total * x;
		}
		
		System.out.println(x + " uzeri " + y + " = " +total);

	}

}
