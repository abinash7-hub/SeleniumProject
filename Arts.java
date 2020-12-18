package polymorphism;

public class Arts extends Education {
	
	private void bsc() {
		System.out.println("course details");
	

	}
	
	private void bEd() {
		
	}
	
	private void ba() {
		

	}
	
	private void bba() {
		

	}

	@Override
	public void ug() {
		System.out.println("per year two sem");
		super.ug();
	}
	
	@Override
	public void pg() {
		System.out.println("Each sem fees 1000 ");
		super.pg();	
	}
	
	public static void main(String[] args) {
		
		Arts a = new Arts();
	a.ug();
	a.pg();
		
		
	}
	
	
	
}
