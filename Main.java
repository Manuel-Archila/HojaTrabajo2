import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculadora calculator = new Calculadora();
        String datos = "";
        try {
            Scanner entrada = new Scanner(new File("datos.txt"));
            while (entrada.hasNextLine()) {
                datos = entrada.nextLine();
                String resulta = calculator.Calculo(datos);
                System.out.println("El resultado de la operacion es " + resulta);
            }
            entrada.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
