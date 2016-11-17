package moneycalculator.ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    }

    private Component amount() {
        return new JLabel("300");
    }

    private Component currency() {
        return new JLabel("$");
    }

    @Override
    public void display(Money money) {
        
    } 
    
}