package main;

import UI.UICalculadora;

public class main {
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICalculadora().setVisible(true);
            }
        });
    }
}
