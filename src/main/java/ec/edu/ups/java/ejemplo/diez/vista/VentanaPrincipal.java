/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.vista;

import ec.edu.ups.java.ejemplo.diez.controlador.OperadoraControlador;
import ec.edu.ups.java.ejemplo.diez.controlador.PersonaControlador;
import ec.edu.ups.java.ejemplo.diez.dao.OperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.dao.PersonaDAO;
import ec.edu.ups.java.ejemplo.diez.idao.IOperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.idao.IPersonaDAO;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //ventanas
    private VentanaCrearPersona ventanaCrearPersona;
    private VentanaBuscarPersona ventanaBuscarPersona;
    private VentanaCrearOperadora ventanaCrearOperadora;
    private VentanaBuscarOperadora ventanaBuscarOperadora;
    //controladores
    private PersonaControlador personaControlador;
    private OperadoraControlador operadoraControlador;
    //DAOs
    private IPersonaDAO personaDAO;
    private IOperadoraDAO operadoraDAO;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        personaDAO = new PersonaDAO();
        personaControlador = new PersonaControlador(personaDAO);
        operadoraDAO = new OperadoraDAO();
        operadoraControlador = new OperadoraControlador(operadoraDAO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuPersona = new javax.swing.JMenu();
        menuItemCrearPersona = new javax.swing.JMenuItem();
        menuItemBuscarPersona = new javax.swing.JMenuItem();
        menuItemActualizarPersona = new javax.swing.JMenuItem();
        menuItemEliminarPersona = new javax.swing.JMenuItem();
        menuItemListarPersona = new javax.swing.JMenuItem();
        menuOperadora = new javax.swing.JMenu();
        menuItemCrearOperadora = new javax.swing.JMenuItem();
        menuItemBuscarOperadora = new javax.swing.JMenuItem();
        menuItemActualizarOperadora = new javax.swing.JMenuItem();
        menuItemEliminarOperadora = new javax.swing.JMenuItem();
        menuItemListarOperadora = new javax.swing.JMenuItem();
        menuTelefono = new javax.swing.JMenu();
        menuItemCrearTelefono = new javax.swing.JMenuItem();
        menuItemBuscarTelefono = new javax.swing.JMenuItem();
        menuItemActualizarTelefono = new javax.swing.JMenuItem();
        menuItemEliminarTelefono = new javax.swing.JMenuItem();
        menuItemListarTelefono = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        menuItemSalirOpciones = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPersona.setMnemonic('f');
        menuPersona.setText("Persona");

        menuItemCrearPersona.setMnemonic('o');
        menuItemCrearPersona.setText("Crear");
        menuItemCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearPersonaActionPerformed(evt);
            }
        });
        menuPersona.add(menuItemCrearPersona);

        menuItemBuscarPersona.setMnemonic('a');
        menuItemBuscarPersona.setText("Buscar");
        menuItemBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarPersonaActionPerformed(evt);
            }
        });
        menuPersona.add(menuItemBuscarPersona);

        menuItemActualizarPersona.setMnemonic('s');
        menuItemActualizarPersona.setText("Actualizar");
        menuPersona.add(menuItemActualizarPersona);

        menuItemEliminarPersona.setMnemonic('x');
        menuItemEliminarPersona.setText("Eliminar");
        menuPersona.add(menuItemEliminarPersona);

        menuItemListarPersona.setText("Listar");
        menuPersona.add(menuItemListarPersona);

        menuBar.add(menuPersona);

        menuOperadora.setMnemonic('e');
        menuOperadora.setText("Operadora");

        menuItemCrearOperadora.setMnemonic('t');
        menuItemCrearOperadora.setText("Crear");
        menuItemCrearOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearOperadoraActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemCrearOperadora);

        menuItemBuscarOperadora.setMnemonic('p');
        menuItemBuscarOperadora.setText("Buscar");
        menuItemBuscarOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarOperadoraActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemBuscarOperadora);

        menuItemActualizarOperadora.setMnemonic('y');
        menuItemActualizarOperadora.setText("Actualizar");
        menuOperadora.add(menuItemActualizarOperadora);

        menuItemEliminarOperadora.setMnemonic('d');
        menuItemEliminarOperadora.setText("Eliminar");
        menuOperadora.add(menuItemEliminarOperadora);

        menuItemListarOperadora.setText("Listar");
        menuOperadora.add(menuItemListarOperadora);

        menuBar.add(menuOperadora);

        menuTelefono.setMnemonic('h');
        menuTelefono.setText("Telefono");

        menuItemCrearTelefono.setMnemonic('c');
        menuItemCrearTelefono.setText("Crear");
        menuTelefono.add(menuItemCrearTelefono);

        menuItemBuscarTelefono.setText("Buscar");
        menuTelefono.add(menuItemBuscarTelefono);

        menuItemActualizarTelefono.setMnemonic('a');
        menuItemActualizarTelefono.setText("Actualizar");
        menuTelefono.add(menuItemActualizarTelefono);

        menuItemEliminarTelefono.setText("Eliminar");
        menuTelefono.add(menuItemEliminarTelefono);

        menuItemListarTelefono.setText("Listar");
        menuTelefono.add(menuItemListarTelefono);

        menuBar.add(menuTelefono);

        menuOpciones.setText("Opciones");

        menuItemSalirOpciones.setText("Salir");
        menuItemSalirOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirOpcionesActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemSalirOpciones);

        menuBar.add(menuOpciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirOpcionesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirOpcionesActionPerformed

    private void menuItemCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearPersonaActionPerformed
        if (ventanaCrearPersona == null) {
            ventanaCrearPersona = new VentanaCrearPersona(personaControlador);
            desktopPane.add(ventanaCrearPersona);
        }

        ventanaCrearPersona.setVisible(true);
    }//GEN-LAST:event_menuItemCrearPersonaActionPerformed

    private void menuItemBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarPersonaActionPerformed
        if (ventanaBuscarPersona == null) {
            ventanaBuscarPersona = new VentanaBuscarPersona(personaControlador);
            desktopPane.add(ventanaBuscarPersona);
        }

        ventanaBuscarPersona.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarPersonaActionPerformed

    private void menuItemCrearOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearOperadoraActionPerformed
        if (ventanaCrearOperadora == null) {
            IOperadoraDAO operadoraDAO = new OperadoraDAO();
            OperadoraControlador operadoraControlador = new OperadoraControlador(operadoraDAO);
            ventanaCrearOperadora = new VentanaCrearOperadora(operadoraControlador);
            desktopPane.add(ventanaCrearOperadora);
        }
        ventanaCrearOperadora.setVisible(true);
    }//GEN-LAST:event_menuItemCrearOperadoraActionPerformed

    private void menuItemBuscarOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarOperadoraActionPerformed
        if (ventanaBuscarOperadora == null) {
            ventanaBuscarOperadora = new VentanaBuscarOperadora(operadoraControlador);
            desktopPane.add(ventanaBuscarOperadora);
        }
        ventanaBuscarOperadora.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarOperadoraActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemActualizarOperadora;
    private javax.swing.JMenuItem menuItemActualizarPersona;
    private javax.swing.JMenuItem menuItemActualizarTelefono;
    private javax.swing.JMenuItem menuItemBuscarOperadora;
    private javax.swing.JMenuItem menuItemBuscarPersona;
    private javax.swing.JMenuItem menuItemBuscarTelefono;
    private javax.swing.JMenuItem menuItemCrearOperadora;
    private javax.swing.JMenuItem menuItemCrearPersona;
    private javax.swing.JMenuItem menuItemCrearTelefono;
    private javax.swing.JMenuItem menuItemEliminarOperadora;
    private javax.swing.JMenuItem menuItemEliminarPersona;
    private javax.swing.JMenuItem menuItemEliminarTelefono;
    private javax.swing.JMenuItem menuItemListarOperadora;
    private javax.swing.JMenuItem menuItemListarPersona;
    private javax.swing.JMenuItem menuItemListarTelefono;
    private javax.swing.JMenuItem menuItemSalirOpciones;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuOperadora;
    private javax.swing.JMenu menuPersona;
    private javax.swing.JMenu menuTelefono;
    // End of variables declaration//GEN-END:variables

}
