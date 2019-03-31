package array;

public class ElementCount {
	
	public static void main(String[] args) {
	int [] arr = {4, 2, 4, 5, 2, 3, 1,5,3};
	//{
	for (int i = 0; i < arr.length; i++)  
    { 
        for (int j = i + 1; j < arr.length; j++)  
        { 
            int cnt = 0;
			if (arr[i] == arr[j])  
			
                System.out.print(arr[i]+ " "); 
        } 
    } 
	
	//}
}}