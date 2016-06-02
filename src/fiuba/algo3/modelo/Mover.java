package fiuba.algo3.modelo;

import javax.swing.*;

/**
 * Created by Julian Garate on 6/1/16.
 */
public class Mover{
    private static Mover ourInstance = new Mover();

    public static Mover getInstance() {
        return ourInstance;
    }

    private Mover() {
    }
}
