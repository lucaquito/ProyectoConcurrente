
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class VentanaFactura extends javax.swing.JFrame {

    private Admin admin;
    private Pelicula peli;

    public VentanaFactura(Admin admin) {
        initComponents();
        this.admin = admin;
        this.peli = admin.getPeliculas().get(admin.getPeli());
        this.setSize(721, 460);
        this.setResizable(false);
        modificarTexto();
        FechaHora Hilo = new FechaHora(lbFecha, lbHora);
        Hilo.start();
        enviarServer();

    }

    public void modificarTexto() {

        lbPelicula.setText(peli.getNombre());
        lbHorario.setText(peli.getSalas().get(admin.getSala()).getListaHorarios().get(admin.getTanda()).getNombre());
        lbTotal.setText(calcularTotal());
        lbTipoSala.setText(peli.getSalas().get(admin.getSala()).getNombreSala());
        lbButaca.setText(admin.obtenerButacas());

    }

    public void enviarServer() {

        String nombre = admin.getServer();
        int puerto = admin.getPuerto();

        Client cliente = new Client(nombre, puerto);
        
        admin.resetearValores();

        cliente.enviarAdmin(admin);

//        JOptionPane.showMessageDialog(null, "Se envio el admin");

    }

    public String calcularTotal() {

        Double cantidadAdulto = admin.getPeliculas().get(admin.getPeli()).getSalas().get(admin.getSala()).getPrecioAdulto() * admin.getCantAdultos();
        Double cantidadAdultoMayor = admin.getPeliculas().get(admin.getPeli()).getSalas().get(admin.getSala()).getPrecioAdultoMayor() * admin.getCantAdultoMayor();
        Double cantidadNino = admin.getPeliculas().get(admin.getPeli()).getSalas().get(admin.getSala()).getPrecioNino() * admin.getCantNinos();

        Double total = cantidadAdulto + cantidadAdultoMayor + cantidadNino;

        return total + "";

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
        lbFecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbPelicula = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbTipoSala = new javax.swing.JLabel();
        lbButaca = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(605, 30, 60, 23);

        lbFecha.setText("jLabel6");
        getContentPane().add(lbFecha);
        lbFecha.setBounds(40, 300, 110, 20);

        lbHora.setText("jLabel6");
        getContentPane().add(lbHora);
        lbHora.setBounds(40, 270, 110, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("978967569467458");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 300, 110, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Pelicula:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 130, 90, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Horario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 180, 120, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Total a Pagar:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 220, 190, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de sala:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 260, 170, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Numero de butaca:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 300, 170, 22);

        lbPelicula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbPelicula.setText("jLabel6");
        getContentPane().add(lbPelicula);
        lbPelicula.setBounds(270, 130, 270, 20);

        lbHorario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbHorario.setText("jLabel7");
        getContentPane().add(lbHorario);
        lbHorario.setBounds(370, 180, 170, 22);

        lbTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTotal.setText("jLabel8");
        getContentPane().add(lbTotal);
        lbTotal.setBounds(370, 220, 170, 20);

        lbTipoSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTipoSala.setText("jLabel9");
        getContentPane().add(lbTipoSala);
        lbTipoSala.setBounds(370, 260, 170, 22);

        lbButaca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbButaca.setText("jLabel10");
        getContentPane().add(lbButaca);
        lbButaca.setBounds(370, 300, 170, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Otras/82a3255f-dc5a-4dd6-8ea1-eb4380ffa54f.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, -10, 718, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbButaca;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbPelicula;
    private javax.swing.JLabel lbTipoSala;
    private javax.swing.JLabel lbTotal;
    // End of variables declaration//GEN-END:variables
}
