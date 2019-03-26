public class Calculator{
  public static double eval(String s){
    String[] arg = s.split(" ");
    MyDeque<Object> E = new MyDeque<Object>(arg.length);
    //loops through and adds all the args to the MyDeque
    // leaves operators as strings, turns numbers into double
    for(int i = 0; i < arg.length; i++){
      if(!arg[i].equals("+") && !arg[i].equals("-") && !arg[i].equals("*") && !arg[i].equals("/") && !arg[i].equals("%")){
        E.addLast(Double.parseDouble(arg[i]));
      }
      else{
        E.addLast(arg[i]);
      }
    }
    //System.out.println(E);

  return 1.0;
  //look through the deque, if it's operator, perform it on the two last numbers before said operator
  
  }
  public static void main(String[] args) {
    eval("10 2.0 +");
    eval("11 3 - 4 + 2.5 *");
    eval("8 2 + 99 9 - * 2 + 9 -");
    eval("1 2 3 4 5 + * - -") ;

  }
}
