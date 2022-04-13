package sieb;

public class Sieb {

	public static void main(String[] args) {
		int e = 17;
		if (e < 2) {
			System.out.println("Can't take number below 2!");
			return;
		}
		for (int i = 2; i <= e; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
			}
		}
	}

}
