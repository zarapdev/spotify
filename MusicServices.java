package Spotfy;

public interface MusicServices {
    void add(Music music);
    void update (int id, Music music);
    void delete(int id);

    Music getMusicName(String musicName);

    //get ----return
    Music [] getSingerMusic (String singerName);
    Music [] getAllMusic();


}
