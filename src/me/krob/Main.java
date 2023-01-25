package me.krob;

public class Main {

    private final BasicMenu basicMenu;

    public Main() {
        this.basicMenu = new BasicMenu(this);
    }

    public static void main(String[] args) {
        new Main();
    }
}
