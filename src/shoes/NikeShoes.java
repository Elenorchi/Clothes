package shoes;

public class NikeShoes implements IShoes{
    @Override
    public void PutOn() {
        System.out.println ("Надета обувь Nike");
    }

    @Override
    public void PutOff() {
        System.out.println ("Снята обувь Nike");
    }
}