import java.io.File;
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao file, luu duong dan
		File file = new File("data.txt");
		//kiem tra file ton tai hay ko
		boolean exists = file.exists();
		System.out.println(" File ton tai " + exists);
		 // neu file ko ton tai, bo trong try/catch-> tao file
		if (!exists) {
			  try {file.createNewFile();
			  }catch(Exception e) {
				  e.printStackTrace();		  
					 				
			  
			  
			  	}
			 }
			 
		 
		
		

	}

}
