import javax.swing.*;

public class funcaoConversorMoeda {
    public void converterMoedaRealParaDolar(double valor) {
        double valorConversao = valor / 5.17 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em dólar: " + valorConversao);
    }

    public void converterMoedaDolarParaReal(double valor) {
        double valorConversao = valor * 5.17 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + valorConversao);
    }

    public void converterMoedaRealParaEuro(double valor) {
        double valorConversao = valor / 5.07 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em euro: " + valorConversao);
    }

    public void converterMoedaEuroParaReal(double valor) {
        double valorConversao = valor * 5.07 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + valorConversao);
    }

    public void converterMoedaRealParaLibra(double valor) {
        double valorConversao = valor / 5.84 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em libra: " + valorConversao);
    }

    public void converterMoedaLibraParaReal(double valor) {
        double valorConversao = valor * 5.84 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + valorConversao);
    }

    public void converterMoedaRealParaYenes(double valor) {
        double valorConversao = valor / 0.037 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em Yenes: " + valorConversao);
    }

    public void converterMoedaYenesParaReal(double valor) {
        double valorConversao = valor * 27.98 ;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + valorConversao);
    }

    public void converterMoedaRealParaWonCoreano(double valor) {
        double valorConversao = valor / 27.98;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em Won Coreano: " + valorConversao);
    }

    public void converterMoedaWonCoreanoParaReal(double valor) {
        double valorConversao = valor * 277.46;
        valorConversao = (double) Math.round(valorConversao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + valorConversao);
    }
}
