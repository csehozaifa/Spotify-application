//package org.example;
package org.example;

import Listenify.Album;
import Listenify.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Album a1=new Album("MoonChild Era","Diljit Dosanjh");
        a1.addNewSong("Champagne",3.02);
        a1.addNewSong("Lover",4.2);
        a1.addNewSong("Vibe",2.36);
        a1.addNewSong("Black and White",4.05);

        Album a2=new Album("Arjit Song","Arijit Singh");
        a2.addNewSong("Apna Bana le",3.4);
        a2.addNewSong("Agar Tum Sath Ho",5.3);
        a2.addNewSong("Uska Hi Bana",4.5);
        a2.addNewSong("Chaleya",5.98);
        a2.addNewSong("Channa Mereya",3.4);
        a2.addNewSong("Khariyat",3.4);

        List<Song> playlist=new ArrayList<>();
        a1.addToPlayList(playlist,1);
        a1.addToPlayList(playlist,4);

        a2.addToPlayList(playlist,"Apna Bana Le");
        a2.addToPlayList(playlist,"Uska Hi Bana");
        a2.addToPlayList(playlist,"Channa Mereya");
    }
}