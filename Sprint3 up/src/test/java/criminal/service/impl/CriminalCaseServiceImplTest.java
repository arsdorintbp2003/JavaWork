package criminal.service.impl;

import criminal.model.entity.CriminalCase;
import criminal.model.enums.CaseStatus;
import criminal.model.enums.CaseType;
import criminal.repository.CriminalCaseRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CriminalCaseServiceImplTest {
    @Autowired
    private CriminalCaseRepo criminalCaseRepo;
    @Autowired
    private CriminalCaseServiceImpl criminalCaseService;

    @Test
    void save() {
        CriminalCase criminalCase = new CriminalCase(2L, 2, LocalDateTime.now(), LocalDateTime.now(),
                "a", "a", "a", "a", CaseType.FELONY, CaseStatus.CLOSED);
        criminalCaseRepo.save(criminalCase);
    }

    @Test
    void getAll() {
        System.out.println(criminalCaseRepo.findAll());
    }

    @Test
    void update() {
    }

    @Test
    void deleteCriminalCaseById() {
        criminalCaseService.deleteCriminalCaseById(2L);
    }

    @Test
    void findCriminalCaseById() {
        System.out.println(criminalCaseRepo.findById(1L));
    }

    @Test
    void findCriminalCaseByNumber() {
        System.out.println(criminalCaseService.findCriminalCaseByNumber("a"));
    }
}