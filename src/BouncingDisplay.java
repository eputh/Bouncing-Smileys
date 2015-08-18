// BouncingDisplay.java - build the display panel
// 
// ICS 45J : Lab Assignment 3
// 
// Completed by: [YOUR NAME]
// UCInetiD:     [YOUR UCInetID]
// ID:           [YOUR UCI ID Number]
// Modified:     [LAST MODIFICATION DATE]

import java.awt.*;
import java.awt.geom.*;

// Panel that displays the moving smiley

class BouncingDisplay extends BasicDisplay
{
	
	// Constants go here. You'll likely want them for the four edges
	// of the frame, the thickness of the walls, and perhaps others
	
	// Needed fields go here. You'll likely want fields for the moving
	// smileys, the graphics 2D environment, the x and y coordinates
	// of the upper left corner of the current face part, and for each
	// of the four walls -- and perhaps others as well
	
	// A wall of the display (off which the smiley bounces). The outer
	// class will make four objects of this class, one for each wall.
	// Not required (since private); still, strongly recommended!
	
	private static class Wall
	{
		// A wall consists of a rectangle, color, name, and edge --
		// the position of the edge of the wall that the smiley touches.
		
		// Build a wall, given its name and color -- we can figure out
		// the wall's shape from the provided name and the geometry of the
		// screen--and provide that info to Rectangle() to build the wall
		
		public Wall(WallName position, Color c)
		{
			// walls have a left position, top position, length in x dimension,
			// length in y dimension, color the same as c; which wall we're
			// making is indicated by position (WallName.LEFT, 
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
	
	// The bouncing display is a display with
	// four walls (left, right, top, bottom) and three moving smileys
	
	public BouncingDisplay(BouncingGroup bouncingGroup)
	
	// complete
	
	// paintComponent: called by the runtime environment whenever
	// it thinks the displayed screen has changed, or as soon as
	// possible after the program makes a call to repaint()
	
	public void paintComponent(Graphics g)
	{
		
		// Done as a matter of course as the first two
		// lines of a paintComponent routine
		
		super.paintComponent(g);
		g2 = (Graphics2D)g;
		
		// Draw each smiley onto its place on the screen
		// The moving smileys are now the previous smileys...
		
		// complete
		
	}
	
	// Return the wall's edge
	
	public int getWallEdge(WallName wallName)
	
	// complete
	
	// Return the color of the wallName wall
	
	public Color getWallColor(WallName wallName)
	
	// complete
	
	// Set the specified wall to the provided color
	
	public void setWallColor(WallName wallName, Color c)
	
	// complete
	
	// The methods described below are private, and so
	// only suggested; however, the functionality they 
	// provide will almost certainly be needed, regardless of 
	// whether you choose to implement them.
	
	// computeUpperLeft() determines the x- and y-coordinate of the
	// upper-left of a SmileyFacePart.  This should be called whenever
	// an attributes change would cause the upper-left position to
	// change. It's recommended because the graphic grawing routines
	// need to be given theupper left corner of a figure (in addition
	// to x and y legnths) to draw it.
	
	private void computeUpperLeft(SmileyFacePart part)
	
	// complete
	
	// drawSmiley: draw a smiley by drawing each of its parts
	
	private void drawSmiley(SmileyFace cntSmiley)
	
	// complete
	
	// drawPart: make an ellipse corresponding to the shape 
	// of the given smiley face part, and draw it, filled
	// in with the part's color
	
	private void drawPart(SmileyFacePart part)
	
	// complete
	
}

