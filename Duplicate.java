package Programs;
//importing the array class from the java.util.package
import java.util.Arrays;
//Define a class named Duplicate
public class Duplicate{
	//The main method where the program execution starts
    public static void main(String[] args)
    {
    	//Declare and initialize an integer arr
        int[] arr={1,2,5,5,6,6,7,2};
        //Iterate through the elemnts of the arr
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            	//check if two elemnts are equal or not
                if((arr[i] == arr[j]) && (i!=j))
                {
                	//if a duplicate is found ,print the duplicate elements
                    System.out.println("Duplicate Element: " + arr[j]);
                }
            }
        }
    }
}

OUTPUT:
Duplicate Element: 2
Duplicate Element: 5
Duplicate Element: 6