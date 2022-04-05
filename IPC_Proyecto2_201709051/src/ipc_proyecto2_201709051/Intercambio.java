
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

public class Intercambio extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  nombrej, infoj, ima;
    JButton colocar, ant, sig, inter, verlis;
    
    
 public Intercambio(){
    
        super("Intercambio");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/esta.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        
       
        ant = new JButton("Anterior");
        ant.setBackground(Color.pink);ant.setBounds(30,150,60,60);
        ant.addActionListener((ActionEvent ae) -> {
          
        });
       sig = new JButton("Siguiente");
        sig.setBackground(Color.pink);sig.setBounds(480,150,60,60);
        sig.addActionListener((ActionEvent ae) -> {
          
        });
        
        inter = new JButton("Intercambiar");
        inter.setBackground(Color.pink);inter.setBounds(30,350,110,40);
        inter.addActionListener((ActionEvent ae) -> {
          
        });
        verlis = new JButton("Listado");
        verlis.setBackground(Color.pink);verlis.setBounds(450,350,110,40);
        verlis.addActionListener((ActionEvent ae) -> {
          
        });
        
       nombrej= new JLabel("----");
       nombrej.setBounds(220,245,160,30);
       nombrej.setOpaque(true);
       infoj= new JLabel("Info Jugador");
       infoj.setBounds(220,280,160,60);
       infoj.setOpaque(true);
       ima= new JLabel("Imagen ");
       ima.setBounds(220,70,160,170);
       ima.setOpaque(true);
       
        
        this.add(verlis); 
        this.add(inter); 
        this.add(nombrej);
        this.add(infoj);
        this.add(ima);
        this.add(ant); 
        this.add(sig);
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(600,480);
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


