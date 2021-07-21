package com.TMS;

import jackets.IJacket;
import jackets.ZaraJacket;
import pants.IPants;
import pants.OyshoPants;
import shoes.IShoes;
import shoes.NikeShoes;

public class Main {

    public static void main(String[] args) {
        IPants OyshoPants = new OyshoPants();
        IJacket ZaraJacket = new ZaraJacket();
        IShoes NikeShoes = new NikeShoes();
        Human Yahor = new Human ("Yahor", ZaraJacket, OyshoPants, NikeShoes);
        Yahor.Name();
        Yahor.PutAllOn();
        Yahor.PutAllOff();
    }
}
