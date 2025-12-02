import javax.swing.*;

public class Calculator {
    private JPanel Caclulator;
    private JTextField txtDisplay;
    private JButton button1;
    private JButton button2;
    private JButton a8Button;
    private JButton a6Button;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton divButton;
    private JButton button13;
    private JButton a3Button;
    private JButton a9Button;
    private JButton button16;
    private JButton button17;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Caclulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
