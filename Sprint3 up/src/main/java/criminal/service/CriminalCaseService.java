package criminal.service;

import criminal.model.entity.CriminalCase;

import java.util.List;

public interface CriminalCaseService {
    CriminalCase save(CriminalCase criminalCase);

    List<CriminalCase> getAll();

    CriminalCase update(CriminalCase criminalCase);

    void deleteCriminalCaseById(Long id);

    CriminalCase findCriminalCaseById(Long id);

    CriminalCase findCriminalCaseByNumber(String number);
}
