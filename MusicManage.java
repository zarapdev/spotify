package Spotfy;

import java.util.ArrayList;
import java.util.List;

public class MusicManage implements MusicServices {
    Music[] musiqiler= new Music[100];
    int count = 0;

    @Override
    public void add(Music music) {
        if (musiqiler.length > count) {
            musiqiler[count] = music;
            count++;
            System.out.println("Musiqi yeri var");

        }else {
            System.out.println("Musiqinin yeri dolub");
        }
    }

    @Override
    public void update(int id, Music music) {
        for (int i=0; i<count; i++){
            if (id==musiqiler[i].getId()){
                musiqiler[i] = music;
                System.out.println("Deyisildi");
                return;
            }
        }
    }
    @Override
    public void delete(int id) {
        for (int i=0; i<count; i++){
            if (id==musiqiler[i].getId()){
                musiqiler[i] = null;
                System.out.println("silindi");
                return;
            }
        }


    }

    @Override
    public Music getMusicName(String musicName) {
        for (int i = 0; i < musiqiler.length; i++) {
            if (musiqiler[i]!=null){
                if (musicName.equalsIgnoreCase(musiqiler[i].getMusicName())) {
                    return musiqiler[i];
                }
                break;
            }

        }
        return null;


    }
    @Override
    public Music[] getSingerMusic(String singerName) {
        Music[] tempArray = new Music[musiqiler.length];
        int count1 = 0;

        // Eşleşen müzikleri tempArray'e ekleyelim
        for (int i = 0; i < musiqiler.length; i++) {
            if (musiqiler[i] != null && musiqiler[i].getSingerName().equalsIgnoreCase(singerName)) {
                tempArray[count1] = musiqiler[i];
                count1++;
            }
        }

        // Sonuç dizisini oluşturup, tempArray'den kopyalayalım
        Music[] matchedMusic = new Music[count1];
        for (int j = 0; j < count1; j++) {
            matchedMusic[j] = tempArray[j];
        }

        return matchedMusic;

    }



    @Override
    public Music[] getAllMusic() {
        return musiqiler;
    }
}
