package p1;

public class KYCVerification {

	private String panNumber;
	private long adharNumber;
	private String documentType;
	private String documentNumber;
	public KYCVerification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KYCVerification(String panNumber, long adharNumber, String documentType, String documentNumber) {
		super();
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	
}
