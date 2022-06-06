package fis.java.bigexample.dao.evidence;

import fis.java.bigexample.model.Evidence;

import java.util.ArrayList;

public interface IEvidence {
    public void add(Evidence evidence);
    public Evidence remove(int code);
    public ArrayList<Evidence> getAll();
    public Evidence update(Evidence evidence);
    Evidence findEvidenceById(Long id);
}
