
package pa_pbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Keranjang extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    public Keranjang() {
        initComponents();
        tampilbarang();
        tampilharga();
        tampilstatus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        pnavbar = new javax.swing.JPanel();
        lkembali = new javax.swing.JLabel();
        ljudul = new javax.swing.JLabel();
        lpesanan = new javax.swing.JPanel();
        lbarang = new javax.swing.JLabel();
        lharga = new javax.swing.JLabel();
        lstatus = new javax.swing.JLabel();

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
        ljudul.setText("Keranjang");

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ljudul)
                .addContainerGap(93, Short.MAX_VALUE))
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

        lstatus.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lstatus.setForeground(new java.awt.Color(102, 102, 102));
        lstatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout lpesananLayout = new javax.swing.GroupLayout(lpesanan);
        lpesanan.setLayout(lpesananLayout);
        lpesananLayout.setHorizontalGroup(
            lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpesananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lpesananLayout.createSequentialGroup()
                        .addGap(0, 175, Short.MAX_VALUE)
                        .addComponent(lstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
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

    private void lpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpesananMouseClicked
        Pesanan psn = new Pesanan();
        psn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lpesananMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keranjang().setVisible(true);
            }
        });
    }
    
    public void tampilbarang(){
        try{          
            String sql = "Select * from pembelian";            
            kon.statement = kon.koneksi.createStatement();
            ResultSet resultSet = kon.statement.executeQuery(sql);

            while(resultSet.next()){
                lbarang.setText(resultSet.getString("barang"));
            }
            kon.statement.close();
        }

        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
    
    public void tampilharga(){
        try{          
            String sql = "Select * from pembelian";            
            kon.statement = kon.koneksi.createStatement();
            ResultSet resultSet = kon.statement.executeQuery(sql);

            while(resultSet.next()){
                lharga.setText(resultSet.getString("harga"));
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
    private javax.swing.JLabel lbarang;
    private javax.swing.JLabel lharga;
    private javax.swing.JLabel ljudul;
    private javax.swing.JLabel lkembali;
    private javax.swing.JPanel lpesanan;
    private javax.swing.JLabel lstatus;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pnavbar;
    // End of variables declaration//GEN-END:variables
}
