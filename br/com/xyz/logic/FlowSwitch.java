package br.com.xyz.logic;
public class FlowSwitch {
	
	public static void main(String[] args) {
		System.out.println("Flow Switch");
		
		
		char sex = 'F';
		
		switch(sex) {
			case 'M':
				System.out.println("Male");
				break;
			case 'F':
				System.out.println("Female");
				break;
			default:
				System.out.println("Other");
		}
		
		String technology = "c++";
		
		switch(technology) {
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Programming language");
				break;
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Data base");
				break;
			default:
				System.out.println("Unknown technology");
		}
	}	
	
}	