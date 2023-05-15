package com.levochka108;

import com.levochka108.music.Music;
import com.levochka108.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Levochka108
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();

    }
}
