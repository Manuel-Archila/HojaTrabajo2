public class Calculadora implements CalculadoraGeneral {

  //Metodo que recibe una String con los datos del realiza una operacion
  public String Calculo(String datos){
    String[] operacion = datos.split(",");
    int operando1 = Integer.parseInt(operacion[0]);
    int operando2 = Integer.parseInt(operacion[2]);

    String resultado = "";
    switch (operacion[1]){
      case "+":
        resultado = String.valueOf(operando1 + operando2);
        break;

      case "-":
        resultado = String.valueOf(operando1 - operando2);
        break;
      
      case "/":
        resultado = String.valueOf(operando1 * operando2);
        break;

      case "*":
        resultado = String.valueOf(operando1 / operando2);
        break;

    }
    return resultado;
  }
  
}
