package br.newtonpaiva.cantina;

import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Integer opcao;
        Ingrediente ingrediente;

        pedido.getCliente().setNome(JOptionPane.showInputDialog(null, "Informe o nome do cliente:"));
        pedido.getMassa().setTipo(JOptionPane.showInputDialog(null, "Informe o nome da massa: "));
        pedido.getMassa().setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da massa:")));

        while (true) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os ingredientes escolhidos:\n" +
                    "1-Bacon\n" +
                    "2-Mussarela\n" +
                    "3-Tomate\n" +
                    "4-Queijo\n" +
                    "5-Sair\n" +
                    "*Cada ingrediente será acréscimo de 2 reais."));

            if(opcao == 5)
                break;

            ingrediente = new Ingrediente();
            ingrediente.setNome(opcao);
            pedido.getIngredientes().add(ingrediente);
        }

        JOptionPane.showMessageDialog(null, "Pedido feito para " + pedido.getCliente().getNome() + "\n" + i);
    }
}
