package visam.com.ImmutableObject;

class EmpObjectImmutable {
	    public static void main(String args[])
	    {
	        ImmutableExample ie = new ImmutableExample(101,45,"ABC","texas");
	        System.out.println(ie.getEmpid());
	        System.out.println(ie.getAge());
	        System.out.println(ie.getName());
	        System.out.println(ie.getAddress());
	    }
	}