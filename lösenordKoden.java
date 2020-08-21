package l�senord;

import java.util.Scanner;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your password");
		String password;
		String correct = "1124";

		boolean moretrys = true;
		int count = 1;
		while (moretrys) {
			password = reader.nextLine();

			if (password.equals(correct)) {
				System.out.println("Correct password");
				System.out.println("Good job");
				moretrys = false;
			} else {
				System.out.println("Wrong password");

				int trysleft = 3 - count;

				if (trysleft < 3) {
					System.out.println("Tips! SOS nummret plus en fyra!");

				}
				if (trysleft > 0) {
					System.out.println(" you have " + trysleft + " tries left");
				}

			}
			if (count == 3)

				moretrys = false;
			count++;

		}
		reader.close();

	}

}
