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
		
<<<<<<< Updated upstream
		JOptionPane.showMessageDialog(null, "O resultado da soma é: "+resultado);
=======
		resultadomult = numero1 * numero2;
		
		resultadosub = numero1 - numero2;
		
		resultadodiv = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é: "+resultadosoma);
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação: "+resultadomult);
>>>>>>> Stashed changes
		
		if(numero1 == 0 || numero2 == 0) {
			JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por 0:");
		}
		else {
			JOptionPane.showMessageDialog(null, "O resultado da divisão: "+resultadodiv);
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da subtração: "+resultadosub);
		

		
		}

}
