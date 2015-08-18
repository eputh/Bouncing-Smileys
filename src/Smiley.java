// Smiley.java
// 
// ICS 45J : Lab Assignment 3
// 
// Coded for ICS45J by Norman Jacobson, August 2012,
//   based on the October, 2010 version used in ICS21
// 
// DO NOT MODIFY
// 
// The main class.
// We construct a smiley group, and a display in which they will bounce around;
// we add the group to the display, construct a frame to hold the display,
// and add the display to it. With all now built and in place, we start the
// animation (which also makes the frame, and thus the moving smileys,
// visible  to the user).

public class Smiley
{
	
	public static void main(String[] args)
	{
		BouncingGroup bouncers= new BouncingGroup();
		BouncingDisplay bounceDisplay = new BouncingDisplay(bouncers);
		BouncingFrame f = new BouncingFrame("Smiley Faces");
		f.add(bounceDisplay);
		f.activateAnimation(bouncers,bounceDisplay);
	}
	
}

