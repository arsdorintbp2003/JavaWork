package criminal.repository.jdbc;

import criminal.model.entity.Detective;
import criminal.repository.DetectiveRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.*;

@SpringBootTest
class DetectiveRepoTestJDBC {

    @Autowired
    DetectiveRepo detectiveRepo;
    @Test
    void findById() {
        System.out.println(detectiveRepo.findById(1L));
    }

    @Test
    void findByBadgeNumber() {
        System.out.println(detectiveRepo.findByBadgeNumber("774744"));
    }

    @Test
    void save() {
        Detective detective = new Detective(2L, 2, LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now(),
                "dec02", "Anne", "Shirley", "654321", "B02", null,
                true,  null,
                null, null);
        detectiveRepo.save(detective);
    }

    @Test
    void findAll() {
        System.out.println(detectiveRepo.findAll());
    }

    @Test
    void findbyRank() {
        Set<Detective> detectiveSet;
        detectiveSet = detectiveRepo.findbyRank("TRAINEE");
        for(Detective detective : detectiveSet){
            System.out.println(detective);
        }
    }

    @Test
    void delete() {
        detectiveRepo.delete(detectiveRepo.findById(2L).get());
    }

    @Test
    void deleteById() {
        detectiveRepo.deleteById(8L);
    }
}