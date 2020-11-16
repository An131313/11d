package tv;

public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;
	
	public TV() {
		channel = 10;
		volumeLevel = 4;
		on = false;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public String isTvOn() {
		String isOn = on ? "The TV is on" : "The TV is off";
		return isOn;
	}
	
	public void setChannel(int newChannel) {
		if(newChannel > 0 && newChannel < 121){
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if(newVolumeLevel > 0 && newVolumeLevel < 8){
			volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp() {
		channel += 1;
	}
	
	public void channelDown() {
		channel -= 1;
	}
	
	public void volumeUp() {
		volumeLevel += 1;
	}
	
	public void volumeDown() {
		volumeLevel -= 1;
	}
}
