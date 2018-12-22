package com.c2t.ist1130;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */


class ThreadAssistant extends Thread{
	public void run(){
		String id3 = Thread.currentThread().getName();
		System.out.println("id3="+id3);
		System.out.println("I am inside run...");
		downloadMusic(id3);
	}
	public void downloadMusic(String id){
		String id2 = Thread.currentThread().getName();
		System.out.println("id of calling thread::"+id);
		System.out.println("id2="+id2);
	}
}

public class ThreadWindowMediaPlayer {
	public static void main(String[] args) {
		String id1 = Thread.currentThread().getName();
		System.out.println("id1="+id1);
		System.out.println("Playing music");
		ThreadAssistant t1 = new ThreadAssistant();
		//t1.run();
		t1.start();
		t1.downloadMusic(id1);
	}
}
