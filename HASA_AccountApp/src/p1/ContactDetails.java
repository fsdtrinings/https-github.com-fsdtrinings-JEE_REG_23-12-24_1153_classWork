package p1;

public class ContactDetails {
	
	private String fullAddress;
	private String email;
	private long mobileNumber;
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(String fullAddress, String email, long mobileNumber) {
		super();
		this.fullAddress = fullAddress;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
