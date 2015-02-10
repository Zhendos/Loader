package org.bot.reflection;

import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Mouse extends MouseAdapter {

	public static Canvas canvas;
	public static int x, y;

	/**
	 * 
	 * 
	 * Gets the mouseX
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static int getMouseX() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("DZ").getDeclaredField("K");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * 
	 * Gets the mouseY
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getMouseY() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("DZ").getDeclaredField("L");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	public static int getIdleTime() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("DZ").getDeclaredField("G");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	public void setMouseX(int mouseX) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException{
		mouseX = getMouseX();
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

