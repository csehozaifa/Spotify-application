//package org.example;
package org.example;

import Listenify.Album;
import Listenify.Song;

import java.util.*;

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

        int currIndex=0;
        printMenu();
        System.out.println("Now playlist"+playlist.get(currIndex).toString());
        playPlayList(playlist);
    }

    public static void playPlayList(List<Song> playlist){
        Scanner sc=new Scanner(System.in);
        int currInd=0;

        boolean quit=false;

        while(quit==false){
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    currInd=currInd+1;
                    if(currInd%playlist.size()==0)
                        currInd=0;
                        System.out.println("Now playing"+playlist.get(currInd).toString());

                    break;
                case 2:
                    currInd=currInd-1;
                    if(currInd==-1)
                        currInd=0;
                    System.out.println("Now playing"+playlist.get(currInd).toString());
                    break;
                case 3:
                    System.out.println("Now playing"+playlist.get(currInd).toString());
                    break;
                case 4:
                    Collections.shuffle(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    printPlayList(playlist);
                    break;
                case 7:
                    playlist.remove(currInd);
                    System.out.println("The current song has been deleted");
                    break;
                case 8:
                    quit=true;
                    break;



            }
        }

    }
    public static void printPlayList(List<Song> playlist){
        for(Song song:playlist){


        }
    }
    public static void printMenu(){
        System.out.println("1.play the next song");
        System.out.println("2.play the previous song");
        System.out.println("3.repeat this song");
        System.out.println("4.shuffle the playlist");
        System.out.println("5.print the menu !!");
        System.out.println("6.print playlist");
        System.out.println("7.delete the current song");
        System.out.println("8.Exit the system");
        System.out.println("<<<-------->>>");
        System.out.println("enter your choice");
    }
}