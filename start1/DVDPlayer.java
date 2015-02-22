package com.start1;

public class DVDPlayer {
	boolean canRecord = false;
	void recordDVD(){
		System.out.println("DVDrecording");
		
	}
	public void playDVD() {
		// TODO Auto-generated method stub
		System.out.println("playing DVD");
	}
}
class DVDPlayerTEstDrive{
	public static void main(String[] args){
		DVDPlayer dp = new DVDPlayer();
		dp.canRecord=true;
		dp.playDVD();
		if(dp.canRecord==true){
			dp.recordDVD();
		}
	}
}
