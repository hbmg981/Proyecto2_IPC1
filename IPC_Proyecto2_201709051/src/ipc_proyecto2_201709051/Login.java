package ipc_proyecto2_201709051;

import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

    public Image imgfondo;
    public URL fondo;
    JLabel nombre, pass, bienve, lerror;
    JPanel VentanaLogin, error;
    JButton entrar, cancelar, registrar;
    JTextField nom;
    JPasswordField contra;
    static public Usuario Usuario;

    public Login() {

        super("Ingreso de Usuario");
        Container contenedor = getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        error = new JPanel();
        VentanaLogin = new JPanel();
        fondo = this.getClass().getResource("/Im_201709051/f1.jpg");
        imgfondo = new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Bienvenido Al Album Mundialito<br> Ingrese su usuario y contraseña </body></html>");
        bienve.setBorder(border);
        bienve.setOpaque(true);
        bienve.setBackground(Color.lightGray);
        bienve.setHorizontalAlignment(JLabel.CENTER);
        bienve.setBounds(100, 10, 400, 50);
        entrar = new JButton("Entrar");
        entrar.setBackground(Color.pink);
        entrar.setBounds(150, 250, 100, 60);
        entrar.addActionListener((ActionEvent evt) -> {
            if (contra.getPassword().equals("") || nom.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "LLenar todos los campos");
            } else if (contra.getText().equals("201709051") && nom.getText().equals("admin")) {
                Login.this.dispose();
                Admin a = new Admin();
                a.Vadmin.setVisible(true);
            } else {
                try {
                    Usuario usuario = main.users.find(nom.getText());
                    if (usuario != null && usuario.Contraseña.equals(contra.getText())) {
                        Usuario = usuario;
                        Login.this.dispose();
                        new UsuarioWin().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ID debe ser un numero entero");
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        });

        cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.pink);
        cancelar.setBounds(330, 250, 100, 60);
        cancelar.addActionListener((ActionEvent ae) -> {
            /* Inicio ini = new Inicio();
            ini.setVisible(true);
            dispose();*/
        });
        registrar = new JButton("Registrar");
        registrar.setBackground(Color.pink);
        registrar.setBounds(430, 350, 100, 60);
        registrar.addActionListener((ActionEvent ae) -> {
            this.dispose();
            Registro reg = new Registro();
            reg.setVisible(true);
        });

        ImageIcon usuari = new ImageIcon(getClass().getResource("/Im_201709051/usuario.jpg"));
        ImageIcon usuario = new ImageIcon(usuari.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        ImageIcon contras = new ImageIcon(getClass().getResource("/Im_201709051/contrase.jpg"));
        ImageIcon contrase = new ImageIcon(contras.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));

        nombre = new JLabel("Usuario:  ");
        nombre.setIcon(usuario);
        nombre.setOpaque(true);
        nombre.setBackground(Color.lightGray);
        nombre.setBounds(150, 80, 100, 50);
        pass = new JLabel("Contraseña:  ");
        pass.setIcon(contrase);
        pass.setOpaque(true);
        pass.setBackground(Color.lightGray);
        pass.setBounds(150, 150, 100, 50);
        contra = new JPasswordField();
        contra.setBounds(340, 150, 130, 40);
        nom = new JTextField();
        nom.setBounds(340, 80, 130, 40);

        this.add(bienve);
        this.add(nombre);
        this.add(nom);
        this.add(pass);
        this.add(contra);
        this.add(entrar);
        this.add(cancelar);
        this.add(registrar);

        contenedor.add(panel, BorderLayout.CENTER);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public JPanel panel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            g.drawImage(imgfondo, 0, 0, getWidth(), getHeight(), this);
        }
    };
}
