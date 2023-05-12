package vista;

import javax.swing.JOptionPane;
import modelo.CifrarContraseña;
import modelo.SQLUsuario;
import modelo.Usuario;

/**
 *
 * @author nick_
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        cajaConfirmarContraseña = new javax.swing.JPasswordField();
        cajaNombre = new javax.swing.JTextField();
        cajaCorreo = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombre.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("<html>Confirmar contraseña:</html>");

        Nombre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombre1.setText("Correo:");

        cajaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre)
                    .addComponent(Nombre1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cajaUsuario)
                        .addComponent(cajaContraseña)
                        .addComponent(cajaConfirmarContraseña)
                        .addComponent(cajaNombre)
                        .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(cajaConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre1)
                    .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(botonRegistrar)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        Usuario usuario = new Usuario();
        SQLUsuario sqlUsuario = new SQLUsuario();

        String contraseña = new String(cajaContraseña.getPassword());
        String ConfirmarContraseña = new String(cajaConfirmarContraseña.getPassword());

        if (cajaUsuario.getText().equals("") || contraseña.equals("") || ConfirmarContraseña.equals("") || cajaNombre.getText().equals("") || cajaCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos");
        } else {
            if (contraseña.equals(ConfirmarContraseña)) {
                if (sqlUsuario.verificarUsuario(cajaUsuario.getText()) == 0) {
                    if (sqlUsuario.comprobarEmail(cajaCorreo.getText())) {
                        String nuevaContraseña = CifrarContraseña.md5(contraseña);
                        usuario.setNombreUsuario(cajaUsuario.getText());
                        usuario.setContraseña(nuevaContraseña);
                        usuario.setNombre(cajaNombre.getText());
                        usuario.setCorreo(cajaCorreo.getText());
                        usuario.setIdTipo_usuario(2);

                        if (sqlUsuario.registrar(usuario)) {
                            JOptionPane.showMessageDialog(null, "Registro correcto");
                            limpiarCajas();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al registrar usuario");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El correo no es correcto, cambielo");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed
    private void limpiarCajas() {
        cajaUsuario.setText("");
        cajaContraseña.setText("");
        cajaConfirmarContraseña.setText("");
        cajaNombre.setText("");
        cajaCorreo.setText("");
    }

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPasswordField cajaConfirmarContraseña;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
