# inmotion

InMotion Logic Test

1. Given string array of {"z", "d", "a", "b"}. Please provide a function to sort above array in alphabetical order
2. Please write a function to find the first recurring character in a given string. For example:
   "BCABA" -> the first recurring character is B
   "ABCA" -> the first recurring character is A
3. You are given an integer. Print the factorial of this number.
   N! = N x (N-1) x (N-2) x ... x 3 x 2 x 1
   Input
   Input consists of a single integer N , where 1 <= N <= 100
   Output
   Print the factorial of N.
   Example :
   For an input of 25 , you would print 15511210043330985984000000
4. Source Code:
   int[] a = {1,2,3,4,5,6};
   int I = a.length – 1;
   while (I >= 0) {
      System.out.println(a[i]);
      i--;
   }
   What will be the output of above code?
5. In this problem we have givern you three classes in the editer:
   - Student class
   - Rockstar class
   - Hacker class
   
   In the main method we populated an ArrayList with several instances of these classes. 
   Count method calculates how many instances of each type is present in the ArrayList. 
   The code prints three integers, the number of instance of Student class,the number of instance of Rockstar class, the number of instance of Hacker class. 
   But some lines of the code are missing, and you have to fix it by modifying only lines! Don't add, delete or modify any extra line.
   Below is the source code you have to fix

   import java.util.*;
   class Student{}
   class Rockstar{ }
   class Hacker{}
   public class JavaTest{
      static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
          Object element=mylist.get(i);
          if(~~Complete this line~~)
          a++;
          if(~~Complete this line~~)
          b++;
          if(~~Complete this line~~)
          c++;
      }
   
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
       ArrayList mylist = new ArrayList();
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0; i<t; i++){
          String s=sc.next();
          if(s.equals("Student"))mylist.add(new Student());
          if(s.equals("Rockstar"))mylist.add(new Rockstar());
          if(s.equals("Hacker"))mylist.add(new Hacker());
       }
      System.out.println(count(mylist));
      }
    }
