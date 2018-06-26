package visam.com.ImmutableObject;

final public class ImmutableExample {
	    final private int empid;
	    final private int age;
	    final private String name;
	    final private String address;
	    public ImmutableExample(int empid, int age,String name,String address) {
        this.empid = empid;
        this.age = age;
        this.name = name;
        this.address = address;
	    }
	    public int getEmpid() {
	        return empid;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getAddress() {
	        return address;
	    }
}
