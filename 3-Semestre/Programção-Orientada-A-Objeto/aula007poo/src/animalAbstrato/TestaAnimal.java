package animalAbstrato;

import javax.swing.JOptionPane;

public class TestaAnimal {
	public static void main(String[] args) {
		Cachorro rex = new Cachorro();
		
		System.out.println(rex.getTipoAnimal());
		
		JOptionPane.showInputDialog(null, "Esolha um tipo", null, 0, null, 
				TipoAnimal.values(), null);
	}
}
