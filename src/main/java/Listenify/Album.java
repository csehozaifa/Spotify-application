package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private List<Song> songList;
    public Album(String albumName,String artistName){
        this.albumName=albumName;
        this.artistName=artistName;
        songList=new ArrayList<>();
    }
    public Album(String artistName,List<Song> songList,String albumName){
        this.artistName=artistName;
        this.albumName=albumName;
        this.songList=songList;
    }
    public boolean findSong(String title){
        //find if the song entered with title is present in the songList
        //of this album or not
        for(Song song:songList){
            if(song.getSongTitle().equals(title)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    public String addNewSong(String title,double duration){
        if(findSong(title)==false){
            Song newSong=new Song(title,duration);
            songList.add(newSong);
            return "new song had been added to the song list";
        }else {
            return "the song is already present in the song list";
        }
    }
    public void addToPlayList(List<Song> playList,int songNo){
        int index=songNo-1;
        if(index<songList.size()){
            Song song=songList.get(index);
            playList.add(song);
        }
    }
    public String addToPlayList(List<Song> playList,String title){
        for(Song song:songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return "song added successfully";
            }
        }
        return "no song found";
    }
}
