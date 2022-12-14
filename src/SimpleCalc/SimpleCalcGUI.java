package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber;
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

    public int tfNumber_entered() {
        return Integer.parseInt(tfNumber.getText());
    }

    public int tfNumber1_entered() {
        return Integer.parseInt(tfNumber1.getText());
    }

    public void result() {
        if(Objects.equals(cbOperations.getSelectedItem(), "+")) {
            lblResult.setText(Integer.toString(tfNumber_entered() + tfNumber1_entered()));
        } else if(Objects.equals(cbOperations.getSelectedItem(), "-")) {
            lblResult.setText(Integer.toString(tfNumber_entered() - tfNumber1_entered()));
        } else if(Objects.equals(cbOperations.getSelectedItem(), "*")) {
            lblResult.setText(Integer.toString(tfNumber_entered() * tfNumber1_entered()));
        } else if(Objects.equals(cbOperations.getSelectedItem(), "/")) {
            lblResult.setText(Integer.toString(tfNumber1_entered() / tfNumber_entered()));
        }
    }
}
