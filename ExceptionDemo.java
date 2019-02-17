package day21;

import java.util.NoSuchElementException;

public class Exceptiondemo {
	public static void main(String[] args) {
		try {
			function(3);
			function(2);
			function(3);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}catch(NullPointerException ex) {
			System.out.println(ex);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	public static void function(int i)throws Exception,NullPointerException,NoSuchElementException{
		if(i==1) {
			throw new Exception();
			}
		if(i==2) {
			throw new NoSuchElementException();}
		if(i==3) {
			throw new NullPointerException();}
	}
	public static void function() {
		throw new RuntimeException();
	}
		
}
