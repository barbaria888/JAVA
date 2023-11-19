class Student {
	public static String collegeNmae="GLA";
}


class cow {

	public static void main(String[] args) {
        
		Student.collegeNmae = "GLA";

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(s1.collegeNmae);
		System.out.println(s2.collegeNmae);
		System.out.println(s3.collegeNmae);
	}
}