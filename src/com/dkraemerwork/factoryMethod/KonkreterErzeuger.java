package com.dkraemerwork.factoryMethod;

public class KonkreterErzeuger implements Erzeuger {

    public Produkt erstelleProdukt(String url) {
        Produkt produkt = new KonkretesProdukt();
        produkt.setAbhaengigkeit("Oracle Database");

        return produkt;
    }
}
