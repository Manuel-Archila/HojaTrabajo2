public class Calculadora implements CalculadoraGeneral {
  StackVector<Integer> stick = new StackVector<>();

  //Metodo que recibe una String con los datos del realiza una operacion
  public String Calculo(String datos){
    String[] operacion = datos.split(" ");
    String resultado = "";
    for(String dato : operacion){
      int isnum = 0;
      boolean num = false;
      try{
          isnum = Integer.parseInt(dato);
          num = true;
      }catch(Exception e){
         
      }
      if(num == true){
          stick.push(isnum);
      }else{
          int num1 = stick.pop();
          int num2 = stick.pop();
          switch (dato){
            case "+":
              resultado = String.valueOf(num1 + num2);
              System.out.println(resultado);
              break;

            case "-":
              resultado = String.valueOf(num2 -num1);
              System.out.println(resultado);
              break;
            
            case "/":
              resultado = String.valueOf(num2 / num1);
              System.out.println(resultado);
              break;

            case "*":
              resultado = String.valueOf(num1 * num2);
              System.out.println(resultado);
              break;
          }
          stick.push(Integer.parseInt(resultado));
        }
}
return resultado;
}
}
