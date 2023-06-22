package vistas;

import LIB.FSTexFieldMD;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;

/**
 *
 * @author Derek
 */
public class VistaConductor extends javax.swing.JFrame {
    public VistaConductor() {
        initComponents();
    }

    public JButton getBtnagregarremi() {
        return btnagregarremi;
    }

    public JButton getBtneliminarremi() {
        return btneliminarremi;
    }

    public JButton getBtnlimpiarremi() {
        return btnlimpiarremi;
    }

    public JButton getBtnmodificarremi() {
        return btnmodificarremi;
    }

    public JButton getBtnregistrarremi() {
        return btnregistrarremi;
    }

    public JDateChooser getJdcfechaenvioremiten() {
        return jdcfechaenvioremiten;
    }

    public FSTexFieldMD getTxtcedularemiten() {
        return txtcedularemiten;
    }

    public FSTexFieldMD getTxtidremitente() {
        return txtidremitente;
    }

    public JInternalFrame getJINTFRemitente() {
        return JINTFRemitente;
    }

    public FSTexFieldMD getTxtcedconductor() {
        return txtcedconductor;
    }

    public FSTexFieldMD getTxtidconductor() {
        return txtidconductor;
    }

    public JInternalFrame getJINTFConductores() {
        return JINTFConductores;
    }

    public JButton getBtnagregarconduc() {
        return btnagregarconduc;
    }

    public JButton getBtnconductor() {
        return btnconductor;
    }

    public JButton getBtndestinatario() {
        return btndestinatario;
    }

    public JButton getBtneliminarconduc() {
        return btneliminarconduc;
    }

    public JButton getBtnlimpiarconduc() {
        return btnlimpiarconduc;
    }

    public JButton getBtnmodificarconduc() {
        return btnmodificarconduc;
    }

    public JButton getBtnregistrarconduc() {
        return btnregistrarconduc;
    }

    public JButton getBtnregresar() {
        return btnregresar;
    }

    public JButton getBtnremitente() {
        return btnremitente;
    }

    public JSpinner getSpnsalarioconduc() {
        return spnsalarioconduc;
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JINTFConductores = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnsalarioconduc = new javax.swing.JSpinner();
        btnregistrarconduc = new javax.swing.JButton();
        btnmodificarconduc = new javax.swing.JButton();
        btneliminarconduc = new javax.swing.JButton();
        btnlimpiarconduc = new javax.swing.JButton();
        btnagregarconduc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtidconductor = new LIB.FSTexFieldMD();
        txtcedconductor = new LIB.FSTexFieldMD();
        jPanel6 = new javax.swing.JPanel();
        JINTFRemitente = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidremitente = new LIB.FSTexFieldMD();
        txtcedularemiten = new LIB.FSTexFieldMD();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jdcfechaenvioremiten = new com.toedter.calendar.JDateChooser();
        btnagregarremi = new javax.swing.JButton();
        btnregistrarremi = new javax.swing.JButton();
        btnmodificarremi = new javax.swing.JButton();
        btneliminarremi = new javax.swing.JButton();
        btnlimpiarremi = new javax.swing.JButton();
        btnconductor = new javax.swing.JButton();
        btnremitente = new javax.swing.JButton();
        btndestinatario = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        JINTFConductores.setVisible(true);

        jLabel2.setText("ID Conductor:");

        jLabel3.setText("Cedula: ");

        jLabel4.setText("Salario:");

        spnsalarioconduc.setModel(new javax.swing.SpinnerNumberModel(250, 250, 1500, 1));

        btnregistrarconduc.setText("Registrar");

        btnmodificarconduc.setText("Modificar");

        btneliminarconduc.setText("Eliminar");

        btnlimpiarconduc.setText("Limpiar");

        btnagregarconduc.setText("Agregar");

        jPanel3.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        txtidconductor.setFont(new java.awt.Font("Roboto Bold", 0, 12)); // NOI18N
        txtidconductor.setPlaceholder("Conductor");

        txtcedconductor.setFont(new java.awt.Font("Roboto Bold", 0, 12)); // NOI18N
        txtcedconductor.setPlaceholder("Cedula");

        jPanel6.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JINTFConductoresLayout = new javax.swing.GroupLayout(JINTFConductores.getContentPane());
        JINTFConductores.getContentPane().setLayout(JINTFConductoresLayout);
        JINTFConductoresLayout.setHorizontalGroup(
            JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JINTFConductoresLayout.createSequentialGroup()
                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JINTFConductoresLayout.createSequentialGroup()
                        .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JINTFConductoresLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnagregarconduc)
                                    .addGroup(JINTFConductoresLayout.createSequentialGroup()
                                        .addComponent(btnregistrarconduc)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnmodificarconduc)
                                        .addGap(29, 29, 29)
                                        .addComponent(btneliminarconduc)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnlimpiarconduc))))
                            .addGroup(JINTFConductoresLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JINTFConductoresLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtidconductor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JINTFConductoresLayout.createSequentialGroup()
                                        .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(49, 49, 49)
                                        .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spnsalarioconduc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcedconductor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JINTFConductoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JINTFConductoresLayout.setVerticalGroup(
            JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JINTFConductoresLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidconductor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnagregarconduc)
                .addGap(5, 5, 5)
                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcedconductor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnsalarioconduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JINTFConductoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarconduc)
                    .addComponent(btnmodificarconduc)
                    .addComponent(btneliminarconduc)
                    .addComponent(btnlimpiarconduc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JINTFRemitente.setVisible(true);

        jLabel5.setText("ID Remitente:");

        jLabel6.setText("Cedula :");

        jLabel7.setText("Fecha de Envio:");

        txtidremitente.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        txtidremitente.setPlaceholder("Remitente");

        txtcedularemiten.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        txtcedularemiten.setPlaceholder("Cedula");

        jPanel4.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnagregarremi.setText("Agregar");

        btnregistrarremi.setText("Registrar");

        btnmodificarremi.setText("Modificar");

        btneliminarremi.setText("Eliminar");

        btnlimpiarremi.setText("Limpiar");

        javax.swing.GroupLayout JINTFRemitenteLayout = new javax.swing.GroupLayout(JINTFRemitente.getContentPane());
        JINTFRemitente.getContentPane().setLayout(JINTFRemitenteLayout);
        JINTFRemitenteLayout.setHorizontalGroup(
            JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(31, 31, 31)
                                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidremitente, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtcedularemiten, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addComponent(btnagregarremi))
                            .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                                        .addComponent(btnmodificarremi)
                                        .addGap(42, 42, 42)
                                        .addComponent(btneliminarremi)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnlimpiarremi))
                                    .addComponent(jdcfechaenvioremiten, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnregistrarremi)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        JINTFRemitenteLayout.setVerticalGroup(
            JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtidremitente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedularemiten, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnagregarremi)))
                .addGap(11, 11, 11)
                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addGroup(JINTFRemitenteLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jdcfechaenvioremiten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(JINTFRemitenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarremi)
                    .addComponent(btnmodificarremi)
                    .addComponent(btneliminarremi)
                    .addComponent(btnlimpiarremi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnconductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/conductor64.png"))); // NOI18N
        btnconductor.setText("Conductor");

        btnremitente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/remitente64.png"))); // NOI18N
        btnremitente.setText("Remitente");

        btndestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/destinatario64.png"))); // NOI18N
        btndestinatario.setText("Destinatario");

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/salir32.jpg"))); // NOI18N
        btnregresar.setText("Regresar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Iconos/envios.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregresar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnremitente)
                            .addComponent(btndestinatario)
                            .addComponent(btnconductor))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)))
                .addGap(40, 40, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconductor)
                        .addGap(18, 18, 18)
                        .addComponent(btndestinatario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnremitente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(VistaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame JINTFConductores;
    private javax.swing.JInternalFrame JINTFRemitente;
    private javax.swing.JButton btnagregarconduc;
    private javax.swing.JButton btnagregarremi;
    private javax.swing.JButton btnconductor;
    private javax.swing.JButton btndestinatario;
    private javax.swing.JButton btneliminarconduc;
    private javax.swing.JButton btneliminarremi;
    private javax.swing.JButton btnlimpiarconduc;
    private javax.swing.JButton btnlimpiarremi;
    private javax.swing.JButton btnmodificarconduc;
    private javax.swing.JButton btnmodificarremi;
    private javax.swing.JButton btnregistrarconduc;
    private javax.swing.JButton btnregistrarremi;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnremitente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private com.toedter.calendar.JDateChooser jdcfechaenvioremiten;
    private javax.swing.JSpinner spnsalarioconduc;
    private LIB.FSTexFieldMD txtcedconductor;
    private LIB.FSTexFieldMD txtcedularemiten;
    private LIB.FSTexFieldMD txtidconductor;
    private LIB.FSTexFieldMD txtidremitente;
    // End of variables declaration//GEN-END:variables
}