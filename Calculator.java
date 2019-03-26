//credit to cs dojo for helping me
public class Calculator{
  public static double eval(String s){
    String[] arg = s.split(" ");
    MyDeque<Double> E = new MyDeque<Double>(arg.length);
    //loops through and adds all the args to the MyDeque
    // leaves operators as strings, turns numbers into double
    for(int i = 0; i < arg.length; i++){
      if(!arg[i].equals("+") && !arg[i].equals("-") && !arg[i].equals("*") && !arg[i].equals("/") && !arg[i].equals("%")){
        E.addLast(Double.parseDouble(arg[i]));
      }
      else{
        double x = E.removeLast();
        double y = E.removeLast();
        if(arg[i].equals("+")){
          E.addLast(y + x);
        }
        if(arg[i].equals("-")){
          E.addLast(y - x);
        }
        if(arg[i].equals("*")){
          E.addLast(y * x);
        }
        if(arg[i].equals("/")){
          E.addLast( y / x);
        }
        if(arg[i].equals("%")){
          E.addLast( y % x);
        }
      }
    }


  return E.removeLast();
  //look through the deque, if it's operator, perform it on the two last numbers before said operator

  }
  public static void main(String[] args) {
    System.out.println(eval("10 2.0 +"));
    System.out.println(eval("11 3 - 4 + 2.5 *"));
    System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    System.out.println(eval("1 2 3 4 5 + * - -")) ;

  }
}public class Calculator{
  public static double eval(String s){
    String[] arg = s.split(" ");
    MyDeque<Double> E = new MyDeque<Double>(arg.length);
    //loops through and adds all the args to the MyDeque
    // leaves operators as strings, turns numbers into double
    for(int i = 0; i < arg.length; i++){
      if(!arg[i].equals("+") && !arg[i].equals("-") && !arg[i].equals("*") && !arg[i].equals("/") && !arg[i].equals("%")){
        E.addLast(Double.parseDouble(arg[i]));
      }
      else{
        double x = E.removeLast();
        double y = E.removeLast();
        if(arg[i].equals("+")){
          E.addLast(y + x);
        }
        if(arg[i].equals("-")){
          E.addLast(y - x);
        }
        if(arg[i].equals("*")){
          E.addLast(y * x);
        }
        if(arg[i].equals("/")){
          E.addLast( y / x);
        }
        if(arg[i].equals("%")){
          E.addLast( y % x);
        }
      }
    }


  return E.removeLast();
  //look through the deque, if it's operator, perform it on the two last numbers before said operator

  }
  public static void main(String[] args) {
    System.out.println(eval("10 2.0 +"));
    System.out.println(eval("11 3 - 4 + 2.5 *"));
    System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
    System.out.println(eval("1 2 3 4 5 + * - -")) ;

  }
}
