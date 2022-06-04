package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiemTest {
    Diem thisDiem = new Diem(new MonHoc("Hoa", 1, 1), 1);

    @Test
    void getDiem() {
    }

    @Test
    void getMon() {
        //1st a
        MonHoc subject = new MonHoc("CTDL", 3, 1);
        //2nd a
        Diem diem = new Diem(subject, 10);
        //3rd a
        assertEquals("CTDL", subject.getTen());
        assertNotEquals("Cấu trúc dữ liệu", subject.getTen());

        subject = new MonHoc(null, 3, 1);
        assertNull(subject.getTen());
    }

    @Test
    void testCollection() {
        List<Diem> mark = new ArrayList<>();
        MonHoc subject = new MonHoc("Java", 6, 3);
        Diem diem = new Diem(subject, 8);
        Diem diem1 = new Diem(subject, 9);
        mark.add(diem1);
        mark.add(diem);
        Collections.sort(mark);
        System.out.println(mark);
    }


}
