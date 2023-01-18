package Embotelladora;

public class Embotellador {
    private LlenadoBotella llenadoBotella;

    public void setLlenadoBotella(LlenadoBotella lb){
        llenadoBotella = lb;
    }

    public Botella getBotella(){
        return llenadoBotella.getBotella();
    }

    public void construirBotella(){

        llenadoBotella.crearBotella();
        llenadoBotella.llenarBotella();

    }

}
