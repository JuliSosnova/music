public class CD_player implements music_device {
    /**метод реализует интерфейс music_device и определяет принадлежность полученного носителя к классу-носителю,который
     * проигрывается на данном девайсе*/
    @Override
    public void play(Song song) {
        if (song.getMedia() instanceof CD){
            System.out.println("Проигрывается " + song.getName() + " " + song.getArtist() + " на CD player");}
        else{
                System.out.println("Мы не можем проиграть это на данном плейере");
        }

    }
    @Override
    public String getDeviceType() {
        return "CD player";
    }
}
