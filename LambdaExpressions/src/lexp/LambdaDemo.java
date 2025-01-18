package lexp;

interface Bluetooth
{
	public String doFileSharing(String fileName);
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
		
		Bluetooth b2 = (fileName2)->{
			return fileName2+"sending";
		};
		
		String sendingViaLambda = b2.doFileSharing("test.txt");
		
		
		
		String notification = b2.doFileSharing(fileName);
		
		return notification;
	}
}

public class LambdaDemo {

}
