public class  StringMethod
{  
    public static void main(String[] args)
	{      
        String s1 = "positive thinking";  
        String s2 = "smile";  
		String s3 = "smile";
		String s4 = "veje";
		String s5 = " I like nature and babys ";
		//charAt
		System.out.println(s1.charAt(5));
		// Concatenating one string   
        System.out.println(s1.concat(s2)); 
		//StartsWith &endsWith
		System.out.println(s1.startsWith("positive"));  // true  
        System.out.println(s1.startsWith("Positive"));   // false as 'p' and 'P' are different   
        System.out.println(s1.endsWith("thinking"));  // true
        //Equals string method
		System.out.println(s2.equals(s3));//true because content and case is same  
        System.out.println(s1.equals(s2));//false because case is not same
		//indexOf &lastIndexOf method
		System.out.println(s1.indexOf('s'));//find the indexof the first occurrance of a char in the string
		System.out.println(s1.indexOf('i',10));//its 10 place is h and then search i,i'th place is 11
		System.out.println(s1.lastIndexOf('n'));//find the lastIndexof the last occurrance of a char in the string
		System.out.println(s1.lastIndexOf('n',10));//its 10 place is h and then search n from last,no anyother n so print -1
		//length
		System.out.println(s5.length());
        //Replace &Replaceall
        System.out.println(s4.replace('e', 'i'));
        String replaceString=s5.replaceAll("like","love");//replaces all occurrences of "like" to "love"  
        System.out.println(replaceString);  
	    //toUppercase & tolowercase
		System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
		//trim
		System.out.println(s5);
        System.out.println(s5.trim());
		//Substring method
		System.out.println(s5.substring(3));//returns like nature and babys(cut 3 character string to end)
	    System.out.println(s5.substring(3,7));//returns like(startindex 3 to endindex 7 between characters)
		//split
		String[] s6  = s1.split("\s");
        for (String str : s6)
	    {
        System.out.println(str);
	    }
		

		
		}
		}
		
		

       
	   
	   