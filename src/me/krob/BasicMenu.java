package me.krob;

import javax.swing.*;
import java.awt.*;

public class BasicMenu extends JFrame {
    private final Main main;
    private JPanel mainPanel;
    private JButton clearButton;
    private JButton negativeButton;
    private JButton modButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a7Button;
    private JButton a4Button;
    private JTextField displayField;
    private JTextArea answerArea;
    private JPanel displayPanel;
    private JPanel buttonPanel;
    private JButton a3Button;
    private JButton pointButton;
    private JButton a2Button;
    private JButton a1Button;
    private JButton zeroButton;
    private JButton divisionButton;
    private JButton multiplyButton;
    private JButton minusButton;
    private JButton addButton;
    private JButton equalsButton;
    private Double value, previous;
    private ActionEnum action;

    public BasicMenu(Main main) {
        super("Calculator");
        this.main = main;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setResizable(false);
        pack();

        setContentPane(mainPanel);

        addButtonListeners();

        addButton.addActionListener(l -> action = ActionEnum.ADDITION);
        minusButton.addActionListener(l -> action = ActionEnum.MINUS);
        multiplyButton.addActionListener(l -> action = ActionEnum.MULTIPLICATION);
        divisionButton.addActionListener(l -> action = ActionEnum.DIVISION);
        modButton.addActionListener(l -> action = ActionEnum.MODULUS);

        clearButton.addActionListener(l -> clear());
    }

    /***
     * Set up the Menu
     */
    public void start() {
        setVisible(true);

        disableTextFields();
    }

    /***
     * Disabling the ability to write in the text fields/areas
     */
    private void disableTextFields() {
        displayField.setEnabled(false);
        answerArea.setEnabled(false);
    }

    private void addButtonListeners() {
        // TOOD: Use classes and a loop for this
        a1Button.addActionListener(l -> handleButton(1.0));
        a2Button.addActionListener(l -> handleButton(2.0));
        a3Button.addActionListener(l -> handleButton(3.0));
        a4Button.addActionListener(l -> handleButton(4.0));
        a5Button.addActionListener(l -> handleButton(5.0));
        a6Button.addActionListener(l -> handleButton(6.0));
        a7Button.addActionListener(l -> handleButton(7.0));
        a8Button.addActionListener(l -> handleButton(8.0));
        a9Button.addActionListener(l -> handleButton(9.0));
    }

    /***
     * Clear the text fields/areas
     */
    private void clear() {
        answerArea.setText(null);
        displayField.setText(null);
    }

    private void updateDisplay() {
        answerArea.setText(String.valueOf(value));
    }

    private void handleButton(double val) {
        if (value == null) {
            value = val;
            return;
        }

        value = calculate(val); // Calculate value
        System.out.printf("value: %s val: %s action: %s%n", value, val, action);

        action = ActionEnum.NONE; // Resetting action
        updateDisplay(); // Update display
    }

    private Double calculate(Double val) {
        switch (action) {
            case ADDITION:
                return value + val;
            case MINUS:
                return value - val;
        }
        return null;
    }
}
