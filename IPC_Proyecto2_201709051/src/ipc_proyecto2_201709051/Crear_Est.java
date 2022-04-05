
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

public class Crear_Est extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  nombre, bienve, codigo,rareza,ruta;
    JButton entrar, cancelar;
    JTextField  nom,cod,rar,rutai;
    
    
 public Crear_Est(){
    
        super("Crear Estampas");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/esta.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Crea una nueva Estampa <br> Ingrese los datos </body></html>" );
        bienve.setBorder(border);
        bienve.setOpaque(false);
        bienve.setBackground(Color.lightGray); bienve.setForeground(Color.black);
        bienve.setFont(new java.awt.Font("Tahoma", 1, 20));
        bienve.setHorizontalAlignment(JLabel.CENTER);bienve.setBounds(100,10,400,50);
        entrar = new JButton("Crear");
        entrar.setBackground(Color.pink);entrar.setBounds(150,250,100,40);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                main.est.add(new Estampa(nom.getText(), cod.getText(),rar.getText(),rutai.getText()));
            main.est.show();
        JOptionPane.showMessageDialog(null,"Estampa creada con Exito");    
            nom.setText("");
            cod.setText("");
            rar.setText("");
            rutai.setText("");
            
            }
            
        }); 
        cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.pink);cancelar.setBounds(330,250,100,40);
        cancelar.addActionListener((ActionEvent ae) -> {
          Admin adm = new Admin();
            adm.Vadmin.setVisible(true);
            dispose();
        });
        
        
       nom = new JTextField();nom.setBounds(300,80,130,30);
       cod = new JTextField();cod.setBounds(300,120,130,30);
       rar = new JTextField();rar.setBounds(300,160,130,30);
       rutai= new JTextField();rutai.setBounds(300,200,130,30);
       
       nombre= new JLabel("Nombre del Jugador:  ");
       nombre.setBounds(130,80,130,30);
       codigo= new JLabel(" Codigo Equipo ");
       codigo.setBounds(130,120,130,30);
       rareza= new JLabel("Rareza");
       rareza.setBounds(130,160,130,30);
       ruta= new JLabel("Ruta Imagen ");
       ruta.setBounds(130,200,100,30);
       
        this.add(bienve); 
        this.add(nombre); 
        this.add(nom); 
        this.add(entrar); 
        this.add(cancelar); 
        this.add(cod);
        this.add(ruta);
        this.add(rutai);
        this.add(rareza);
        this.add(rar);
        this.add(codigo);
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(600,350);
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


