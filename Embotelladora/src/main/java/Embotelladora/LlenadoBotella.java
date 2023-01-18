/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Embotelladora;

//Constructor abstracto
public abstract class LlenadoBotella {
    protected Botella botella;

    public Botella getBotella(){
        return botella;
    }

    public void crearBotella(){
        botella = new Botella();
    }

    public abstract void llenarBotella();

    }
