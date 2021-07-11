package controller;

import view.Mainframe;

public class Application {

    private static Mainframe mainframe;

    /**
     * Main method to start the application.
     * @param args
     */
    public static void main(String[] args) {
        mainframe = new Mainframe();
    }
}
