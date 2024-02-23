
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUNG
 */
public class SongList extends TreeSet<Song>
{
    public void addSong(Song song)
    {
        this.add(song);
    }
    public Song getSongMaxDuration()
    {
        Song m=this.first();
        for(Song song:this)
        {
            if(song.getDuration()>m.getDuration())
                m=song;
        }
        return m;
    }
    public void printSongList()
    {
        for(Song song:this)
        {
            System.out.println(song);
        }
    }
}
