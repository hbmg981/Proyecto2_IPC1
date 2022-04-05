
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

public class MiAlbum extends JFrame {
    public Image imgfondo;
    public URL fondo;
    JButton cancelar;
    JLabel pais, l1, l2, l3, l4, l5, l6, l7, l8; 
    
 public MiAlbum(){
    
        super("Mi Album");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/estadio.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        pais = new JLabel(" PAIS");
        pais.setBounds(50, 30, 200, 60); 
        pais.setOpaque(true);
        l1 = new JLabel(" ");
        l1.setBounds(50, 100, 150, 170); 
        l1.setOpaque(true);
        l2 = new JLabel(" ");
        l2.setBounds(210, 100, 150, 170); 
        l2.setOpaque(true);
        l3 = new JLabel(" ");
        l3.setBounds(400, 100, 150, 170); 
        l3.setOpaque(true);
        l4 = new JLabel(" ");
        l4.setBounds(560, 100, 150, 170); 
        l4.setOpaque(true);
        l5 = new JLabel(" ");
        l5.setBounds(50, 280, 150, 170); 
        l5.setOpaque(true);
        l6 = new JLabel(" ");
        l6.setBounds(210, 280, 150, 170); 
        l6.setOpaque(true);
        l7 = new JLabel(" ");
        l7.setBounds(400, 280, 150, 170); 
        l7.setOpaque(true);
        l8 = new JLabel(" ");
        l8.setBounds(560, 280, 150, 170); 
        l8.setOpaque(true);
        cancelar = new JButton("Atras");
        cancelar.setBackground(Color.pink);cancelar.setBounds(600,20,80,40);
        cancelar.addActionListener((ActionEvent ae) -> {
           UsuarioWin adm = new UsuarioWin();
            adm.setVisible(true);
            dispose();
        });
        this.add(pais);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(cancelar);
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(750,530);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
 public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
}


