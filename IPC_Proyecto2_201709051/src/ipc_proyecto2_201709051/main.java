
package ipc_proyecto2_201709051;

/**
 *
 * @author heidy
 */
public class main {

    static public Equipos Teams = new Equipos();
    static public Usuarios users = new Usuarios();
    static public Estampas est = new Estampas();
    static public reports reports = new reports();
    static public Jugadores jugad = new Jugadores();
   
    public static void main(String[] args) {
        
        Usuario prueba = new Usuario("jpg", "Heidy", "25/52/62", "1234", "heid@gmail.com", "heidy");
        users.add(prueba);
        
     //  Login ini = new Login();
      // ini.setVisible(true);
  //      UsuarioWin usu = new UsuarioWin();
   //     usu.setVisible(true);
       Admin ad = new Admin();
       ad.Vadmin.setVisible(true);
        
//        Crear_Equipo ce = new Crear_Equipo();
//        ce.setVisible(true);
       // Crear_Est ces = new Crear_Est();
       // ces.setVisible(true);
       // Crear_Jug cj = new Crear_Jug();
       // cj.setVisible(true);
      // SobreN sn = new SobreN();
       //sn.setVisible(true);
       
       //Cambiar cm = new Cambiar();
      // cm.setVisible(true);
       //Listado_Inter li = new Listado_Inter();
       //  li.setVisible(true);
      // Intercambio cmd = new Intercambio();
      // cmd.setVisible(true);
      // MiAlbum ma = new MiAlbum();
      // ma.setVisible(true);
//       VerSobre vs = new VerSobre();
//       vs.setVisible(true);
     //   EstampasWin es = new EstampasWin();
     //   es.setVisible(true);



    }
    
}
