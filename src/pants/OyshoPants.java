package pants;

public class OyshoPants implements IPants {
    @Override
    public void PutOn() {
        System.out.println ("Надеты штаны Oysho");
    }

    @Override
    public void PutOff() {
        System.out.println ("Сняты штаны Oysho");
    }
}