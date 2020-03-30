package org.cap.model;
import java.util.Arrays;
import java.util.List;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(Arrays.asList(12,13,34,56,78,7823,12));
	}
	public static void display(List<Integer> lst)
	{
		long count=lst.stream().count();
		System.out.println("No of elements:"+ count);
	}

}
