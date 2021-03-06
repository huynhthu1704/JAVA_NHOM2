/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dal.DAL_TimSach;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author son2lk
 */
public class BLL_TimSach {

    DAL_TimSach dal_timsach;

    public BLL_TimSach() throws Exception {
        this.dal_timsach = new DAL_TimSach();
    }

    public void setCB(JComboBox cbb, HashMap<String, String> hm) {

        cbb.removeAllItems();
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            Object key = entry.getKey();
            cbb.addItem(key.toString());
        }
    }

    public void TimSach(String searchBy, String kw, JTable tb) throws Exception {

        ResultSet rs = dal_timsach.layDSSach(searchBy, kw);

        while (rs.next()) {
            String id = rs.getString("id_book");
            String tt = rs.getString("title");
            String ctg = rs.getString("ctg");
            String au = rs.getString("author_name");
            String p = rs.getString("p_name");
            String lan = rs.getString("lan_name");
            String total = rs.getString("total_page");
            String price = rs.getString("price");
            String location = rs.getString("location");
            String[] row = {id, tt, ctg, au, p, lan, total, price, location};
            DefaultTableModel tableModel = (DefaultTableModel) tb.getModel();
            tableModel.addRow(row);
        }

    }
}
