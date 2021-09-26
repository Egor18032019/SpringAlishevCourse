package org.springcourse.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String comp = "Computer".toLowerCase();
//        MusicPlayer music1 = context.getBean(comp, MusicPlayer.class);
////        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        music1.playMusic();
////        Music music2 = context.getBean("musicBean", Music.class);
////        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
////        musicPlayer2.playMusic();
        Computer computer = context.getBean(comp,Computer.class);
        System.out.println(computer);
//        // обязательно закрыть
        context.close();
    }
}
