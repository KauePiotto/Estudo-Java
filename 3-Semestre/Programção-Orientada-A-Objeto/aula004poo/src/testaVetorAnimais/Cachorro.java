package testaVetorAnimais;

public class Cachorro {
	//Atributos (estado)
	
		public String nome;
		public String raca;
		private boolean fome = true;

		//Métodos (comportamentos)
		
		public Cachorro(String nome, String raca) {
			this.nome = nome;
			this.raca = raca;
		}
		public void latir(int latidos) {
		System.out.println(this.nome+" latindo:");
		for(int i = 0; i < latidos; i++) {
			System.out.println("Au Au");
		}	
	 }
		public void info() {
		System.out.printf("Nome: %s%nRaça: %s%n",this.nome,this.raca);
		//Consdição ? valor se verdadeiro : valor se for falso
		System.out.println(fome ? "Estou com fome" : "Não estou com fome" );
		System.out.println();
	  }
		public void comer() {
		if(fome) {
			fome = false;
		}
	  }
		public void dormir() {
			System.out.println("zzzzzzzzzzzzz");
			fome = true;
		}
		private void chorar() {
			System.out.println("uim uim uim uim uim");
		}
		public void morder(Cachorro dog) {
			dog.chorar();
			dog.fome = true;
		}
}
