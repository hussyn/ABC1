package a.shak;
public class StringExample1 {

	public static void main(String[] args) {
		
		String firstName = "Shakir     ";
		
		String lastName = new String("   Hussain");
		
		
		/*System.out.println(firstName.toUpperCase());
		System.out.println(lastName.toLowerCase()); 
		System.out.println(firstName.length()); */
		
		//System.out.println(firstName.trim());
		
		String sent = "This  is, my, book";
		
		//String word = sent.substring(0, 3); // starts from index 0 , goes upto 3-1
		//System.out.println(word); 
		
		String words[] = sent.split("\\s");
		for(String w : words) {
			System.out.println(w); 
		}
		

	}

}
