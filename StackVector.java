import java.util.Vector;
public class StackVector<T> implements Stack<T>{
  public Vector<T> vector;

  public StackVector(){
    vector = new Vector<T>();
  }


  public void push(T num){
    vector.add(num);
  }

  public T pop(){
    T last = vector.lastElement();
    vector.remove(vector.lastElement());
    return last;
  }

  public boolean empty(){
    return vector.isEmpty();
  }

  public int size(){
    return vector.size();

  }

  public T peek(){
    T ojo = vector.get(0);
    return ojo;
  }
  
}
