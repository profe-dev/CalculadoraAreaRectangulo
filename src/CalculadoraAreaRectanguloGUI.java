import javax.swing.*;
import java.awt.event.*;

public class CalculadoraAreaRectanguloGUI extends JFrame {
    private JTextField baseField, alturaField, resultadoField;
    private JButton calcularButton;

    public CalculadoraAreaRectanguloGUI() {
        setTitle("Calculadora Area Rectangulo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        baseField = new JTextField(10);
        alturaField = new JTextField(10);
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularAreaRectangulo();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Base: "));
        panel.add(baseField);
        panel.add(new JLabel("Altura: "));
        panel.add(alturaField);
        panel.add(new JLabel("Area: "));
        panel.add(resultadoField);
        panel.add(calcularButton);

        add(panel);
    }

    private void calcularAreaRectangulo() {
        try {
            double base = Double.parseDouble(baseField.getText());
            double altura = Double.parseDouble(alturaField.getText());
            Rectangulo rectangulo = new Rectangulo(base, altura);
            double area = rectangulo.CalcularArea();
            resultadoField.setText(String.valueOf(area));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa números válidos");
        }
    }

    public void iniciar() {
        setVisible(true);
    }
}
