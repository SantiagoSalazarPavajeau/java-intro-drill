import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {

    String name;
    static boolean isEmpty;
    static List<Song> songs = new ArrayList<>();
    static int totalDuration = 0;

    public Playlist(String name){
        this.name = name;
        this.isEmpty = true;
        this.songs = new ArrayList<>();
    }

    public static boolean isEmpty(){
        return isEmpty;
    }

    public static void addSong(Song song){
        songs.add(song);
        isEmpty = false;
        totalDuration += song.durationInSeconds;
    }

    public static String[] songNames(){

        String[] names = new String[songs.size()];


        for(int i = 0; i < songs.size(); i++){
            Song song = songs.get(i);
            System.out.println(song.title);
            names[i] = song.title;
        }

        System.out.println(names.length);
        System.out.println(songs.size());

        return names;
    }

    public static int totalDuration(){
        return totalDuration;
    }

    public static void swap(Song song1, Song song2){

        int len = songs.size();

        int i = 0;
        int j = 0;
        int first = 0;
        int second = 0;

        while (i < len) {

            if (songs.get(i) == song1) {
                first = i;
            }
            i++;
        }

        while (j < len) {

            if (songs.get(j) == song2) {
                second = j;
            }
            j++;

        }

        Collections.swap(songs, first, second);

//        Song temp = songNames[first];
//        songNames[first] = songNames[second];
//        songNames[second] = temp;

        songNames();
    }

    public static void removeSong(Song song){
//        List<Song> temp = new ArrayList<>(songs.size() -1);
//
//        for (int i = 0, k = 0; i < songs.size(); i++) {
//
//            if(songs.get(i).title == song.title){
//                continue;
//            }
//            temp.set(k++, songs.get(i));
//
//        }
        songs.remove(song);

        songNames();

        for(int i = 0; i < songs.size(); i++){
            System.out.println(songs.get(i));

        }
        System.out.println(songs.size());

    }





}
