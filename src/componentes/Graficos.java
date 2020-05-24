package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graficos extends JFrame implements ActionListener {

    JPanel panel;
    JTextField tex;
    JButton boton;
    JLabel label;

    public Graficos() {
        this.setTitle("Practica de componentes basicos");
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setLayout(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        panel = new JPanel();
        panel.setBackground(new Color(3, 131, 135));

        tex = new JTextField();
//        textbox1.setBounds(10, 10, 610, 35);
        tex.setLocation(10, 10);
        tex.setPreferredSize(new Dimension(610, 35));
        panel.add(tex);

        boton = new JButton("Ver contenido");
        boton.setName("btnVer");
        boton.setLocation(30, 40);
        boton.setPreferredSize(new Dimension(200, 35));
        boton.addActionListener(this);

        label = new JLabel("");
        label.setLocation(10, 40);
        label.setPreferredSize(new Dimension(200, 35));
        panel.add(label);

        panel.add(boton);

        this.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(tex.getText());
        tex.setText("");
    }
}
