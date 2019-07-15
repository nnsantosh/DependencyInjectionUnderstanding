package com.test.app;

import com.test.Circle;
import com.test.Shape;
import com.test.Triangle;

/**
 * 
 *With setter injection you can specify the type of Shape that this class is dependent upon
 *Notice that here the dependency Shape object is optional for this class
 *The dependency required by this class(actual Shape instance) is injected at run time
 *The dependency of this class to the Shape object is not owned by this class
 *This class does not own the relationship to the Shape object
 *
 */

public class DrawingApplicationWithDISetterInjection {
	
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void makeDrawing() {
		shape.draw();
	}
	
	public static void main(String[] args) {
		DrawingApplicationWithDISetterInjection dri = new DrawingApplicationWithDISetterInjection();
		dri.setShape(new Triangle());
		dri.makeDrawing();
		/*dri.setShape(new Circle());
		dri.makeDrawing();*/
	}
	

}
