class Buffer
{
public static void main(String args[])
{ 
StringBuffer sb=new StringBuffer("welcome");
System.out.println(sb.append("java"));
System.out.println(sb.insert(1,"Java"));
System.out.println(sb.delete(1,3));
System.out.println(sb.reverse());
System.out.println(sb.replace(2,2,"ja"));
}
}
/*//append(string)
StringBuffer sb=new StringBuffer("Hello "); 
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  

//insert(index,string)
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello 

//delete(start_index,end_index)
sb.delete(1,3);  
System.out.println(sb);//prints Hlo
  
//reverse() 
sb.reverse();  
System.out.println(sb);//prints olleH 

//length()
sb.length();  
System.out.println(sb);//prints olleH  

//replace(start_index,end_index,string)
sb.replace(1,3,"Java");  
System.out.println(sb1);//prints HJavalo*/




 