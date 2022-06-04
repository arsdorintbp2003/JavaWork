package com.example;

import java.util.*;

import java.util.function.Predicate;

public class SinhVien {
    private String mssv;
    private String ten;

    private Set<Diem> monDaHoc = new HashSet<Diem>();

    public SinhVien(String mssv, String ten) {
        this.mssv = mssv;
        this.ten = ten;
    }

    public SinhVien() {
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return ten;
    }

    public void setName(String ten) {
        this.ten = ten;
    }

    public boolean themDiem(Diem diemMoi) {

        return this.monDaHoc.add(diemMoi);
    }

    //TODO Cau 1
    public double tinhDiemTrungBinh() {
        //Giong nhu cach tinh hien tai cua truong
        double tongDiem = 0;
        int count = 0;
        //...
        for (Diem diem : monDaHoc) {
            tongDiem += diem.getDiem();
            count++;
        }
        return tongDiem / count;
    }

    //TODO Cau 2
    public String bangDiem() {
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
        //...
        //StringBuilder
        StringBuilder str = new StringBuilder();
        str.append("MSSV: " + this.mssv + "\n");
        str.append("Ten: " + this.ten + "\n");
        str.append("Danh Sach Diem\n");
        str.append("STT  Ten Mon             Diem       So Tin Chi");
        for (Diem mon : monDaHoc) {
            str.append("1    " + mon.getMon().getTen() + " " + mon.getDiem() + mon.getMon().getTcLT() + mon.getMon().getTcTH());
        }
        str.append("Diem Trung Binh   " + tinhDiemTrungBinh());
        return str.toString();
    }

    public List<Diem> getDiemByCondition(Predicate<Diem> predicate) {
        List<Diem> dsDiem = new ArrayList<>();
        for (Diem diem: this.monDaHoc) {
            if (predicate.test(diem)) {
                dsDiem.add(diem);
            }
        }
        return dsDiem;
    }

    public static boolean doPredicate(Diem diem) {
        if (diem.getDiem() >= 5) {
            return true;
        }
        return false;
    }

    public static boolean truotPredicate(Diem diem) {
        if (diem.getDiem() < 5) {
            return true;
        }
        return false;
    }

    //TODO Cau 3
    public String xepLoai() {
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */
        if (tinhDiemTrungBinh() < 5) {
            return "YEU";
        } else if (tinhDiemTrungBinh() < 6) {
            return "TRUNG BINH";
        } else if (tinhDiemTrungBinh() < 7) {
            return "TB-KHA";
        } else if (tinhDiemTrungBinh() < 8) {
            return "KHA";
        } else if (tinhDiemTrungBinh() <= 10) {
            return "GIOI";
        } else {
            return "invalid mark";
        }
    }
}
