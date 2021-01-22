package interfaces;

import clases.Conexion;
import clases.Variables;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class RegistroPeliculas extends javax.swing.JFrame {

    String usuario, password, nombredepelicula, generoP, actorP, anoP, numerodisco, formatoV, sinopsisP, comboboxno;

    public RegistroPeliculas() {

        usuario = Variables.user;
        password = Variables.pass;
        nombredepelicula = Variables.nombrePelicula;
        generoP = Variables.genero;
        actorP = Variables.actor;
        anoP = Variables.ano;
        numerodisco = Variables.noDisco;
        formatoV = Variables.formatoVideo;
        sinopsisP = Variables.sinopsis;

        initComponents();
        setSize(800, 600);
        setResizable(false);
        setTitle("Registro-Peliculas");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        //Lineas de codigo para integrar las imagenes dentro del Jlabel o sea el fondo
        //dentro de los parentesos de ImageIcon va ala ruta de la imagen que queremos poner de fondo
        this.jLabel_wallpaper_registro_peliculas.setIcon(new ImageIcon(getClass().getResource("/images/wallpaper_registro_peliculas.jpg")));
//        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper_registro_peliculas.jpg");
//       final ImageIcon wallpaper = new ImageIcon(getClass().getResource("images/wallpaper_registro_peliculas.jpg"));
        //Aqui sencillamente lo que se hace es obtener las dimensiones del laber que se utilizo para el fondo para que se pueda adaptar facilmente a al ventana
//        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper_registro_peliculas.getWidth(), jLabel_wallpaper_registro_peliculas.getHeight(), Image.SCALE_DEFAULT));
        //Para colocar el Wallpaper dentro del jLabel        
//        jLabel_wallpaper_registro_peliculas.setIcon(icono);
        //Linea de codigo ocional para que se ejecuten los cambios
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombrePelicula = new javax.swing.JLabel();
        txt_Nombre_Pelicula = new javax.swing.JTextField();
        jLabel_genero = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_actor_principal = new javax.swing.JLabel();
        txt_Actor = new javax.swing.JTextField();
        jLabel_ano = new javax.swing.JLabel();
        txt_Ano = new javax.swing.JTextField();
        jLabel_no_disco = new javax.swing.JLabel();
        txt_Disco = new javax.swing.JTextField();
        jLabel_formato = new javax.swing.JLabel();
        txt_Formato = new javax.swing.JTextField();
        jLabel_Sinopsis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_insertar_bd = new javax.swing.JButton();
        jLabel_wallpaper_registro_peliculas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombrePelicula.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_NombrePelicula.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombrePelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NombrePelicula.setText("Nombre de Pelicula: ");
        getContentPane().add(jLabel_NombrePelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txt_Nombre_Pelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, -1));

        jLabel_genero.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_genero.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_genero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_genero.setText("Genero: ");
        getContentPane().add(jLabel_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accion", "Ficcion", "Animados", "Infantiles", "Munes", "Terror", "Drama", "Clasicos", "Suspenso", "Gay", "PGM" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 200, -1));

        jLabel_actor_principal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_actor_principal.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_actor_principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_actor_principal.setText("Actor Principal: ");
        getContentPane().add(jLabel_actor_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(txt_Actor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jLabel_ano.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_ano.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ano.setText("Año de Lanzamiento: ");
        getContentPane().add(jLabel_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(txt_Ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, -1));

        jLabel_no_disco.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_no_disco.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_no_disco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_no_disco.setText("Numero de Disco: ");
        getContentPane().add(jLabel_no_disco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(txt_Disco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, -1));

        jLabel_formato.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_formato.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formato.setText("Formato de Video: ");
        getContentPane().add(jLabel_formato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        getContentPane().add(txt_Formato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, -1));

        jLabel_Sinopsis.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel_Sinopsis.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sinopsis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Sinopsis.setText("Sinopsis: ");
        getContentPane().add(jLabel_Sinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, 120));

        btn_insertar_bd.setBackground(new java.awt.Color(165, 220, 245));
        btn_insertar_bd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_insertar_bd.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertar_bd.setText("INSERTAR A BD");
        btn_insertar_bd.setBorder(new javax.swing.border.SoftBevelBorder(0, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        btn_insertar_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertar_bdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insertar_bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 90));
        getContentPane().add(jLabel_wallpaper_registro_peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertar_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertar_bdActionPerformed
        int nivelescb, validacion = 0;

        numerodisco = txt_Disco.getText().trim();
        nombredepelicula = txt_Nombre_Pelicula.getText().trim();
        actorP = txt_Actor.getText().trim();
        anoP = txt_Ano.getText().trim();
        sinopsisP = jTextArea1.getText().trim();
        formatoV = txt_Formato.getText().trim();
        nivelescb = jComboBox1.getSelectedIndex() + 1;

//    COndiciones para que no queden vacios los campos
        if (numerodisco.equals("")) {
            txt_Disco.setBackground(Color.red);
            validacion++;
        }
        if (nombredepelicula.equals("")) {
            txt_Nombre_Pelicula.setBackground(Color.red);
            validacion++;
        }
        if (actorP.equals("")) {
            txt_Actor.setBackground(Color.red);
            validacion++;
        }
        if (anoP.equals("")) {
            txt_Ano.setBackground(Color.red);
            validacion++;
        }
        if (sinopsisP.equals("")) {
            jTextArea1.setBackground(Color.red);
            validacion++;
        }
        if (formatoV.equals("")) {
            txt_Formato.setBackground(Color.red);
            validacion++;
        }

//    Para sabre a que genero pertenece la pelicula
        if (nivelescb == 1) {
            comboboxno = "Accion";
        }
        if (nivelescb == 2) {
            comboboxno = "Ficcion";
        }
        if (nivelescb == 3) {
            comboboxno = "Suspenso";
        }
        if (nivelescb == 4) {
            comboboxno = "Terror";
        }
        if (nivelescb == 5) {
            comboboxno = "Drama";
        }
        if (nivelescb == 6) {
            comboboxno = "Munequitos";
        }

//            Mas adelante puedo validar que no haya ususarios repetidos pero de momento como es para mi papa, no es necesario
//                Establecer conexion con base de datos para poder meter todos los datos
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into datos values (?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);
            pst.setString(2, numerodisco);
            pst.setString(3, nombredepelicula);
            pst.setString(4, actorP);
            pst.setString(5, comboboxno);
            pst.setString(6, anoP);
            pst.setString(7, sinopsisP);
            pst.setString(8, formatoV);

            pst.executeUpdate();

            Limpiar();

        } catch (SQLException sqlexception) {
            System.err.println("sql Error!!!" + sqlexception);
        }


    }//GEN-LAST:event_btn_insertar_bdActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insertar_bd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel_NombrePelicula;
    private javax.swing.JLabel jLabel_Sinopsis;
    private javax.swing.JLabel jLabel_actor_principal;
    private javax.swing.JLabel jLabel_ano;
    private javax.swing.JLabel jLabel_formato;
    private javax.swing.JLabel jLabel_genero;
    private javax.swing.JLabel jLabel_no_disco;
    private javax.swing.JLabel jLabel_wallpaper_registro_peliculas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_Actor;
    private javax.swing.JTextField txt_Ano;
    private javax.swing.JTextField txt_Disco;
    private javax.swing.JTextField txt_Formato;
    private javax.swing.JTextField txt_Nombre_Pelicula;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        jTextArea1.setText("");
        txt_Actor.setText("");
        txt_Ano.setText("");
        txt_Disco.setText("");
        txt_Formato.setText("");
        txt_Nombre_Pelicula.setText("");

//        RESTAURAR UN COMBOBOX
        jComboBox1.setSelectedIndex(0);
    }

}
