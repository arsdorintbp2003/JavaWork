package fis.java.bigexample.dao.trackentry;

import fis.java.bigexample.model.TrackEntry;

import java.util.ArrayList;

public class TrackEntryDAO implements ITrackEntry {
    ArrayList<TrackEntry> listTrackEntry = new ArrayList<>();

    @Override
    public void add(TrackEntry trackEntry) {
        listTrackEntry.add(trackEntry);
    }

    @Override
    public TrackEntry update(TrackEntry trackEntry) {
        findById(trackEntry.getId());
        return update(trackEntry);
    }

    @Override
    public TrackEntry delete(long id) {
        if (isEmpty(id)) {
        }
        TrackEntry trackEntry = findById(id);
        listTrackEntry.remove(trackEntry);
    }

    private boolean isEmpty(long id) {
        if (String.valueOf(id).length() == 0) {
            return false;
        }
        return true;

    }

    @Override
    public ArrayList<TrackEntry> getAll() {
        return listTrackEntry;
    }

    @Override
    public TrackEntry findById(long id) {
        if (isEmpty(id)) {

        }
        for (int i = 0; i < listTrackEntry.size(); i++) {
            if (listTrackEntry.get(i).getId() == id) {
                return listTrackEntry.get(i);
            }
        }
    }
}

