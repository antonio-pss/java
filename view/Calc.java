/*
 * Created by JFormDesigner on Thu Aug 29 20:06:13 BRT 2024
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author etech
 */
public class Calc extends JFrame {
    public Calc() {
        initComponents();
    }

    private boolean equalsNum() {
        String str = labelCalc.getText();
        str = String.valueOf(str.charAt(str.length() - 1));
        if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9")) {
            return true;
        }
        return false;
    }

    private void btn1(ActionEvent e) {
        // TODO add your code here
        labelCalc.setText(labelCalc.getText() + "1");
    }

    private void btn2(ActionEvent e) {
        // TODO add your code here
        labelCalc.setText(labelCalc.getText() + "2");
    }

    private void btn0(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "0");
    }

    private void btn3(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "3");
    }

    private void btn4(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "4");
    }

    private void btn5(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "5");
    }

    private void btn6(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "6");
    }

    private void btn7(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "7");
    }

    private void btn8(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "8");
    }

    private void btn9(ActionEvent e) {
        labelCalc.setText(labelCalc.getText() + "9");
    }

    private void btnC(ActionEvent e) {
        labelCalc.setText("");
    }

    private void btnCE(ActionEvent e) {
        labelCalc.setText("");
    }

    private void btnPlus(ActionEvent e) {
        if (equalsNum()) {
            labelCalc.setText(labelCalc.getText() + "+");
        }
    }

    private void btnMinus(ActionEvent e) {
        if (equalsNum()) {
            labelCalc.setText(labelCalc.getText() + "-");
        }
    }

    private void btnX(ActionEvent e) {
        if (equalsNum()) {
            labelCalc.setText(labelCalc.getText() + "x");
        }
    }

    private void btnDiv(ActionEvent e) {
        if (equalsNum()) {
            labelCalc.setText(labelCalc.getText() + "/");
        }
    }

    private void btnDot(ActionEvent e) {
        boolean has = false;
        for (int i = 0; i < labelCalc.getText().length(); i++) {
            char ch = labelCalc.getText().charAt(i);
            if (ch == ',') {
                has = true;
            }
            if (ch == '+' || ch == '-' || ch == 'x' || ch == '/') {
                has = false;
            }
        }
        if (!has) {
            labelCalc.setText(labelCalc.getText() + ",");    
        }
        
    }

    private void btnCancel(ActionEvent e) {
        labelCalc.setText(labelCalc.getText().substring(0, labelCalc.getText().length() - 1));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel2 = new JPanel();
        labelCalc = new JLabel();
        panel1 = new JPanel();
        btnPot = new JButton();
        btnCE = new JButton();
        btnC = new JButton();
        btnDiv = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnX = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btnMinus = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btnPlus = new JButton();
        btnCancel = new JButton();
        btn0 = new JButton();
        btnDot = new JButton();
        btnEqual = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(400, 500));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(350, 100));
            panel2.setLayout(null);

            //---- labelCalc ----
            labelCalc.setHorizontalAlignment(SwingConstants.RIGHT);
            labelCalc.setPreferredSize(new Dimension(24, 100));
            labelCalc.setFont(new Font("Inter", Font.PLAIN, 26));
            panel2.add(labelCalc);
            labelCalc.setBounds(0, 0, 370, labelCalc.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel2.getComponentCount(); i++) {
                    Rectangle bounds = panel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel2.setMinimumSize(preferredSize);
                panel2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel2, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(400, 300));
            panel1.setLayout(new GridLayout(5, 4, 2, 2));

            //---- btnPot ----
            btnPot.setFont(new Font("Inter", Font.BOLD, 16));
            btnPot.setText("x\u00b2");
            panel1.add(btnPot);

            //---- btnCE ----
            btnCE.setText("CE");
            btnCE.setFont(new Font("Inter", Font.BOLD, 16));
            btnCE.addActionListener(e -> btnCE(e));
            panel1.add(btnCE);

            //---- btnC ----
            btnC.setText("C");
            btnC.setFont(new Font("Inter", Font.BOLD, 16));
            btnC.addActionListener(e -> btnC(e));
            panel1.add(btnC);

            //---- btnDiv ----
            btnDiv.setText("/");
            btnDiv.setFont(new Font("Inter", Font.BOLD, 16));
            btnDiv.addActionListener(e -> btnDiv(e));
            panel1.add(btnDiv);

            //---- btn7 ----
            btn7.setText("7");
            btn7.setFont(new Font("Inter", Font.BOLD, 16));
            btn7.addActionListener(e -> btn7(e));
            panel1.add(btn7);

            //---- btn8 ----
            btn8.setText("8");
            btn8.setFont(new Font("Inter", Font.BOLD, 16));
            btn8.addActionListener(e -> btn8(e));
            panel1.add(btn8);

            //---- btn9 ----
            btn9.setText("9");
            btn9.setFont(new Font("Inter", Font.BOLD, 16));
            btn9.addActionListener(e -> btn9(e));
            panel1.add(btn9);

            //---- btnX ----
            btnX.setText("x");
            btnX.setFont(new Font("Inter", Font.BOLD, 16));
            btnX.addActionListener(e -> btnX(e));
            panel1.add(btnX);

            //---- btn4 ----
            btn4.setText("4");
            btn4.setFont(new Font("Inter", Font.BOLD, 16));
            btn4.addActionListener(e -> btn4(e));
            panel1.add(btn4);

            //---- btn5 ----
            btn5.setText("5");
            btn5.setFont(new Font("Inter", Font.BOLD, 16));
            btn5.addActionListener(e -> btn5(e));
            panel1.add(btn5);

            //---- btn6 ----
            btn6.setText("6");
            btn6.setFont(new Font("Inter", Font.BOLD, 16));
            btn6.addActionListener(e -> btn6(e));
            panel1.add(btn6);

            //---- btnMinus ----
            btnMinus.setText("-");
            btnMinus.setFont(new Font("Inter", Font.BOLD, 16));
            btnMinus.addActionListener(e -> btnMinus(e));
            panel1.add(btnMinus);

            //---- btn1 ----
            btn1.setText("1");
            btn1.setFont(new Font("Inter", Font.BOLD, 16));
            btn1.addActionListener(e -> btn1(e));
            panel1.add(btn1);

            //---- btn2 ----
            btn2.setText("2");
            btn2.setFont(new Font("Inter", Font.BOLD, 16));
            btn2.addActionListener(e -> btn2(e));
            panel1.add(btn2);

            //---- btn3 ----
            btn3.setText("3");
            btn3.setFont(new Font("Inter", Font.BOLD, 16));
            btn3.addActionListener(e -> btn3(e));
            panel1.add(btn3);

            //---- btnPlus ----
            btnPlus.setText("+");
            btnPlus.setFont(new Font("Inter", Font.BOLD, 16));
            btnPlus.addActionListener(e -> btnPlus(e));
            panel1.add(btnPlus);

            //---- btnCancel ----
            btnCancel.setFont(new Font("Inter", Font.BOLD, 16));
            btnCancel.setText("(X)");
            btnCancel.addActionListener(e -> btnCancel(e));
            panel1.add(btnCancel);

            //---- btn0 ----
            btn0.setText("0");
            btn0.setFont(new Font("Inter", Font.BOLD, 16));
            btn0.addActionListener(e -> btn0(e));
            panel1.add(btn0);

            //---- btnDot ----
            btnDot.setText(",");
            btnDot.setFont(new Font("Inter", Font.BOLD, 16));
            btnDot.addActionListener(e -> btnDot(e));
            panel1.add(btnDot);

            //---- btnEqual ----
            btnEqual.setText("=");
            btnEqual.setFont(new Font("Inter", Font.BOLD, 16));
            panel1.add(btnEqual);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel2;
    private JLabel labelCalc;
    private JPanel panel1;
    private JButton btnPot;
    private JButton btnCE;
    private JButton btnC;
    private JButton btnDiv;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnX;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMinus;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnPlus;
    private JButton btnCancel;
    private JButton btn0;
    private JButton btnDot;
    private JButton btnEqual;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
