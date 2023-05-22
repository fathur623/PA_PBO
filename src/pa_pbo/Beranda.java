
package pa_pbo;

public class Beranda extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    public Beranda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        pnavbar = new javax.swing.JPanel();
        lkembali = new javax.swing.JLabel();
        ljudul1 = new javax.swing.JLabel();
        ljudul2 = new javax.swing.JLabel();
        plogo = new javax.swing.JPanel();
        llogo = new javax.swing.JLabel();
        lteks1 = new javax.swing.JLabel();
        lteks2 = new javax.swing.JLabel();
        lteks3 = new javax.swing.JLabel();
        pbarang1 = new javax.swing.JPanel();
        lgambar1 = new javax.swing.JLabel();
        lnama1 = new javax.swing.JLabel();
        lharga1 = new javax.swing.JLabel();
        pbarang2 = new javax.swing.JPanel();
        lgambar2 = new javax.swing.JLabel();
        lnama2 = new javax.swing.JLabel();
        lharga2 = new javax.swing.JLabel();
        pbarang3 = new javax.swing.JPanel();
        lgambar3 = new javax.swing.JLabel();
        lnama3 = new javax.swing.JLabel();
        lharga3 = new javax.swing.JLabel();
        pbarang4 = new javax.swing.JPanel();
        lgambar4 = new javax.swing.JLabel();
        lnama4 = new javax.swing.JLabel();
        lharga4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pbackground.setBackground(new java.awt.Color(255, 255, 255));

        pnavbar.setBackground(new java.awt.Color(153, 204, 255));

        lkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        lkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkembaliMouseClicked(evt);
            }
        });

        ljudul1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul1.setForeground(new java.awt.Color(255, 255, 255));
        ljudul1.setText("Trove");

        ljudul2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul2.setForeground(new java.awt.Color(153, 153, 153));
        ljudul2.setText("Tech");

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnavbarLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(ljudul2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ljudul1)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        pnavbarLayout.setVerticalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lkembali)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnavbarLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ljudul1)
                        .addComponent(ljudul2))
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        plogo.setBackground(new java.awt.Color(255, 255, 255));
        plogo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(204, 204, 204)));

        llogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N

        lteks1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lteks1.setForeground(new java.awt.Color(153, 153, 153));
        lteks1.setText("Beli alat elektronik");

        lteks2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lteks2.setForeground(new java.awt.Color(153, 153, 153));
        lteks2.setText("hanya di Tech");

        lteks3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lteks3.setForeground(new java.awt.Color(153, 204, 255));
        lteks3.setText("Trove");

        javax.swing.GroupLayout plogoLayout = new javax.swing.GroupLayout(plogo);
        plogo.setLayout(plogoLayout);
        plogoLayout.setHorizontalGroup(
            plogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(llogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(plogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plogoLayout.createSequentialGroup()
                        .addComponent(lteks2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lteks3))
                    .addComponent(lteks1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plogoLayout.setVerticalGroup(
            plogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(plogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(plogoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lteks1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lteks2)
                            .addComponent(lteks3))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pbarang1.setBackground(new java.awt.Color(255, 255, 255));
        pbarang1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pbarang1.setPreferredSize(new java.awt.Dimension(145, 160));
        pbarang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbarang1MouseClicked(evt);
            }
        });

        lgambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/poco x3 pro.jpg"))); // NOI18N

        lnama1.setForeground(new java.awt.Color(102, 102, 102));
        lnama1.setText("Poco X3 Pro 8/256 GB");

        lharga1.setForeground(new java.awt.Color(153, 204, 255));
        lharga1.setText("Rp.4.000.000");

        javax.swing.GroupLayout pbarang1Layout = new javax.swing.GroupLayout(pbarang1);
        pbarang1.setLayout(pbarang1Layout);
        pbarang1Layout.setHorizontalGroup(
            pbarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnama1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lharga1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lgambar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pbarang1Layout.setVerticalGroup(
            pbarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lharga1)
                .addContainerGap())
        );

        pbarang2.setBackground(new java.awt.Color(255, 255, 255));
        pbarang2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pbarang2.setPreferredSize(new java.awt.Dimension(145, 160));
        pbarang2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbarang2MouseClicked(evt);
            }
        });

        lgambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/rog strix g15.jpg"))); // NOI18N

        lnama2.setForeground(new java.awt.Color(102, 102, 102));
        lnama2.setText("ROG STRIX G15");

        lharga2.setForeground(new java.awt.Color(153, 204, 255));
        lharga2.setText("Rp.18.000.000");

        javax.swing.GroupLayout pbarang2Layout = new javax.swing.GroupLayout(pbarang2);
        pbarang2.setLayout(pbarang2Layout);
        pbarang2Layout.setHorizontalGroup(
            pbarang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbarang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lharga2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lgambar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pbarang2Layout.setVerticalGroup(
            pbarang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lharga2)
                .addContainerGap())
        );

        pbarang3.setBackground(new java.awt.Color(255, 255, 255));
        pbarang3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pbarang3.setPreferredSize(new java.awt.Dimension(145, 160));
        pbarang3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbarang3MouseClicked(evt);
            }
        });

        lgambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/iphone 12 pro.jpg"))); // NOI18N

        lnama3.setForeground(new java.awt.Color(102, 102, 102));
        lnama3.setText("Iphone 12 Pro 512 GB");

        lharga3.setForeground(new java.awt.Color(153, 204, 255));
        lharga3.setText("Rp.12.000.000");

        javax.swing.GroupLayout pbarang3Layout = new javax.swing.GroupLayout(pbarang3);
        pbarang3.setLayout(pbarang3Layout);
        pbarang3Layout.setHorizontalGroup(
            pbarang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbarang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lharga3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lgambar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pbarang3Layout.setVerticalGroup(
            pbarang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgambar3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lharga3)
                .addContainerGap())
        );

        pbarang4.setBackground(new java.awt.Color(255, 255, 255));
        pbarang4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pbarang4.setPreferredSize(new java.awt.Dimension(145, 160));
        pbarang4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbarang4MouseClicked(evt);
            }
        });

        lgambar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/macbook pro m1.jpg"))); // NOI18N

        lnama4.setForeground(new java.awt.Color(102, 102, 102));
        lnama4.setText("MacBook Pro M1 13\"");

        lharga4.setForeground(new java.awt.Color(153, 204, 255));
        lharga4.setText("Rp.20.000.000");

        javax.swing.GroupLayout pbarang4Layout = new javax.swing.GroupLayout(pbarang4);
        pbarang4.setLayout(pbarang4Layout);
        pbarang4Layout.setHorizontalGroup(
            pbarang4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbarang4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnama4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(lharga4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lgambar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pbarang4Layout.setVerticalGroup(
            pbarang4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarang4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lgambar4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lharga4)
                .addContainerGap())
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addComponent(pbarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addComponent(pbarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbarang4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbarang4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        Akun akn = new Akun();
        akn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkembaliMouseClicked

    private void pbarang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbarang1MouseClicked
        Barang1 br1 = new Barang1();
        br1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pbarang1MouseClicked

    private void pbarang2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbarang2MouseClicked
        Barang2 br2 = new Barang2();
        br2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pbarang2MouseClicked

    private void pbarang3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbarang3MouseClicked
        Barang3 br3 = new Barang3();
        br3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pbarang3MouseClicked

    private void pbarang4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbarang4MouseClicked
        Barang4 br4 = new Barang4();
        br4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pbarang4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lgambar1;
    private javax.swing.JLabel lgambar2;
    private javax.swing.JLabel lgambar3;
    private javax.swing.JLabel lgambar4;
    private javax.swing.JLabel lharga1;
    private javax.swing.JLabel lharga2;
    private javax.swing.JLabel lharga3;
    private javax.swing.JLabel lharga4;
    private javax.swing.JLabel ljudul1;
    private javax.swing.JLabel ljudul2;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel llogo;
    private javax.swing.JLabel lnama1;
    private javax.swing.JLabel lnama2;
    private javax.swing.JLabel lnama3;
    private javax.swing.JLabel lnama4;
    private javax.swing.JLabel lteks1;
    private javax.swing.JLabel lteks2;
    private javax.swing.JLabel lteks3;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pbarang1;
    private javax.swing.JPanel pbarang2;
    private javax.swing.JPanel pbarang3;
    private javax.swing.JPanel pbarang4;
    private javax.swing.JPanel plogo;
    private javax.swing.JPanel pnavbar;
    // End of variables declaration//GEN-END:variables
}
