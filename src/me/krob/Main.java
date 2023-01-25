package me.krob;

public class Main {

    public Main() {

        BasicMenu basicMenu = new BasicMenu(this);
        basicMenu.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
