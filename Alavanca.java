/* PEDRO DE TORRES MASCHIO
   DATE: 12/10/2016
   All rights reserved.
*/
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class Alavanca{
	public static void main(String[] args){
		double f1, f2, d1, d2, f3, d4, result;
		int opc, cont1;
		String valor, r, cont;
		do{
		JOptionPane.showMessageDialog(null, "Informe os valores para calcularmos o equilibrio.");
		valor = JOptionPane.showInputDialog("Informe o peso que voce ja tem(em newtons): ");
		f1 = Double.parseDouble(valor.trim());
		
		valor = JOptionPane.showInputDialog("Informe a distancia que voce ja tem: ");
		d1 = Double.parseDouble(valor.trim());
		
		valor = JOptionPane.showInputDialog("Voce quer descobrir a distancia(1) ou a massa(2): ");
		opc = Integer.parseInt(valor.trim());
		if(opc == 1){
			valor = JOptionPane.showInputDialog("Informe o peso do outro lado que voce ja tem: ");
			f3 = Double.parseDouble(valor.trim());
			result = (f1*d1)/f3;
			r = String.format("A distancia e: %.2f metros", result);
			JOptionPane.showMessageDialog(null, r);
		}
		else if(opc == 2){
			valor = JOptionPane.showInputDialog("Informe a distancia do outro lado que voce ja tem(em metros): ");
			d4 = Double.parseDouble(valor.trim());
			result = (f1*d1)/d4;
			r = String.format("A massa e: %.2fN", result);
			JOptionPane.showMessageDialog(null, r);
		}
		else
			JOptionPane.showMessageDialog(null, "Opcao invalida!");
		cont = JOptionPane.showInputDialog("Deseja repetir, 1 para sim e 0 para sair");
		cont1 = Integer.parseInt(cont.trim());
		}while(cont1 != 0);
	}
}
