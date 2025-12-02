import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton button3;
    private JButton button13;
    private JButton a3Button;
    private JButton a9Button;
    private JButton button16;
    private JButton button17;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;

    double a, b, result;
    String op;

    public Calculator() {

        // Clear button
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });

        // 00 button
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });

        // 0 button
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });

        // 1 button
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        // 2 button
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });

        // 3 button
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });

        // 4 button
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });

        // 5 button
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });

        // 6 button
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });

        // 7 button
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });

        // 8 button
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });

        // 9 button
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });




        // + button
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
//                String currentText = txtDisplay.getText();
//                if(currentText.isEmpty()){
//                    return;
//                }
                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");
            }
        });

        // - button
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });

        // x button
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String currentText = txtDisplay.getText();
                if(currentText.isEmpty()){
                    return;
                }
                a = Double.parseDouble(txtDisplay.getText());
                op = "x";
                txtDisplay.setText("");
            }
        });

        // ÷ button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                a = Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
            }
        });

        //+- button
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    double num = Double.parseDouble(txtDisplay.getText());
                    num = num*-1;
                    txtDisplay.setText(String.valueOf(num));
                } else {
                    long NUM = Long.parseLong(txtDisplay.getText());
                    NUM = NUM*-1;
                    txtDisplay.setText(String.valueOf(NUM));
                }
            }
        });

        // . button
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText() + button13.getText());
                }
            }
        });

        // back button
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String backspace = null;

                if(txtDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });

        // = button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

               if (op == "+"){
                   result = a+b;
                   txtDisplay.setText(String.valueOf(result));
               } else if (op == "-"){
                   result = a-b;
                   txtDisplay.setText(String.valueOf(result));
               } else if (op == "x"){
                   result = a*b;
                   txtDisplay.setText(String.valueOf(result));
               } else if (op == "/"){
                   result = a/b;
                   txtDisplay.setText(String.valueOf(result));
               }


            }
        });



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Caclulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
