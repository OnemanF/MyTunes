package dk.easv.mytunes.DAL.db;

import dk.easv.mytunes.BE.Song;

import java.util.List;

public interface ISongDataAccess {
    List<Song> getAllSongs() throws Exception;
}
