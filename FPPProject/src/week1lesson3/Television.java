package week1lesson3;
import java.util.*;
/**
 * 
 * @author haftomtesfay
My new TV is: Apple, 55 size.
The power : Off
Trying to turn on.
It's now power: On
I want to see channel 13
Now it's channel: 2
Increasing its volume!
Now volume is: 3
Decreasing Volume!
Now volume is: 1
 */
public class Television {
	
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	
	private boolean powerOn;
	private int channel;
	private int volume;
	
	Television(String brand, int size) // Parameterized constructor
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		volume = 0;
		channel = 1;
		powerOn = false;
	}
	
	
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}


	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}

	public void power()
	{
		powerOn = !powerOn;
	}

	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void increaseVolume()
	{
		this.volume++;
	}
	
	public void decreaseVolume()
	{
		this.volume--;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television newTV = new Television("Apple",55);
		
		System.out.printf("My new TV is: %s, %d size.\n",newTV.getMANUFACTURER(),newTV.getSCREEN_SIZE());
		System.out.println("The power : " +(newTV.powerOn ? "On":"Off"));
		System.out.println("Trying to turn on.");
		newTV.power();
		System.out.println("It's now power: " +(newTV.powerOn ? "On":"Off"));
		System.out.println("I want to see channel 13");
		newTV.setChannel(2);
		System.out.println("Now it's channel: " + newTV.getChannel());
		System.out.println("Increasing its volume!");
		newTV.increaseVolume();
		newTV.increaseVolume();
		newTV.increaseVolume();
		System.out.println("Now volume is: " + newTV.getVolume());
		System.out.println("Decreasing Volume!");
		newTV.decreaseVolume();
		newTV.decreaseVolume();
		
		System.out.println("Now volume is: " + newTV.getVolume());
	}

}