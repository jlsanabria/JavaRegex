/*
 * Created by JFormDesigner on Thu Sep 12 21:02:11 BOT 2024
 */

package form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author jsanabria
 */
public class FormJava extends JFrame {
    public FormJava() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        System.out.println("Hola " + tfName.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Jose
        label1 = new JLabel();
        label2 = new JLabel();
        tfName = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Mi Aplicaci\u00f3n");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1);
        label1.setBounds(205, 20, 165, label1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Nombre:");
        label2.setHorizontalAlignment(SwingConstants.RIGHT);
        contentPane.add(label2);
        label2.setBounds(35, 75, 75, label2.getPreferredSize().height);
        contentPane.add(tfName);
        tfName.setBounds(115, 70, 180, 24);

        //---- button1 ----
        button1.setText("Hola");
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1);
        button1.setBounds(120, 105, 175, 29);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(50, 160, 480, 197);

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
    // Generated using JFormDesigner Evaluation license - Jose
    private JLabel label1;
    private JLabel label2;
    private JTextField tfName;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
