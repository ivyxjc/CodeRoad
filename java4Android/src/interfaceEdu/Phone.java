package interfaceEdu;

class Phone implements USB,Wifi{
	public void read(){
		System.out.println("USBPhone��д");
	}
	
	 public void write(){
		System.out.println("USBPhoneд");
	}
	
	 public void open(){
		 System.out.println("WifiOpen");
	 }
	 
	 public void close(){
		 System.out.println("WifiClose");
	 }
}
