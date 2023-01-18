
package Embotelladora;

// Clase del producto
public class Botella {
    private String liquido = "";

    public void setLiquido(String liquido){this.liquido = liquido;}

    @Override
    public String toString() {
        return "Botella{" +
                "liquido='" + liquido + '\'' +
                '}';
    }
}
