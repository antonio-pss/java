/*
 * Created by JFormDesigner on Wed Aug 28 20:35:17 BRT 2024
 */

package model.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author etech
 */
public class SecondWindow extends JFrame {
    public SecondWindow() {
        initComponents();
    }

    private void ok(ActionEvent e) {
        // TODO add your code here
        JOptionPane.showMessageDialog(null, "Texto informado com sucesso: \n" + txTexto.getText());
    }

    private void cancelBtn(ActionEvent e) {
        // TODO add your code here
        this.dispose();
    }

    private void add(ActionEvent e) {
        // TODO add your code here
        textAdd.setText(textAdd.getText() + txTexto.getText() + "\n");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        okButton = new JButton();
        txTexto = new JTextField();
        label1 = new JLabel();
        cancelBtn = new JButton();
        scrollPane1 = new JScrollPane();
        textAdd = new JTextArea();
        addBtn = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(300, 250));
        setBackground(new Color(0x666666));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setForeground(new Color(0xff3333));
            dialogPane.setBackground(new Color(0x333333));
            dialogPane.setLayout(null);

            //---- okButton ----
            okButton.setText("OK");
            okButton.setForeground(Color.white);
            okButton.setFont(new Font("Arial", Font.BOLD, 14));
            okButton.setBackground(new Color(0x333333));
            okButton.setBorder(new LineBorder(Color.white, 1, true));
            okButton.addActionListener(e -> ok(e));
            dialogPane.add(okButton);
            okButton.setBounds(265, 220, 85, 35);

            //---- txTexto ----
            txTexto.setFont(new Font("Arial", Font.PLAIN, 14));
            txTexto.setToolTipText("Aqui:");
            txTexto.setBackground(Color.white);
            txTexto.setForeground(Color.black);
            txTexto.setMinimumSize(new Dimension(49, 50));
            dialogPane.add(txTexto);
            txTexto.setBounds(15, 50, 245, txTexto.getPreferredSize().height);

            //---- label1 ----
            label1.setText("Escreva Abaixo");
            label1.setFont(new Font("Arial", Font.BOLD, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setBackground(new Color(0x333333));
            label1.setForeground(Color.white);
            dialogPane.add(label1);
            label1.setBounds(15, 10, 340, 39);

            //---- cancelBtn ----
            cancelBtn.setText("Cancel");
            cancelBtn.setForeground(Color.white);
            cancelBtn.setFont(new Font("Arial", Font.BOLD, 14));
            cancelBtn.setBackground(new Color(0x333333));
            cancelBtn.setBorder(new LineBorder(Color.white, 1, true));
            cancelBtn.addActionListener(e -> cancelBtn(e));
            dialogPane.add(cancelBtn);
            cancelBtn.setBounds(170, 220, 85, 35);

            //======== scrollPane1 ========
            {

                //---- textAdd ----
                textAdd.setEditable(false);
                scrollPane1.setViewportView(textAdd);
            }
            dialogPane.add(scrollPane1);
            scrollPane1.setBounds(15, 90, 340, 120);

            //---- addBtn ----
            addBtn.setText("Adicionar");
            addBtn.setForeground(Color.white);
            addBtn.setFont(new Font("Arial", Font.BOLD, 14));
            addBtn.setBackground(new Color(0x333333));
            addBtn.setBorder(new LineBorder(Color.white, 1, true));
            addBtn.addActionListener(e -> add(e));
            dialogPane.add(addBtn);
            addBtn.setBounds(270, 50, 85, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialogPane.getComponentCount(); i++) {
                    Rectangle bounds = dialogPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialogPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialogPane.setMinimumSize(preferredSize);
                dialogPane.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(dialogPane);
        dialogPane.setBounds(0, 0, 368, dialogPane.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JButton okButton;
    private JTextField txTexto;
    private JLabel label1;
    private JButton cancelBtn;
    private JScrollPane scrollPane1;
    private JTextArea textAdd;
    private JButton addBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
