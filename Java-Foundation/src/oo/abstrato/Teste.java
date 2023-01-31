package oo.abstrato;

public class Teste {
	
	public static void main(String[] args) {
		
		Animal dog = new Cachorro();
		
		System.out.println(dog.respirar());
		System.out.println(dog.mover());
	//	System.out.println(dog.mamar());
		
		Mamifero dog2 = new Cachorro();
		
		System.out.println(dog2.respirar());
		System.out.println(dog2.mover());
		System.out.println(dog2.mamar());
		
		Cachorro dog3 = new Cachorro();
		
		System.out.println(dog3.respirar());
		System.out.println(dog3.mover());
		System.out.println(dog3.mamar());
		
	}

}
