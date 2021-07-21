package jackets;

import jackets.IJacket;

public class ZaraJacket implements IJacket {
    @Override
    public void PutOn() {
        System.out.println ("Надета куртка Zara");
    }

    @Override
    public void PutOff() {
        System.out.println ("Снята куртка Zara");
    }
}
