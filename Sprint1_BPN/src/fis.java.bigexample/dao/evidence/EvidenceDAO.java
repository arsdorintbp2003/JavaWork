package fis.java.bigexample.dao.evidence;

import fis.java.bigexample.model.Evidence;

import java.util.ArrayList;

public class EvidenceDAO implements IEvidence {
    ArrayList<Evidence> listEvidence = new ArrayList<>();
    @Override
    public void add(Evidence evidence) {
        listEvidence.add(evidence);
    }
    @Override
    public Evidence update(Evidence evidence) {
        findEvidenceById(evidence.getId());
        return update(evidence);
    }
    private boolean isEmpty(long id) {
        if (String.valueOf(id).length() == 0) {
            return false;
        }
        return true;
    }
    @Override
    public Evidence remove(int id) {
        if(isEmpty(id)){
    }
    @Override
    public Evidence findEvidenceById(Long id) {
        if (isEmpty(id)) {
        }
        for (int i = 0; i < listEvidence.size(); i++) {
            if (listEvidence.get(i).getId() == id) {
                return listEvidence.get(i);
            }
        }
    }

    @Override
    public ArrayList<Evidence> getAll() {
        return listEvidence;
    }


}
