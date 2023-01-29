package clases.tarea8;

public class SmartDevice {

    String tipoPantalla;
    int nivelBateria;
    String sistemaOperativo;


    public SmartDevice()
    {

    }

    public SmartDevice(String tp,int nb, String so)
    {
        this.tipoPantalla = tp;
        this.nivelBateria = nb;
        this.sistemaOperativo = so;
    }

    public String getTipoPantalla(){
        return this.tipoPantalla;
    }

    public int getNivelBateria(){
        return this.nivelBateria;
    }

    public String getSistemaOperativo(){
        return this.sistemaOperativo;
    }


}
