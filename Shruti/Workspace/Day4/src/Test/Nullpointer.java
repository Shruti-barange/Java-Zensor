package Test;

iException;

public class Nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			String s1="";
			System.out.println(s1.length());
		}
		catch (AnalyzerException e) {
			System.out.println("String is empty.");
		}

	}

}
