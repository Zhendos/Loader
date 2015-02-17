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
	 * Gets the CurveX from the camera position.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getXCameraCurve() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("l");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);			
	}
	
	/**
	 * 
	 * Gets the CurveY from the camera position.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getYCameraCurve() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("k");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}

	
}
