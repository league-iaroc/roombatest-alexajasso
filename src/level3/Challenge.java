package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(200,200);
	sleep(2000);
	driveDirect(400,400);
	sleep(2000);
	/*
	driveDirect(200,200);
	sleep(2000);
	driveDirect(500,600);
	sleep(250);
	driveDirect(400,300);
	*/
	
	
	
	
	
	}

	public void loop() {
	
	}
}
