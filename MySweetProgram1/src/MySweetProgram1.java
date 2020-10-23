import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram1 {
	
	public static void main(String[] args)  {
		
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Mia");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.pop());
		System.out.println(names.removeFirst());
		System.out.println(names.remove());
		
	}
	
}