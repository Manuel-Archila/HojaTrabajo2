import java.util.Vector;
public class StackVector<T> implements Stack<T>{
  public Vector<T> vector;

  public StackVector(){
    vector = new Vector<T>();
  }


  public void Push(T num){
    vector.add(num);
  }

  public T Pop(){
    T last = vector.lastElement();
    vector.remove(vector.lastElement());
    return last;
  }

  public boolean Empty(){
    return vector.isEmpty();
  }

  public int size(){
    return vector.size();

  }

  public T Peek(){
    T ojo = vector.get(0);
    return ojo;

  }
  
}
