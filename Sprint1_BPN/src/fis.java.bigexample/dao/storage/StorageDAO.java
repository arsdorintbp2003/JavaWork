package fis.java.bigexample.dao.storage;

import fis.java.bigexample.model.Storage;

import java.util.ArrayList;

public class StorageDAO implements IStorage {
    ArrayList<Storage> listStorage = new ArrayList<>();
    @Override
    public void add(Storage storage) {
        listStorage.add(storage);
    }
    @Override
    public Storage update(Storage storage) {
        findStorageById(storage.getId());
        return update(storage);
    }
    @Override
    public Storage delete(long id) {
        if(isEmpty(id)) {
        }
        Storage storage = findStorageById(id);
        listStorage.remove(storage);
    }
    @Override
    public ArrayList<Storage> getAll() {
        return listStorage;
    }
    @Override
    public Storage findStorageById(Long id) {
        if(isEmpty(id)){

        }
        for(int i = 0; i < listStorage.size(); i++ ){
            if(listStorage.get(i).getId() == id){
                return listStorage.get(i);
            }
        }
    }
    private boolean isEmpty(long id) {
        if(String.valueOf(id).length() == 0 ){
            return false;
        }
        return true;
    }
}
