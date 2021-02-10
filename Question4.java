package Assignment3;

 class Customer1
{
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress;
	public Customer1()
	{
		super();
		customerName="John";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public String getCutomerDetails()
	{
		return("customer :"+customerName+"\nResidential Adress:"+residentialAddress+"\nOfficial Address:"+officialAddress);
	}
	public Customer1(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
		
	
}

public class Question4 {

	public static void main(String[] args) {
		Customer1 c = new Customer1("John",new Address("1st Main Hsr Layout","Bangalore"),new Address("1st Main Electronics city","Bangalore"));
		System.out.println(c.getCutomerDetails());

	}

}
