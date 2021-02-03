import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculadora calculator = new Calculadora();
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

        String calcular = "";
        for(String dato : operacion){
            int isnum = 0;
            try{
                isnum = Integer.parseInt(dato);
                operation.Push(isnum);
                System.out.println(isnum);
            }catch(Exception e){
                int num1 = operation.Pop();
                int num2 = operation.Pop();
                calcular = num1 + "," + dato + "," + num2;
                String result = calculator.Calculo(calcular);
                int resulta = Integer.parseInt(result);
                operation.Push(resulta);
            }
        }
        System.out.println(operation.Peek());
    }
}
