package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 350.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Argentinos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 368.9;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Argentinos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 427.16;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Argentinos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 2.34;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Argentinos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.26;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Argentinos");
	}
}
