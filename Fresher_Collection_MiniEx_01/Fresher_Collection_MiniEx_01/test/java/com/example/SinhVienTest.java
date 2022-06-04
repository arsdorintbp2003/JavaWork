package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienTest {
    @Test
    void themDiem() {
    }

    @Test
    void testTinhDiemTrungBinh() {
        assertEquals(12, new SinhVien().tinhDiemTrungBinh());
    }

    @Test
    void testBangDiem() {
    }

    @Test
    void testXepLoai() {
    }

    @Test
    void testGetDiemByCondition() {
        //1st a
        MonHoc monHoc1 = new MonHoc("CTDL", 3, 2);
        MonHoc monHoc2 = new MonHoc("CTDL", 2, 1);
        SinhVien sv = new SinhVien("123", "Nam");
        sv.themDiem(new Diem(monHoc1, 6));
        sv.themDiem(new Diem(monHoc2, 9));

        //2nd a
        List<Diem> dsDiem = sv.getDiemByCondition(diem -> {
            if (diem.getDiem() > 6) {
                return true;
            }
            return false;
        });

    }
}
