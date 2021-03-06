package ipc_proyecto2_201709051;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter; 
import ipc_proyecto2_201709051.*;
public class Admin {

    public Image imgfondo;
    public URL fondo;
    JLabel user, jug, estam, equipo, vacia, u, j, es, eq, ci, cm;
    public JFrame Vadmin;
    JButton cuser, muser, eluser, logout, cj, mj, elj, ce, me, ele, ceq, meq, eleq, informes, cij, cie, cies;

    public Admin() {
        Border border = LineBorder.createGrayLineBorder();
        Border brd = LineBorder.createBlackLineBorder();
        Vadmin = new JFrame();
        Vadmin.setSize(750, 500);
        Vadmin.setTitle("Administrador");
        Vadmin.setLocationRelativeTo(null);
        Vadmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fondo = this.getClass().getResource("/Im_201709051/f3.jpg");
        imgfondo = new ImageIcon(fondo).getImage();
        vacia = new JLabel("    Bienvenido Administrador   ");
        vacia.setBorder(brd);
        vacia.setFont(new java.awt.Font("Tahoma", 1, 20));
        vacia.setHorizontalAlignment(JLabel.CENTER);
        vacia.setBounds(50, 75, 600, 60);
        ImageIcon elim = new ImageIcon(getClass().getResource("/Im_201709051/eliminar.jpg"));
        ImageIcon elimi = new ImageIcon(elim.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        ImageIcon cre = new ImageIcon(getClass().getResource("/Im_201709051/crear.png"));
        ImageIcon crear = new ImageIcon(cre.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        ImageIcon mos = new ImageIcon(getClass().getResource("/Im_201709051/modificar.jpg"));
        ImageIcon most = new ImageIcon(mos.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));

        user = new JLabel("");
        user.setBorder(border);
        user.setBounds(50, 150, 150, 250);
        jug = new JLabel("");
        jug.setBorder(border);
        jug.setBounds(210, 150, 150, 250);
        estam = new JLabel("");
        estam.setBorder(border);
        estam.setBounds(370, 150, 150, 250);
        equipo = new JLabel("");
        equipo.setBorder(border);
        equipo.setBounds(530, 150, 150, 250);
        ci = new JLabel("Carga Individual");
        ci.setBorder(border); ci.setOpaque(true);
        ci.setBounds(210, 245, 470, 20);
        cm = new JLabel("Carga Masiva");
        cm.setBorder(border);cm.setOpaque(true);
        cm.setBounds(210, 185, 470, 20);

        u = new JLabel("Usuarios");
        u.setBorder(border);
        u.setBounds(50, 150, 150, 30);
        u.setHorizontalAlignment(JLabel.CENTER);
        u.setOpaque(true);
        u.setBackground(Color.pink);
        j = new JLabel("Jugadores");
        j.setBorder(border);
        j.setBounds(210, 150, 150, 30);
        j.setHorizontalAlignment(JLabel.CENTER);
        j.setOpaque(true);
        j.setBackground(Color.pink);
        es = new JLabel("Estampas");
        es.setBorder(border);
        es.setBounds(370, 150, 150, 30);
        es.setHorizontalAlignment(JLabel.CENTER);
        es.setOpaque(true);
        es.setBackground(Color.pink);
        eq = new JLabel("Equipos");
        eq.setBorder(border);
        eq.setBounds(530, 150, 150, 30);
        eq.setHorizontalAlignment(JLabel.CENTER);
        eq.setOpaque(true);
        eq.setBackground(Color.pink);

        informes = new JButton("Informes");
        informes.setBounds(390, 20, 100, 40);
        informes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        cuser = new JButton("Crear");
        cuser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cuser.setBackground(Color.LIGHT_GRAY);
        cuser.setIcon(crear);
        cuser.setBounds(80, 210, 90, 40);
        cuser.addActionListener((ActionEvent ae) -> {
            Registro reg = new Registro ();
            reg.setVisible(true);
            Vadmin.setVisible(false); 
        });
        muser = new JButton("Modificar");
        muser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        muser.setBackground(Color.LIGHT_GRAY);
        muser.setIcon(most);
        muser.setBounds(80, 265, 90, 40);
        muser.addActionListener((ActionEvent ae) -> {

        });
        eluser = new JButton("Eliminar");
        eluser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eluser.setIcon(elimi);
        eluser.setBounds(80, 320, 90, 40);
        eluser.addActionListener((ActionEvent ae) -> {

        });

        logout = new JButton("Salir");
        logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logout.setFocusPainted(true);
        logout.setBounds(500, 20, 100, 40);
        logout.addActionListener((ActionEvent ae) -> {
            Vadmin.dispose();
            new Login().setVisible(true);
        });

        cj = new JButton("Crear Masiva");
        cj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cj.setBackground(Color.LIGHT_GRAY);
        cj.setIcon(crear);
        cj.setBounds(240, 210, 90, 30);
        cj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            //A new File Chooser is created
            JFileChooser Explorer = new JFileChooser();
            FileNameExtensionFilter Filter = new FileNameExtensionFilter("Carga Masiva","ecys");
            Explorer.setFileFilter(Filter);
            Explorer.setCurrentDirectory(new java.io.File("Documentos"));
            Explorer.setDialogTitle("Escoge un archivo");

            //If a file is readed
            if (Explorer.showOpenDialog(Vadmin) == JFileChooser.APPROVE_OPTION) {

                //This BufferedReader will read the file
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Explorer.getSelectedFile()), "cp1252"))) {
                    String name = Explorer.getSelectedFile().getName();
                    String[] a = name.split("\\.");
                    if (a[1].equals("ecys")) {
                        loadPlayers(br, name);
                        JOptionPane.showMessageDialog(Vadmin, "Cargado con exito");

                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo no soportado");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } main.jugad.show();
            
            }
         
        });
        mj = new JButton("Modificar");
        mj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mj.setBackground(Color.LIGHT_GRAY);
        mj.setIcon(most);
        mj.setBounds(240, 310, 90, 30);
        mj.addActionListener((ActionEvent ae) -> {

        });
        elj = new JButton("Eliminar");
        elj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        elj.setIcon(elimi);
        elj.setBounds(240, 350, 90, 30);
        elj.addActionListener((ActionEvent ae) -> {

        });

        ce = new JButton("Crear Masiva");
        ce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ce.setBackground(Color.LIGHT_GRAY);
        ce.setIcon(crear);
        ce.setBounds(400, 210, 90, 30);
        ce.addActionListener((ActionEvent ae) -> {
            //A new File Chooser is created
            JFileChooser Explorer = new JFileChooser();
            FileNameExtensionFilter Filter = new FileNameExtensionFilter("Carga Masiva","ecys");
            Explorer.setFileFilter(Filter);
            Explorer.setCurrentDirectory(new java.io.File("Documentos"));
            Explorer.setDialogTitle("Escoge un archivo");

            //If a file is readed
            if (Explorer.showOpenDialog(Vadmin) == JFileChooser.APPROVE_OPTION) {

                //This BufferedReader will read the file
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Explorer.getSelectedFile()), "cp1252"))) {
                    String name = Explorer.getSelectedFile().getName();
                    String[] a = name.split("\\.");
                    if (a[1].equals("ecys")) {
                        loadStickers(br, name);
                        JOptionPane.showMessageDialog(Vadmin, "Cargado con exito");

                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo no soportado");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  main.est.show();
        });
        me = new JButton("Modificar");
        me.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        me.setBackground(Color.LIGHT_GRAY);
        me.setIcon(most);
        me.setBounds(400, 310, 90, 30);
        me.addActionListener((ActionEvent ae) -> {

        });
        ele = new JButton("Eliminar");
        ele.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ele.setIcon(elimi);
        ele.setBounds(400, 350, 90, 30);
        ele.addActionListener((ActionEvent ae) -> {

        });

        ceq = new JButton("Crear Masiva");
        ceq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ceq.setBackground(Color.LIGHT_GRAY);
        ceq.setIcon(crear);
        ceq.setBounds(560, 210, 90, 30);
        ceq.addActionListener((ActionEvent ae) -> {
            //A new File Chooser is created
            JFileChooser Explorer = new JFileChooser();
            FileNameExtensionFilter Filter = new FileNameExtensionFilter("Carga Masiva","ecys");
            Explorer.setFileFilter(Filter);
            Explorer.setCurrentDirectory(new java.io.File("Documentos"));
            Explorer.setDialogTitle("Escoge un archivo");

            //If a file is readed
            if (Explorer.showOpenDialog(Vadmin) == JFileChooser.APPROVE_OPTION) {

                //This BufferedReader will read the file
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Explorer.getSelectedFile()), "cp1252"))) {
                    String name = Explorer.getSelectedFile().getName();
                    String[] a = name.split("\\.");
                    if (a[1].equals("ecys")) {
                        loadTeams(br, name);
                        JOptionPane.showMessageDialog(Vadmin, "Cargado con exito");

                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo no soportado");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } main.Teams.show();
        });
        meq = new JButton("Modificar");
        meq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        meq.setBackground(Color.LIGHT_GRAY);
        meq.setIcon(most);
        meq.setBounds(560, 310, 90, 30);
        meq.addActionListener((ActionEvent ae) -> {

        });
        eleq = new JButton("Eliminar");
        eleq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        eleq.setIcon(elimi);
        eleq.setBounds(560, 350, 90, 30);
        eleq.addActionListener((ActionEvent ae) -> {

        });
        cij = new JButton("C. Individual");
        cij.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cij.setIcon(crear);
        cij.setBounds(240, 270, 90, 30);
        cij.addActionListener((ActionEvent ae) -> {
            Crear_Jug cjs = new Crear_Jug();
            cjs.setVisible(true);
              Vadmin.setVisible(false); 
        });
        cie = new JButton("C. Individual");
        cie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cie.setIcon(crear);
        cie.setBounds(560, 270, 90, 30);
        cie.addActionListener((ActionEvent ae) -> {
            Crear_Equipo cequi = new Crear_Equipo();
            cequi.setVisible(true);
              Vadmin.setVisible(false); 

        });
        cies = new JButton("C. Individual");
        cies.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cies.setIcon(crear);
        cies.setBounds(400, 270, 90, 30);
        cies.addActionListener((ActionEvent ae) -> {
            Crear_Est cequis = new Crear_Est();
            cequis.setVisible(true);
              Vadmin.setVisible(false); 
        });
        
        
        
        
        

        Vadmin.add(vacia);
        Vadmin.add(logout);
        Vadmin.add(user);
//        Vadmin.add(u);
        Vadmin.add(cuser);
        Vadmin.add(eluser);
        Vadmin.add(muser);
        Vadmin.add(cj);
        Vadmin.add(elj);
        Vadmin.add(mj);
        Vadmin.add(ce);
        Vadmin.add(ele);
        Vadmin.add(me);
        Vadmin.add(ceq);
        Vadmin.add(eleq);
        Vadmin.add(meq);
        Vadmin.add(jug);
        Vadmin.add(equipo);
        Vadmin.add(estam);
        Vadmin.add(u);
        Vadmin.add(j);
        Vadmin.add(ci);
        Vadmin.add(cm);
        Vadmin.add(cij);
        Vadmin.add(cie);
        Vadmin.add(cies);
        Vadmin.add(eq);
        Vadmin.add(es);
        Vadmin.add(informes);
        Vadmin.add(panel);

        Vadmin.setVisible(false);

    }

    private void loadTeams(BufferedReader br, String FileName) throws FileNotFoundException, IOException {
        reportNode reporteTemp = new reportNode(FileName);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        line = sb.toString();
        String[] a = line.split("\n");
        for (String s : a) {
            String b[] = s.split("#");
            //int team = 0, 
            String nombreeq= "",team ="", wins = "", years = "";
            
            boolean error = false, duplicated = false;
            try {
                //No Blank Spaces
                for (String l : b) {
                    Scanner li = new Scanner(l);
                    String temp = li.next();
                }
                //Validate Name
                char q[] = b[0].toCharArray();
                for (char m : q) {
                    if (Character.isDigit(m) || Character.isLetter(m) || m == ' '); else {
                        throw new Exception();
                    }
                }
                //Validate ID
                Scanner sc = new Scanner(b[1]);
                team = sc.next();
                if (sc.hasNext()) {
                    throw new Exception();
                }
                try {
                    Equipo prueba = main.Teams.find("" + team);
                    if (prueba != null) {
                        reporteTemp.duplicated++;
                        duplicated = true;
                        throw new Exception();
                    }
                } catch (NullPointerException e) {

                }
                
                //Validate Wins
                Scanner sc1 = new Scanner(b[2]);
                wins = sc1.next();
                if (sc1.hasNext()) {
                    throw new Exception();
                }
                
               //Validate a??o creac
                Scanner sc2 = new Scanner(b[3]);
                years = sc2.next();
                if (sc2.hasNext()) {
                    throw new Exception();
                }
               
                
            } catch (Exception e) {
                if (!duplicated) {
                    reporteTemp.invalid++;
                }
                error = true;
            }
            if (!error) {
                reporteTemp.succeded++;
                main.Teams.add(new Equipo("" + b[0], b[1], b[2], "" + years));
                
            }
        }
        main.reports.add(reporteTemp);
    }

    private void loadPlayers(BufferedReader br, String FileName) throws FileNotFoundException, IOException {
        reportNode reporteTemp = new reportNode(FileName);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        line = sb.toString();
        String[] a = line.split("\n");
        for (String s : a) {
            String b[] = s.split("#");
            boolean error = false, duplicated = false;
            int Team = 0, ID = 0;
            String height = "", weight = "", year = "";
            try {
                //No Blank Spaces
                for (String l : b) {
                    Scanner li = new Scanner(l);
                    String temp = li.next();
                }
                    // Validar jugador
                Scanner te = new Scanner(b[0]);
                char[] v = te.next().toCharArray();
                if (!te.hasNext()) {
                    for (char m : v) {
                        if (!Character.isLetter(m)) {
                            throw new Exception();
                        }
                    }
                } else {
                    throw new Exception();
                }
                Equipo e = main.Teams.find("" + v);
                
                //Validate Position
                Scanner po = new Scanner(b[1]);
                char[] v1 = po.next().toCharArray();
                if (!po.hasNext()) {
                    for (char m : v1) {
                        if (!Character.isLetter(m)) {
                            throw new Exception();
                        }
                    }
                } else {
                    throw new Exception();
                }

                //Validate Birth Year
                Scanner sc3 = new Scanner(b[2]);
                year = sc3.next();
                if (sc3.hasNext()) {
                    throw new Exception();
                }
                //Validate team
               // Scanner sc1 = new Scanner(b[6]);
               // Team = sc1.nextInt();
                //Equipo e = main.Teams.find("" + Team);

                //Validate height
                DecimalFormat dF = new DecimalFormat();
                Scanner t = new Scanner(b[3]);
                double my = Double.valueOf(t.next());
                dF.setMaximumFractionDigits(2);
                height = dF.format(my);
                if (t.hasNext()) {
                    throw new Exception();
                }

                //Validate weight
                Scanner t2 = new Scanner(b[4]);
                double my2 = Double.valueOf(t2.next());
                weight = dF.format(my2);
                if (t2.hasNext()) {
                    throw new Exception();
                }
                
                
                //Validate ID
                Scanner sc = new Scanner(b[5]);
                ID = sc.nextInt();
                if (sc.hasNext()) {
                    throw new Exception();
                }
                try {
                    Jugador prueba = e.lista.find("" + ID);
                    if (prueba != null) {
                        duplicated = true;
                        reporteTemp.duplicated++;
                        throw new Exception();
                    }
                } catch (NullPointerException exe) {

                }
                
                //Validate camisola
                char camis[] = b[6].toCharArray();
                for (char m : camis) {
                    if (Character.isLetter(m) || m == ' '); else {
                        throw new Exception();
                    }
                }
                //Validate tipo
                char q[] = b[7].toCharArray();
                for (char m : q) {
                    if (Character.isLetter(m) || m == ' '); else {
                        throw new Exception();
                    }
                }
                

                

                
                
                
            } catch (Exception e) {
                if (!duplicated) {
                    reporteTemp.invalid++;
                }
                error = true;
            }
            if (!error) {
                reporteTemp.succeded++;
                Jugador jugador = new Jugador("" + b[0], b[1], b[2], "" + b[3], "" +b[4], "" +b[5], b[6], b[7]);
            }
        }
        main.reports.add(reporteTemp);
    }

    private void loadStickers(BufferedReader br, String FileName) throws FileNotFoundException, IOException {
        reportNode reporteTemp = new reportNode(FileName);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        line = sb.toString();
        String[] a = line.split("\n");
        for (String s : a) {
            String b[] = s.split("#");
            boolean error = false, duplicated = false;
            int Team = 0, IDE = 0, wei = 0;
            String ID = "";
            String ruta = null;
            try {

                //No Blank Spaces
                for (String l : b) {
                    Scanner li = new Scanner(l);
                    String temp = li.next();
                }
                //Validate Name
                char q[] = b[0].toCharArray();
                for (char m : q) {
                    if (Character.isDigit(m) || Character.isLetter(m) || m == ' '); else {
                        throw new Exception();
                    }
                }
                
                
                // Validar Codigo de equipo
                Scanner sc = new Scanner(b[1]);
                ID = sc.next();
                if (sc.hasNext()) {
                    throw new Exception();
                }
                try {
                    Estampa prueba = main.est.find("" + ID);
                    if (prueba != null) {
                        duplicated = true;
                        reporteTemp.duplicated++;
                        throw new Exception();
                    }
                } catch (NullPointerException e) {

                }

                //Validate team
               // Scanner sc1 = new Scanner(b[2]);
               // Team = sc1.nextInt();
               // Equipo prueba = main.Teams.find("" + Team);

                
                //Validate Rareza
                Scanner sc3 = new Scanner(b[2]);
                wei = sc3.nextInt();
                if (wei == 0 || wei == 1) {
                } else {
                    throw new Exception("Rareza invalida");
                }

                //Validate Ruta
                Scanner asdf = new Scanner(b[3]);
                ruta = asdf.next();
                File imagen = new File("src/" + ruta);
                if (!imagen.isFile() || !imagen.exists()) {
                    throw new Exception("imagen inexistente");
                }

            } catch (Exception e) {
                if (!duplicated) {
                    reporteTemp.invalid++;
                }
                error = true;
            }
            if (!error) {
                reporteTemp.succeded++;
                main.est.add(new Estampa( b[0], b[1],b[2],b[3]));
            }
        }
        main.reports.add(reporteTemp);
    }



    private void loadSU(BufferedReader br, String FileName) throws FileNotFoundException, IOException {

    }

    public JPanel panel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            g.drawImage(imgfondo, 0, 0, getWidth(), getHeight(), this);
        }
    };
}
