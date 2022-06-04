package com.example;

import java.io.Serializable;

public class Diem implements Comparable<Diem>, Serializable {
    private MonHoc mon;
    private int diem;

    public Diem(MonHoc mon, int diem) {
        this.mon = mon;
        this.diem = diem;
    }

    public boolean equals(Object that) {
        // Hai diem duoc goi la bang nhau neu cua cung mot mon
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;

        Diem diem1 = (Diem) that;
        if (diem != diem1.diem) return false;
        return mon.equals(diem1.mon);
    }

    public MonHoc getMon() {
        return mon;
    }
    public MonHoc setMon(MonHoc mon) {
        return this.mon;
    }

    public int getDiem() {
        return diem;
    }

    public int setDiem(int diem) {
        return this.diem;
    }

    @Override
    public int compareTo(Diem that) {
        // TODO Auto-generated method stub
        return Integer.compare(this.diem, that.diem);
    }

    @Override
    public int hashCode() {
        int result = mon.hashCode();
        result = 31 * result + diem;
        return result;
    }

    @Override
    public Diem clone() {
        Diem diem = new Diem(this.mon, this.diem);
        return diem;
    }

    @Override
    public String toString() {
        return "{Diem mon "+ mon + "= " + diem + "}";
    }
}
