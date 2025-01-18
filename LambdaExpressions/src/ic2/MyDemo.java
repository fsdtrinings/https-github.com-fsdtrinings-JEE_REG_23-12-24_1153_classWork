package ic2;

interface Bluetooth
{
	public String doFileSharing(String fileName);
}
class MyNokiaPhone implements Bluetooth
{
	public void doCall() {
		doFileSharing("secure.txt");
	}

	@Override
	public String doFileSharing(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
}

class MySmartPhone 
{
	public void doCall() {}
	
	public String transferFilesViaBluetooth(Bluetooth bv4,String fileName)
	{
		bv4 = new Bluetooth() {
			
			@Override
			public String doFileSharing(String fileName) {
				// whole logic of sending file
				return "Sending "+fileName+" via Bluetooth ";
			}
		};
		String notification = bv4.doFileSharing(fileName);
		
		return notification;
	}
}


public class MyDemo {

	public static void main(String[] args) {
		
		MySmartPhone onePlus = new MySmartPhone();
		
		Bluetooth b = null;
		
		String notification = onePlus.transferFilesViaBluetooth(b, "MySongs.mpv");
		System.out.println(notification);
	}
	
}














