/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan.program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author afrihar
 */
public class FormKaryawan extends javax.swing.JFrame {

    private static final long serialVersionUID = -7428547788635221816L;
    private DefaultTableModel model;

    /**
     * Creates new form FormKaryawan
     */
    public FormKaryawan() {
        initComponents();
        //membuat tablemodel
        model = new DefaultTableModel();

        //menambah tablemodel ke tabel
        tblKaryawan.setModel(model);

        //definisi header table
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("Jabatan");
        model.addColumn("Telp #1");
        model.addColumn("Telp #2");
        model.addColumn("Alamat");

        //load Data ke Table
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmbJabatan = new javax.swing.JComboBox();
        txtTelp1 = new javax.swing.JTextField();
        txtTelp2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDENTITAS KARYAWAN PT VIP ::::");
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NIK :");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Jabatan :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telp #1 :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telp #2 :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Alamat :");

        txtNik.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        txtNik.setDocument(new PlainDocument() {
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str.matches("[0-9]*")) {
                    super.insertString(offs, str, a);
                } else {
                    JOptionPane.showMessageDialog(null, "Tolong Di Isi dengan Angka");
                }
            }
        });
        txtNik.setNextFocusableComponent(txtNama);

        txtNama.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                str = str.toUpperCase();
                if (str.matches("[0-9 _A-Z-,./]*")) {
                    super.insertString(offs, str, a);
                }
            }
        });
        txtNama.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNama.setNextFocusableComponent(cmbJabatan);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        cmbJabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TECHNICIAN", "MANAGER", "ENGINEER", "OFFICER", "DIRECTOR", "DOCUMENT", "OFFICE BOY", "COURIER", "DRIVER", "LEADER" }));
        cmbJabatan.setNextFocusableComponent(txtTelp1);

        txtTelp1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTelp1.setNextFocusableComponent(txtTelp2);

        txtTelp2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTelp2.setNextFocusableComponent(txtAlamat);

        txtAlamat.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                str = str.toUpperCase();
                if (str.matches("[0-9 _A-Z-,./]*")) {
                    super.insertString(offs, str, a);
                } else {
                    // data ditolak
                }
            }
        });
        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        txtAlamat.setWrapStyleWord(true);
        txtAlamat.setNextFocusableComponent(btnSimpan);
        jScrollPane1.setViewportView(txtAlamat);

        tblKaryawan.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKaryawan);

        btnSimpan.setText("Simpan");
        btnSimpan.setNextFocusableComponent(btnUbah);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Update");
        btnUbah.setNextFocusableComponent(btnReset);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnReset.setText("Clear");
        btnReset.setNextFocusableComponent(btnHapus);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setNextFocusableComponent(txtNik);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                str = str.toUpperCase();
                if (str.matches("[0-9 _A-Z-,./]*")) {
                    super.insertString(offs, str, a);
                }
            }
        });
        txtCari.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNik)
                    .addComponent(txtNama)
                    .addComponent(txtTelp1)
                    .addComponent(txtTelp2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(cmbJabatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUbah)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSimpan)
                                .addComponent(btnRefresh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCari, txtCari});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String nik = txtNik.getText();
        String nama = txtNama.getText();
        Object jabatan = cmbJabatan.getSelectedItem();
        String telp1 = txtTelp1.getText();
        String telp2 = txtTelp2.getText();
        String alamat = txtAlamat.getText();

        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "insert into identitas values (?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, nik);
            p.setString(2, nama);
            p.setObject(3, jabatan);
            p.setString(4, telp1);
            p.setString(5, telp2);
            p.setString(6, alamat);
            p.executeUpdate();
            p.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "Data tidak Bisa di Input");
        } finally {
            loadData();
            resetInput();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        //Cek Data apakah ada yg terseleksi
        int i = tblKaryawan.getSelectedRow();
        if (i == -1) {
            //tidak ada baris terseleksi
            return;
        }

        //ada baris terseleksi
        String nik = (String) model.getValueAt(i, 0);
        String nama = txtNama.getText();
        Object jabatan = cmbJabatan.getSelectedItem();
        String telp1 = txtTelp1.getText();
        String telp2 = txtTelp2.getText();
        String alamat = txtAlamat.getText();

        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "update identitas set nama=?, jabatan=?, telp_1=?, telp_2=?, alamat=?  where nik=?";
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, nama);
            p.setObject(2, jabatan);
            p.setString(3, telp1);
            p.setString(4, telp2);
            p.setString(5, alamat);
            p.setString(6, nik);
            p.executeUpdate();
            p.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "Data tidak Bisa di Update");
        } finally {
            loadData();
            resetInput();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //Cek Data apakah ada yg terseleksi
        int i = tblKaryawan.getSelectedRow();
        if (i == -1) {
            //tidak ada baris terseleksi
            return;
        }

        //ada baris terseleksi
        String nik = txtNik.getText();


        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "delete from identitas where nik=?";
            PreparedStatement p = c.prepareStatement(sql);

            p.setString(1, nik);
            p.executeUpdate();
            p.close();

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "Data tidak Bisa di Update");
        } finally {
            loadData();
            resetInput();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetInput();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        // TODO add your handling code here:
        int i = tblKaryawan.getSelectedRow();
        if (i == -1) {
            return;
        }

        String nik = (String) model.getValueAt(i, 0);
        txtNik.setText(nik);
        String nama = (String) model.getValueAt(i, 1);
        txtNama.setText(nama);
        String jabatan = (String) model.getValueAt(i, 2);
        cmbJabatan.setSelectedItem(jabatan);
        String telp1 = (String) model.getValueAt(i, 3);
        txtTelp1.setText(telp1);
        String telp2 = (String) model.getValueAt(i, 4);
        txtTelp2.setText(telp2);
        String alamat = (String) model.getValueAt(i, 5);
        txtAlamat.setText(alamat);
    }//GEN-LAST:event_tblKaryawanMouseClicked

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadData();
        resetInput();
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *//*
         try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
         if ("Nimbus".equals(info.getName())) {
         javax.swing.UIManager.setLookAndFeel(info.getClassName());
         break;
         }
         }
         } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(FormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(FormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(FormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(FormKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>

         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKaryawan().setVisible(true);
                try {
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (UnsupportedLookAndFeelException exception) {
                }
            }
        });
    }

    private void cariData() {
        //hapus selurh data
        model.getDataVector().removeAllElements();

        //memberi tahu tabel kosong
        model.fireTableDataChanged();
        String cari = txtCari.getText();
        try {
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "select * from identitas where nama ~* ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, cari);

            ResultSet rs = p.executeQuery();

            while (rs.next()) {
                Object[] o = new Object[6];
                o[0] = rs.getString("nik");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("jabatan");
                o[3] = rs.getString("telp_1");
                o[4] = rs.getString("telp_2");
                o[5] = rs.getString("alamat");

                model.addRow(o);
            }

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "Data Tidak Bisa di Load");
        }
    }

    private void loadData() {
        //hapus seluruh data
        model.getDataVector().removeAllElements();

        //memberi tahu tabel kosong
        model.fireTableDataChanged();

        try {
            Connection c = KoneksiDatabase.getKoneksi();
            Statement s = c.createStatement();

            String sql = "select * from identitas order by nama";
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Object[] o = new Object[6];
                o[0] = rs.getString("nik");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("jabatan");
                o[3] = rs.getString("telp_1");
                o[4] = rs.getString("telp_2");
                o[5] = rs.getString("alamat");

                model.addRow(o);
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(rootPane, "Data Tidak Bisa di Load");
        }
    }

    private void resetInput() {
        txtNik.setText(null);
        txtNama.setText(null);
        cmbJabatan.setSelectedIndex(0);
        txtTelp1.setText(null);
        txtTelp2.setText(null);
        txtAlamat.setText(null);
        txtCari.setText(null); 
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTelp1;
    private javax.swing.JTextField txtTelp2;
    // End of variables declaration//GEN-END:variables
}
