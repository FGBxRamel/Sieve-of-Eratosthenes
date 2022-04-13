package sieb;

public class Sieb {

	public static void main(String[] args) {
		System.out.println("Started");
		int n = 14;
		if (n < 2) {
			System.out.println("Can't take number below 2!");
			System.exit(0);
		}
		System.out.println("Test");
		for (int i = n; i < 2; i--) {
			System.out.println(i);
			if (n % i == 0) {
				System.out.println("Number is not a prime number.");
				System.exit(0);
			}
		}
		System.out.println("Out");
	}

}
