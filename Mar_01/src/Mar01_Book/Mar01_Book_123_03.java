package Mar01_Book;

public class Mar01_Book_123_03 {

	public static void main(String[] args) {

		String star = "";

		for (int i = 0; i < 7; i++) {
			star += "*";
			if (i % 2 == 0) {
				System.out.println(star);
			}
		}
		for (int i = 0; i < 7; i++) {
			// star = star - "*";
			if (i % 2 == 0) {
				System.out.println(star);
			}
		}

	}

}
