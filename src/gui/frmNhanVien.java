/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import javax.swing.table.DefaultTableModel;
import et.ET_NhanVien;
import java.util.Date;
import bll.BLL_NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yushu
 */
public class frmNhanVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNhanVien
     */
    private BLL_NhanVien bll;

    public frmNhanVien() throws Exception {
        initComponents();
        bll = new BLL_NhanVien();
        hienThi();
        hienThiNV();
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
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dtpNgSinh = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtHoNV = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(155, 177, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã nhân viên:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 83, -1, -1));

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 78, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Họ NV:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 175, -1, -1));

        txtCCCD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Tên NV:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 134, -1, -1));

        dtpNgSinh.setDateFormatString("dd/MM/yyyy");
        dtpNgSinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(dtpNgSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 180, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Địa chỉ:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 231, -1, -1));

        txtHoNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtHoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, -1));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_26px.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_26px.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 100, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_remove_26px_1.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, -1));

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NHÂN VIÊN");
        jLabel1.setAutoscrolls(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 11, -1, 44));

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 226, 180, -1));

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Ngày sinh:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 134, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("CCCD:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Số điện thoại");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 83, -1, -1));

        tblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 890, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String maNV = txtMaNV.getText();
        String ho = txtHoNV.getText();
        String ten = txtTenNV.getText();
        String diaChi = txtDiaChi.getText();
        String soDT = txtSDT.getText();
        Date ngaySinh = dtpNgSinh.getDate();
        String cCCD = txtCCCD.getText();
        ET_NhanVien et;
        if (maNV == ""
                || ho == ""
                || ten == ""
                || diaChi == ""
                || soDT == ""
                || ngaySinh == null
                || cCCD == "") {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            try {
                if (bll.checkTT(maNV)) {
                    JOptionPane.showMessageDialog(null, "Đã tồn tại NV");
                } else {
                    et = new ET_NhanVien(maNV, ho, ten, diaChi, soDT, ngaySinh, cCCD);
                    if (bll.themNV(et)) {
                        JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
                    }
                    hienThiNV();
                    reset();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tblNhanVien.getSelectedRow();
        String maNV = tblNhanVien.getValueAt(row, 0).toString();
        JOptionPane.showMessageDialog(null, maNV);
        String ho = txtHoNV.getText();
        String ten = txtTenNV.getText();
        String diaChi = txtDiaChi.getText();
        String soDT = txtSDT.getText();
        Date ngaySinh = dtpNgSinh.getDate();
        String cCCD = txtCCCD.getText();
        ET_NhanVien et;
        if (maNV == ""
                || ho == ""
                || ten == ""
                || diaChi == ""
                || soDT == ""
                || ngaySinh == null
                || cCCD == "") {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            try {
                et = new ET_NhanVien(maNV, ho, ten, diaChi, soDT, ngaySinh, cCCD);

                if (bll.suaNV(et)) {
                    JOptionPane.showMessageDialog(rootPane, "Thành công");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Không thành công");
                }
                hienThiNV();
                reset();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row1 = tblNhanVien.getSelectedRow();
        String maNV = tblNhanVien.getValueAt(row1, 0).toString();
        String ho = txtHoNV.getText();
        String ten = txtTenNV.getText();
        String diaChi = txtDiaChi.getText();
        String soDT = txtSDT.getText();
        Date ngaySinh = dtpNgSinh.getDate();
        String cCCD = txtCCCD.getText();
        ET_NhanVien et;

        int row2 = tblNhanVien.getSelectedRow();
        if (row2 >= 0) {
            et = new ET_NhanVien(maNV, ho, ten, diaChi, soDT, ngaySinh, cCCD);
            try {
                if (bll.xoaNV(et)) {
                    JOptionPane.showMessageDialog(rootPane, "Xoá thành công");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa không thành công");
                }
                hienThiNV();
                reset();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
           this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        int row = tblNhanVien.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        txtMaNV.setText(model.getValueAt(row, 0).toString());
        txtTenNV.setText(model.getValueAt(row, 1).toString());
        txtHoNV.setText(model.getValueAt(row, 2).toString());
        txtDiaChi.setText(model.getValueAt(row, 3).toString());
        txtSDT.setText(model.getValueAt(row, 4).toString());
        dtpNgSinh.setDate((Date) model.getValueAt(row, 5));
        txtCCCD.setText(model.getValueAt(row, 6).toString());
        //JOptionPane.showMessageDialog(rootPane, model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tblNhanVienMouseClicked
    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã NV");
        model.addColumn("Tên");
        model.addColumn("Họ");
        model.addColumn("Địa chỉ");
        model.addColumn("Số ĐT");
        model.addColumn("Ngày sinh");
        model.addColumn("CCCD");
        tblNhanVien.setModel(model);
    }

    public void hienThiNV() throws SQLException {
        ResultSet rs = bll.layNV();
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[7];
            for (int i = 1; i <= 7; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        // rs.close();
    }

    public void reset() {
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtHoNV.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        dtpNgSinh.setDate(new Date());
        txtCCCD.setText("");
        txtMaNV.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dtpNgSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoNV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
