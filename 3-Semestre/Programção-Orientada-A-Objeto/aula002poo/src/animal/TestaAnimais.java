package animal;

public class TestaAnimais {
	public static void main(String[] args) {
//Craindo um cachorro
	Cachorro dog1 = new Cachorro();
	dog1.nome = "Rex";
	dog1.raca = "Labrador";
	dog1.latir(2);
	dog1.comer();
	dog1.info();

	Cachorro dog2 = new Cachorro();
	dog2.nome = "Lulu";
	dog2.raca = "Poodle";
	dog2.latir(2);
	dog2.comer();
	dog2.info();
	dog2.dormir();
	dog2.info();
	
	System.out.println("Mordida\n");
	dog1.info();
	dog2.morder(dog1);
	dog1.info();
	}
}
