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

    public BasicMenu(Main main) {
        super("Calculator");
        this.main = main;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 250));
        setResizable(false);
        pack();

        setContentPane(mainPanel);
    }
}
