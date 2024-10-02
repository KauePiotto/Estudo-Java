package animalAbstrato;

public enum TipoAnimal {
	PEIXES("Peixes",1), REPITEIS("Repiteis",2), ANFIBIOS("Anfibios",3), AVES("Aves",4),
	MAMIFEROS("Mamiferos",5);

	String descricao;
	int ordem;

	TipoAnimal(String descricao, int ordem) {
		this.descricao = descricao;
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return descricao;
	}
}
