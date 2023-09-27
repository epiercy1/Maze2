
public class Maze {
	private int width;
	private int height;
	private char[][]maze;
	
	public Maze(int width, int height) {
		this.width = width;
		this.height = height;
		this.char = maze;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void set(char character, int row, int column) {
		row = height;
		column = width;
		maze = [4][7];
	}
	
	public String solve(int startrow, int startcol, int endrow, int endcol) {
		String result = " ";

		//Must use recursion
		//Must return a String of the form: r, c-r1, c1-r2, c2

		String breadCrumb = "*";

		//base cases

		//if we are at the end
		//	return end coordinates

		//if we are at a dead end(zero ways to go)
		//	return null

		//if only one way to go
		//	calculate the next spot's coordinates
		//	if we are changing direction
		//		return nextRow + ", " + nextCol + " - " + solve(nextRow, nextCol, endRow, endCol)

		//there are multiple ways to go

		//if we can move east
		//	calculate the east coordinates
		//	result = solve(eastRow, eastCol, endRow, endCol)

		//	if result != null
		//		return eastRow + " + " + eastCol + " - " + result

		//if we can move south
		//	calculate the south coordinates
		//	result = solve(southRow, southCol, endRow, endCol)

		//	if result != null
		//		return southRow + " + " + southCol + " - " + result

		//if we can move west
		//	calculate the west coordinates
		//	result = solve(westRow, westCol, endRow, endCol

		//	if result != null
		//		return westRow + " + " + westCol + " - " + result

		//if we can move north
		//	calculate the north coordinates
		//	result = solve(northRow, northCol, endRow, endCol)

		//	if result != null
		//		return northRow + " + " + northCol + " - " + result
		
		return null;
	}
}
