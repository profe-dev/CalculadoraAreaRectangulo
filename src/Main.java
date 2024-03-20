import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CalculadoraAreaRectanguloGUI gui = new CalculadoraAreaRectanguloGUI();
            gui.iniciar();
        });
    }
}