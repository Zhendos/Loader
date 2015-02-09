package org.bot.reflection;

import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Mouse extends MouseAdapter {

	public static Canvas canvas;
	public static int x, y;

	public static int getMouseX() throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.clazz.getDeclaredField("k");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}


	/**
	 * 
	 * get and set the mouse actual position
	 * 
	 */

	public void mouseMoved(MouseEvent e) {
		System.out.println("moved");
		x = e.getPoint().x;
		y = e.getPoint().y;
	}

}
