package controle;

public class Break {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break;
				}
				System.out.printf("[%d %d]", i, j);
			}

		}
	}

}
