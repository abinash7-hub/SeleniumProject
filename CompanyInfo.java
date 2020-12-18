package polymorphism;

public class CompanyInfo {

	
	
	private void companyname(int num) {
		System.out.println("7676373");
	} 

	private void companyname(String name) {
		System.out.println("priya");
		
	}
	
	private void companyname(String email,long ph) {
		System.out.println("srinismart09@gmail.com");
		System.out.println("1234567890l");
	}
	
	
	
	public static void main(String[] args) {
		CompanyInfo a=new CompanyInfo();
		a.companyname(56533);
		a.companyname("srini");
		a.companyname("srinismart09@gmail.com",1234567890l);
	}
}
