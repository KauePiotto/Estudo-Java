package aula01;

import javax.swing.JOptionPane;

public class exericio02 {
	public static void main(String[] args) {
		int matriz[][] = { 
				{ 10, 52, 45, 63 }, 
				{ 25, 35, 31, 98 }, 
				{ 50, 60, 90, 27 }, 
				{ 65, 30, 90, 27 } 
				};
		System.out.println("Valores presentes na Matriz:\n");

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz.length;c++) {
				System.out.println(matriz[l][c] + " ");
			}
			System.out.println();
		}
		System.out.println("Valores nos índices \n" 
		+ "[0,0]\t[1,1]\t[2,2]\t[3,3]");
		String valores = "";
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(l==c)
				 valores+=matriz[l][c] + " \t";					
			}
		}
		JOptionPane.showMessageDialog(null, valores);
	}
}
