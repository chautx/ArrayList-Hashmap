import java.util.ArrayList;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Words> word = new ArrayList<>();
		Words w1 = new Words("hello", "xin chao");
		word.add(w1);
		word.add(new Words("Add", "Them"));
		word.add(new Words("Delete", "Xoa"));
		word.add(new Words("Remove", "Chuyen"));
		for(int i = 0; i < word.size(); i++) {
			Words Words = word.get(i);
			System.out.println("Key:" + Words.key);
			System.out.println("Value:" + Words.value);
			System.out.println("-----------");
		}

	}

}
