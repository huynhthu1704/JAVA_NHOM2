/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_ChiTietHD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DAL_ChiTietHD {

    private Connection conn;

    public DAL_ChiTietHD() throws Exception {
        conn = DatabaseUtil.getConnection();
    }

    public boolean themChiTietHD(ET_ChiTietHD et) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "insert into idv_detail(id_idv_detail,quantity,id_idv,id_book)"
                + "values('" + et.getMaChiTietHD() + "'," + et.getSoLuong() + ",'" + et.getMaHD() + "','" + et.getMaSach() + "')";
        if (st.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }

    public Boolean checkTonTai(String ma) throws SQLException {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from idv_detail where id_idv_detail = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from idv_detail ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet timCTHD(String maHD) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from idv_detail where id_idv = '" + maHD + "'";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}
