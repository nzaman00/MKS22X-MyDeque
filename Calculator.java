public class Calculator{
  public static double eval(String s){
    String[] arg = s.split(" ");
    MyDeque<Object> E = new MyDeque<Object>(arg.length);
    for(int i = 0; i < arg.length; i++){
      if(!arg[i].equals("+") && !arg[i].equals("-") && !arg[i].equals("*") && !arg[i].equals("/") && !arg[i].equals("%")){
        E.addLast(Double.parseDouble(arg[i]));
      }
      else{
        E.addLast(arg[i]);
      }
    }
    System.out.println(E);

  return 1.0;
  }
  public static void main(String[] args) {
    eval("10 2.0 +");
  }
}
