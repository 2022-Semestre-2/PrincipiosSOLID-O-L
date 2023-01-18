

package principal;

import Embotelladora.Embotellador;
import Embotelladora.BotellaTeLlenar;
import Embotelladora.LlenadoBotella;
import Embotelladora.Botella;
import Embotelladora.BotellaAguaLlenar;
public class Principal {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Embotellador embotellador = new Embotellador();
        LlenadoBotella botellaTe = new BotellaTeLlenar();
        LlenadoBotella botellaAgua = new BotellaAguaLlenar();

        embotellador.setLlenadoBotella(botellaTe);
        embotellador.construirBotella();

        Botella botella = embotellador.getBotella();

        /*
        embotellador.setLlenadoBotella(botellaAgua);
        embotellador.construirBotella();

        Botella botella1 = embotellador.getBotella();

         */

        System.out.println(botella.toString());
    }
}
