package com.c2t.edureka.ist830.module2;

import org.apache.commons.io.filefilter.MagicNumberFileFilter;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

class TV{
	
}

interface Remote {
	
	String maufacturer = "China";
	
	abstract void powerOnOff();
	void volume();
}

interface Remote2 {
	void changeChannel();
}

class TvRemote extends TV implements Remote, Remote2 {
	
	public void powerOnOff() {
		
		System.out.println("PowerOnOff");
		System.out.println(maufacturer);
	}

	public void volume() {
		System.out.println("volume");
	}
	
	public void changeChannel(){
		System.out.println("I am changeChannel");
	}
}

public class InterfaceConcepts {
	public static void main(String[] args) {
		Remote r = new TvRemote();
		r.powerOnOff();
		System.out.println(r.maufacturer);
	}
}
