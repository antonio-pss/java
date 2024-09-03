package model.view;

import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {

    public Swing() {
        initComponents();
    }

    private void initComponents() {
        setPreferredSize(new Dimension(250, 150));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
    }
}
