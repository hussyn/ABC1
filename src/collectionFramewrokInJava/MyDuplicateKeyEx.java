package collectionFramewrokInJava;

import java.util.HashMap;
//How to eliminate duplicate user defined objects as a key from HashMap?
public class MyDuplicateKeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("TV","samsung");
		hm.put("Car","honda city");
		hm.put("Byke","hero Honda");
		hm.put("bus","hero Honda");
		System.out.println(hm);
		

}
}