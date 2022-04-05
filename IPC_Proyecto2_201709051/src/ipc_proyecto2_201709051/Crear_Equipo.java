
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

public class Crear_Equipo extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  nombre, bienve, codigo,mundiales,año;
    JButton entrar, cancelar;
    JTextField  nom,cod,mun,añ;
    
    
 public Crear_Equipo(){
    
        super("Crear Equipos");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/eq.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Crea un Equipo nuevo <br> Ingrese los datos </body></html>" );
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
                main.Teams.add(new Equipo (nom.getText(),cod.getText(),mun.getText(),año.getText()));
                main.Teams.show();
                JOptionPane.showMessageDialog(null,"Equipo creado con Exito");    
                nom.setText("");
                cod.setText("");
                mun.setText("");
                añ.setText("");
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
       mun = new JTextField();mun.setBounds(300,160,130,30);
       añ= new JTextField();añ.setBounds(300,200,130,30);
       
       nombre= new JLabel("Nombre del Equipo:  ");
       nombre.setBounds(130,80,130,30);
       codigo= new JLabel(" Codigo ");
       codigo.setBounds(130,120,100,30);
       mundiales= new JLabel("Mundiales Ganados");
       mundiales.setBounds(130,160,130,30);
       año= new JLabel("Año de Creación ");
       año.setBounds(130,200,100,30);
       
        this.add(bienve); 
        this.add(nombre); 
        this.add(nom); 
        this.add(entrar); 
        this.add(cancelar); 
        this.add(cod);
        this.add(mun);
        this.add(mundiales);
        this.add(año);
        this.add(añ);
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


