
package pa_pbo;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pa_pbo.Barang1.harga1;
import static pa_pbo.Beli.total;

public class Pesanan extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    String nama;
    public Pesanan() {
        initComponents();
        tampilalamat();
        tampilstatus();
        pembeli();
        lbarang.setText(Barang1.barang1);
        String str = Integer.toString(harga1);
        lharga.setText(str);
        int harga1 = 4000000;   
        String strd = Integer.toString(total);
        ltotal.setText(strd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        pnavbar = new javax.swing.JPanel();
        lkembali = new javax.swing.JLabel();
        ljudul = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        lpesanan = new javax.swing.JPanel();
        lbarang = new javax.swing.JLabel();
        lharga = new javax.swing.JLabel();
        lalamat = new javax.swing.JLabel();
        lalamatisi = new javax.swing.JLabel();
        ltotal = new javax.swing.JLabel();
        lstatus = new javax.swing.JLabel();
        pbatal = new javax.swing.JPanel();
        lbatal = new javax.swing.JLabel();
        pterima = new javax.swing.JPanel();
        lterima = new javax.swing.JLabel();

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
        ljudul.setText("Pesanan");

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(ljudul)
                .addContainerGap(102, Short.MAX_VALUE))
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

        lnama.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lnama.setForeground(new java.awt.Color(102, 102, 102));
        lnama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lpesanan.setBackground(new java.awt.Color(255, 255, 255));
        lpesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lpesanan.setForeground(new java.awt.Color(102, 102, 102));
        lpesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpesananMouseClicked(evt);
            }
        });

        lbarang.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lbarang.setForeground(new java.awt.Color(102, 102, 102));

        lharga.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lharga.setForeground(new java.awt.Color(153, 204, 255));
        lharga.setToolTipText("");

        javax.swing.GroupLayout lpesananLayout = new javax.swing.GroupLayout(lpesanan);
        lpesanan.setLayout(lpesananLayout);
        lpesananLayout.setHorizontalGroup(
            lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lharga, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(lbarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lpesananLayout.setVerticalGroup(
            lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpesananLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lharga, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lalamat.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lalamat.setForeground(new java.awt.Color(102, 102, 102));
        lalamat.setText("Alamat");

        ltotal.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ltotal.setForeground(new java.awt.Color(153, 204, 255));
        ltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lstatus.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lstatus.setForeground(new java.awt.Color(102, 102, 102));
        lstatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        pbatal.setBackground(new java.awt.Color(102, 102, 102));
        pbatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbatalMouseClicked(evt);
            }
        });

        lbatal.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbatal.setForeground(new java.awt.Color(255, 255, 255));
        lbatal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbatal.setText("Batal");

        javax.swing.GroupLayout pbatalLayout = new javax.swing.GroupLayout(pbatal);
        pbatal.setLayout(pbatalLayout);
        pbatalLayout.setHorizontalGroup(
            pbatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbatal, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        pbatalLayout.setVerticalGroup(
            pbatalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pterima.setBackground(new java.awt.Color(153, 204, 255));
        pterima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pterimaMouseClicked(evt);
            }
        });

        lterima.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lterima.setForeground(new java.awt.Color(255, 255, 255));
        lterima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lterima.setText("Terima");

        javax.swing.GroupLayout pterimaLayout = new javax.swing.GroupLayout(pterima);
        pterima.setLayout(pterimaLayout);
        pterimaLayout.setHorizontalGroup(
            pterimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lterima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pterimaLayout.setVerticalGroup(
            pterimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lterima, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pbatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pterima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lalamat)
                        .addComponent(lalamatisi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lnama, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lnama, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lalamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lalamatisi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pterima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        Keranjang krj = new Keranjang();
        krj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkembaliMouseClicked

    private void pbatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbatalMouseClicked
        nama = lnama.getText();
        try {
            String query = "DELETE FROM `pembelian` WHERE `nama` = '"+nama+"'";
            kon.statement = kon.koneksi.createStatement();
            kon.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
            Keranjang krj = new Keranjang();
            krj.setVisible(true);
            this.dispose();     
        } 
        catch (HeadlessException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_pbatalMouseClicked

    private void pterimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pterimaMouseClicked
        nama = lnama.getText();
        try {
            String query = "UPDATE `pembelian` SET `status` = 'Selesai' WHERE nama = '"+nama+"'"; 
            kon.statement = kon.koneksi.createStatement();
            kon.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah");
            Keranjang krj = new Keranjang();
            krj.setVisible(true);
            this.dispose();     
        } 
        catch (HeadlessException | SQLException ex){
            System.out.println(ex.getMessage());
        }        
    }//GEN-LAST:event_pterimaMouseClicked

    private void lpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpesananMouseClicked
        Pesanan psn = new Pesanan();
        psn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lpesananMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }
    
    public void pembeli(){
       try{          
            String sql = "Select * from pembelian";            
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
    
    public void tampilalamat(){
        try{          
            String sql = "Select * from pembelian";            
            kon.statement = kon.koneksi.createStatement();
            ResultSet resultSet = kon.statement.executeQuery(sql);

            while(resultSet.next()){
                lalamatisi.setText(resultSet.getString("alamat"));
            }
            kon.statement.close();
        }

        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    public void tampilstatus(){
        try{          
            String sql = "Select * from pembelian";            
            kon.statement = kon.koneksi.createStatement();
            ResultSet resultSet = kon.statement.executeQuery(sql);

            while(resultSet.next()){
                lstatus.setText(resultSet.getString("status"));
            }
            kon.statement.close();
        }

        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lalamat;
    private javax.swing.JLabel lalamatisi;
    private javax.swing.JLabel lbarang;
    private javax.swing.JLabel lbatal;
    private javax.swing.JLabel lharga;
    private javax.swing.JLabel ljudul;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel lnama;
    private javax.swing.JPanel lpesanan;
    private javax.swing.JLabel lstatus;
    private javax.swing.JLabel lterima;
    private javax.swing.JLabel ltotal;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pbatal;
    private javax.swing.JPanel pnavbar;
    private javax.swing.JPanel pterima;
    // End of variables declaration//GEN-END:variables
}
