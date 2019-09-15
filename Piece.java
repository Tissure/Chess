//File: Piece.java
//Name: Kyle Ng

import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Piece{
	private Location location; 
	private int x, y;
	private char color;

	public Piece(){
		location = new Location(0,0);
		x = location.getCol() * Definition.X_COORD;
		y = location.getRow() * Definition.Y_COORD;
		this.color = Definition.NO_COLOR;
	}
	
	public Piece(char color){
		location = new Location(0,0);
		x = location.getCol() * Definition.X_COORD;
		y = location.getRow() * Definition.Y_COORD;
		this.color=color;
	}

	public void place(int row, int col){
		location.setLocation(row, col);
		setCoords();
	}
	
	public Location getLocation(){
		return location;
	}

	public void setCoords(){
		x = location.getCol() * Definition.X_COORD;
		y = location.getRow() * Definition.Y_COORD; 
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @return the color
	 */
	public char getColor() {
		return color;
	} 

	abstract public void paint(Graphics2D g2);
	abstract public int getType();
}


