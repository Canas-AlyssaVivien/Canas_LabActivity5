package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(600, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(app.rbNone);
        group.add(app.rb5);
        group.add(app.rb10);
        group.add(app.rb15);

    }

    public void result() {
        double price = 0.00;
        boolean flag = false;
        int order = 0;

        if(cPizza.isSelected()) {
            price += 100;
            order++;
        }

        if(cBurger.isSelected()) {
            price += 80;
            order++;
        }

        if(cFries.isSelected()) {
            price += 65;
            order++;
        }

        if(cSoftDrinks.isSelected()) {
            price += 55;
            order++;
        }

        if(cTea.isSelected()) {
            price += 50;
            order++;
        }

        if(cSundae.isSelected()) {
            price += 40;
            order++;
        }

        if(rb5.isSelected()) {
            price = price - (price * 0.05);
            JOptionPane.showMessageDialog(null,"Total Price is Php " + price);
        } else if(rb10.isSelected()) {
            price = price - (price * 0.10);
            JOptionPane.showMessageDialog(null,"Total Price is Php " + price);
        } else if(rb15.isSelected()) {
            price = price - (price * 0.15);
            JOptionPane.showMessageDialog(null,"Total Price is Php " + price);
        } else if(rbNone.isSelected()) {
            JOptionPane.showMessageDialog(null,"Total Price is Php " + price);
        } else {
            flag = true;
        }

        try {
            if(flag) {
                throw(new discount("Select one discount."));
            } else if(order == 0) {
                throw(new orderr("Select atleast one food."));
            }
        } catch(discount a) {
            JOptionPane.showMessageDialog(null, "Select one discount.");
        } catch (orderr b) {
            JOptionPane.showMessageDialog(null, "Select atleast one food.");
        }
    }

    class discount extends Exception {
        public discount (String s) {
            super(s);
        }
    }

    class orderr extends Exception {
        public orderr (String s) {
            super(s);
        }
    }
}
