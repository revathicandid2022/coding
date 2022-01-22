public class  MathDemo
{    
    public static void main(String[] args)     
    {   int a=15;
	    int b=5;
        double x = 15;    
        double y = Math.toRadians(x);
        System.out.println("y is" + y);		
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " + Math.max(a, b));  

        // return the minimum of two numbers  
        System.out.println("Minimum number of x and y is: " + Math.min(a, b));		
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 15 power of y  
		
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the trigonometric sine of a      
        System.out.println("Sine value of a is: " +Math.sin(a));    
          
        // return the trigonometric cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cos(a));  
          
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tan(a));  
          
        // return the trigonometric arc sine of a      
        System.out.println("Sine value of a is: " +Math.asin(a));
	}
}	
 