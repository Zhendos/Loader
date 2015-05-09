package org.bot.reflection;

import java.lang.reflect.Field;

import org.bot.loader.ClassLoader;

public class Player extends Entity{
	/**
	 * 
	 * Fields.
	 * 
	 */
	public static Object playerInstance;
	public static boolean b;
	
	public Object instance;
	
	public Object PInstance(){
		return instance;
	}
	

	
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
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("FD");
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
	 * Sets the privilege of the local character.
	 * @param rank
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int setMyPrivillege(int rank) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("m");
		f.setAccessible(true);
		f.setInt(ClassLoader.applet, rank);
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
		return (int) f.getInt(playerInstance());
	}
	
	/**
	 * 
	 * Gets the username. ( playerInstance) ( broken )
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static String getUsername() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException{
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("FD"); //KI
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
	
	/**
	 * 
	 * Checks if the local player is visible or not.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public int isVisible() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("BZ").getDeclaredField("iI");
		f.setAccessible(true);
		return (int) f.getInt(playerInstance());
	}
	
	/**
	 * 
	 * Set the player character visible or invisible.
	 * @param visible
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static boolean setVisible(boolean visible) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("BZ").getDeclaredField("iI");
		f.setAccessible(true);
		f.setBoolean(playerInstance(), visible);
		return (boolean) f.getBoolean(playerInstance());
	}
	
	/**
	 * 
	 * Gets the health ( not finished )
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public int getHealth() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("II").getDeclaredField("");
		f.setAccessible(true);
		return (int) f.getInt(instance);
	}
}
