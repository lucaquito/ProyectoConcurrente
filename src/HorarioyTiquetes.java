
import javax.swing.SpinnerNumberModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class HorarioyTiquetes extends javax.swing.JFrame {

    /**
     * Creates new form Sinopsis
     */
    public HorarioyTiquetes() {
        initComponents();
        ((SpinnerNumberModel) jSpinner1.getModel()).setMinimum(0);
        ((SpinnerNumberModel) jSpinner2.getModel()).setMinimum(0);
        ((SpinnerNumberModel) jSpinner3.getModel()).setMinimum(0);
        ((SpinnerNumberModel) jSpinner1.getModel()).setMaximum(10);
        ((SpinnerNumberModel) jSpinner2.getModel()).setMaximum(10);
        ((SpinnerNumberModel) jSpinner3.getModel()).setMaximum(10);
        this.setSize(603, 412);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 70, 70, 22);

        jButton2.setText(" 1:30 p.m.");
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 130, 83, 23);

        jButton3.setText("4:00 p.m.");
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 200, 79, 23);

        jButton4.setText("7:00 p.m.");
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 270, 79, 23);

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Catidad de entradas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 70, 190, 24);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(470, 130, 50, 30);

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adultos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 130, 80, 24);

        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Niño");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 200, 40, 24);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(470, 200, 50, 30);

        jLabel7.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adulto Mayor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 270, 160, 24);
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(470, 270, 50, 30);

        jButton5.setText("Siguiente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(470, 350, 100, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asientos-Cine-Rojos.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TipoSala tiposala = new TipoSala();
        this.setVisible(false);
        tiposala.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(HorarioyTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorarioyTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorarioyTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorarioyTiquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorarioyTiquetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
