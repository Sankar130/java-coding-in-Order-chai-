import java.util.Scanner;

public class MethodOverLoading {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter flavour=");
		String flavour = scan.nextLine();
		System.out.println("enter quantity=");
		int quantity = scan.nextInt();
		orderchai();
		orderchai(flavour);
		orderchai(quantity);
		orderchai(flavour, quantity);
		scan.close();

	}

	public static void orderchai(int quantity) {
		System.out.println("Bill of" + quantity + "cups =" + (quantity * 10.0));
	}

	public static void orderchai(String flavour, int quantity) {
		System.out.println("Bill of " + flavour + "chai for" + quantity + "cups=" + (quantity * 15.00));

	}

	public static void orderchai(String flavour) {
		System.out.println("Bill for" + flavour + "chai=15.00");
	}

	public static void orderchai() {
		System.out.println("Bill of 1 chai=" + 10.00);
	}

}
