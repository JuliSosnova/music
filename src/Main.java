import java.util.Scanner;

public class Main {
    /** Тест-драйв работы программы
     * */
    public static void main(String[] args) {
        Song cd_disk=new Song("Спам","Дайте танк(!)",new CD());
        CD_player testCD=new CD_player();
        testCD.play(cd_disk);
        Song vinyl=new Song("Ария","Точка невозврата",new vinyl_record());
        VinylTurntable testvinyl=new VinylTurntable();
        testvinyl.play(vinyl);
        Song cd_disk2=new Song("АнимациЯ","Ошибки",new vinyl_record());
        CD_player testCD2=new CD_player();
        testCD2.play(cd_disk2);
    }
}