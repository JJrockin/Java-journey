package arrays;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Paulo Borges";
		u1.email = "pauloborges@ezmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Paulo Borges";
		u2.email = "pauloborges@ezmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

	}
}
