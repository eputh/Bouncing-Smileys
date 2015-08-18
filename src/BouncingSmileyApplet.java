// BouncingSmileyApplet.java
// 
// ICS 45J : Lab Assignment 3
// 
// Completed by: [YOUR NAME]
// UCInetiD:     [YOUR UCInetID]
// ID:           [YOUR UCI ID Number]
// Modified:     [LAST MODIFICATION DATE]

import java.awt.*;
import java.applet.*;
import java.awt.geom.*;
import java.util.Random;

// An applet that bounces a group of smileys around a wall-lined screen
public class BouncingSmileyApplet extends Applet
{
	
	// Constants go here. You'll likely want them for the four
	// edges of the display, the thickness of the walls, the time the
	// animation should run (in milliseconds) and perhaps others
	
	// Suggested fields:
	//	the smiley group to be displayed
	//  the three animated smileys
	//	random number generator (used in the animation)
	//  the graphics environment
	//	the four walls of the display
	//  the x and y coordinates of the upper left corner 
	//  of the current face part	
	
	// A wall of the display (off which the smiley bounces). The outer
	// class will make four objects of this class, one for each wall.
	// Not required (since private); still, strongly recommended!
	
	private static class Wall
	{
		
		// A wall consists of a rectangle, color, name, and edge --
		// the position of the edge of the wall that the smiley touches.
		
		// Build a wall, given its name and color -- we can figure 
		// out the wall's shape from the provided name and the geometry 
		// of the screen--and provide that info to Rectangle() 
		// to build the wall
		
		public Wall(WallName position, Color c)
		{
			
			// walls have a left position, top position, 
			// length in x dimension, length in y dimension,
			// color the same as c; which wall we're making
			// is indicated by position (WallName.LEFT, 
			// WallName.RIGHT, WallName.TOP, WallName.BOTTOM)
			
			// figure out upper left, upper right, xLength and 
			// yLength for each rectangle representing a wall, 
			// and the edge the smiley will hit when it touches 
			// a wall, using information about the display screen 
			// and frame, and the wall's thickness
			
			// Use that info to make a new rectangle that represents the wall
			
		}
	}
	
	// Inherited method:
	// 	public void repaint() - forces Java to redraw this display
	
	// The parts of the applet that need construction:
	//   build the four walls
	//   make the smiley group to be animated
	//   make a random number generator (used in animation)
	
	public BouncingSmileyApplet()
	{
		// complete
	}
	
	// init: when applet is invoked:
	//  resize the screen to match the boundaries 
	//    given above 
	//	set the background color to the 
	//    BACKGROUND_COLOR 
	//	break the smileys from the 
	//	  group and store separately, since they 
	//	  are animated separately
	//  begin the animation
	
	public void init()
	{
		// complete
	}
	
	// Animate the smiley in it own thread,
	// so that it is separate from the rest
	// of the programs; operations: in particular,
	// when we repaint() to draw the next frame of
	// the animation, when this thread suspends,
	// the other implied program thread will
	// repaint the screen. (If a separate thread
	// is not used, repaint() is only acted upon
	// once the animation is complete!)
	// All details to actually animate are in the
	// paint() method; this just loops through
	// repainting and pausing as paint() generates
	// and displays each frame of the animation
	
	public void animate()
	{
		class AnimationRunnable implements Runnable
		{
			public void run()
			{
				// Set the current time

				// For each frame, for as long as we are animating...
					// repaint the current frame and pause
			}
		}
		Thread t = new Thread(new AnimationRunnable());
		t.start();
	}
	
	// pause(): pause the animation for the given 
	// number of milliseconds
	// DO NOT MODIFY
	private void pause(int millisecs)
	{
		try
		{
			Thread.sleep(millisecs);
		}
		catch (InterruptedException e)
		{
		}
	}
	
	// paint: draw a frame of the animation
	public void paint(Graphics g)
	{
		// Call parent
		// Make a graphics2D reference
		// Draw the walls
		// Move each smiley one "frame" of animation
		// Draw each smiley onto its place on the screen
	}
	
	// The methods described below are private, and so
	// only suggested; however, the functionality they 
	// provide will almost certainly be needed, regardless of 
	// whether you choose to implement them.
	
	// moveCntSmiley: Continue to move smiley until 
	// it hits a wall; when it does, swap color of
	// smiley and wall, and change direction
	
	private void moveCntSmiley(AnimatedSmiley cntSmiley)
	
	// complete
	
	// Swap the colors of the wall just touched and the smiley
	
	private void switchColor(AnimatedSmiley cntSmiley, WallName wallTouched)
	
	// complete
	
	// Change the smiley's direction so it is away from the wall just touched.
	
	private void adjustDirection(AnimatedSmiley cntSmiley, WallName wallTouched)
	{
			
		// If hit top or bottom wall, y direction is reversed,
		// x direction can be to the left, to the right, or
		// no movement at all; it is randomly chosen
		
		// If hit left or right wall, x direction is reversed,
		// y direction can be up, down, or no movement; it is 
		// randomly chosen
		
	}
	
	// whichWallWasHit: return a label (LEFT, RIGHT, TOP, BOTTOM) to tell us which wall 
	// was hit or NONE if none was hit
	
	private WallName whichWallWasHit(AnimatedSmiley cntSmiley)
	
	// complete
	
	// Return true if hit left wall, false otherwise
	
	private boolean hitLeftWall(AnimatedSmiley cntSmiley)
	{
		// Wall was hit if x coordinate of leftmost point of smiley is
		// same or less than edge of the left wall and is (still)
		// heading into the wall
	}
	
	// Return true if hit right wall, false otherwise
	
	private boolean hitRightWall(AnimatedSmiley cntSmiley)
	{		
		// Wall was hit if x coordinate of rightmost point of smiley is
		// same or greater than edge of the right wall and is (still)
		// heading into the wall
	}
	
	// Return true if hit top wall, false otherwise
	
	private boolean hitTopWall(AnimatedSmiley cntSmiley)
	{
		// Wall was hit if y coordinate of top-most point of smiley is
		// same or less than edge of the top wall and is (still)
		// heading into the wall
	}
	
	// Return true if hit bottom wall, false otherwise
	
	private boolean hitBottomWall(AnimatedSmiley cntSmiley)
	{
		// Wall was hit if y coordinate of bottom-most point of smiley is
		// same or greater than edge of the bottom wall and is (still)
		// heading into the wall
	}
	
	// Return wall's edge
	
	public int getWallEdge(WallName wallName)
	
	// complete
	
	// Return the color of the wallName wall
	
	public Color getWallColor(WallName wallName)
	
	// complete
	
	// Set the specified wall to the provided color
	
	public void setWallColor(WallName wallName, Color c)
	
	// complete
	
	// drawSmiley: draw a smiley by drawing each of its parts
	
	private void drawSmiley(SmileyFace cntSmiley)
	
	// complete
	
	// drawPart: make an ellipse corresponding to the shape 
	// of the given smiley face part; the ellipses are what 
	// are actually drawn
	
	private void drawPart(SmileyFacePart part)
	
	// complete
	
	// computeUpperLeft: determine the x- and y-coordinate of the
	// upper-left of a SmileyFacePart.  This should be called whenever
	// an attributes change would cause the upper-left position to
	// change.
	
	private void computeUpperLeft(SmileyFacePart part)	{
	
	// complete
	
}

