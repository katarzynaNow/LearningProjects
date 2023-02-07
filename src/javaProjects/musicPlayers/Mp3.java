package javaProjects.musicPlayers;

public class Mp3 extends MusicPlayer{

    public Mp3(Song[] library) {
        super(library);
    }

    public void play() {
        System.out.println("mp3 play: " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("mp3 pause " + getCurrentSong());
    }

    public void stop () {
        System.out.println("mp3 stop");
    }

}
