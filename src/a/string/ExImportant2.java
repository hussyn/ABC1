package a.string;

	public class ExImportant2 {
	public static void main(String[] args) {
		Book B=new Book("Let Us C","HT301","Harsh Tomar");	
	 
		// If We Want to Print the Value Of Object We have To use toString Method In Our User Defined Class	
		System.out.println(B);
	}}
	 class book{

			private String Name;
			private String Code;
			private String Author;
			
			public Book2(String Name,String Code,String Author)
			{
				this.Name=Name;
				this.Code=Code;
				this.Author=Author;
			}
			
			// toString method 
			public String toString()
			{return ("Name :"+this.Name+"\nCode :"+this.Code+"\nAuthor :"+this.Author);}  
		}
	}