package com.test.app;

import com.test.Circle;
import com.test.Shape;
import com.test.Triangle;

/**
 * Without DI there is tight coupling between this class and the Shape classes
 * 
 * 
 *
 */
public class DrawingApplicationWithoutDI {
	
	public void makeDrawing() {
		
		Shape triangle = new Triangle();
		triangle.draw();
		
		Shape circle = new Circle();
		circle.draw();
		
		
	}

}
