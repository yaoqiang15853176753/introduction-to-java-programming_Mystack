public class  Mystack  {
private java.util.ArrayList list = new java.util.ArrayList  ();
     public boolean isEmpty(){
       return list.isEmpty();
        }
public int getSize() {
       return list.size();
        }
public Object peek() {
        return list.get(getSize()-1);
       }
public Object pop(){
      Object o= list.get(getSize()-1);
      list.remove(getSize()-1);
      return o;
       }
public void push ( Object o ){
      list.add(o);
      }
public int search (Object o){
      return list.lastIndexOf(o);
     }
public String toString(){
   return "stack:" + list.toString();
   }



public static void main (String [] args ){
    Mystack mystack = new Mystack ();
      mystack.push("1");
      mystack.push("2");
      mystack.push("3");
      System.out.println(mystack.peek());
}
}
