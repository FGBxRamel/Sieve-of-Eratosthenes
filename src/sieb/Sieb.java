package sieb;

import java.util.Arrays;
import java.util.Scanner;

public class Sieb {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter Max-Number");
		int e = userIn.nextInt();
		userIn.close();
		System.out.println("Result:");
		if (e < 2) {
			System.out.println("Can't take number below 2!");
			return;
		}
		boolean[] status = new boolean[e];
		Arrays.fill(status, true);
		for (int i = 2; i < Math.sqrt(e); i++) {
			if (status[i]) {
				for (int j = i + i; j < e; j += i) {
					status[j] = false;
				}
			}
		}
		for (int i = 0; i < status.length; i++) {
			if (status[i]) {
				System.out.println(i);
			}
		}
	}

}
