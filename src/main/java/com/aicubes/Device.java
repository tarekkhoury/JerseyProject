package com.aicubes;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement
public class Device {

	@XmlElement(name = "Device-Name", required = true)
	private String deviceType;	
	
	@XmlElement(name = "Device-Type", required = true)
	private String deviceName;	

	// constructor
	public Device() {
		deviceName = "device1";
		deviceType = "arduino uno";
	}
	
	public Device(final String name, final String type) {
		this.deviceName = name;
		this.deviceType = type;
	}
	
	

	
	public String getDeviceName() {
		
		return this.deviceName;
	}
	
	
	public  void setDeviceName(String deviceName) {
		this.deviceName =deviceName;
		
	}
	
	
	public String getDeviceType() {
		
		return this.deviceType;
	}
	
	
	public  void setDeviceTyp(String deviceType) {
		this.deviceType =deviceType;
		
	}
	
	
	
}
