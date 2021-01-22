package interfaces;

import clases.Conexion;
import clases.Variables;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    String pass;
    public static String user = "";
    
    public Login() {

//    RECORDAR QUE SIEMPRE LA RECUPERACION DE VARIABLE VAN DENTRO DEL CONSTRUCTOR
//    Y HAY QUE DECLARARLAS PREVIAMENTE FUERA DEL CONSTRUCTOR
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setTitle("Login-Bienvenido");
        setLocationRelativeTo(null);

//    Lineas de codigo para integrar las imagenes dentro del Jlabel o sea el fondo
//    dentro de los parentesos de ImageIcon va ala ruta de la imagen que queremos poner de fondo
        this.labelParaWallpaper.setIcon(new ImageIcon(getClass().getResource("/images/wallpaper_login.jpg")));
//        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper_login.jpg");

//    Aqui sencillamente lo que se hace es obtener las dimensiones del label que se utilizó para el fondo para que se pueda adaptar facilmente a al ventana
//        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(labelParaWallpaper.getWidth(), labelParaWallpaper.getHeight(), Image.SCALE_DEFAULT));

//    Para colocar el Wallpaper dentro del jLabel
//        labelParaWallpaper.setIcon(icono);
//    Linea de codigo ocional para que se ejecuten los cambios      
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombredeUsuario = new javax.swing.JLabel();
        jTextField_NombredeUsuario = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_PasswordLogin = new javax.swing.JPasswordField();
        jButton_Ingresar = new javax.swing.JButton();
        labelParaWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombredeUsuario.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel_NombredeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombredeUsuario.setText("Usuario");
        getContentPane().add(jLabel_NombredeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jTextField_NombredeUsuario.setBackground(new java.awt.Color(210, 240, 200));
        jTextField_NombredeUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_NombredeUsuario.setForeground(new java.awt.Color(55, 61, 54));
        jTextField_NombredeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_NombredeUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField_NombredeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombredeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_NombredeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 120, 30));

        jLabel_Password.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Contraseña");
        getContentPane().add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 200, -1, -1));

        jPasswordField_PasswordLogin.setBackground(new java.awt.Color(210, 240, 200));
        jPasswordField_PasswordLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField_PasswordLogin.setForeground(new java.awt.Color(55, 61, 54));
        jPasswordField_PasswordLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_PasswordLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jPasswordField_PasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 240, 120, 30));

        jButton_Ingresar.setBackground(new java.awt.Color(210, 240, 200));
        jButton_Ingresar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_Ingresar.setForeground(new java.awt.Color(20, 170, 230));
        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, 50));
        getContentPane().add(labelParaWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombredeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombredeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombredeUsuarioActionPerformed

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed

//        Recuperando lo que esté en el campo Nombre de usuario de la interfaz login
        user = jTextField_NombredeUsuario.getText().trim();
//        Recuperando lo que esté en el campo Contraseña de la interfaz login
        pass = jPasswordField_PasswordLogin.getText().trim();

//        Aqui viene algo de lo que no me acordaba
//        los SIMBOLOS !-> Significa "Mientras Sea distinto de lo que haya en el campo"
//            Y el simbolo || significa -> or u ó
//        Recordar en este punto que vamos a hacer uso de la base de datos, o sea vamos a hacer una consulta
//        por ende vamos a necesitar establecer todo dentro de una estructura try catch
        if (!user.equals("") || !pass.equals("")) {
            try {
//        Establecemos la conexion
                Connection cn = Conexion.conectar();
//        Ahora vamos a hacer la consulta
                PreparedStatement pst = cn.prepareStatement("select nombre_usuario, contrasena from registrar where nombre_usuario = '" + user + "' and contrasena = '" + pass + "'");

//        Ahora el siguiente metodo es para ejecutar la query
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    String userRecuperado = rs.getString("nombre_usuario");
                    String passRecuperado = rs.getString("contrasena");
                    if (user.equals(userRecuperado)) {
                        if (pass.equals(passRecuperado)) {
//                Definir la interfaz aqui
                            dispose();
                            new InterfazPrincipal().setVisible(true);
//                new RegistroPeliculas().setVisible(true);
                        } else {
                            System.err.println("Error!! no coincide el pass. Reingreselo.");
                            JOptionPane.showMessageDialog(null, "Asegurese que ingresó los datos correctamente!!");
                        }
                    } else {
                        System.err.println("Error!! no coincide el usuario. Reingreselo.");
                        JOptionPane.showMessageDialog(null, "Asegurese que ingresó los datos correctamente!!");
                    }

                } else {
                    System.err.println("Error en encontrar Datos!!");
                    JOptionPane.showMessageDialog(null, "Hubo error en la recuperacion de datos");
                }

            } catch (SQLException ex) {
                System.err.println("Error en conexion a BD " + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe Rellenar todos los campos.");
        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JLabel jLabel_NombredeUsuario;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JPasswordField jPasswordField_PasswordLogin;
    private javax.swing.JTextField jTextField_NombredeUsuario;
    private javax.swing.JLabel labelParaWallpaper;
    // End of variables declaration//GEN-END:variables
}
