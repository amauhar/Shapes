/**
 * 
 */
package edu.cvtc.agile;

/**
 * @author Adam
 *
 */
public class Cylinder extends Shape {
	
	// fields
	private float radius = 0;
	private float height = 0;
	
	// default constructor
	public Cylinder() {
		
	}
	
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * radius * (radius + height));
	}

	@Override
	public float volume() {
		return (float) (Math.PI * radius * radius * height);
	}

	@Override
	public void render() {
		System.out.println("Cylinder has a surface area of " + surfaceArea() + " and a volume of " + volume());
	}
	
	// constructor
	public Cylinder(float radius, float height) {
		
		this.radius = radius;
		this.height = height;
		
	}
	
	// getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
}
