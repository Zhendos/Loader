package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;


public class Camera {
	/**
	 * 
	 * 
	 * --> Gets the cameraX position.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getCameraX() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.clazz.getDeclaredField("e");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	/**
	 * 
	 * 
	 * --> Gets the CameraY position.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getCameraY() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.clazz.getDeclaredField("h");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * --> Gets the CameraZ position.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getCameraZ() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.clazz.getDeclaredField("g");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	/**
	 * 
	 * Sets our cameraX postion.
	 * @param cameraX
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	 public void setCameraX(int cameraX) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		cameraX = Camera.getCameraX();
		
	}

	
}
