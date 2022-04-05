
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

public class SobreN extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  contenidas, econ,nombrej, infoj, ima;
    JButton colocar, ant, sig, cancelar;
    
    
 public SobreN(){
    
        super("Abrir Sobre");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/esta.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        
        colocar = new JButton("Colocar Estampa");
        colocar.setBackground(Color.pink);colocar.setBounds(220,380,160,40);
        colocar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        }); 
        ant = new JButton("Anterior");
        ant.setBackground(Color.pink);ant.setBounds(30,150,60,60);
        ant.addActionListener((ActionEvent ae) -> {
          
        });
       sig = new JButton("Siguiente");
        sig.setBackground(Color.pink);sig.setBounds(480,150,60,60);
        sig.addActionListener((ActionEvent ae) -> {
          
        });
        
        cancelar = new JButton("Atras");
        cancelar.setBackground(Color.pink);cancelar.setBounds(480,20,80,40);
        cancelar.addActionListener((ActionEvent ae) -> {
           UsuarioWin adm = new UsuarioWin();
            adm.setVisible(true);
            dispose();
        });
       contenidas= new JLabel("Estampas Contenidas ");
       contenidas.setBounds(50,20,150,30);
       contenidas.setOpaque(true);
       econ= new JLabel("  ");
       econ.setBounds(210,20,50,30);
       econ.setOpaque(true);
       nombrej= new JLabel("----");
       nombrej.setBounds(220,245,160,30);
       nombrej.setOpaque(true);
       infoj= new JLabel("Info Jugador");
       infoj.setBounds(220,280,160,60);
       infoj.setOpaque(true);
       ima= new JLabel("Imagen ");
       ima.setBounds(220,70,160,170);
       ima.setOpaque(true);
       
        this.add(colocar); 
        this.add(ant); 
        this.add(sig); 
        this.add(contenidas); 
        this.add(econ); 
        this.add(nombrej);
        this.add(infoj);
        this.add(ima);
        this.add(cancelar);
        
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


