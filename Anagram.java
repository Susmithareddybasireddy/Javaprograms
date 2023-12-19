package Programs;
import java.util.Arrays;
class Anagram{
    public static void main(String[] args){
        String S1="heart";
        String S2="earth";
        
        S1=S1.toLowerCase();
        S2=S2.toLowerCase();
        
        //check if length is same
        if(S1.length()==S2.length()){
            //convert strings to char array
            char[] charArr1=S1.toCharArray();
            char[] charArr2=S2.toCharArray();
            //sort the char array
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            //if sorted char arrays are same
            //then the string is anagram
            boolean result=Arrays.equals(charArr1,charArr2);
            
            if(result)
            {
                System.out.println(S1 +" "+"and" +" "+S2+" " +"are anagram.");
                
            }
            else{
                System.out.println(S1 +" "+"and" +" "+S2+" " +"are not anagram.");
            }
            
        }
        
    }
}

OUTPUT:
heart and earth are anagram.
