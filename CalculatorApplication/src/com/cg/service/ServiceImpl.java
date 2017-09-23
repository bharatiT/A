package com.cg.service;

public class ServiceImpl implements CalculatorService{

	@Override
	public int addNumber(int[] arr) {
		int sum =0;
		for(int var:arr)
			sum = sum + var;
		return sum;
	}

	@Override
	public int subNumber(int[] arr) {
		// TODO Auto-generated method stub
		int sub = 0;
		for(int var:arr)
			sub = sub - var;
		return sub;
	}
	

}
