package fis.java.bigexample.dao.criminal;

import fis.java.bigexample.model.CriminalCase;

public interface ICriminal {
    void add(CriminalCase criminalCase);
    public CriminalCase update(CriminalCase criminalCase);
    public CriminalCase delete(int code);
    CriminalCase findCriminalCaseByID(long id);

}
