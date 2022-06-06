package fis.java.bigexample.dao.criminal;
import fis.java.bigexample.model.AbstractEntity;
import fis.java.bigexample.model.CriminalCase;

import java.util.ArrayList;
import java.util.List;


public class CriminalDAO implements ICriminal {
    ArrayList<CriminalCase> listCriminalCase = new ArrayList<>();
    @Override
    public void add(CriminalCase criminalCase) {
        listCriminalCase.add(criminalCase);
    }
    @Override
    public CriminalCase update(CriminalCase criminalCase) {
        findCriminalCaseByID(criminalCase.getId());
        return update(criminalCase);
    }
    private boolean isEmpty(long id) {
        if(String.valueOf(id).length() == 0 ){
            return false;
        }
        return true;
    }
    public CriminalCase findCriminalCaseByID(long id) {
        if(isEmpty(id)) {
        }
        for(int i = 0; i < listCriminalCase.size(); i++ ){
            if(listCriminalCase.get(i).getId() == id){
                return listCriminalCase.get(i);
            }
    }

    public CriminalCase delete(int code) {
        if(isEmpty(id)) {
        }
        findCriminalCaseByID(id);
        listCriminalCase.remove(id);
    }
}
