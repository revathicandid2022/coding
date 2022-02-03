import java.io.File;
import java.io.IOException;
public class FileMethod
{
public static void main(String[] args) 

{
	File f1= new File("D:\\java\\file.java");
    try {
    boolean b=f1.createNewFile();//create new empty file
	System.out.println(b);
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	if(f1.exists())
	{
		System.out.println("File Name:" +f1.getName());
		System.out.println("Absolute path:"+f1.getAbsolutePath());
		System.out.println("Readable:"+f1.canRead());
		System.out.println("writeable:"+f1.canWrite());
		System.out.println("File size in bytes:"+f1.length());
		System.out.println("create floder:"+f1.mkdir());
		System.out.println("deleting:"+f1.delete());
		}
		
	File f= new File("D:\\java");
	String[] listOfFilesFloders=f.list();//list method is display the list of files and floder
	for(String s:listOfFilesFloders)
	System.out.println(s);
    
	File[] fileFloderList=f.listFiles();//listFiles method is display the file of files or floder
	for(File f2:fileFloderList)
		//if(f2.isFile())//display the files
	      if(f2.isDirectory())//display the folder
	System.out.println(f2);
		
}
}
	
	
	/*File f1= new File("D:\\java");
	File[] file =f1.listFiles();//to print the filelist from file
	for(File f:file)
	{
		if(f.isFile())//only print the  file
		{
		String fileName=f.getName();//prine name of the file
		int lastDot = fileName.lastIndexOf(".");
		String extention=fileName.substring(lastDot+1);
		if(extention.equals("java"))//only prints .java files
		System.out.println(fileName +"Size:" + f.length());
		}
	}*/
	
	/*File f1= new File("D:\\java");
	File[] file =f1.listFiles();//to print the filelist from file
	for(File f:file)
	{
		if(f.isFile())//only print the  file
		{
		String fileName=f.getName();//prine name of the file
		int lastDot = fileName.lastIndexOf(".");
		String extention=fileName.substring(lastDot+1);//output will be .class,.java
		System.out.println(extention);
		}
	}*/
	
	/*File f1= new File("D:\\java");
	File[] file =f1.listFiles();//to print the filelist from file
	for(File f:file)
	{
		String fileName=f.getName();//prine name of the file
		int lastDot = fileName.lastIndexOf(".");
		String extention=fileName.substring(lastDot+1);//output will be .class,.java anf floder name
		System.out.println(extention);
	}*/
	
	/*File f1= new File("D:\\java");
	File[] fileFloderList=f1.listFiles();//listFiles method is display the file of files or floder
	for(File f:fileFloderList)
		//if(f.isFile())//display the files
	      if(f.isDirectory())//display the folder
	System.out.println(f);	*/
	
	
	/*File f1= new File("D:\\java");
	String[] listOfFilesFloders=f1.list();//list method is display the list of files and floder
	//for(int i=0;i<listOfFilesFloders.length;i++);
	//System.out.println(listOfFilesFloders[i]);
	for(String s:listOfFilesFloders)
	System.out.println(s);	*/

	/*File f1= new File("D:\\java\\code.java");
	try {
    boolean b=f1.createNewFile();//create new empty file
	System.out.println(b);
	}catch(IOException e) {
		e.printStackTrace();
	}
	File newName=new File ("D\\java\\coding.java");
	boolean b1=f1.renameTo(newName);//rename file like code.java to rename coding.java
	System.out.println(b1);
	System.out.println(newName.getName());//getName method is using the display the file name
	System.out.println(f1.canExecute());
	System.out.println(f1.canRead());*/
	


/*File f1= new File("D:\\java\\code.java");
//delete()
boolean b3=f1.delete();
System.out.println(b3);*/

//boolean b1=f1.createNewFile();//its reture true or false ,if true no files and already file is there that return false
//System.out.println(b1);

 /*//exists its mean file or direcotry is there or not 
File f1= new File("D:\\java\\code");
boolean b4=f1.exists();
System.out.println(b4);
if(b4==false)
//System.out.println(f1.mkdir());//create folder using mkdir
(("D:\\java\\code\\code.java")
System.out.println(f1.mkdirs());//create sub floder using mkdirs like ("D:\\java\\code.java\\program\\task")*/

/*//can read
boolean b2=f1.canRead();
System.out.println(b2);
//getName()
boolean b5=f1.getName();
System.out.println(b5);
//getAbsolutePath()
String s1=f1.getAbsolutePath();
//length()
long l1=f1.length();
//can write
boolean b=f1.canWrite();
System.out.println(b);
//delete()
//boolean b3=f1.delete();
System.out.println(b3);
//list()
String[] s2=f1.list();
//mkdir
boolean b6=f1.mkdir();*/


