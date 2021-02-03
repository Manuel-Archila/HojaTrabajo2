public class Calculadora implements CalculadoraGeneral {

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
