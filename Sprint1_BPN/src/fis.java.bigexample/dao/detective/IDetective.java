package fis.java.bigexample.dao.detective;

import fis.java.bigexample.model.Detective;

import java.util.ArrayList;

public interface IDetective {
    public void add(Detective detective);
    public Detective remove(int code);
    public ArrayList<Detective> getAll();
    public Detective update(Detective detective);
    public Detective findDetectiveById(Long id);
}
