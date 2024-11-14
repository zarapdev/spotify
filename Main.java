package Spotfy;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        MusicManage musicManage = new MusicManage();


        while (true){
            System.out.println("1.Musiqi elave et");
            System.out.println("2.Musiqini sil");
            System.out.println("3.Musiqini update et");
            System.out.println("4.Musiqi get (Singer)");
            System.out.println("5.Musigi get (Name)");
            System.out.println("6.Musiqi get(All)");
            System.out.println("7.cix");
            int a= input.nextInt();
            switch (a){
                case 1:
                    System.out.println("Id daxil et: ");
                    int id = input.nextInt();
                    System.out.println("name daxil et");
                    String name = input.next();
                    System.out.println("singer name daxil et: ");
                    String singerName = input.next();
                    System.out.println("id  daxil et");

                     musicManage.add(new Music(id,name,singerName));
                       break;
                case 2:
                    System.out.println("Id daxil et: ");
                    id = input.nextInt();
                    musicManage.delete(id);
                    break;
                case 3:
                    System.out.println(" Update edeceyim musiqini Id-ni daxil et: ");
                    id = input.nextInt();
                    System.out.println("Yeni name daxil et");
                    name=input.next();
                    System.out.println("Yeni singer name daxil et");
                    singerName = input.next();
                    musicManage.update(id,new Music(id,name,singerName));
                    break;
                case 4:
                    System.out.print("Singer daxil et: ");
                    String singer = input.next();
                   Music [] songs = musicManage.getSingerMusic(singer);
                    for (int i=0; i < songs.length; i++){
                        System.out.println(songs[i]);
                    }
                    break;
                case 5:
                    System.out.print("Musiqinin adini daxil  et: ");
                    String musicName = input.next();
                    Music  song = musicManage.getMusicName(musicName);
                    if(song != null){
                        System.out.println(song);
                    }else {
                        System.out.println("Musiqi tapilmadi");
                    }
                    break;
                case 6:
                    System.out.println("Butun musiqiler");
                    Music [] allSongs = musicManage.getAllMusic();
                    for (int i=0; i< allSongs.length; i++){
                        if (allSongs[i]!=null){
                            System.out.println(allSongs[i]);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Cixis");
                    input.close();
                    return;
                default:
                    System.out.println("yalniw");
            }
        }
    }
}
