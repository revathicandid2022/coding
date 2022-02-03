import java.util.LinkedList;

class LinkedListMethod
{
public static void main(String[] args)
{
LinkedList <String> colour=new LinkedList <String>();
colour.add("blue");
colour.add("Navy blue");
colour.add("Red");
colour.add("black");
System.out.println(colour);
//Adding an element at the specified  position in the LinkedList
colour.add(1,"pink");
System.out.println(colour);
//adding an element at ther beginning of the LinkedList
colour.addFirst("gold");
System.out.println(colour);
//adding an element at the end of the LinkedList
colour.addLast("Yellow");
System.out.println(colour);
//Getting the first element in the LinkedList using getFirst()
System.out.println(colour.getFirst());
//Getting the last element in the LinkedList using getLast()
System.out.println(colour.getLast());
//Getting the element at a given position in the LinkedList
System.out.println(colour.get(1));
//Remove the first element in the LinkedList
System.out.println(colour.removeFirst());
//Remove the Last element in the LinkedList
System.out.println(colour.removeLast());
//To clear the LinkedList completely
colour.clear();
System.out.print(colour);
}
}

