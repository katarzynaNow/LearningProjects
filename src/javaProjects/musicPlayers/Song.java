package javaProjects.musicPlayers;

public class Song {
    private String artistName;
    private String title;
    private String album;

    public Song(String artistName, String title, String album) {
        this.artistName = artistName;
        this.title = title;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistName='" + artistName + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
