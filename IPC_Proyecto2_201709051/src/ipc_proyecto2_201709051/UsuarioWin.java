package ipc_proyecto2_201709051;

import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class UsuarioWin extends JFrame {

    public Image imgfondo;
    public URL fondo;
    JLabel sobreab, s, estamcol, escol;
    JPanel VentanaUs;
    JButton interc, sdorado, snormal, estampas, sobres, album, reporte, cancelar;
    int sobab = 0, estam = 0;

    public UsuarioWin() {

        super("Usuario Album Mundialito");
        Container contenedor = getContentPane();
        Border border = LineBorder.createGrayLineBorder();

        fondo = this.getClass().getResource("/Im_201709051/f2.jpg");
        imgfondo = new ImageIcon(fondo).getImage();
        sobreab = new JLabel("Sobres Abiertos");
        sobreab.setOpaque(true);
        sobreab.setBounds(70, 30, 150, 40);
        s = new JLabel(" "+sobab+ " ");
        s.setOpaque(true);
        s.setBounds(230, 30, 50, 40);
        estamcol = new JLabel("Estampas Colocadas");
        estamcol.setOpaque(true);
        estamcol.setBounds(70, 80, 150, 40);
        escol = new JLabel(" "+estam+" ");
        escol.setOpaque(true);
        escol.setBounds(230, 80, 50, 40);

        interc = new JButton("Intercambiar");
        interc.setBackground(Color.pink);
        interc.setBounds(350, 55, 110, 60);
        interc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Intercambio inte = new Intercambio();
                inte.setVisible(true);
                dispose();
            }
            

        });
        sdorado = new JButton("Abrir Dorado");
        sdorado.setBackground(Color.pink);
        sdorado.setBounds(160, 150, 120, 40);
        sdorado.addActionListener((ActionEvent ae) -> {
            SobreD sd = new SobreD();
            sd.setVisible(true);
            this.dispose();
            sobab++;
        });
        snormal = new JButton("Abrir Normal");
        snormal.setBackground(Color.pink);
        snormal.setBounds(320, 150, 120, 40);
        snormal.addActionListener((ActionEvent ae) -> {
            SobreN sdn = new SobreN();
            sdn.setVisible(true); 
            this.dispose();
            sobab++;
        });
        estampas = new JButton("Ver Estampas");
        estampas.setBackground(Color.pink);
        estampas.setBounds(160, 220, 120, 40);
        estampas.addActionListener((ActionEvent ae) -> {
            this.dispose();
            EstampasWin es = new EstampasWin();
            es.setVisible(true);
        });
        sobres = new JButton("Ver Sobres");
        sobres.setBackground(Color.pink);
        sobres.setBounds(320, 220, 120, 40);
        sobres.addActionListener((ActionEvent ae) -> {
            VerSobre vs = new VerSobre();
            vs.setVisible(true);
            this.dispose();

        });
        album = new JButton("Mi Album");
        album.setBackground(Color.pink);
        album.setBounds(160, 290, 120, 40);
        album.addActionListener((ActionEvent ae) -> {
            MiAlbum mia = new MiAlbum();
            mia.setVisible(true);
            this.dispose();
        });
        reporte = new JButton("Reportes");
        reporte.setBackground(Color.pink);
        reporte.setBounds(320, 290, 120, 40);
        reporte.addActionListener((ActionEvent ae) -> {

        });
        cancelar = new JButton("Salir");
        cancelar.setBackground(Color.pink);cancelar.setBounds(480,20,80,40);
        cancelar.addActionListener((ActionEvent ae) -> {
          Login adm = new Login();
            adm.setVisible(true);
            dispose();
        });

        this.add(sobres);
        this.add(estampas);
        this.add(snormal);
        this.add(sdorado);
        this.add(interc);
        this.add(sobreab);
        this.add(s);
        this.add(album);
        this.add(estamcol);
        this.add(escol);
        this.add(reporte);
        this.add(cancelar);

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
