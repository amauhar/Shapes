/**
 * 
 */
package edu.cvtc.agile;

/**
 * @author Adam
 *
 */
public class Sphere extends Shape {
	
	// fields
	public float radius = 0;
	
	// default constructor
	public Sphere() {
		
	}
	
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * (radius * radius));
	}

	@Override
	public float volume() {
		return (float) (( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 ));
	}

	@Override
	public void render() {
		System.out.println("Sphere has a surface area of " + surfaceArea() + " and a volume of " + volume());
	}
	
	// constructor
	public Sphere(float radius) {
		this.radius = radius;
	}

	// getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}
