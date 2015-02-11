package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class NPC {
	
	/**
	 * 
	 * gets the smallX.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int[] smallX() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("II").getDeclaredField("B");
		f.setAccessible(true);
		return (int[]) f.get(ClassLoader.applet);
	}
	
	//z is interacting.
	/**
	 * 
	 * Gets the interacting.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getInteracting() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("II").getField("z");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
		
	}

}
