package git;

import javax.swing.JOptionPane;

public class JonasRuan {
	
public static void main(String args[]) {
		
		int numero1 = 0;
		int numero2 = 0;
		
		int resultado = 0;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro numero para soma"));

		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo numero para soma"));
		
		resultado = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é: "+resultado);
		
		

		
		}

}
