package com.brushfiredigitalservices.patternmaker;

/**
* Used to flag a class as an acceptable parameter to a Renderable
* object's renderTo() method.
*/
public interface RenderVisitor {
	public void render(Rnderable r);
}
