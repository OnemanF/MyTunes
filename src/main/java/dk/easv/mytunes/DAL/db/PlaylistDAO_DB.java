package dk.easv.mytunes.DAL.db;

import java.io.IOException;

public class PlaylistDAO_DB implements IPlaylistDataAccess {
    private DBConnector playlistdatabaseConnector;

    public PlaylistDAO_DB() throws IOException {
        playlistdatabaseConnector = new DBConnector();
    }
}