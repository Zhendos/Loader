package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Entity {
	
	// II = Entity.
	// LI = NPC.
	
	/**
	 * 
	 * The Entity instance.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static Object EntityInstance() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("II");
		f.setAccessible(true);
		return f.get(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the current health.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getCurrentHealth() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("a");
		f.setAccessible(true);
		return (int) f.getInt(NPC.NPCInstance());
	}
	
	/**
	 * 
	 * Gets the text that is spoken ( broken )
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String textSpoken() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("II").getDeclaredField("E");
		f.setAccessible(true);
		return (String) f.get(Entity.EntityInstance());
	}
}
