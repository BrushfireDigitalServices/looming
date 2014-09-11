	package com.brushfiredigitalservices.patternmaker;
	
	public class GridPattern implements LayerStack, Resizable2D, MosaicDrawable {
		
		@Override
		public boolean equals(Object obj) {
			try {
				GridPattern gp = (GridPattern)obj;
				if (gp != null) {
					if (this.height == gp.getHeight() && 
							this.width == gp.getWidth()) {
						return true;
					}
				}
			} catch(ClassCastException e) {
				return false;
			}
			return false;
		}
	
		// begin Resizable2D implementation
	
		private int height;
		private int width;

		public int getHeight() { 
			return 0;
			// TODO stub
		}
	
		public int getWidth() {
			return 0;
			// TODO stub
			
		}
		
		public void resize(int w, int h) {
			// TODO stub
		}
		
		// Begin LayerStack implementation
		
		@Override
		public boolean addLayer(PatternLayer lyr) {
			
			// TODO Auto-generated method stub
			updateBuffer();
			return false;
		}
	
		@Override
		public boolean removeLayer(PatternLayer lyr) {
			// TODO Auto-generated method stub
			updateBuffer();
			return false;
		}
	
		@Override
		public boolean removeLayer(int i) {
			// TODO Auto-generated method stub
			updateBuffer();
			return false;
		}
	
		@Override
		public boolean clearLayers() {
			// TODO Auto-generated method stub
			renderBuffer = new BufferLayer(); // update the buffer
			return false;
		}
		
		// Begin Renderable implementation
	
		PatternLayer renderBuffer = null;
		
		public void updateBuffer() {
			if (renderBuffer == null)
				renderBuffer = new BufferLayer(); 
			// TODO stub
		}
		
		@Override
		public String toString() {
			return super.toString();
					// TODO stub
		}
	
		@Override
		public void draw(MosaicPanel m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setMosaic(MosaicPanel m) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public MosaicPanel getMosaic() {
			// TODO Auto-generated method stub
			return null;
		}
	}
