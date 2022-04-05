
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

public class VerSobre extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel   sobre,nombrej, infoj, ima;
    JButton colocar, ant, sig,sant, ssig, cancelar;
    
    
 public VerSobre(){
    
        super("Ver Sobre");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/esta.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        
        colocar = new JButton("Colocar Estampa");
        colocar.setBackground(Color.pink);colocar.setBounds(220,460,160,40);
        colocar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        }); 
        ant = new JButton("Anterior");
        ant.setBackground(Color.pink);ant.setBounds(130,320,60,60);
        ant.addActionListener((ActionEvent ae) -> {
          
        });
        
        cancelar = new JButton("Atras");
        cancelar.setBackground(Color.pink);cancelar.setBounds(480,20,80,40);
        cancelar.addActionListener((ActionEvent ae) -> {
           UsuarioWin adm = new UsuarioWin();
            adm.setVisible(true);
            dispose();
        });
       sig = new JButton("Siguiente");
        sig.setBackground(Color.pink);sig.setBounds(410,320,60,60);
        sig.addActionListener((ActionEvent ae) -> {
          
        });
        
        sant = new JButton("S. Anterior");
        sant.setBackground(Color.pink);sant.setBounds(130,50,60,60);
        sant.addActionListener((ActionEvent ae) -> {
          
        });
       ssig = new JButton("S. Siguiente");
        ssig.setBackground(Color.pink);ssig.setBounds(410,50,60,60);
        ssig.addActionListener((ActionEvent ae) -> {
          
        });
   
       sobre= new JLabel(" sobre ");
       sobre.setBounds(200,35,200,130);
       sobre.setOpaque(true);
       nombrej= new JLabel("----");
       nombrej.setBounds(220,365,160,25);
       nombrej.setOpaque(true);
       infoj= new JLabel("Info Jugador");
       infoj.setBounds(220,395,160,55);
       infoj.setOpaque(true);
       ima= new JLabel("Imagen ");
       ima.setBounds(220,210,160,150);
       ima.setOpaque(true);
       
        this.add(colocar); 
        this.add(ant); 
        this.add(sig); 
        this.add(sant); 
        this.add(ssig); 
        this.add(sobre); 
        this.add(nombrej);
        this.add(infoj);
        this.add(ima);
        this.add(cancelar);
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(600,550);
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


