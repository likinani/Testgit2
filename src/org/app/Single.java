package org.app;

public class Single {
	public static Single emp=null;
	private Single() {
	}
public synchronized static  Single getInstance(){
	if(emp==null){
		emp=new Single();
	}
	
	return emp;}
	public void raja(){
		System.out.println("java");
}
	public void rani(){
		System.out.println("sql");
		
	}
}
