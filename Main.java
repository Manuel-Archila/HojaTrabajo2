import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int resultado = 0;
        String datos = "";
        try {
            Scanner entrada = new Scanner(new File("datos.txt"));
            while (entrada.hasNextLine()) {
                datos += entrada.nextLine();
                System.out.println(datos);
            }
            entrada.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String[] operacion = datos.split(" ");
        StackVector<Integer> operation = new StackVector<>();

        String calcular = 
        for(String dato : operacion){
            int isnum = 0;
            try{
                isnum = Integer.parseInt(dato);
                operation.Push(isnum);
            }catch(Exception e){
                int num1 = operation.Pop();
                int num2 = operation.Pop();

            }
        }





    }
}
