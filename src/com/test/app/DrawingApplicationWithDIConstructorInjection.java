package com.test.app;

import com.test.Shape;
import com.test.Triangle;

/**
 * With constructor injection you can specify the type of Shape that this class is dependent upon
 * And notice that here the dependency Shape object is mandatory for this class
 * 
 *
 */
public class DrawingApplicationWithDIConstructorInjection {
	
	private Shape shape;

	public DrawingApplicationWithDIConstructorInjection(Shape shape) {
		super();
		this.shape = shape;
	}
	
	public void makeDrawing() {
		shape.draw();
	}
	
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		
		DrawingApplicationWithDIConstructorInjection dri = new DrawingApplicationWithDIConstructorInjection(triangle);
		dri.makeDrawing();
		
	}

}
