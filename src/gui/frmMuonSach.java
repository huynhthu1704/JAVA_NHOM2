/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import bll.BLL_MuonSach;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import et.ET_MuonSach;
import java.awt.Container;
import java.sql.SQLException;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yushu
 */
public class frmMuonSach extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmMuonSach
     */
    HashMap<String, String> hm_nv;
    BLL_MuonSach bll_muonsach;

    //Contructor form Mượn sách
    public frmMuonSach() throws Exception {
        initComponents();
        this.setTitle("Quản lý Mượn sách");
        this.txtTenDocGia.setEditable(false);
        this.bll_muonsach = new BLL_MuonSach();
        this.hm_nv = bll_muonsach.hm_NV();
        java.util.Date date = new java.util.Date();
        ngayMuonJDate.setDate(date);
        ngayMuonJDate.setEnabled(false);

        loadCBNV();
        LoadDSPM();
    }

    //Hàm set textfield rống
    public void clearTextFields(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText("");
            } else if (c instanceof JTextArea) {
                JTextArea f = (JTextArea) c;
                f.setText("");
            } else if (c instanceof Container) {
                clearTextFields((Container) c);
            }
        }
        java.util.Date date = new java.util.Date();
        ngayMuonJDate.setDate(date);
    }

    //Hàm load combobox
    public void loadCBNV() {
        cbNhanVien.removeAllItems();
        Map<String, String> map = new TreeMap<>(hm_nv);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            Object value = entry.getValue();
            cbNhanVien.addItem(value.toString());
        }
    }

    //Hàm lấy mã nhân viên
    public String getMaNV() {
        for (Entry<String, String> entry : hm_nv.entrySet()) {
            if (entry.getValue().equals(cbNhanVien.getSelectedItem())) {
                return entry.getKey();
            }
        }
        return "";
    }

    //Hàm Load lại danh sách
    public void LoadDSPM() throws Exception {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        bll_muonsach.SetTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaDocGia = new javax.swing.JTextField();
        txtTenDocGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbNhanVien = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ngayMuonJDate = new com.toedter.calendar.JDateChooser();
        cbNgay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTinhTrang = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MƯỢN SÁCH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã thẻ thư viện");

        txtMaDocGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaDocGia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaDocGiaFocusLost(evt);
            }
        });

        txtTenDocGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Tên độc giả:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Ngày mượn:");

        cbNhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Huỳnh Thị Ngọc Thư", "Bùi Hồng Ngọc" }));
        cbNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhanVienActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nhân viên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Mã sách:");

        txtMasach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_26px.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã thẻ", "Mã NV", "Mã Sách", "Ngày mượn", "Ngày phải trả", "Tình trạng sách", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ngayMuonJDate.setDateFormatString("dd/MM/yyyy");
        ngayMuonJDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbNgay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "7", "14", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Số ngày mượn:");

        txtTinhTrang.setColumns(15);
        txtTinhTrang.setRows(5);
        jScrollPane2.setViewportView(txtTinhTrang);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Tình trạng:");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_new_26px_4.png"))); // NOI18N
        btnClear.setText("MỚI");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ngayMuonJDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(txtTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnThoat)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(cbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnClear)
                            .addComponent(btnThoat))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ngayMuonJDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Hàm thêm sư kiện lost focus load tên đọc giả
    private void txtMaDocGiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaDocGiaFocusLost
        try {
            // TODO add your handling code here:
            String text = bll_muonsach.GetTenDG(txtMaDocGia.getText());
            txtTenDocGia.setText(text);
            if (text.equals("") && !txtMaDocGia.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Mã thẻ không tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            LoadDSPM();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtMaDocGiaFocusLost

    private void cbNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhanVienActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbNhanVienActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        try {
            // TODO add your handling code here:
            if (!bll_muonsach.HetHan(txtMaDocGia.getText())) {
                JOptionPane.showMessageDialog(null, "Thẻ đã hết hạn, vui lòng gian hạn thêm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                return;
            }
            if (!bll_muonsach.DuocMuon(txtMaDocGia.getText())) {
                JOptionPane.showMessageDialog(null, "Mượn vượt quá mức !!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!bll_muonsach.GetQtyBook(txtMasach.getText())) {
                JOptionPane.showMessageDialog(null, "Sách đã hết !!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmMuonSach.class.getName()).log(Level.SEVERE, null, ex);
        }

        ET_MuonSach muonsach = new ET_MuonSach(txtMasach.getText(), txtMaDocGia.getText(), getMaNV(), ngayMuonJDate.getDate(), Integer.parseInt((String) cbNgay.getSelectedItem()), txtTinhTrang.getText());

        try {

            bll_muonsach.ChoMuon(muonsach);
            clearTextFields(jPanel1);
            JOptionPane.showMessageDialog(null, "Mượn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            LoadDSPM();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, jPanel1, "Mượn thất bại lỗi" + ex, JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
            try {

            } catch (Exception ex1) {
                Logger.getLogger(frmMuonSach.class.getName()).log(Level.SEVERE, null, ex1);
            }
            try {
                LoadDSPM();
            } catch (Exception ex1) {
                Logger.getLogger(frmMuonSach.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmMuonSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearTextFields(jPanel1);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbNgay;
    private javax.swing.JComboBox<String> cbNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser ngayMuonJDate;
    private javax.swing.JTextField txtMaDocGia;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtTenDocGia;
    private javax.swing.JTextArea txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
