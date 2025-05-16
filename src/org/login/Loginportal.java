package org.login;

public class Loginportal extends Database {

	@Override
	public void name() {
	System.out.println("sona");
			}
	public void userid () {
		System.out.println("12345");
	}
	public static void main(String[] args) {
		Loginportal l=new Loginportal();
		l.name();
		l.userid();
		l.id();
		
		Database d=new Loginportal();
		d.id();
		d.name();
	//	d.userid();
	}
}
