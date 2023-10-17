/**класс для работы с носителем */
abstract class Media implements music_device{
    String medtype;
    public String getMedtype(){
        return medtype;
    }
    public void play(Song song) {
        if (song.getMedia().equals(medtype)){
            System.out.println("Проигрывается" + song.getName() + " " + song.getArtist() + getMedtype());}
        else{
            System.out.println("Мы не можем проиграть это ");
        }

    }
}

