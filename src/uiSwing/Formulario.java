package uiSwing;

import util.ValidacionUtil;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    private JPanel contentPane, formPane, dataPane;
    private JLabel lTitle, lName, lLastName, lEmail, lPhone;
    private JTextField tfName, tfLastName, tfEmail, tfPhone;
    private JButton bRegistrar;

    public Formulario() throws HeadlessException {
       init();
    }

    public void init() {
        setTitle("Formulario de Registro de Empleados");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.GRAY);
        contentPane.setLayout(null);

        formPane = new JPanel();
        formPane.setLayout(null);
        formPane.setBackground(Color.BLACK);
        formPane.setBounds(10,10,360,440);
        formPane.setBorder(new TitledBorder(new LineBorder(Color.WHITE), "Registro Empleado"));

        lTitle = new JLabel("EMPLEADOS");
        lTitle.setFont(new Font("Roboto", Font.BOLD, 18));
        lTitle.setForeground(Color.WHITE);
        lTitle.setHorizontalAlignment(SwingConstants.CENTER);
        //lTitle.setVerticalAlignment(SwingConstants.CENTER);
        lTitle.setBounds(10, 40, 300, 40);
        formPane.add(lTitle);

        dataPane = new JPanel();
        dataPane.setLayout(null);
        dataPane.setBackground(Color.BLACK);
        dataPane.setBounds(30,100,300,250);

        lName = new JLabel("Nombres: ");
        lName.setFont(new Font("Roboto", Font.BOLD, 14));
        lName.setForeground(Color.WHITE);
        lName.setBounds(15, 15, 75, 20);

        tfName = new JTextField(20);
        tfName.setFont(new Font("Roboto", Font.PLAIN, 14));
        tfName.setBounds(110, 15, 170, 25);

        lLastName = new JLabel("Apellidos: ");
        lLastName.setFont(new Font("Roboto", Font.BOLD, 14));
        lLastName.setForeground(Color.WHITE);
        lLastName.setBounds(15, 55, 75, 20);

        tfLastName = new JTextField(10);
        tfLastName.setFont(new Font("Roboto", Font.PLAIN, 14));
        tfLastName.setBounds(110, 55, 170, 25);

        lEmail = new JLabel("Correo: ");
        lEmail.setFont(new Font("Roboto", Font.BOLD, 14));
        lEmail.setForeground(Color.WHITE);
        lEmail.setBounds(15, 95, 75, 20);

        tfEmail = new JTextField(10);
        tfEmail.setFont(new Font("Roboto", Font.PLAIN, 14));
        tfEmail.setBounds(110, 95, 170, 25);

        lPhone = new JLabel("Teléfono: ");
        lPhone.setFont(new Font("Roboto", Font.BOLD, 14));
        lPhone.setForeground(Color.WHITE);
        lPhone.setBounds(15, 135, 75, 20);

        tfPhone = new JTextField(10);
        tfPhone.setFont(new Font("Roboto", Font.PLAIN, 14));
        tfPhone.setBounds(110, 135, 170, 25);

        bRegistrar = new JButton("Registrar");
        bRegistrar.setFont(new Font("Roboto", Font.BOLD, 16));
        bRegistrar.setBounds(110, 180, 170, 25);
        bRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = tfName.getText();
                System.out.println(nombre);
                boolean nombresValido = ValidacionUtil.validarNombreApellidos(nombre);
                if(nombresValido) {
                    tfName.setBackground(Color.GREEN);
                } else {
                    tfName.setBackground(Color.RED);
                }

                System.out.println(tfLastName.getText());
                System.out.println(tfEmail.getText());
                System.out.println(tfPhone.getText());
            }
        });

        dataPane.add(lName);
        dataPane.add(tfName);

        dataPane.add(lLastName);
        dataPane.add(tfLastName);

        dataPane.add(lEmail);
        dataPane.add(tfEmail);

        dataPane.add(lPhone);
        dataPane.add(tfPhone);

        dataPane.add(bRegistrar);

        formPane.add(dataPane);
        contentPane.add(formPane);
        setContentPane(contentPane);
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
