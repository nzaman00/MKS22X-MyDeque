import java.util.*;
import java.io.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "{";
    int index = start;
    for (int i = 0; i < size; i++){
      output += data[index % data.length] + " ";
      index++;
    }
    return output + "}";
  }
  
  public void addFirst(E element){
    if (element == null) throw new NullPointerException("exception from addFirst");
    if (size == data.length) resize();
    if (size != 0){
      if (start == 0) start = data.length - 1;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException("exception from addLast");
    if (size == data.length) resize();
    if (size != 0){
      if (end == data.length - 1) end = 0;
      else end++;
    }
    data[end] = element;
    size++;
  }
  
}
