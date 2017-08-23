
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Asientos extends javax.swing.JFrame {

   private Admin admin;
   private int cantidadAsientos;
   private int contAsientosEscogidos;
   
    public Asientos(Admin admin) {
        initComponents();
        this.admin = admin;
        this.cantidadAsientos = admin.obtenerEntradasTotales();
        this.setSize(633, 430);
        this.setResizable(false);
        generarAsientos();
    }

    public void generarAsientos() {

        int contX = 10;
        int contY = 10;
        contAsientosEscogidos=0;

        for (int i = 0; i < 75; ++i) {
            JButton b = new JButton("");
            b.setLocation(contX, contY);
            b.setSize(30, 30);
            b.setIcon(new ImageIcon(getClass().getResource("Otras/asientoicono.jpg")));

            b.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    
                    if(contAsientosEscogidos<cantidadAsientos){
                       JButton boton = (JButton) e.getSource();
                       boton.setIcon(new ImageIcon(getClass().getResource("Otras/asientoiconorojo.jpg")));
                       contAsientosEscogidos++;
                    }else{
                    JOptionPane.showMessageDialog(null, "No puede comprar mas asientos de los escogidos");
                    }
                    
                }
            });

            jPanel1.add(b);

            if (contX == 430) {
                contX = 10;
                contY += 40;
            } else {
                contX += 30;
            }

        }
        jPanel1.repaint();
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(513, 370, 90, 27);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 80, 480, 220);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona la butaca");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 20, 280, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PANTALLA1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 490, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redcurtain.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        VentanaFactura ventanafactura = new VentanaFactura();
        this.setVisible(false);
        ventanafactura.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
