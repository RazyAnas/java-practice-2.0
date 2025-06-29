package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private ArrayList<Album> album = new ArrayList<>();
    public static void main(String[] args) {
        LinkedList<Song> songList1 = new LinkedList<>();
        songList1.add(new Song("Tere naam", "2min 30sec"));
        songList1.add(new Song("Tere naam 2", "2min 50sec"));
        Album album1 = new Album("album1", songList1);
        System.out.println(album1);
    }
}























































//    public static void main(String[] args) {
//        LinkedList<Song> iterator = new LinkedList<>();
//        Song clouds = new Song("Clouds by Sabrina Carpenter", "5min 6sec");
//        Song love = new Song("Lucy's love by Isac Ibrahim", "2min 0sec");
//        addSong(iterator, clouds);
//        addSong(iterator, love);
//        addSong(iterator, love);
//        System.out.println(iterator);
//    }
//    private static void addSong(LinkedList<Song> songList, Song song) {
//        // check if duplicate song exists
//        for (var songElement : songList) {
//            if (songElement.title().equalsIgnoreCase(song.title())) {
//                System.out.println("\"" + song + "\"" + " already exists in the playlist!");
//                return;
//            }
//        }
//        // if not duplicate, add
//        songList.add(song);
//    }