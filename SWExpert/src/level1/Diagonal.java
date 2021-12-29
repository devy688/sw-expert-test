package level1;

public class Diagonal {

	public static void main(String[] args) {

		int num = 5;
		char hashTag = '#';
		char plus = '+';

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == i) {
					System.out.print(hashTag);
				} else {
					System.out.print(plus);
				}
			}
			System.out.println("");
		}
	}
}
