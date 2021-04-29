package com.demo_ScienceDirect.services;

import com.demo_ScienceDirect.entity.Article;

public class TestService  {
	
	public int somme(int a,int b)
	{
		return a+b ;
	}
	
	public int sub(int a,int b)
	{
		return a-b ;
	}
	
	public double devide(double x,double y) 
		throws IllegalArgumentException{
        if(y==0) throw new IllegalArgumentException();
        return x/y;
	}


}
