import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {

    String name;
    private boolean isEmpty;
    private List<Song> songs;
    private int totalDuration;

    public Playlist(String name){
        // add default values with another constructor that calls the full constructor
        this(name, true, new ArrayList<>(), 0);
    }

    public Playlist(String name, boolean isEmpty, List<Song> songs, int totalDuration) {
        this.name = name;
        this.isEmpty = isEmpty;
        this.songs = songs;
        this.totalDuration = totalDuration;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }

    public void addSong(Song song){
        this.songs.add(song);
        this.isEmpty = false;
        this.totalDuration += song.durationInSeconds;
    }

    public String[] songNames(){
        String[] names = new String[this.songs.size()];
        // create a new array of strings with names

        for(int i = 0; i < this.songs.size(); i++){
            Song song = this.songs.get(i); // .get method from ArrayList
            names[i] = song.title;
        }

        return names; //test asks for new Song[0] in this case its equal to new String[0]
    }

    public int totalDuration(){
        return this.totalDuration;
    }

    public void swap(Song song1, Song song2){

        int len = this.songs.size();

        int i = 0;
        int j = 0;
        int first = 0;
        int second = 0;

        while (i < len) {

            if (this.songs.get(i) == song1) {
                first = i;
            }
            i++;
        }
        // find indexes of elements we need to swap
        while (j < len) {

            if (this.songs.get(j) == song2) {
                second = j;
            }
            j++;

        }

        Collections.swap(this.songs, first, second);
        // Collections method accepts an ArrayList and two indexes to swap
    }

    public void removeSong(Song song){
        songs.remove(song);
    }





}
