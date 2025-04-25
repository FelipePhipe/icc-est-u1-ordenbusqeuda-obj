package views;

import models.Persona;

public class ViewConsole {

    public static void printArray(Persona[] personas){
        for (Persona p: personas)
        System.out.println(p);
        System.out.println();
    }
    
    
}
