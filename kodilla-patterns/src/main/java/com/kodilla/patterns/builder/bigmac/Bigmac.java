package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final String souce;
    private List<String> ingredients;

    public static class BigmacBuilder{
        private Bun bun;
        private int burgers;
        private String souce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun){
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder souce(String souce){
            this.souce= souce;
            return this;
        }
        public BigmacBuilder addIngredient(String ingredient){
            this.ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun,burgers,souce,ingredients);
        }
    }

    private Bigmac(Bun bun, int burgers, String souce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.souce = souce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSouce() {
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", souce='" + souce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
