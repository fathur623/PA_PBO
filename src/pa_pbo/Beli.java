
package pa_pbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pa_pbo.Barang1.harga1;

public class Beli extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    int ongkir = 30000;
    public static int total;
    
    public Beli() {
    initComponents();
    tampilnama();
    lbarang.setText(Barang1.barang1);
    String str = Integer.toString(harga1);
    lharga.setText(str);
    int harga1 = 4000000;
    total = harga1 + ongkir;
    String strd = Integer.toString(total);
    ltotal.setText(strd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pbackground = new javax.swing.JPanel();
        pnavbar = new javax.swing.JPanel();
        lkembali = new javax.swing.JLabel();
        ljudul = new javax.swing.JLabel();
        lalamat = new javax.swing.JLabel();
        tfalamat = new javax.swing.JTextField();
        lpesanan = new javax.swing.JPanel();
        lbarang = new javax.swing.JLabel();
        lharga = new javax.swing.JLabel();
        longkos = new javax.swing.JLabel();
        longkir = new javax.swing.JLabel();
        ltotal = new javax.swing.JLabel();
        pbayar = new javax.swing.JPanel();
        lbayar = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pbackground.setBackground(new java.awt.Color(255, 255, 255));

        pnavbar.setBackground(new java.awt.Color(153, 204, 255));

        lkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        lkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkembaliMouseClicked(evt);
            }
        });

        ljudul.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul.setForeground(new java.awt.Color(255, 255, 255));
        ljudul.setText("Pembelian");

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ljudul)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnavbarLayout.setVerticalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ljudul)
                    .addComponent(lkembali))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        lalamat.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lalamat.setForeground(new java.awt.Color(102, 102, 102));
        lalamat.setText("Alamat");

        tfalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfalamatActionPerformed(evt);
            }
        });

        lpesanan.setBackground(new java.awt.Color(255, 255, 255));
        lpesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lpesanan.setForeground(new java.awt.Color(102, 102, 102));

        lbarang.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lbarang.setForeground(new java.awt.Color(102, 102, 102));

        lharga.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lharga.setForeground(new java.awt.Color(153, 204, 255));
        lharga.setToolTipText("");

        javax.swing.GroupLayout lpesananLayout = new javax.swing.GroupLayout(lpesanan);
        lpesanan.setLayout(lpesananLayout);
        lpesananLayout.setHorizontalGroup(
            lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lpesananLayout.setVerticalGroup(
            lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpesananLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lharga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        longkos.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        longkos.setForeground(new java.awt.Color(102, 102, 102));
        longkos.setText("Ongkos Kirim");

        longkir.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        longkir.setForeground(new java.awt.Color(153, 204, 255));
        longkir.setText("Rp.30.000");

        ltotal.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        ltotal.setForeground(new java.awt.Color(153, 204, 255));
        ltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        pbayar.setBackground(new java.awt.Color(153, 204, 255));
        pbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbayarMouseClicked(evt);
            }
        });

        lbayar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbayar.setForeground(new java.awt.Color(255, 255, 255));
        lbayar.setText("Bayar");

        javax.swing.GroupLayout pbayarLayout = new javax.swing.GroupLayout(pbayar);
        pbayar.setLayout(pbayarLayout);
        pbayarLayout.setHorizontalGroup(
            pbayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbayarLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lbayar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbayarLayout.setVerticalGroup(
            pbayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbayarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbayar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lnama.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lnama.setForeground(new java.awt.Color(102, 102, 102));
        lnama.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(longkos)
                            .addComponent(longkir)))
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pbackgroundLayout.createSequentialGroup()
                                .addComponent(lalamat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnama, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(lpesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lalamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(longkos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longkir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkembaliMouseClicked
        Beranda brd = new Beranda();
        brd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkembaliMouseClicked

    private void tfalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfalamatActionPerformed

    }//GEN-LAST:event_tfalamatActionPerformed

    private void pbayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbayarMouseClicked
        try {
            String query = "INSERT INTO `pembelian`(`nama`,`barang`,`harga`,`alamat`,`status`) VALUES ('"+getnama()+"','"+getbarang()+"','"+harga1+"','"+getalamat()+"','Dikirim')";
            
            kon.statement = kon.koneksi.createStatement();
            kon.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Pembelian Berhasil");
            Keranjang krj = new Keranjang();
            krj.setVisible(true);
            this.dispose();
        } 
        
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_pbayarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beli().setVisible(true);
            }
        });
    }
    
    public void tampilnama(){
        try{          
            String sql = "Select * from akun";            
            kon.statement = kon.koneksi.createStatement();
            ResultSet resultSet = kon.statement.executeQuery(sql);

            while(resultSet.next()){
                lnama.setText(resultSet.getString("nama"));
            }
            kon.statement.close();
        }

        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
    
    public String getnama(){
        return lnama.getText();
    }
    
    public String getbarang(){
        return lbarang.getText();
    }
    
    public String getalamat(){
        return tfalamat.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lalamat;
    private javax.swing.JLabel lbarang;
    private javax.swing.JLabel lbayar;
    private javax.swing.JLabel lharga;
    private javax.swing.JLabel ljudul;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel longkir;
    private javax.swing.JLabel longkos;
    private javax.swing.JPanel lpesanan;
    private javax.swing.JLabel ltotal;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pbayar;
    private javax.swing.JPanel pnavbar;
    private javax.swing.JTextField tfalamat;
    // End of variables declaration//GEN-END:variables
}
