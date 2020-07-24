package examples;


public class Student extends Person {
	 
	public void setName(String s)
	{
		this.name=s;
	}
	public  void setAge(int age)
	{
		this.age=age;
	}
	public void setCollegeName(String clgName)
	{
		this.collegeName=clgName;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void getDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("College Name: "+this.collegeName);
		System.out.println("City: "+this.city);
	}

	public static void main(String[] args) {
		 Student s=new Student();
		 s.setName("abc");
		 s.setAge(22);
		 s.setCollegeName("GPREC");
		 s.setCity("Kurnool");
		 s.getDetails();

	}

}

