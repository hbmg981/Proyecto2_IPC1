
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
import ipc_proyecto2_201709051.*;

public class Registro extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  nombre, pass, bienve, cuil, nacl,emaill,userl, confi;
    JButton entrar, cancelar;
    JTextField  nom,cui,nac, email, user;
    JPasswordField contra, conf;
  // static public Usuarios users = new Usuarios();
    
 public Registro(){
    
        super("Registro de Usuarios");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        fondo=this.getClass().getResource("/Im_201709051/f4.jpeg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Bienvenido Al Album Mundialito<br> Ingrese sus datos </body></html>" );
        bienve.setBorder(border);
        bienve.setOpaque(false);
        bienve.setBackground(Color.lightGray); bienve.setForeground(Color.black);
        bienve.setFont(new java.awt.Font("Tahoma", 1, 20));
        bienve.setHorizontalAlignment(JLabel.CENTER);bienve.setBounds(100,10,400,50);
       
        cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.pink);cancelar.setBounds(330,390,100,40);
        cancelar.addActionListener((ActionEvent ae) -> {
          Login in = new Login();
          in.setVisible(true);
        });
        
         
        ImageIcon usuari= new ImageIcon(getClass().getResource("/Im_201709051/usuario.jpg"));
        ImageIcon usuario = new ImageIcon(usuari.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        ImageIcon contras= new ImageIcon(getClass().getResource("/Im_201709051/contrase.jpg"));
        ImageIcon contrase = new ImageIcon(contras.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        
       
        
       nom = new JTextField();nom.setBounds(300,80,130,30);
       cui = new JTextField();cui.setBounds(300,120,130,30);
       nac = new JTextField();nac.setBounds(300,160,130,30);
       email = new JTextField();email.setBounds(300,200,150,30);
       user = new JTextField();user.setBounds(300,240,130,30);
       contra = new JPasswordField(); contra.setBounds(300,280,130,30);
       conf = new JPasswordField(); conf.setBounds(300,320,130,30);
       nombre= new JLabel("Nombre:  ");
       nombre.setBounds(130,80,100,30);
       cuil= new JLabel(" CUI ");
       cuil.setBounds(130,120,100,30);
       nacl= new JLabel("Fecha de Nacimiento");
       nacl.setBounds(130,160,130,30);
       emaill= new JLabel("E-mail:  ");
       emaill.setBounds(130,200,100,30);
       userl= new JLabel("Username:  ");
       userl.setBounds(130,240,100,30);
       pass= new JLabel("Contraseña:  "); 
       pass.setBounds(130,280,100,30);
       confi= new JLabel(" Confirmar Contraseña:"); 
       confi.setBounds(130,320,150,30);
       
        entrar = new JButton("Registrar");
        entrar.setBackground(Color.pink);entrar.setBounds(150,390,100,40);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            main.users.add(new Usuario(cui.getText(),nom.getText(), nac.getText(),contra.getText(),email.getText(),user.getText()));
            main.users.show();
        JOptionPane.showMessageDialog(null,"Usuario Registrado con Exito");    
            nom.setText("");
            cui.setText("");
            nac.setText("");
            contra.setText("");
            email.setText("");
            user.setText("");
            conf.setText("");
            
            
            }
            
        }); 
       
       
       
       
        this.add(bienve); 
        this.add(nombre); 
        this.add(nom); 
        this.add(pass); 
        this.add(contra); 
        this.add(entrar); 
        this.add(cancelar); 
        this.add(cui);
        this.add(nac);
        this.add(email);
        this.add(user);
        this.add(cuil);
        this.add(nacl);
        this.add(emaill);
        this.add(userl);
        this.add(confi);
        this.add(conf);
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(600,500);
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


