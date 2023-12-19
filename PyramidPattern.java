public class PyramidPattern {
	public static void main(String[] args) {
	    int r=5;
	    int c=1;
	    for(int i=1;i<=r;i++)
	    {PyramidPattern
	        for(int j=i;j<r;j++)
	        {
	            System.out.print(" ");
	            
	        }
	        for (int k=1;k<=i;k++)
	        {
	            System.out.printf("%-3d",c);
	            c++;
	        }
	        System.out.println();
	    }
	
	}
}

OUTPUT:
    1  
   2  3  
  4  5  6  
 7  8  9  10 
11 12 13 14 15 
