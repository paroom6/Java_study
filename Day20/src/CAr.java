
public class CAr {
	boolean poweron;
	String color;
	int wheel;
	int speed;
	boolean wiperon;
	
	void power() {poweron =! poweron;} // true->false, false->true
	void speedup() {speed++;}
	void speeddown() {speed--;}
	void wiper() {wiperon =! wiperon;}
}
