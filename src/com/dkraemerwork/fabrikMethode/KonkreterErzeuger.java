package com.dkraemerwork.fabrikMethode;

public class KonkreterErzeuger implements Erzeuger {

    public Produkt fabrikmethode() {
        Produkt produkt = new KonkretesProdukt();
        produkt.setAbhaengigkeit("Oracle Database");

        return produkt;
    }

    public void eineOperation(){

    }
}
