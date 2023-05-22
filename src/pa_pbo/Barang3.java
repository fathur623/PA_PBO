
package pa_pbo;

public class Barang3 extends javax.swing.JFrame {
    public Barang3() {
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
        lgambar = new javax.swing.JLabel();
        pbarang = new javax.swing.JPanel();
        lharga = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        ldeskripsi1 = new javax.swing.JLabel();
        ldeskripsi2 = new javax.swing.JLabel();
        ldeskripsi3 = new javax.swing.JLabel();
        ldeskripsi4 = new javax.swing.JLabel();
        pbeli = new javax.swing.JPanel();
        lbeli = new javax.swing.JLabel();

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
        ljudul1.setForeground(new java.awt.Color(153, 153, 153));
        ljudul1.setText("Tech");

        ljudul2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul2.setForeground(new java.awt.Color(255, 255, 255));
        ljudul2.setText("Trove");

        javax.swing.GroupLayout pnavbarLayout = new javax.swing.GroupLayout(pnavbar);
        pnavbar.setLayout(pnavbarLayout);
        pnavbarLayout.setHorizontalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ljudul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ljudul2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnavbarLayout.setVerticalGroup(
            pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ljudul2)
                        .addComponent(ljudul1))
                    .addComponent(lkembali))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        lgambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/barang iphone.jpg"))); // NOI18N

        pbarang.setBackground(new java.awt.Color(255, 255, 255));
        pbarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lharga.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lharga.setForeground(new java.awt.Color(153, 204, 255));
        lharga.setText("Rp. 12.000.000");

        lnama.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lnama.setForeground(new java.awt.Color(102, 102, 102));
        lnama.setText("Iphone 12 Pro 512 GB");

        javax.swing.GroupLayout pbarangLayout = new javax.swing.GroupLayout(pbarang);
        pbarang.setLayout(pbarangLayout);
        pbarangLayout.setHorizontalGroup(
            pbarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lharga)
                    .addComponent(lnama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbarangLayout.setVerticalGroup(
            pbarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lharga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ldeskripsi1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ldeskripsi1.setForeground(new java.awt.Color(102, 102, 102));
        ldeskripsi1.setText("Deskripsi");

        ldeskripsi2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ldeskripsi2.setForeground(new java.awt.Color(102, 102, 102));
        ldeskripsi2.setText("Chipset Apple A14 Bionic");

        ldeskripsi3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ldeskripsi3.setForeground(new java.awt.Color(102, 102, 102));
        ldeskripsi3.setText("Kamera utama 12 MP, Kamera depan 12 MP");

        ldeskripsi4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ldeskripsi4.setForeground(new java.awt.Color(102, 102, 102));
        ldeskripsi4.setText("Baterai Li-Po 2815 mAh");

        pbeli.setBackground(new java.awt.Color(153, 204, 255));
        pbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pbeliMouseClicked(evt);
            }
        });

        lbeli.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbeli.setForeground(new java.awt.Color(255, 255, 255));
        lbeli.setText("Beli Sekarang");

        javax.swing.GroupLayout pbeliLayout = new javax.swing.GroupLayout(pbeli);
        pbeli.setLayout(pbeliLayout);
        pbeliLayout.setHorizontalGroup(
            pbeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbeliLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lbeli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbeliLayout.setVerticalGroup(
            pbeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbeliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbeli)
                .addContainerGap())
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnavbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lgambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ldeskripsi3)
                            .addComponent(ldeskripsi4)
                            .addComponent(ldeskripsi2)
                            .addComponent(ldeskripsi1))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(pbarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addComponent(pnavbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ldeskripsi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ldeskripsi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ldeskripsi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ldeskripsi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(pbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void pbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbeliMouseClicked
        Beli bli = new Beli();
        bli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pbeliMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbeli;
    private javax.swing.JLabel ldeskripsi1;
    private javax.swing.JLabel ldeskripsi2;
    private javax.swing.JLabel ldeskripsi3;
    private javax.swing.JLabel ldeskripsi4;
    private javax.swing.JLabel lgambar;
    private javax.swing.JLabel lharga;
    private javax.swing.JLabel ljudul1;
    private javax.swing.JLabel ljudul2;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel lnama;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pbarang;
    private javax.swing.JPanel pbeli;
    private javax.swing.JPanel pnavbar;
    // End of variables declaration//GEN-END:variables
}
