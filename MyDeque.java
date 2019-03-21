public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[]) new Object [10];
    size = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[]) new Object [initialCapacity];
    size = 0;
  }
  public int size(){
    return size;
    }
  //public String toString(){ }
  //public void addFirst(E element){ }
  //public void addLast(E element){ }
  //public E removeFirst(E element){ }
  //public E removeLast(E element){ }
  //public E getFirst(E element){ }
  //public E getLast(E element){ }
}
