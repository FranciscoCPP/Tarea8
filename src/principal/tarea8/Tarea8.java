package principal.tarea8;

import clases.tarea8.SmartDevice;
import clases.tarea8.SmartPhone;
import clases.tarea8.SmartWatch;

public class Tarea8 {

    public static void main(String[] args) {



        SmartPhone celular = new SmartPhone("TFT",100,"Android 8.0");

        System.out.println(celular.getNivelBateria());
        System.out.println(celular.getTipoPantalla());
        System.out.println(celular.getSistemaOperativo());


        SmartWatch reloj = new SmartWatch("TFT",80,"Android 11");


        System.out.println(reloj.getNivelBateria());
        System.out.println(reloj.getTipoPantalla());
        System.out.println(reloj.getSistemaOperativo());

        SmartDevice aparato = new SmartDevice("OLED",90,"Android 100");

        System.out.println(aparato.getNivelBateria());
        System.out.println(aparato.getTipoPantalla());
        System.out.println(aparato.getSistemaOperativo());

        
    }
}
