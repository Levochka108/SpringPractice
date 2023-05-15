/**
 * @author Dmitrii Klochkov
 * Date:15.05.2023
 * Time:11:08
 */
package com.levochka108.music;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());

    }
}
