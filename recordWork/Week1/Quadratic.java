Aim : Write a JAVA program that display the roots of a quadratic equation ax^2+bx = 0. 
      Calculate the disciminate D and basing on value D,describe the nature of root.

Description : 
  To find the roots of the quadratic equation ax^2+bx=0:
  1. Factor out x: Rewrite the equation as x(ax+b)=0.
  2. set the factor to zero :
    > x = 0
    > ax + b = 0
  3. solve for x :
    > The first root is x = 0
    > For the second root,solve ax + b = 0 to get x = -b/a, assuming a != 0
  so the roots are x = 0 and x = -b/a

Program : 
  import java.util.*;
  class Quadratic {
  	public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a : ");
  		double a = sc.nextDouble();
      System.out.print("Enter the value of b : ");
  		double b = sc.nextDouble();
  		double res1 = 0.0;
  		double res2 = (-b) / a;
  		double D = b * b;
  		
  		System.out.println(res1);
  		System.out.println(res2);
  		
  		if(D > 0) {
  			System.out.println("Roots are Real and Distinct");
  		} else if(D == 0) {
  			System.out.println("Roots are Real and Equal");
  		} else {
  			System.out.println("Imaginary");
  		}
  	}
  }

output : 
Test case 1 :
  Enter the value of a : 2 
  Enter the value of b : 5
  0.0
  -2.5
  Roots are Real and Distinct
