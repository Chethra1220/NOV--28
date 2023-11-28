package demo;

public class rev {
	
	public static void main(String[] args) {

		String name= "Welocme";
		String rev_name="";
		for (int i = name.length()-1; i>=0; i--) {
			
			rev_name= rev_name+name.charAt(i);
			
			
		}
		System.out.println("the reverse of the name is :"+rev_name);
	}	
	
}