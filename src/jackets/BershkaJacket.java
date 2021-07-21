package jackets;

import jackets.IJacket;

public class BershkaJacket implements IJacket {
    @Override
    public void PutOn() {
        System.out.println ("Надета куртка Bershka");
    }

    @Override
    public void PutOff() {
        System.out.println ("Снята куртка Bershka");
    }
}
