package com.dkraemerwork.factoryMethod;

public class KonkretesProdukt implements Produkt{

    private String abhaengigkeit;

    @Override
    public void use() {
        System.out.println("Ich bin Oracle Statement");
    }

    @Override
    public void destroy() {
        System.out.println("Ich war ein Oracle Statement");
    }


    public void setAbhaengigkeit(String abhaengigkeit) {
        this.abhaengigkeit = abhaengigkeit;
    }
}
