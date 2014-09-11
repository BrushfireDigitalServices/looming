package com.brushfiredigitalservices.patternmaker;

public interface LayerStack {
	public boolean addLayer(PatternLayer lyr);
	public boolean removeLayer(PatternLayer lyr);
	public boolean removeLayer(int i);
	public boolean clearLayers();
}
