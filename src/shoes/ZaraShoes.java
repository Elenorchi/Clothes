package shoes;

public class ZaraShoes implements IShoes{
    @Override
    public void PutOn() {
        System.out.println ("Надета обувь Zara");
    }

    @Override
    public void PutOff() {
        System.out.println ("Снята обувь Zara");
    }
}