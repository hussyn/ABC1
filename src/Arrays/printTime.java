package Arrays;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class printTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long uptime = System.currentTimeMillis();

		long days = TimeUnit.MILLISECONDS.toDays(uptime);
		uptime -= TimeUnit.DAYS.toMillis(days);

		long hours = TimeUnit.MILLISECONDS.toHours(uptime);
		uptime -= TimeUnit.HOURS.toMillis(hours);
		System.out.println("hours"+uptime);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(uptime);
		uptime -= TimeUnit.MINUTES.toMillis(minutes);
		System.out.println("minutes"+uptime);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(uptime);
		System.out.println("seconds"+uptime);
		  SimpleDateFormat simpleDateFormat = 
	                new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		
		
		
		
		
		Date date=new Date();
		System.out.println(date);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat ft=new SimpleDateFormat(pattern);
		System.out.println(ft.format(date));
	}

}
