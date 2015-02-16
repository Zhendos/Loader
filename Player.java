package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Player {
	/**
	 * 
	 * Fields.
	 * 
	 */
	public static Object playerInstance;
	public static boolean b;
	

	
	/**
	 * 
	 * The player instance;
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Object playerInstance() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("EI");
		f.setAccessible(true);
		return (Object) f.get(ClassLoader.applet);
	}

	
	/**
	 * 
	 * Gets the model height. ( broken )
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
		return (int) f.get(playerInstance());
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
	public static int getMyPrivilege() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("m");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
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
		return (int) f.get(ClassLoader.applet);
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
	 * Gets the combat level. ( was de playerInstance)
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static int getCombatLevel() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("BZ").getDeclaredField("MI"); //loadClass BZ.
		f.setAccessible(true);
		return (int) f.get(playerInstance());
		
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
		return (String) f.get(playerInstance());
	}
	
	/**
	 * 
	 * Gets the password.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String getPassword() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("tD");
		f.setAccessible(true);
		return (String) f.get(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Checks if the username is logged in.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static boolean isLoggedIn() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("dD");
		f.setAccessible(true);
		return (boolean) f.getBoolean(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets if an admin can mute you or not.
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static boolean canMute() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("fD");
		f.setAccessible(true);
		return (boolean) f.getBoolean(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the destinationX of our player.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getDestinationX() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("UJ");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the destinationY of our player.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getDestinationY() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("VJ");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * gets the player count.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getPlayerCount() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("GI");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the input string from the local user.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String getInputString() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("JI");
		f.setAccessible(true);
		return (String) f.get(ClassLoader.applet);
	}
	
	

	

}
