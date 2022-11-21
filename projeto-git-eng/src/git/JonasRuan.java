package git;

import javax.swing.JOptionPane;

public class JonasRuan {
	
public static void main(String args[]) {
		
		int numero1 = 0;
		int numero2 = 0;
		
		int resultadosoma = 0;
		int resultadomult = 0;
		int resultadosub = 0;
		int resultadodiv = 0;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro numero para soma"));

		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo numero para soma"));
		
		resultadosoma = numero1 + numero2;
		
		resultadomult = numero1 * numero2;
		
		resultadosub = numero1 - numero2;
		
		resultadodiv = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma Ã©: "+resultadosoma);
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação: "+resultadomult);
		JOptionPane.showMessageDialog(null, "O resultado da subtração: "+resultadosub);
		JOptionPane.showMessageDialog(null, "O resultado da divisão: "+resultadodiv);
		
		

		
		}

}
