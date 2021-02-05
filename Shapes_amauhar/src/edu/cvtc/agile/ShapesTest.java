/**
 * 
 */
package edu.cvtc.agile;

/**
 * @author Adam
 *
 */
public class ShapesTest {
	
	public static void main(String[] args) {
		
		// declare objects
		Cuboid cuboid = new Cuboid();
		Cylinder cylinder  = new Cylinder();
		Sphere sphere = new Sphere();
		
		// call render method of objects and get an A on this assignment
		cuboid.render();
		cylinder.render();
		sphere.render();
	}

}
