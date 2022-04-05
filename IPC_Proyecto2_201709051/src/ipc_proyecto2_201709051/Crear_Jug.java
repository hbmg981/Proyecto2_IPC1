
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

public class Crear_Jug extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  bienve,nombre, pos, añ,alt, pesol,codeql,camisolal, tipol;
    JButton entrar, cancelar;
    JTextField  nom, posicion, año,altura, peso,codeq,camisola, tipo;
    
 public Crear_Jug(){
    
        super("Registro de Usuarios");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/jug.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Bienvenido Al Album Mundialito<br> Ingrese sus datos </body></html>" );
        bienve.setBorder(border);
        bienve.setOpaque(false);
        bienve.setBackground(Color.lightGray); bienve.setForeground(Color.black);
        bienve.setFont(new java.awt.Font("Tahoma", 1, 20));
        bienve.setHorizontalAlignment(JLabel.CENTER);bienve.setBounds(100,10,400,50);
        entrar = new JButton("Registrar");
        entrar.setBackground(Color.pink);entrar.setBounds(150,420,100,40);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Jugadores jd = new Jugadores();
                jd.add(new Jugador(nom.getText(),posicion.getText(),año.getText(),altura.getText(),peso.getText(),codeq.getText(),camisola.getText(),tipo.getText()));
                jd.show();
                JOptionPane.showMessageDialog(null,"Jugador creado con Exito");    
                nom.setText("");
                posicion.setText("");
                año.setText("");
                altura.setText("");
                peso.setText("");
                codeq.setText("");
                camisola.setText("");
                tipo.setText("");
                
            }
            
        }); 
        cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.pink);cancelar.setBounds(330,420,100,40);
        cancelar.addActionListener((ActionEvent ae) -> {
           Admin adm = new Admin();
            adm.Vadmin.setVisible(true);
            dispose();
        });
        
        
       nom = new JTextField();nom.setBounds(300,80,130,30);
       posicion = new JTextField();posicion.setBounds(300,120,130,30);
       año = new JTextField();año.setBounds(300,160,130,30);
       altura = new JTextField();altura.setBounds(300,200,130,30);
       peso = new JTextField();peso.setBounds(300,240,130,30);
       codeq = new JTextField();codeq.setBounds(300,280,130,30);
       camisola = new JTextField();camisola.setBounds(300,320,130,30);
       tipo = new JTextField();tipo.setBounds(300,360,130,30);
       
       nombre= new JLabel("Nombre:  ");
       nombre.setBounds(130,80,100,30);
       pos= new JLabel("Posicion");
       pos.setBounds(130,120,100,30);
       añ= new JLabel("Año de Nacimiento");
       añ.setBounds(130,160,130,30);
       alt= new JLabel("Altura");
       alt.setBounds(130,200,130,30);
       pesol= new JLabel("Peso ");
       pesol.setBounds(130,240,100,30);
       codeql= new JLabel("Codigo de Equipo  ");
       codeql.setBounds(130,280,130,30);
       camisolal= new JLabel(" # Camisola  "); 
       camisolal.setBounds(130,320,100,30);
       tipol= new JLabel("Tipo de Jugador"); 
       tipol.setBounds(130,360,150,30);
       
        this.add(bienve); 
        this.add(nombre); 
        this.add(nom); 
        this.add(pos); 
        this.add(posicion); 
        this.add(entrar); 
        this.add(cancelar); 
        this.add(año);
        this.add(añ);
        this.add(altura);
        this.add(alt);
        this.add(peso);
        this.add(pesol);
        this.add(codeq);
        this.add(codeql);
        this.add(camisola);
        this.add(camisolal);
        this.add(tipo);
        this.add(tipol);
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(600,530);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
}
 public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
}


