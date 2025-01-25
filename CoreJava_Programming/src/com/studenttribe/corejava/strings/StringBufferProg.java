package core.studenttribe.corejava.strings;

public class StringBufferProg {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append(3108);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Abhishek");
		System.out.println(sb.hashCode());
		
		

	}

}
