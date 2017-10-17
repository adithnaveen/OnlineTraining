package com.mycompany.day5;

class Device{
	private int deviceId;
	private String deviceName;
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public String toString() {
		return this.deviceId +", " + this.deviceName;
	}
	@Override
	protected void finalize() throws Throwable {
		// we have have purging of code here 
		System.out.println("Hey i'm Finalize in Device");
	}
}



public class ObjectTesting {
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
		
		Device d = new Device();
		d.setDeviceId(101);
		d.setDeviceName("Computer");
		
		
		System.out.println(d);   // -> System.out.println(d.toString());
		
		String s = "hi";
		System.out.println(s);   // -> System.out.println(s.toString());
 		
		
		Runtime.getRuntime().gc();
		
	}
}
