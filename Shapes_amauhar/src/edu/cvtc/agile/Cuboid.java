package edu.cvtc.agile;

/**
 * @author Adam
 *
 */
public class Cuboid extends Shape {
	
	// fields
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	// default constructor
	public Cuboid() {

	}
	
	@Override
	public float surfaceArea() {
		return 6 * (width * height);
	}

	@Override
	public float volume() {
		return width * height * depth;
	}

	@Override
	public void render() {
		System.out.println("Cuboid has a surface area of " + surfaceArea() + " and a volume of " + volume());
	}
		
	// constructor
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// getters and setters
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
}