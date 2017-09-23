package com.cg.client;

import java.util.Scanner;

import com.cg.service.CalculatorService;
import com.cg.service.ServiceImpl;

public class Client {

	public static void main(String []args)
	{
		CalculatorService service = new ServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-add");
		System.out.println("2-sub");
		int choice = 0;
		switch(choice)
		{
		case 1:
			System.out.println("How many numbers you want to add::");
			int size =0;
			size = sc.nextInt();
			System.out.println("enter numbers::");
		int []arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = service.addNumber(arr);
		System.out.println("sum = "+sum);
		break;
		
		case 2:
			System.out.println("How many numbers you want to add::");
			int sz =0;
			sz = sc.nextInt();
			System.out.println("enter numbers::");
		int []arr1 = new int[sz];
		for(int i=0;i<sz;i++)
		{
			arr1[i] = sc.nextInt();
		}
		int sub = service.subNumber(arr1);
		System.out.println("sub = "+sub);
		break;
		}
	}
}
