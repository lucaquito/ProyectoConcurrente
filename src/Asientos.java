
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
    private int[][] asientos;
    private int contI;
    private int contJ;
    
    public int[][] getAsientos() {
        return asientos;
    }
    
    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }
    
    public Asientos(Admin admin) {
        initComponents();
        this.admin = admin;
        this.cantidadAsientos = admin.obtenerEntradasTotales();
        this.asientos = admin.getPeliculas().get(admin.getPeli()).getSalas().get(admin.getSala()).getListaHorarios().get(admin.getTanda()).getAsientos();
        this.setSize(633, 430);
        this.asientos[0][0] = 1;
        this.asientos[0][1] = 1;
        //JOptionPane.showMessageDialog(null, asientos.length);
        this.setResizable(false);
        generarAsientos();
        jButton1.setEnabled(false);
    }
    
    public void generarAsientos() {
        
        int contX = 10;
        int contY = 10;
        int cont = 1;
        contAsientosEscogidos = 0;
        JButton boton = new JButton("");
        
        for (int i = 0; i < asientos.length; i++) {
            
            for (int j = 0; j < asientos[i].length; j++) {
                
                contI = i;
                contJ = j;
                
                if (asientos[i][j] == 0) {
                    
                    boton = new Asiento(i,j);
                    boton.setLocation(contX, contY);
                    boton.setSize(30, 30);
                    boton.setName(cont + "");
                    boton.setIcon(new ImageIcon(getClass().getResource("Otras/asientoicono.jpg")));
                    
                    boton.addActionListener(new java.awt.event.ActionListener() {
                        private boolean seleccionado = false;
                        
                        public void actionPerformed(java.awt.event.ActionEvent e) {
                            
                            Asiento boton = (Asiento) e.getSource();
                            // Cuando se le da click y desactiva el boton
                            if (seleccionado == true) {
                                System.out.println("Se desactivo el boton: " + boton.getName());
                                boton.setIcon(new ImageIcon(getClass().getResource("Otras/asientoicono.jpg")));
                                seleccionado = false;
                                contAsientosEscogidos--;
                                asientos[boton.getFila()][boton.getColumna()] = 0;
                                admin.getAsientosSeleccionados().remove(boton.getName());
                                // Cuando se activa el boton
                            } else {
                                seleccionado = true;
                                System.out.println("Se activo el boton: " + boton.getName());
                                if (contAsientosEscogidos < cantidadAsientos) {
                                    
                                    boton.setIcon(new ImageIcon(getClass().getResource("Otras/asientoiconorojo.jpg")));
                                    
                                    asientos[boton.getFila()][boton.getColumna()] = 1;
                                    
                                    admin.getAsientosSeleccionados().add(boton.getName());
                                    contAsientosEscogidos++;
                                } else {
                                    JOptionPane.showMessageDialog(null, "No puede comprar mas asientos de los escogidos");
                                }
                            }
                            
                            if (contAsientosEscogidos == cantidadAsientos) {
                                jButton1.setEnabled(true);
                            } else {
                                jButton1.setEnabled(false);
                            }
                        }
                    });
                    
                } else if (asientos[i][j] == 1) {
                    boton = new JButton("");
                    boton.setLocation(contX, contY);
                    boton.setSize(30, 30);
                    boton.setIcon(new ImageIcon(getClass().getResource("Otras/asientoiconorojo.jpg")));
                    boton.setName(cont + "");
                    
                }
                
                jPanel1.add(boton);
                
                if (contX == 430) {
                    contX = 10;
                    contY += 40;
                } else {
                    contX += 30;
                }
                
                cont++;
                
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
        
        admin.getPeliculas().get(admin.getPeli()).getSalas().get(admin.getSala()).getListaHorarios().get(admin.getTanda()).setAsientos(asientos);
        VentanaFactura ventanafactura = new VentanaFactura(admin);
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
