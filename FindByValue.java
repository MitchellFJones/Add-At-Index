import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindByValue {
    
     
    public static int NewNumber(){
        
        System.out.println("Enter a new number");
        
        Scanner in = new Scanner (System.in);
        
        int input = in.nextInt();
        
        return input;
    }
    
    public static int IndexNumber(){
        
        System.out.println("What value would you like to search for");
        
        Scanner in = new Scanner (System.in);
        
        int input = in.nextInt();
        
        return input;
    }


    public static void main(String[] args) {
        
    System.out.println("Enter comma-separated numbers");
       
    Scanner in = new Scanner(System.in);
    
    String input = in.nextLine();
        
    String[] numberStrs = input.split(",");
    
    int[] numbers = new int[numberStrs.length];
    
    for(int i = 0;i < numberStrs.length;i++)
            numbers[i] = Integer.parseInt(numberStrs[i]);
            
    System.out.println("Your array is " + Arrays.toString(numbers));
    
    List<Integer> numbersLst = new ArrayList<Integer>();
    for (int i : numbers)
{
    numbersLst.add(i);
}
    
    //int newNumber = NewNumber();
    
    int indexNumber = IndexNumber();
    
    boolean listContain = numbersLst.contains(indexNumber);
    
    if(listContain == true)
    	 System.out.println(indexNumber + " is at position " + numbersLst.indexOf(indexNumber) + " in the array");

    
    
   
    
    }
    
   
}
