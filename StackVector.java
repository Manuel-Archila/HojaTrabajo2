import java.util.Vector;
public class StackVector<T> implements Stack<T>{
  public Vector<T> vector;

  public StackVector(){
    vector = new Vector<T>();
  }

  //Metodo que recibe un dato y lo inserta dentro del stack
  public void push(T num){
    vector.add(num);
  }

  //Metodo que selecciona el ultimo elemento del stack y lo devuelve
  public T pop(){
    T last = vector.lastElement();
    vector.remove(vector.lastElement());
    return last;
  }

  //Verifica si el vector esta vacio o no
  public boolean empty(){
    return vector.isEmpty();
  }

  //Metodo que devuelve el tamano del stack
  public int size(){
    return vector.size();

  }

  //Metodo que muestra el primero elemento dentro del Stack
  public T peek(){
    T ojo = vector.get(0);
    return ojo;
  }
  
}
