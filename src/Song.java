public class Song {
    /**класс для работы с песней
     * @param name название песни
     * @param artist исполнитель
     * @param media носитель*/
    private String name;
    private String artist;
    private Media media;
    public Song(String name, String artist, Media media){
        this.name=name;
        this.artist=artist;
        this.media=media;
    }
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Media getMedia() {
        return media;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setMedia(Media media) {
        this.media = media;
    }
    public void setName(String name) {
        this.name = name;
    }
    /** переопределенный метод*/
    @Override
    public String toString() {
        return super.toString();
    }
    /** переопределенный метод*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if(this.getMedia()!=other.getMedia())
            return false;
        if(this.getArtist()!=other.getArtist())
            return false;
        if(this.getName()!=other.getName())
            return false;
        return true;
    }
}
