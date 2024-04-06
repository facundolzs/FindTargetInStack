package main;

import GUI.App;

public class Main {

    public static void main(String[] args) {

        new Main();

    }

    public Main() {
        App screen = new App();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
    }

}
