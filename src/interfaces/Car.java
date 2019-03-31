package interfaces;

public class Car implements Vehical{
 int speed=0;
 int gear=1;
 
	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		gear=newValue;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
	}

	@Override
	public void breakApp(int decrement) {
		// TODO Auto-generated method stub
		speed=speed+decrement;
	}
	
	 void printStates() {
         System.out.println(" speed:" + speed + " gear:" + gear);

}
	 }
