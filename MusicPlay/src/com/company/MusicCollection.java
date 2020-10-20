package com.company;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<File> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files=new ArrayList<File>();
        player=new MusicPlayer();

    }

    /**
     * Add a file to the collection.
     *
     * @param filename The file to be added.
     */
    public void addFile(File filename) {
        files.add(filename);

    }

    /**
     * search in music in files by addres(name) and singer
     * @param addres address of song
     * @param singer singer of song
     * @return return file that include this information
     */
    public File searchInMusic(String addres,String singer){
        int flag=0;
        File ff=new File();//   one empty  object of files
        for (File f:files
             ) {
            if(f.getAddress().equals(addres)&& f.getNameOfSinger().equals(singer)){
                flag=1;ff=f;return f;
            }

        }
        if(flag==0)return null;
        else return ff;

    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();

    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        System.out.println(index+"\'th file :");
        files.get(index).printFile();
        System.out.println();

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        int i=0;
        System.out.println("list of Collection");
        for (File st:files
             ) {
            System.out.print(i+" : ");
            st.printFile();
            i++;
        }

    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if(validIndex(index)==true){
            files.remove(index);
            System.out.println("file delet");
            System.out.println();
        }



    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
       if (validIndex(index))
            player.startPlaying(files.get(index));


    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {

        player.stop();

    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if(files.size()>=index && files.contains(files.get(index))) return true;
        else {
            System.out.println("not valid file");
            return false;
        }

    }
}