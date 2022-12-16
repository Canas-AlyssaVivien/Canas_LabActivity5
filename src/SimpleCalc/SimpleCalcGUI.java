package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result();
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public double tfNumber1_entered() {
        return Double.parseDouble(tfNumber1.getText());
    }

    public double tfNumber2_entered() {
        return Double.parseDouble(tfNumber2.getText());
    }

    public void result() {
        try {
            if(Objects.equals(cbOperations.getSelectedItem(), "+")) {
                lblResult.setText(Double.toString(tfNumber1_entered() + tfNumber2_entered()));
            } else if(Objects.equals(cbOperations.getSelectedItem(), "-")) {
                lblResult.setText(Double.toString(tfNumber1_entered() - tfNumber2_entered()));
            } else if(Objects.equals(cbOperations.getSelectedItem(), "*")) {
                lblResult.setText(Double.toString(tfNumber1_entered() * tfNumber2_entered()));
            } else if(Objects.equals(cbOperations.getSelectedItem(), "/")) {
                lblResult.setText(Double.toString(tfNumber1_entered() / tfNumber2_entered()));
            }
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, "Input must be a number.");
            tfNumber1.setText("");
            tfNumber2.setText("");
        }

    }
}
