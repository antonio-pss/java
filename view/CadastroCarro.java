/*
 * Created by JFormDesigner on Mon Sep 02 20:14:45 BRT 2024
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author etech
 */
public class CadastroCarro extends JFrame {
    private DefaultTableModel tableModel;

    public CadastroCarro() {
        initComponents();
        tableModel = (DefaultTableModel) tableItens.getModel();
    }

    private void btnSalvar(ActionEvent e) {
        String carModel = tfModelo.getText();
        String marca = tfMarca.getText();
        String cor = tfCor.getText();
        String ano = tfAno.getText();

        tableModel.addRow(new Object[]{carModel, marca, cor, ano});

        tfModelo.setText("");
        tfMarca.setText("");
        tfCor.setText("");
        tfAno.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelCadastro = new JPanel();
        panelCampos = new JPanel();
        labelModelo = new JLabel();
        labelMarca = new JLabel();
        tfModelo = new JTextField();
        tfMarca = new JTextField();
        labelCor = new JLabel();
        label8 = new JLabel();
        tfCor = new JTextField();
        tfAno = new JTextField();
        panelButtons = new JPanel();
        btnSalvar = new JButton();
        btnCancelar = new JButton();
        panelLista = new JPanel();
        scrollPane1 = new JScrollPane();
        tableItens = new JTable();

        //======== this ========
        setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 0));

        //======== panelCadastro ========
        {
            panelCadastro.setPreferredSize(new Dimension(500, 500));
            panelCadastro.setLayout(new BoxLayout(panelCadastro, BoxLayout.Y_AXIS));

            //======== panelCampos ========
            {
                panelCampos.setMinimumSize(new Dimension(-5, 20));
                panelCampos.setPreferredSize(new Dimension(-5, 160));
                panelCampos.setLayout(new GridLayout(4, 2, 5, 5));

                //---- labelModelo ----
                labelModelo.setText("Modelo");
                panelCampos.add(labelModelo);

                //---- labelMarca ----
                labelMarca.setText("Marca");
                panelCampos.add(labelMarca);
                panelCampos.add(tfModelo);
                panelCampos.add(tfMarca);

                //---- labelCor ----
                labelCor.setText("Cor");
                panelCampos.add(labelCor);

                //---- label8 ----
                label8.setText("Ano");
                panelCampos.add(label8);
                panelCampos.add(tfCor);
                panelCampos.add(tfAno);
            }
            panelCadastro.add(panelCampos);

            //======== panelButtons ========
            {
                panelButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));

                //---- btnSalvar ----
                btnSalvar.setText("Salvar");
                btnSalvar.addActionListener(e -> btnSalvar(e));
                panelButtons.add(btnSalvar);

                //---- btnCancelar ----
                btnCancelar.setText("Cancelar");
                panelButtons.add(btnCancelar);
            }
            panelCadastro.add(panelButtons);
        }
        contentPane.add(panelCadastro);

        //======== panelLista ========
        {
            panelLista.setPreferredSize(new Dimension(500, 500));
            panelLista.setLayout(new BoxLayout(panelLista, BoxLayout.Y_AXIS));

            //======== scrollPane1 ========
            {

                //---- tableItens ----
                tableItens.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "Modelo", "Marca", "Cor", "Ano"
                    }
                ));
                scrollPane1.setViewportView(tableItens);
            }
            panelLista.add(scrollPane1);
        }
        contentPane.add(panelLista);
        setSize(445, 465);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panelCadastro;
    private JPanel panelCampos;
    private JLabel labelModelo;
    private JLabel labelMarca;
    private JTextField tfModelo;
    private JTextField tfMarca;
    private JLabel labelCor;
    private JLabel label8;
    private JTextField tfCor;
    private JTextField tfAno;
    private JPanel panelButtons;
    private JButton btnSalvar;
    private JButton btnCancelar;
    private JPanel panelLista;
    private JScrollPane scrollPane1;
    private JTable tableItens;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
