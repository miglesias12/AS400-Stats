package Databases;


public class MainClass {

	public static void main(String[] args) {
		
		//Create new AS400SQL Object 
		AS400SQL SQL400 = new AS400SQL();
		
		SQL400.AS400SQLCon();
		SQL400.SQLstmt = "SELECT * FROM TF_LOAD";
		SQL400.AS400SQLexec();
		

	}

}
