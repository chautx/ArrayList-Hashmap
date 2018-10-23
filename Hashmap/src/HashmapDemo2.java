import java.util.HashMap;

public class HashmapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> maps = new HashMap<>();
		maps.put("hello","Xin chao");
		maps.put("hello","Xin chao");
		
		String keyword = "hello";
		String value =  maps.get(keyword);
		System.out.println(" Value: " + value);
		

	}

}
