/**Данный класс определяет можем ли мы проиграть этот носитель на Виниловой вертушке
 *
 * */
public class VinylTurntable implements music_device{
    /**метод реализует интерфейс music_device и определяет принадлежность полученного носителя к классу-носителю,который
     * проигрывается на данном девайсе*/
    @Override
    public void play(Song song) {
        if (song.getMedia() instanceof vinyl_record){
            System.out.println("Проигрывается " + song.getName() + " " + song.getArtist() + " на Виниловой вертушке");}
        else{
            System.out.println("Мы не можем проиграть это на данном плейере");
        }

    }
    @Override
    /**метод реализует интерфейс music_device и возвращает тип устройства*/
    public String getDeviceType() {
        return "VinylTurntable";
    }
}
