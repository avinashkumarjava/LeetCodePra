package prac;

import java.util.Scanner;
import java.util.stream.Stream;

public class Maximum_Number_of_Words_Found_in_Sentences {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Sentence");
	String sentences=sc.nextLine();
	
	
	 System.out.println(1 + Stream.of(sentences)
     .mapToInt(s -> (int) s.chars().filter(c -> c == ' ').count())
     .max()
     .getAsInt());
}
}
