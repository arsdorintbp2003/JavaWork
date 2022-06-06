package fis.java.bigexample.dao.trackentry;

import fis.java.bigexample.model.TrackEntry;

import java.util.ArrayList;

public interface ITrackEntry {
    public void add(TrackEntry trackEntry);
    public TrackEntry delete(int code);
    public TrackEntry findById(long id)
    public TrackEntry update(TrackEntry trackEntry);
    public ArrayList<TrackEntry> getAll();

}
