package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email firstEmailObj = new Email ("John","Smith"); //first Object
		
		firstEmailObj.setAlternateEmail("johnsmith@gmail.com");
		
		//System.out.println(firstEmailObj.getMailboxCapcity());
		//System.out.println(firstEmailObj.getAlterEmail());
		
		System.out.println(firstEmailObj.showInfo());
		
		

	}

}
