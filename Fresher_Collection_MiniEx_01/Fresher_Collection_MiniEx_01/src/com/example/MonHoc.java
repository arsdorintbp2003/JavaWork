package com.example;

public class MonHoc {
    private String ten;
    private int tcLT;
    private int tcTH;

    public MonHoc(String ten, int tcLT, int tcTH) {
        this.ten = ten;
        this.tcLT = tcLT;
        this.tcTH = tcTH;
    }

    public String getTen() {
        return ten;
    }

    public int getTcLT() {
        return tcLT;
    }

    public int getTcTH() {
        return tcTH;
    }

    public String setTen(String ten) {
        return this.ten;
    }

    public int setTcLT(int tcLT) {
        return this.tcLT;
    }

    public int setTcTH(int tcTH) {
        return this.tcTH;
    }

    public boolean equals(Object that) {
        //Hai mon duoc goi la bang nhau neu cung ten mon
        if (that instanceof MonHoc) {
            return ((MonHoc) that).ten.equals(this.ten);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = ten != null ? ten.hashCode() : 0;
        result = 31 * result * tcLT;
        result = 31 * result * tcTH;
        return result;
    }

    @Override
    public int compareTo(MonHoc that) {
        if (this.ten.compareTo(that.ten) > 0) {
            return 1;
        } else if (this.ten.compareTo(that.ten) < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Mon Hoc{" + "ten=" + ten + ", tcLT=" + tcLT + ", tcTH=" + tcTH + "}";
    }
}

