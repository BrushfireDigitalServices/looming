package com.brushfiredigitalservices.patternmaker;

public interface LayerStack {
	public void addLayer(PatternLayer lyr);
	public void removeLayer(PatternLayer lyr);
	public void removeLayer(int i);
	public void clearLayers();
}
