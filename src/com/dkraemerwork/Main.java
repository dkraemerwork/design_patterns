package com.dkraemerwork;

import com.dkraemerwork.fabrikMethode.KonkreterErzeuger;
import com.dkraemerwork.fabrikMethode.Produkt;
import com.dkraemerwork.singleton.Logger;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        KonkreterErzeuger konkreterErzeuger = new KonkreterErzeuger();

        Produkt produkt = konkreterErzeuger.erstelleProdukt("https://test:apfel");
        produkt.use();
        produkt.destroy();


        Logger logger = Logger.getInstance();

        logger.log("Deine Mutter");

    }
}
