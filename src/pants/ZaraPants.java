package pants;

public class ZaraPants implements IPants {
    @Override
    public void PutOn() {
        System.out.println ("Надеты штаны Zara");
    }

    @Override
    public void PutOff() {
        System.out.println ("Сняты штаны Zara");
    }
}
