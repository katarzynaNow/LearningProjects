package javaProjects.musicPlayers;

public class StereoSystem {
    public static void main(String[] args) {
    Song[] library = { new Song("Blinding Lights", "The Weekend", "After Hours"),
            new Song("Believer", "Imagine Dragons", "Evolve"),
            new Song("Sweater Weather", "The Neighbourhood", "I Love You.")};


        Player[] players = {new CD(library), new Mp3(library)};
        players[0].play();
        players[0].pause();
        players[0].play();
        players[0].next();
        players[0].stop();

        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].next();
        players[1].play();
        players[1].previous();
        players[1].play();
        players[1].stop();

    }
}
