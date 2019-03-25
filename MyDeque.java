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
    if (element == null) throw new NullPointerException("error in addFirst");
    if (size == data.length) resize();
    if (size != 0){
      if (start == 0) start = data.length - 1;
      else start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException("error in addLast");
    if (size == data.length) resize();
    if (size != 0){
      if (end == data.length - 1) end = 0;
      else end++;
    }
    data[end] = element;
    size++;
  }

  public E removeFirst(){
    if (size() == 0) throw new NoSuchElementException("error in removeFirst");
    E temp = data[start];
    data[start] = null;
    if (size != 1){
      if (start == data.length - 1) start = 0;
      else start++;
    }
    size--;
    return temp;
  }

  public E removeLast(){
    if (size() == 0) throw new NoSuchElementException("error in removeLast");
    E temp = data[end];
    data[end] = null;
    if (size != 1){
      if (end == 0) end = data.length - 1;
      else end--;
    }
    size--;
    return temp;
  }

  public E getFirst(){
    if (size() == 0) throw new NoSuchElementException("error in getFirst");
    return data[start];
  }

  public E getLast(){
    if (size() == 0) throw new NoSuchElementException("error in getLast");
    return data[end];
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    E[] temp = (E[]) new Object[size() * 2 + 1];
    int index = start;
    for (int i = 0; i < size; i++){
      temp[i] = data[index % data.length];
      index++;
    }
    start = 0;
    end = size - 1;
    data = temp;
  }
}
