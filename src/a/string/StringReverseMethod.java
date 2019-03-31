package a.string;

public class StringReverseMethod {

	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
    }


	public static void main(String[] args) {
		reverse("sajjad");
		System.out.println(reverse("sajjad"));
		//System.out.println("original String : %s ,reversed String %s %n\", +word +"" +reverse);              
	}

}
