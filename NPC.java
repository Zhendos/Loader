package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class NPC extends Entity{
	/**
	 * 
	 * Fields.
	 * 
	 */
	public static Object NPCInstance;
	// class LI is NPC class
	// class II is entity class.

	
	
	/**
	 * 
	 * the NPC instance.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static Object NPCInstance() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("trim");
		f.setAccessible(true);
		return (Object) f.get(ClassLoader.applet);
	}

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
		return (int) f.getInt(NPC.NPCInstance());
		
	}
	
	/**
	 * 
	 * Gets the NPC count in the minimap.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getCountNPC() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("valueOf");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}

}
