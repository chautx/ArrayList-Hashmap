import java.util.ArrayList;

public class  ArrayObject{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayNumbers = new ArrayList();
		Student s1 = new Student(1, "MrA");
		Student s2 = new Student(2, "MrB");
		Student s3 = new Student(3, "MrC");
		Teacher t1 = new Teacher("Khoa", "Tieng Anh");
		
		
		arrayNumbers.add(s1);
		arrayNumbers.add(s2);
		arrayNumbers.add(s3);
		arrayNumbers.add(t1);
		//print, ham size tra ve kich co cua mang
		for(int i = 0; i < arrayNumbers.size(); i++) {
			Object obj = arrayNumbers.get(i);
			// ep object ve kieu student
			Student std = (Student)obj;
			System.out.println("Student ID: " + std.id);
			System.out.println("Student Name: " + std.name);
			System.out.println("------------");
			
		 }
			      
		}
}
