/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import Fungsi.fungsi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Pindo
 */
public class detail_user extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    String sql;
    Connection con = koneksi.koneksi.getKoneksi();
    public static String id;
    
    /**
     * Creates new form halaman_operator
     */
    public detail_user() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
        user_id.setText(toString().valueOf(Login.getid()));
        tampil();
        tampil_profile();
        tampil_peminjaman();
    }
    
    public void tampil(){
        try {
            String nama;
            sql = "SELECT * FROM tb_anggota WHERE id_anggota = '"+ user_id.getText() +"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Object[] data = new Object[3];
                data[0] = rs.getString(2);
                
                
                username.setText((String) data[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tampil_peminjaman(){
        try {
            sql = "SELECT * FROM tb_pinjam WHERE id_anggota='"+ user_id.getText() +"' AND kt='Belum kembali'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString(1);
                data[1] = rs.getString(5);
                data[2] = rs.getString(6);
                data[3] = rs.getString(7);
                
                kd_pinjam.setText((String) data[0]);
                judul.setText((String) data[1]);
                tgl_pinjam.setText((String) data[2]);
                tgl_kembali.setText((String) data[3]);
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tampil_profile(){
        try {
            sql = "SELECT * FROM tb_anggota WHERE id_anggota='"+ user_id.getText() +"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Object[] data = new Object[4];
                data[0] = rs.getString(4);
                data[1] = rs.getString(5);
                data[2] = rs.getString(6);
                data[3] = rs.getString(7);
                
                jk.setText((String) data[0]);
                telp.setText((String) data[1]);
                alamat.setText((String) data[2]);
                stat.setText((String) data[3]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        telp = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();
        tgl_kembali = new javax.swing.JLabel();
        kd_pinjam = new javax.swing.JLabel();
        tgl_pinjam = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        username2 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(28, 42, 57));

        logout.setBackground(new java.awt.Color(28, 42, 57));
        logout.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("Keluar");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setFocusPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(28, 42, 57));
        close.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("x");
        close.setToolTipText("Tutup");
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setFocusPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-account-box_2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PerPus");

        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/books-stack-of-three (1).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Raih impianmu dengan membaca buku");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID                   :");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username    :");

        username.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");

        user_id.setBackground(new java.awt.Color(28, 42, 57));
        user_id.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        user_id.setForeground(new java.awt.Color(255, 255, 255));
        user_id.setText("id_user");
        user_id.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jenis kelamin :");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Telp                 :");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Alamat           :");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Status             :");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Kode pinjam  :");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Judul Buku     :");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tgl Pinjam       :");

        username1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Status Peminjaman");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tgl kembali     :");

        jk.setBackground(new java.awt.Color(28, 42, 57));
        jk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jk.setForeground(new java.awt.Color(255, 255, 255));
        jk.setText("jk");
        jk.setOpaque(true);

        telp.setBackground(new java.awt.Color(28, 42, 57));
        telp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        telp.setForeground(new java.awt.Color(255, 255, 255));
        telp.setText("telp");
        telp.setOpaque(true);

        alamat.setBackground(new java.awt.Color(28, 42, 57));
        alamat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setText("alamat");
        alamat.setOpaque(true);

        stat.setBackground(new java.awt.Color(28, 42, 57));
        stat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stat.setForeground(new java.awt.Color(255, 255, 255));
        stat.setText("stat");
        stat.setOpaque(true);

        tgl_kembali.setBackground(new java.awt.Color(28, 42, 57));
        tgl_kembali.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tgl_kembali.setForeground(new java.awt.Color(255, 255, 255));
        tgl_kembali.setText("-");
        tgl_kembali.setOpaque(true);

        kd_pinjam.setBackground(new java.awt.Color(28, 42, 57));
        kd_pinjam.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        kd_pinjam.setForeground(new java.awt.Color(255, 255, 255));
        kd_pinjam.setText("-");
        kd_pinjam.setOpaque(true);

        tgl_pinjam.setBackground(new java.awt.Color(28, 42, 57));
        tgl_pinjam.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tgl_pinjam.setForeground(new java.awt.Color(255, 255, 255));
        tgl_pinjam.setText("-");
        tgl_pinjam.setOpaque(true);

        judul.setBackground(new java.awt.Color(28, 42, 57));
        judul.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("-");
        judul.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        username2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        username2.setForeground(new java.awt.Color(255, 255, 255));
        username2.setText("Profile");

        kembali.setBackground(new java.awt.Color(28, 42, 57));
        kembali.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("kembali");
        kembali.setToolTipText("Kembali");
        kembali.setBorder(null);
        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.setFocusPainted(false);
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(telp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(username2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(headerLayout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(kd_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(headerLayout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(headerLayout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(tgl_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(headerLayout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(tgl_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                                .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(260, 260, 260)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7))))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kembali)))
                .addGap(26, 26, 26)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11))
                            .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(user_id)
                                .addGap(6, 6, 6)
                                .addComponent(username)))))
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(username2)
                        .addGap(49, 49, 49)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jk))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(telp))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(alamat))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(stat)))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username1)
                        .addGap(50, 50, 50)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(kd_pinjam))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(judul))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(tgl_pinjam))
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(tgl_kembali))
                        .addGap(52, 52, 52))))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,"Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        Login lg = new Login();
        lg.show();
        this.dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        fungsi.close();
    }//GEN-LAST:event_closeActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        halaman_user hu = new halaman_user();
        hu.show();
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(detail_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JButton close;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jk;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kd_pinjam;
    private javax.swing.JButton kembali;
    private javax.swing.JButton logout;
    private javax.swing.JLabel stat;
    private javax.swing.JLabel telp;
    private javax.swing.JLabel tgl_kembali;
    private javax.swing.JLabel tgl_pinjam;
    private javax.swing.JLabel user_id;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
