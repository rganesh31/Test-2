package org.phone;

public class PhoneInfo {
	
	public void phoneImei() {
		System.out.println("Phone IMEI no: 123456");
	}
	
	public void phoneName() {
		System.out.println("Phone Name is iPhone");
	}
	
	public void camera() {
		System.out.println("Camera: Triple Lens");
	}
	
	public void storage() {
		System.out.println("Storage: 256 GB");
	}
	
	public void phoneOS() {
		System.out.println("OS: iOS");
	}
	
	public static void main (String[] arg) {
		PhoneInfo p=new PhoneInfo ();
		p.phoneName();
		p.phoneImei();
		p.phoneOS();
		p.camera();
		p.storage();
	}

}
