import javax.swing.*;

public class conversorMoeda {
    public static void main(String[] args) {

        funcaoConversorMoeda funcaoConverterMoeda = new funcaoConversorMoeda();
        boolean continuar = true;
        while (continuar) {

            String opcaoConversorMoeda = JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção de converção de moeda",
                    "Conversor de Moedas",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]
                            {"Converter de real para dólar",
                             "Converter de real para euro",
                             "Converter de real para libra",
                             "Converter de real para yenes",
                             "Converter de real para won coreano",
                             "Converter de dólar para real",
                             "Converter de euro para real",
                             "Converter de libra para real",
                             "Converter de yenes para real",
                             "Converter de won coreano para real"},
                    "Escolha").toString();

            if (opcaoConversorMoeda == "Converter de real para dólar") {
                String realParaDolar = JOptionPane.showInputDialog("Insira o valor em reais");
                if (isNumber(realParaDolar)) {
                    double valorConvertido = Double.parseDouble(realParaDolar);
                    funcaoConverterMoeda.converterMoedaRealParaDolar(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de real para euro") {
                String realParaEuro = JOptionPane.showInputDialog("Insira o valor em reais");
                if (isNumber(realParaEuro)) {
                    double valorConvertido = Double.parseDouble(realParaEuro);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de real para libra") {
                String realParaLibra = JOptionPane.showInputDialog("Insira o valor em reais");
                if (isNumber(realParaLibra)) {
                    double valorConvertido = Double.parseDouble(realParaLibra);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de real para yenes") {
                String realParaYenes = JOptionPane.showInputDialog("Insira o valor em reais");
                if (isNumber(realParaYenes)) {
                    double valorConvertido = Double.parseDouble(realParaYenes);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de real para won coreano") {
                String realParaWonCoreano = JOptionPane.showInputDialog("Insira o valor em reais");
                if (isNumber(realParaWonCoreano)) {
                    double valorConvertido = Double.parseDouble(realParaWonCoreano);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de dólar para real") {
                String dolarParaReal = JOptionPane.showInputDialog("Insira o valor em dólar");
                if (isNumber(dolarParaReal)) {
                    double valorConvertido = Double.parseDouble(dolarParaReal);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de euro para real") {
                String euroParaReal = JOptionPane.showInputDialog("Insira o valor em euros");
                if (isNumber(euroParaReal)) {
                    double valorConvertido = Double.parseDouble(euroParaReal);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de libra para real") {
                String libraParaReal = JOptionPane.showInputDialog("Insira o valor em libras");
                if (isNumber(libraParaReal)) {
                    double valorConvertido = Double.parseDouble(libraParaReal);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de yenes para real") {
                String yenesParaReal = JOptionPane.showInputDialog("Insira o valor em yenes");
                if (isNumber(yenesParaReal)) {
                    double valorConvertido = Double.parseDouble(yenesParaReal);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else if (opcaoConversorMoeda == "Converter de won coreano para real") {
                String wonCoreanoParaReal = JOptionPane.showInputDialog("Insira o valor em won coreano");
                if (isNumber(wonCoreanoParaReal)) {
                    double valorConvertido = Double.parseDouble(wonCoreanoParaReal);
                    funcaoConverterMoeda.converterMoedaRealParaEuro(valorConvertido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            }
        }
    }

    public static boolean isNumber(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}