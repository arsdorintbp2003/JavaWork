package fis.java.bigexample.dao.storage;

import fis.java.bigexample.model.Storage;

import java.util.ArrayList;

public interface IStorage {
    public void add(Storage storage);
    public ArrayList<Storage> getAll();
    public Storage delete(int code);
    public Storage update(Storage storage);
    public Storage findStorageById(Long id);
}
