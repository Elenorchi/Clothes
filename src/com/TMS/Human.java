package com.TMS;

import jackets.IJacket;
import pants.IPants;
import shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }
    public void Name () {
        System.out.println ("Человека зовут "+name);
    }
        public void PutAllOn() {
        jacket.PutOn();
        pants.PutOn();
        shoes.PutOn();
    }

    public void PutAllOff() {
        jacket.PutOff();
        pants.PutOff();
        shoes.PutOff();

    }
}
