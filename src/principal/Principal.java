package principal;

import javax.swing.JOptionPane;
import model.Veiculo;
public class Principal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite os quilometros percorridos:")));
        v1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Digite os litros gastos:")));
        
        JOptionPane.showMessageDialog(null, "O consumo é " + v1.getConsumo() + "km/l");
    }
}
