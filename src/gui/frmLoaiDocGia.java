/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import bll.BLL_NhaCungCap;
import et.ET_NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yushu
 */
public class frmLoaiDocGia extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmLoaiDocGia
     */
    public frmLoaiDocGia() {
        initComponents();
    }

    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tbNCC.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã NCC");
        model.addColumn("Tên NCC");
        model.addColumn("Địa chỉ");
        model.addColumn("Số ĐT");
        tbNCC.setModel(model);
    }

    public void hienThiNCC() throws SQLException {
        ResultSet rs = bll.layNCC();
        DefaultTableModel model = (DefaultTableModel) tbNCC.getModel();
        model.setNumRows(0);
        while (rs.next()) {
            Object[] col = new Object[4];
            for (int i = 1; i <= 4; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
    }

    public void layMa() throws Exception {
        ResultSet rs = bll.layNCC();
        rs.last();
        // JOptionPane.showMessageDialog(null, rs.getRow());
        int row = rs.getRow();
        if (row == 0) {
            STT = 1;
        } else {
            rs.beforeFirst();
            while (rs.next()) {
                STT = Integer.parseInt(rs.getObject(1).toString().substring(3)) + 1;
            }
        }
        String ma = String.format("%02d", STT);
        txtMaNCC.setText("NCC" + ma);
        txtTenNCC.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtTenNCC.requestFocus();
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
        jLabel5 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNCC = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnMoi = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tên loại độc giả");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtMaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 76, 176, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOẠI ĐỘC GIẢ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tên NCC:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTenNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 176, -1));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_26px.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_26px.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 100, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_remove_26px_1.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 100, -1));

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        tbNCC.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbNCC.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNCCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbNCC);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 690, 180));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Số lượng tối đa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 182, -1));

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_new_26px_4.png"))); // NOI18N
        btnMoi.setText("MỚI");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 186, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String maNCC = txtMaNCC.getText();
        String tenNCC = txtTenNCC.getText();
        String diaChi = txtDiaChi.getText();
        String soDT = txtSDT.getText();
        if (maNCC.compareTo("") == 0
                || tenNCC.compareTo("") == 0
                || diaChi.compareTo("") == 0
                || soDT.compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            ET_NhaCungCap et = new ET_NhaCungCap(maNCC, tenNCC, diaChi, soDT);
            try {
                if (bll.checkTT(maNCC)) {
                    JOptionPane.showMessageDialog(null, "Đã tồn tại Nha Cung Cap");
                } else {
                    if (bll.themNCC(et)) {
                        JOptionPane.showMessageDialog(rootPane, "Thành công");
                        STT++;
                        layMa();
                        hienThiNCC();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Không thành công");
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(frmNCC1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(frmNCC1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int dong = tbNCC.getSelectedRow();
        String maNCC = tbNCC.getValueAt(dong, 0).toString();
        String tenNCC = txtTenNCC.getText();
        String diaChi = txtDiaChi.getText();
        String soDT = txtSDT.getText();
        ET_NhaCungCap et;
        if (dong != -1) {
            if (maNCC.compareTo("") == 0
                    || tenNCC.compareTo("") == 0
                    || diaChi.compareTo("") == 0
                    || soDT.compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
            } else {

                try {
                    et = new ET_NhaCungCap(maNCC, tenNCC, diaChi, soDT);
                    if (bll.suaNCC(et)) {
                        JOptionPane.showMessageDialog(rootPane, "Thành công");
                        layMa();
                        hienThiNCC();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Không thành công");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        int row = tbNCC.getSelectedRow();
        if (row != -1) {
            try {
                String maNCC = txtMaNCC.getText();
                String tenNCC = txtTenNCC.getText().compareTo("") > 0 ? txtTenNCC.getText() : "";
                String diaChi = txtDiaChi.getText().compareTo("") > 0 ? txtDiaChi.getText() : "";
                String soDT = txtSDT.getText().compareTo("") > 0 ? txtSDT.getText() : "";
                if (maNCC != "" && tenNCC != "" && diaChi != "" && soDT != "") {
                    ET_NhaCungCap et = new ET_NhaCungCap(maNCC, tenNCC, diaChi, soDT);

                    if (bll.xoaNCC(maNCC)) {
                        JOptionPane.showMessageDialog(rootPane, "Thành công");
                        layMa();
                        hienThiNCC();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Không thành công");
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tbNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNCCMouseClicked
        // TODO add your handling code here:
        int row = tbNCC.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbNCC.getModel();
        txtMaNCC.setText(model.getValueAt(row, 0).toString());
        txtTenNCC.setText(model.getValueAt(row, 1).toString());
        txtDiaChi.setText(model.getValueAt(row, 2).toString());
        txtSDT.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tbNCCMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        try {
            // TODO add your handling code here:
            layMa();
        } catch (Exception ex) {
            Logger.getLogger(frmDanhMuc1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
}