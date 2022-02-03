import java.util.ArrayList;
public class ArrayListDemo
{
public static void main(String[] args)
{
/*ArrayList is resizable
data structure-growable array
class-package,constructor,methods,variables*/


ArrayList al=new ArrayList();
//appdent the add end of the element
al.add(3);
al.add(5);
al.add(1);
al.add("suriyan");
al.add(true);
//add (index,string)
al.add(3,"nila");
System.out.println(al);
System.out.println(al.add(90));//return data type boolean  so output will be true or false
System.out.println(al.size());
System.out.println(al.contains("vennila"));
System.out.println(al.get(0));//will returns the element present in particular index&will not remove the particular element from the arralist
System.out.println(al.remove(5));//will returns the element present in particular index&will remove the particular element from the arralist
System.out.println(al.set(3,"sun"));//set the index of 3rd position to replace to sun
System.out.println(al.indexOf("sun"));
System.out.println(al.lastIndexOf("True"));

System.out.println(al);
ArrayList al2=new ArrayList();
al2.addAll(al);
System.out.println(al2);

ArrayList al3=new ArrayList();
//appdent the add end of the element
al3.add("dog");
al3.add("cat");
al3.add("parraot");
System.out.println(al3);
System.out.println(al3.addAll(1,al));
System.out.println(al3);
}
}

