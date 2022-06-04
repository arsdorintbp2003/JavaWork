package com.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MonHocTest {
    @Test
    void testEquals() {
    }

    @Test
    void getName() {
        MonHoc subject = new MonHoc("CTDL", 3, 1);
        assertEquals("CTDL", subject.getTen());
        assertNotEquals("Cấu trúc dữ liệu", subject.getTen());

        subject = new MonHoc( null,3, 1);
        assertNull(subject.getTen());
    }

    @Test
    void getTcLT() {
    }

    @Test
    void getTcTH() {
    }

    @Test
    void testWithCollection() {
        List<MonHoc> subjectList = new ArrayList<>();

        MonHoc firstSubject = new MonHoc("CTDL", 3, 1);
        MonHoc secondSubject = new MonHoc("OOP", 2, 1);
        subjectList.add(firstSubject);
        subjectList.add(secondSubject);

        MonHoc thirdSubject = new MonHoc("CTDL", 3, 1);
        assertEquals(0, subjectList.indexOf(firstSubject));
        assertEquals(0, subjectList.indexOf(thirdSubject));

        Collections.sort(subjectList, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                if (o1.getTcLT() > o2.getTcLT()) {
                    return -1;
                }
                else if (o1.getTcLT() < o2.getTcLT()) {
                    return 1;
                }
                return 0;
            }
            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }

    @Test
    void testWithSet() {
        Set<MonHoc> subjectSet = new HashSet<>();
        MonHoc firstSubject = new MonHoc("CTDL", 3, 1);
        MonHoc secondSubject = new MonHoc("OOP", 2, 1);
        subjectSet.add(firstSubject);
        subjectSet.add(secondSubject);

        MonHoc thirdSubject = new MonHoc("CTDL", 3, 1);
        assertEquals(0, subjectSet.size());
    }

    /* void testLambdaCollection() {
        List<MonHoc> subjectList = createSubjectList();
        List<MonHoc> subjectL = setMon(subjectList);
        System.out.println(subjectL);

        subjectL.stream().map(new Function<MonHoc, Object>() {
            @Override
            public MonHoc apply(MonHoc subject) {
                Diem diem = new Diem(subject, (int)Math.random() * 10);
                return diem;
            }

        }).forEach(subject -> {
        });
        List<MonHoc> getSubject(List<MonHoc> subjectList);
    } */
}
