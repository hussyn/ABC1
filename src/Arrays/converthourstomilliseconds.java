package Arrays;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class converthourstomilliseconds {
	public static void main(String[] args) {

		
		int hour = 01, minute = 50; 
		long millisecond = TimeUnit.SECONDS.toMillis(TimeUnit.HOURS.toSeconds(hour) + TimeUnit.MINUTES.toSeconds(minute));
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss"); 
		Date date = new Date(millisecond);
		String returnFormat = formatter.format(date); //Final Result.
		
		System.out.println(returnFormat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        long hours;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter hours:");
        hours = in.nextInt();
        long minutes = hours * 60;
        long seconds = hours * 60 * 60;
        long milliseconds = hours * 60 * 60 *1000;
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
        System.out.println(milliseconds + " Milliseconds");
    }
}
