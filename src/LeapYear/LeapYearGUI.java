package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                year_checker();
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(400, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public int year_entered() {
        return Integer.parseInt(tfYear.getText());
    }

    public void year_checker() {
        if((year_entered() % 4 == 0) && (year_entered() % 100 != 0) || (year_entered() % 400 == 0)) {
            JOptionPane.showMessageDialog(null,"Leap year");
            tfYear.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Not a leap year");
            tfYear.setText("");
        }
    }
}
