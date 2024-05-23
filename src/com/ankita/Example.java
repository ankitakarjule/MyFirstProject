package com.ankita;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		Example example=new Example();
		example.m1();

	}
public void m1()
{
	List<String> list=new ArrayList<String>();
	list.add("Ankita");
	list.add("mitali");
	list.add("rohit");
	list.add("kamalesh");
	for(String str:list)
	{
		System.out.println(str);
	}
}
}
