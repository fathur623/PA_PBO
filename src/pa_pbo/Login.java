
package pa_pbo;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;  

public class Login extends javax.swing.JFrame {
    String sql;
    ResultSet rs;
    Statement stat;
    
    public Login() {
        initComponents();
        setTitle("Login Page");
        Koneksi kon = new Koneksi();
        stat = kon.statement;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbackground = new javax.swing.JPanel();
        llogo = new javax.swing.JLabel();
        ljudul1 = new javax.swing.JLabel();
        ljudul2 = new javax.swing.JLabel();
        lusername = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        lpassword = new javax.swing.JLabel();
        tfpassword = new javax.swing.JTextField();
        plogin = new javax.swing.JPanel();
        llogin = new javax.swing.JLabel();
        ltextdaftar = new javax.swing.JLabel();
        pdaftar = new javax.swing.JPanel();
        ldaftar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        pbackground.setBackground(new java.awt.Color(255, 255, 255));

        llogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N

        ljudul1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul1.setForeground(new java.awt.Color(153, 153, 153));
        ljudul1.setText("Tech");

        ljudul2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ljudul2.setForeground(new java.awt.Color(153, 204, 255));
        ljudul2.setText("Trove");

        lusername.setForeground(new java.awt.Color(102, 102, 102));
        lusername.setText("Username");

        lpassword.setForeground(new java.awt.Color(102, 102, 102));
        lpassword.setText("Password");

        plogin.setBackground(new java.awt.Color(153, 204, 255));

        llogin.setBackground(new java.awt.Color(153, 204, 255));
        llogin.setForeground(new java.awt.Color(255, 255, 255));
        llogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llogin.setText("Login");
        llogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lloginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ploginLayout = new javax.swing.GroupLayout(plogin);
        plogin.setLayout(ploginLayout);
        ploginLayout.setHorizontalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ploginLayout.setVerticalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ltextdaftar.setForeground(new java.awt.Color(102, 102, 102));
        ltextdaftar.setText("Belum punya akun?");

        pdaftar.setBackground(new java.awt.Color(153, 153, 153));

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
                        .addGap(35, 35, 35)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lpassword)
                            .addComponent(lusername)
                            .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pbackgroundLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(llogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ljudul1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ljudul2))))
                    .addGroup(pbackgroundLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(pbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pbackgroundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ltextdaftar))
                            .addComponent(pdaftar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(66, 66, 66)
                .addComponent(lusername)
                .addGap(5, 5, 5)
                .addComponent(tfusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(plogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltextdaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void lloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lloginMouseClicked
        try {
            sql = "SELECT * FROM akun WHERE username='"+tfusername.getText()+"' AND password='"+tfpassword.getText()+"'";
            rs = stat.executeQuery(sql);
            
            if(rs.next()){
                if(tfusername.getText().equals(rs.getString("username")) && tfpassword.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    Beranda brd = new Beranda();
                    brd.setVisible(true);
                    brd.pack();
                    brd.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Username atau Password salah!!");    
            }
        } 
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lloginMouseClicked

    private void ldaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ldaftarMouseClicked
        Daftar dft = new Daftar();
        dft.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ldaftarMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ldaftar;
    private javax.swing.JLabel ljudul1;
    private javax.swing.JLabel ljudul2;
    private javax.swing.JLabel llogin;
    private javax.swing.JLabel llogo;
    private javax.swing.JLabel lpassword;
    private javax.swing.JLabel ltextdaftar;
    private javax.swing.JLabel lusername;
    private javax.swing.JPanel pbackground;
    private javax.swing.JPanel pdaftar;
    private javax.swing.JPanel plogin;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}
