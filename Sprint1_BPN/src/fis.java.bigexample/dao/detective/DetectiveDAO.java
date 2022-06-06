package fis.java.bigexample.dao.detective;

import fis.java.bigexample.model.Detective;

import java.util.ArrayList;

public class DetectiveDAO implements IDetective {
    private ArrayList<Detective> listDetective = new ArrayList<>();
    @Override
    public void add(Detective detective) {
        listDetective.add(detective);
    }
    @Override
    public Detective update(Detective detective) {
        findDetectiveById(detective.getId());
        return update(detective);
    }
    private boolean isEmpty(long id) {
        if(String.valueOf(id).length() == 0 ){
            return false;
        }
        return true;
    }
    @Override
    public Detective remove(int id) {
        if(isEmpty(id)) {
        }
        Detective detective = findDetectiveById(id);
        listDetective.remove(detective);
        return ... //TODO
        }

    }
    public Detective findDetectiveById(long id) {
        if (isEmpty(id)) {
        }
        for (int i = 0; i < listDetective.size(); i++) {
            if (listDetective.get(i).getId() == id) {
                return listDetective.get(i);
            }
        }
    }

    @Override
    public ArrayList<Detective> getAll() {
        return listDetective;
    }
}
