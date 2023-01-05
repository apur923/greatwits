
public class Emp  {
private String Name;
private long phone;
private int empid;
//Overriding
@Override
public String toString() {
	return "Emp [Name=" + Name + ", phone=" + phone + ", empid=" + empid + "]";
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getPhone() {
	return phone;
}


public Emp(String name, long phone, int empid) {
	super();
	Name = name;
	this.phone = phone;
	this.empid = empid;
}
public void setPhone(long phone) {
	this.phone = phone;
}



public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}

}
