package assignment;

public class SchoolRecords {
	
	String SchoolId;
	String SchoolAddress;
	String SchoolName;
	
	void ddRecords(String Id,String Name,String Address)
	{
		System.out.println("Adding all records");
		System.out.println(Id+Name+Address);
		System.out.println("Records added");
	}
	
	void disRecords(String Name,String Address,String Id) {
		System.out.println("School Name: "+Name);
		System.out.println("School Id: "+Id);
		System.out.println("School Address: "+Address);
	}
}
