package main;

import java.awt.Rectangle;
import java.util.LinkedList;

import map.Map;
import map.MapInterface;
import toolbar.Toolbar;

public class MainPanel extends GuiComponent {
	
	private static MapInterface canvas;
	private static VariantCloseButton closeButton;
	private static Map map;
	
	public MainPanel (Rectangle bounds, Gui gui) {
		super (bounds, gui);
		//Create the map
		map = new Map ();
		//Default dimensions
		canvas = new MapInterface (new Rectangle (160, 0, 480, 480), this);
		closeButton = new VariantCloseButton (new Rectangle (240,0,16,16),this);
		closeButton.hide();
		
	}
	
	public static MapInterface getMapInterface () {
		return canvas;
	}
	public static VariantCloseButton getVariantCloseButton () {
		return closeButton;
	}
	
	public static Map getMap () {
		return map;
	}
	
	public DisplayBox addDisplayBox (Rectangle bounds, String message) {
		DisplayBox b = new DisplayBox (bounds, message, this);
		return b;
	}
	
	@Override
	public void render () {
		super.render ();
	}

}
