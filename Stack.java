public interface Stack<T> {

  //Metodo que recibe un dato y lo inserta dentro del stack
  public void push(T num);

  //Metodo que selecciona el ultimo elemento del stack y lo devuelve
  public T pop();

  //Verifica si el vector esta vacio o no
  public boolean empty();

  //Metodo que devuelve el tamano del stack
  public int size();

  //Metodo que muestra el primero elemento dentro del Stack
  public T peek();
  
}
