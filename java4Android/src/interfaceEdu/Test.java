package interfaceEdu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone Phone=new Phone();
		
		USB usb=Phone;
		
		usb.read();
		usb.write();
		
		Wifi wifi=Phone;
		wifi.open();
		wifi.close();

	}

}
