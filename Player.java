package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Player {
	/**
	 * 
	 * Gets the model height.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getModelHeight() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("I").getDeclaredField("I");
		f.setAccessible(true);
		return (int) f.get(ClassLoader.applet);
	}
	/**
	 * 
	 * 
	 * Gets my player it's privilege.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String getMyPrivilege() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("Str1");
		f.setAccessible(true);
		return (String) f.get(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the X.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getX() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("XC");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the Y.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getY() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("YC");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the combat level from the local player.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getCombatLevel() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("BZ").getDeclaredField("MI");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the username.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String getUsername() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("BZ").getDeclaredField("KI");
		f.setAccessible(true);
		return (String) f.get(ClassLoader.applet);
	}
	

}
