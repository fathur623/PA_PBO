
package pa_pbo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class Akun extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    public Akun() {
        initComponents();
        tampilnama();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        pnavbar = new javax.swing.JPanel();
        lkembali = new javax.swing.JLabel();
        ljudul1 = new javax.swing.JLabel();
        ljudul2 = new javax.swing.JLabel();
        lprofil = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        pkeranjang = new javax.swing.JPanel();
        lkeranjang = new javax.swing.JLabel();
        plogout = new javax.swing.JPanel();
        llogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pbackground.setBackground(new java.awt.Color(255, 255, 255));

        pnavbar.setBackground(new java.awt.Color(153, 204, 255));

        lkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        lkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnavbarLayout.setVerticalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lkembali)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        ljudul1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul1.setForeground(new java.awt.Color(153, 153, 153));
        ljudul1.setText("Tech");

        ljudul2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul2.setForeground(new java.awt.Color(153, 204, 255));
        ljudul2.setText("Trove");

        lprofil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/profil.jpg"))); // NOI18N

        lnama.setForeground(new java.awt.Color(153, 153, 153));
        lnama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnama.setText("Nama");

        pkeranjang.setBackground(new java.awt.Color(153, 204, 255));

        lkeranjang.setBackground(new java.awt.Color(153, 204, 255));
        lkeranjang.setForeground(new java.awt.Color(255, 255, 255));
        lkeranjang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lkeranjang.setText("Keranjang");
        lkeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkeranjangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pkeranjangLayout = new javax.swing.GroupLayout(pkeranjang);
        pkeranjang.setLayout(pkeranjangLayout);
        pkeranjangLayout.setHorizontalGroup(
            pkeranjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lkeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pkeranjangLayout.setVerticalGroup(
            pkeranjangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lkeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        plogout.setBackground(new java.awt.Color(153, 153, 153));
        plogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plogoutMouseClicked(evt);
            }
        });

        llogout.setBackground(new java.awt.Color(153, 204, 255));
        llogout.setForeground(new java.awt.Color(255, 255, 255));
        llogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llogout.setText("Logout");
        llogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout plogoutLayout = new javax.swing.GroupLayout(plogout);
        plogout.setLayout(plogoutLayout);
        plogoutLayout.setHorizontalGroup(
            plogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llogout, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        plogoutLayout.setVerticalGroup(
            plogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogoutLayout.createSequentialGroup()
                .addComponent(llogout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbackgroundLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pbackgroundLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(ljudul1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ljudul2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lprofil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pkeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljudul2)
                    .addComponent(ljudul1))
                .addGap(18, 18, 18)
                .addComponent(lprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(pkeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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

    private void llogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llogoutMouseClicked
        Login log = new Login();
        log.setVisible(true);

    }//GEN-LAST:event_llogoutMouseClicked

    private void lkeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkeranjangMouseClicked
        Keranjang krj = new Keranjang();
        krj.setVisible(true);
    }//GEN-LAST:event_lkeranjangMouseClicked

    private void plogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plogoutMouseClicked
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_plogoutMouseClicked

    private void lkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkembaliMouseClicked
        Beranda brd = new Beranda();
        brd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkembaliMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Akun().setVisible(true);
            }
        });
    }
    
    public void tampilnama(){
        try{          
            String sql = "Select * from akun "; 
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ljudul1;
    private javax.swing.JLabel ljudul2;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel lkeranjang;
    private javax.swing.JLabel llogout;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lprofil;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pkeranjang;
    private javax.swing.JPanel plogout;
    private javax.swing.JPanel pnavbar;
    // End of variables declaration//GEN-END:variables
}
