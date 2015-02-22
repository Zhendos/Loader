package org.bot.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.bot.loader.ClassLoader;

public class Menu {
	public Object instance;
	
	public Menu(Object instance){
		this.instance = instance;
	}
	
	/**
	 * 
	 * Gets the loaded menu ( broken )
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Menu[] getLoadedMenu() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		ArrayList<Menu> menus = new ArrayList<Menu>();
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("cB");
		f.setAccessible(true);
		for(Object o :(Object[]) f.get(ClassLoader.applet)){
			if(o != null){
				menus.add(new Menu(o));
			}
		}
		return menus.toArray(new Menu[menus.size()]);
		
	}
	
	/**
	 * 
	 * Checks if the menu is open or not.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static boolean isMenuOpen() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("DI");
		f.setAccessible(true);
		return (boolean) f.getBoolean(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the menu screen area.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getMenuScreenArea() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("wI");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	/**
	 * 
	 * Gets the menu action ID.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int[] getMenuActionID() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("cB");
		f.setAccessible(true);
		return (int[]) f.get(ClassLoader.applet);
	}
	
	public static Object getMenuIDAction() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		for(int m : Menu.getMenuActionID()){
			return m;
		}
		return null;
	}

	
}

