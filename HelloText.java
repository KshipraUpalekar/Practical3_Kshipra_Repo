public class HelloTest { 
  public static void main(String[] args) { 
    if (Hello.isPositive(5)) { 
        System.out.println("Test passed: 5 is positive"); 
      } else { 
        System.out.println("Test failed!"); 
      } 
      if (!Hello.isPositive(-3)) { 
        System.out.println("Test passed: 3 is not positive"); 
      } else { 
        System.out.println("Test failed!"); 
      } 
    } 
}
