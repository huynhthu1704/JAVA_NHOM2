/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

import java.sql.Date;

/**
 *
 * @author dthan
 */
public class ET_TraSachh {

    private int maMuonSach; // mã sách mượn
    private java.sql.Date ngayDuTra; // ngày dự trả
    private java.sql.Date ngayThucTra; // ngày thực trả
    private String maSach; // mã sách
    private String tenDocGia; // tên độc giả
    private String maThuVien; // mã thư viện
    private int soNgayQuaHan; // số ngày quá hạn
    private String maNhanVien; // mã nhân viên
    private String tinhTrangSach; // tình trạng sách

    public ET_TraSachh(int maMuonSach, Date ngayDuTra, Date ngayThucTra, String maSach, String tenDocGia, String maThuVien, int soNgayQuaHan, String maNhanVien, String tinhTrangSach) {
        this.maMuonSach = maMuonSach;
        this.ngayDuTra = ngayDuTra;
        this.ngayThucTra = ngayThucTra;
        this.maSach = maSach;
        this.tenDocGia = tenDocGia;
        this.maThuVien = maThuVien;
        this.soNgayQuaHan = soNgayQuaHan;
        this.maNhanVien = maNhanVien;
        this.tinhTrangSach = tinhTrangSach;
    }

    public int getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(int maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public Date getNgayDuTra() {
        return ngayDuTra;
    }

    public void setNgayDuTra(Date ngayDuTra) {
        this.ngayDuTra = ngayDuTra;
    }

    public Date getNgayThucTra() {
        return ngayThucTra;
    }

    public void setNgayThucTra(Date ngayThucTra) {
        this.ngayThucTra = ngayThucTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getMaThuVien() {
        return maThuVien;
    }

    public void setMaThuVien(String maThuVien) {
        this.maThuVien = maThuVien;
    }

    public int getSoNgayQuaHan() {
        return soNgayQuaHan;
    }

    public void setSoNgayQuaHan(int soNgayQuaHan) {
        this.soNgayQuaHan = soNgayQuaHan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTinhTrangSach() {
        return tinhTrangSach;
    }

    public void setTinhTrangSach(String tinhTrangSach) {
        this.tinhTrangSach = tinhTrangSach;
    }

   
  
}
