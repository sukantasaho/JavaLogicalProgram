public class FindEDOcc {

	public static void main(String[] args) {
        
		String[] strings = {"dedicated", "editor", "embedded"};
		int count = Arrays.stream(strings).mapToInt(s->s.split("ed", -1).length-1).sum();
		System.out.println(count);
	}

}