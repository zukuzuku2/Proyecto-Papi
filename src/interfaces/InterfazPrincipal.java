/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author josej
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    
    String user;

    public InterfazPrincipal() {
        initComponents();
        user = Login.user;
        setSize(800, 600);
        setResizable(false);
        setTitle("Bienvenido - " + user);
        setLocationRelativeTo(null);
        //Lineas de codigo para integrar las imagenes dentro del Jlabel o sea el fondo
        //dentro de los parentesos de ImageIcon va ala ruta de la imagen que queremos poner de fondo
         this.jLabel_Wallpaper_Interfaz_Principal.setIcon(new ImageIcon(getClass().getResource("/images/wallpaper_Interfax_Principal.jpg")));

//        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper_Interfax_Principal.jpg");
        //Aqui sencillamente lo que se hace es obtener las dimensiones del laber que se utilizo para el fondo para que se pueda adaptar facilmente a al ventana
//        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper_Interfaz_Principal.getWidth(), jLabel_Wallpaper_Interfaz_Principal.getHeight(), Image.SCALE_DEFAULT));
        //Para colocar el Wallpaper dentro del jLabel        
//        jLabel_Wallpaper_Interfaz_Principal.setIcon(icono);
        //Linea de codigo ocional para que se ejecuten los cambios
        this.repaint();
        
        txt_Bienvenida.setText("Bienvenido estimado " + user);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Bienvenida = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_pelicula = new javax.swing.JLabel();
        jLabel_gestion = new javax.swing.JLabel();
        jButton_GestionPeliculas = new javax.swing.JButton();
        jLabel_Wallpaper_Interfaz_Principal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Bienvenida.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Bienvenida.setText("jLabel1");
        getContentPane().add(txt_Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/The_Avengers_32401.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 128));

        label_pelicula.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_pelicula.setForeground(new java.awt.Color(255, 255, 255));
        label_pelicula.setText("Registrar Pelicula");
        getContentPane().add(label_pelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 180, -1, -1));

        jLabel_gestion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_gestion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_gestion.setText("Gestión de Peliculas");
        getContentPane().add(jLabel_gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jButton_GestionPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/The_Lord_of_the_Rings.png"))); // NOI18N
        jButton_GestionPeliculas.setText("jButton2");
        jButton_GestionPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 100, 128));
        getContentPane().add(jLabel_Wallpaper_Interfaz_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        dispose();
        new RegistroPeliculas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_GestionPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionPeliculasActionPerformed
        //dispose();
        GestionPeliculas gestionPeliculas = new GestionPeliculas();
        gestionPeliculas.setVisible(true);
    }//GEN-LAST:event_jButton_GestionPeliculasActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_GestionPeliculas;
    private javax.swing.JLabel jLabel_Wallpaper_Interfaz_Principal;
    private javax.swing.JLabel jLabel_gestion;
    private javax.swing.JLabel label_pelicula;
    private javax.swing.JLabel txt_Bienvenida;
    // End of variables declaration//GEN-END:variables
}
