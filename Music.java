package Spotfy;

public class Music {
    private int id;
    private String musicName;
    private String singerName;


    public Music(int id, String musicName, String singerName) {
        this.id = id;
        this.musicName = musicName;
        this.singerName = singerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", musicName='" + musicName + '\'' +
                ", singerName='" + singerName + '\'' +
                '}';
    }
}

