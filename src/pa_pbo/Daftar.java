
package pa_pbo;

import javax.swing.JOptionPane;

public class Daftar extends javax.swing.JFrame {
    public String nama, username, password;
    Koneksi kon = new Koneksi(); 
    
    public Daftar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        llogo = new javax.swing.JLabel();
        ljudul1 = new javax.swing.JLabel();
        ljudul2 = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        lusername = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        lpassword = new javax.swing.JLabel();
        tfpassword = new javax.swing.JTextField();
        pdaftar = new javax.swing.JPanel();
        ldaftar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pbackground.setBackground(new java.awt.Color(255, 255, 255));

        llogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N

        ljudul1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul1.setForeground(new java.awt.Color(153, 153, 153));
        ljudul1.setText("Tech");

        ljudul2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul2.setForeground(new java.awt.Color(153, 204, 255));
        ljudul2.setText("Trove");

        lnama.setForeground(new java.awt.Color(102, 102, 102));
        lnama.setText("Nama");

        lusername.setForeground(new java.awt.Color(102, 102, 102));
        lusername.setText("Username");

        lpassword.setForeground(new java.awt.Color(102, 102, 102));
        lpassword.setText("Password");

        pdaftar.setBackground(new java.awt.Color(153, 204, 255));

        ldaftar.setBackground(new java.awt.Color(153, 204, 255));
        ldaftar.setForeground(new java.awt.Color(255, 255, 255));
        ldaftar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ldaftar.setText("Daftar");
        ldaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ldaftarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pdaftarLayout = new javax.swing.GroupLayout(pdaftar);
        pdaftar.setLayout(pdaftarLayout);
        pdaftarLayout.setHorizontalGroup(
            pdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ldaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pdaftarLayout.setVerticalGroup(
            pdaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ldaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pbackgroundLayout = new javax.swing.GroupLayout(pbackground);
        pbackground.setLayout(pbackgroundLayout);
        pbackgroundLayout.setHorizontalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(llogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ljudul1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ljudul2))
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lpassword)
                            .addComponent(lusername)
                            .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnama)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pbackgroundLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(pdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pbackgroundLayout.setVerticalGroup(
            pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgroundLayout.createSequentialGroup()
                .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(llogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ljudul2)
                            .addComponent(ljudul1))))
                .addGap(68, 68, 68)
                .addComponent(lnama)
                .addGap(5, 5, 5)
                .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lusername)
                .addGap(5, 5, 5)
                .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(pdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
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

    private void ldaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldaftarMouseClicked
        if(tfnama.getText().equals("")) { 
            JOptionPane.showMessageDialog(null,"Silahkan Isi Kolom Yang Kosong");
        }
        
        else {
            try {
                String query = "INSERT INTO `akun`(`nama`, `username`,`password`) VALUES ('"+getnama()+"','"+getusername()+"','"+getpassword()+"')";
            
                kon.statement = kon.koneksi.createStatement();
                kon.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Your account has been successfully created");
                Login log = new Login();
                log.setVisible(true);
                this.dispose();
            } 
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }       
        } 

    }//GEN-LAST:event_ldaftarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }
    
    public String getnama(){
        return tfnama.getText();
    }

    public String getusername() {
        return tfusername.getText();
    }

    public String getpassword() {
        return tfpassword.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ldaftar;
    private javax.swing.JLabel ljudul1;
    private javax.swing.JLabel ljudul2;
    private javax.swing.JLabel llogo;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lpassword;
    private javax.swing.JLabel lusername;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pdaftar;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
