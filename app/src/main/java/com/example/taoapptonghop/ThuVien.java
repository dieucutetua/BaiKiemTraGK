package com.example.taoapptonghop;

import java.io.Serializable;

public class ThuVien implements Serializable {
    private String tenSach;
    private String chitiet;
    private String vitri;
    private int hinh;

    public ThuVien(String tenSach, String chitiet, String vitri, int hinh) {
        this.tenSach = tenSach;
        this.chitiet = chitiet;
        this.vitri = vitri;
        this.hinh = hinh;
    }

    public ThuVien() {
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
