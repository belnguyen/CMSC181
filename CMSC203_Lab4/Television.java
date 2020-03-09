/**
*The purpose of this class is to model a television
*Programmer: Belinda Nguyen 
*/

public class Television {

//declare variables
	 final String MANUFACTURER;
	 int SCREEN_SIZE;
	 boolean powerON;
	 int channel, volume;


	//create constructors
public Television (String brand , int size ) {
	MANUFACTURER = brand;
	SCREEN_SIZE = size;
	powerON = false;
	volume =20;
	channel = 2;
}



public void setChannel(int station) {
	channel = station;	
}

public void power() {
	powerON = !powerON;
}

public void decreaseVolume()
{
	volume --;
}

public void increaseVolume() {
	volume ++;	
}

public int getChannel() {
	return channel;
}

public int getVolume() {
	return volume;	
}

public String getManufacturer() {
	return MANUFACTURER;
}

public int getScreenSize() {
	return SCREEN_SIZE;
}
}