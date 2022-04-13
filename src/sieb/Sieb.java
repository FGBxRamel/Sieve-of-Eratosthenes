package sieb;

public class Sieb {

	public static void main(String[] args) {
		int n = 11;
		if (n < 2) {
			System.out.println("Can't take number below 2!");
		} else {
			for (int i = n-1; i < 2; i--) {
				if (n % i == 0) {
					System.out.println("Number is not a prime number.");
					break;
				}
			}
		}
	}

}
