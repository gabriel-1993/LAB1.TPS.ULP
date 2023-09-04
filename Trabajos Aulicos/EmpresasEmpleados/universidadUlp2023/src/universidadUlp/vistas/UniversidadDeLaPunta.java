package universidadUlp.vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadUlp.entidades.Alumno;
import universidadUlp.vistas.formularioMateria;
import universidadUlp.vistas.manejoDeInscripciones;

/**
 *
 * @author Gabriel
 */
public class UniversidadDeLaPunta extends javax.swing.JFrame {

    public UniversidadDeLaPunta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        formularioAlumnoEvent = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        formularioMateriaEvent = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        manejoInscripcionesEvent = new javax.swing.JMenuItem();
        manipulacionNotasEvent = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        alumnosPorMateriaEvent = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        formularioAlumnoEvent.setText("Formulario de Alumno");
        formularioAlumnoEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioAlumnoEventActionPerformed(evt);
            }
        });
        jMenu1.add(formularioAlumnoEvent);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        formularioMateriaEvent.setText("Formulario Materia");
        formularioMateriaEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioMateriaEventActionPerformed(evt);
            }
        });
        jMenu2.add(formularioMateriaEvent);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administraciòn");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        manejoInscripcionesEvent.setText("Manejo de Inscripciones");
        manejoInscripcionesEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejoInscripcionesEventActionPerformed(evt);
            }
        });
        jMenu3.add(manejoInscripcionesEvent);

        manipulacionNotasEvent.setText("Manipulacion de Notas");
        manipulacionNotasEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manipulacionNotasEventActionPerformed(evt);
            }
        });
        jMenu3.add(manipulacionNotasEvent);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        alumnosPorMateriaEvent.setText("Alumnos por Materia");
        alumnosPorMateriaEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosPorMateriaEventActionPerformed(evt);
            }
        });
        jMenu4.add(alumnosPorMateriaEvent);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formularioAlumnoEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioAlumnoEventActionPerformed
        //quitamos todo lo que este mostrando escritorio
        escritorio.removeAll();
        //le pedimos que se reedibuje 
        escritorio.repaint();
        //creamos un objeto de la vista/clase busqueda por nombre view
        formularioAlumno fa = new formularioAlumno();
        //a la variable anterior la hacemos visible 
        fa.setVisible(true);
        //la agregamos a nuestro display que seria el escritorio
        escritorio.add(fa);
        //la colocamos por delante del escritorio para que este no la tape..
        escritorio.moveToFront(fa);
    }//GEN-LAST:event_formularioAlumnoEventActionPerformed

    private void formularioMateriaEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioMateriaEventActionPerformed

        //quitamos todo lo que este mostrando escritorio
        escritorio.removeAll();
        //le pedimos que se reedibuje 
        escritorio.repaint();
        //creamos un objeto de la vista/clase busqueda por nombre view
        formularioMateria fm = new formularioMateria();
        //a la variable anterior la hacemos visible 
        fm.setVisible(true);
        //la agregamos a nuestro display que seria el escritorio
        escritorio.add(fm);
        //la colocamos por delante del escritorio para que este no la tape..
        escritorio.moveToFront(fm);     }//GEN-LAST:event_formularioMateriaEventActionPerformed

    private void manejoInscripcionesEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejoInscripcionesEventActionPerformed
        //quitamos todo lo que este mostrando escritorio
        escritorio.removeAll();
        //le pedimos que se reedibuje 
        escritorio.repaint();
        //creamos un objeto de la vista/clase busqueda por nombre view
        manejoDeInscripciones mdi = new manejoDeInscripciones();
        //a la variable anterior la hacemos visible 
        mdi.setVisible(true);
        //la agregamos a nuestro display que seria el escritorio
        escritorio.add(mdi);
        //la colocamos por delante del escritorio para que este no la tape..
        escritorio.moveToFront(mdi);
    }//GEN-LAST:event_manejoInscripcionesEventActionPerformed

    private void manipulacionNotasEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manipulacionNotasEventActionPerformed
        //quitamos todo lo que este mostrando escritorio
        escritorio.removeAll();
        //le pedimos que se reedibuje 
        escritorio.repaint();
        //creamos un objeto de la vista/clase busqueda por nombre view
        cargaDeNotas cdn = new cargaDeNotas();
        //a la variable anterior la hacemos visible 
        cdn.setVisible(true);
        //la agregamos a nuestro display que seria el escritorio
        escritorio.add(cdn);
        //la colocamos por delante del escritorio para que este no la tape..
        escritorio.moveToFront(cdn);
    }//GEN-LAST:event_manipulacionNotasEventActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void alumnosPorMateriaEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosPorMateriaEventActionPerformed
        //quitamos todo lo que este mostrando escritorio
        escritorio.removeAll();
        //le pedimos que se reedibuje 
        escritorio.repaint();
        //creamos un objeto de la vista/clase busqueda por nombre view
        consultaAlumnosPorMateria capm = new consultaAlumnosPorMateria();
        //a la variable anterior la hacemos visible 
        capm.setVisible(true);
        //la agregamos a nuestro display que seria el escritorio
        escritorio.add(capm);
        //la colocamos por delante del escritorio para que este no la tape..
        escritorio.moveToFront(capm);
    }//GEN-LAST:event_alumnosPorMateriaEventActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //----------------------------     CONEXION a BASE DE DATOS     ---------------------------
        try {
            //Cargo los drivers en el try para prevenir algun error 
            Class.forName("org.mariadb.jdbc.Driver");
            //Conexion a la Base de Datos: en el url -> mariadb (es el driver que utilizamos para conectar java a BD)
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad2023", "root", "");

            Connection con = null;
            PreparedStatement ps = null;
            Alumno alumno = null;
            //Para cuando traiga cosas de la base de datos, poder guardarlas aqui en Java
            ResultSet rs = null;
            
            //INGRESAR ALUMNO A BASE DE DATOS
            // LAS FECHAS SE INGRESAN COMO SE PUEDE VER EN LA SIGUIENTE LINEA, 
            //sino van a quedar como 00000000 que equivale a null
           
            String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (2363664,'Messi','Lionel','1986-01-13',1)";
            //Para Subir a la base de datos
            ps = conexion.prepareStatement(sql);
            ps.executeUpdate();
            //Para traer desde la base de datos
            sql = "SELECT * FROM alumno";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            //traigo los alumnos recorriendo el resulset mietras alla mas personas...
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                //parseo la fecha para poder asignarla :
                java.sql.Date fechaSQL = rs.getDate("fechaNacimiento");
                LocalDate fechaNacimiento = fechaSQL.toLocalDate();
                alumno.setFechaNacimiento(fechaNacimiento);
                alumno.setEstado(rs.getBoolean("estado"));
                System.out.println(alumno);
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Drivers" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }


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
            java.util.logging.Logger.getLogger(UniversidadDeLaPunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversidadDeLaPunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversidadDeLaPunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversidadDeLaPunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversidadDeLaPunta().setVisible(true);
            }
        });
    }

     public void guardarAlumno(Alumno alumno){
                
            }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alumnosPorMateriaEvent;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem formularioAlumnoEvent;
    private javax.swing.JMenuItem formularioMateriaEvent;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem manejoInscripcionesEvent;
    private javax.swing.JMenuItem manipulacionNotasEvent;
    // End of variables declaration//GEN-END:variables
}
