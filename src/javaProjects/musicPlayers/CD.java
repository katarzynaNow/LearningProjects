package javaProjects.musicPlayers;

public class CD extends MusicPlayer {


    public CD(Song[] library) {
        super(library);
    }

    public void play() {
        System.out.println("cd play: " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("cd pause " + getCurrentSong());
    }

    public void stop () {
        System.out.println("cd stop");
    }

}
