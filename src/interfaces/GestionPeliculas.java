
package interfaces;

import clases.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class GestionPeliculas extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();

    
    public GestionPeliculas() {
        initComponents();
        
        setSize(800, 600);
        setResizable(false);
        setTitle("Login-Bienvenido");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

//    Lineas de codigo para integrar las imagenes dentro del Jlabel o sea el fondo
//    dentro de los parentesos de ImageIcon va ala ruta de la imagen que queremos poner de fondo
//        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
//        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper_Gestion_Pelicula.png");   
    this.jLabel_wallpaper_gestion_peliculas.setIcon(new ImageIcon(getClass().getResource("/images/wallpaperPrincipal.jpg")));

//    Aqui sencillamente lo que se hace es obtener las dimensiones del label que se utilizó para el fondo para que se pueda adaptar facilmente a al ventana
//        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper_gestion_peliculas.getWidth(), jLabel_wallpaper_gestion_peliculas.getHeight(), Image.SCALE_DEFAULT));

//    Para colocar el Wallpaper dentro del jLabel
//        jLabel_wallpaper_gestion_peliculas.setIcon(icono);
//    Linea de codigo ocional para que se ejecuten los cambios      
        this.repaint();
        
        //            Empezamos a meter los datos en la tabla
            jTable_gestion_pelculas = new JTable(model);
            jScrollPane1.setViewportView(jTable_gestion_pelculas);

            model.addColumn(" ");
            model.addColumn("Numero Disco");
            model.addColumn("Nombre Filme");
            model.addColumn("Actor");
            model.addColumn("Genero");
            model.addColumn("Año");
            model.addColumn("Sinopsis");
            model.addColumn("Formato");
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id, numero_disco, nombre_filme, actor, genero, ano, sinopsis, formato from datos");
                
                ResultSet rs = pst.executeQuery();
                
                while(rs.next()){
                    Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
                }
                cn.close();
        } catch (SQLException e) {
                System.err.println("Error en la conexion con la base de datos");
                JOptionPane.showMessageDialog(null, "Consulte al Administrador");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_gestion_pelculas = new javax.swing.JTable();
        jLabel_wallpaper_gestion_peliculas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_gestion_pelculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_gestion_pelculas.setEnabled(false);
        jScrollPane1.setViewportView(jTable_gestion_pelculas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 800, 250));
        getContentPane().add(jLabel_wallpaper_gestion_peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_wallpaper_gestion_peliculas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_gestion_pelculas;
    // End of variables declaration//GEN-END:variables
}
