
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

public class Listado_Inter extends JFrame {
    public Image imgfondo;
    public URL fondo;
     
    
 public Listado_Inter(){
    
        super("Listado de Intercambio");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/inter.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        
        
        
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


