import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de adivinhação!");

        String[] menu = {"Jogar", "Sair"};
        String menuInicial = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]);

        if ("Jogar".equals(menuInicial)) {
            JogoAdivinhacao jogo = new JogoAdivinhacao();
            jogo.jogar();
        } else {
            JOptionPane.showMessageDialog(null, "Até mais!");
        }

    }
}
