package org.bot.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.bot.loader.ClassLoader;

public class NPC extends Entity {
	// update #getCurrentHealth
	/**
	 * 
	 * Fields.
	 * 
	 */

	// class LI is NPC class
	// class II is entity class.

	public NPC(Object instance) {

		this.instance = instance;
	}

	/**
	 * 
	 * gets the loaded NPC.
	 * 
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static NPC[] getLoadedNPC() throws NoSuchFieldException,SecurityException, ClassNotFoundException,IllegalArgumentException, IllegalAccessException {
		ArrayList<NPC> npcs = new ArrayList<NPC>();
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("trim");
		f.setAccessible(true);
		for (Object o : (Object[]) f.get(ClassLoader.applet)) {
			if(o!=null){
				npcs.add(new NPC(o));
			}
		}
		return npcs.toArray(new NPC[npcs.size()]);

	}

	/**
	 * 
	 * the NPC instance.
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public Object NPCInstance(){
		return instance;
	}

	/**
	 * 
	 * Gets the current health.
	 * 
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public int getCurrentHealth() throws NoSuchFieldException,SecurityException, ClassNotFoundException,IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("II").getDeclaredField("a");
		f.setAccessible(true);
		return (int) f.getInt(instance);
	}

	/**
	 * 
	 * gets the smallX.
	 * 
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public  int[] smallX() throws NoSuchFieldException,
			SecurityException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("II").getDeclaredField("B");
		f.setAccessible(true);
		return (int[]) f.get(instance);
	}

	// z is interacting.
	/**
	 * 
	 * Gets the interacting.
	 * 
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public  int getInteracting() throws NoSuchFieldException,
			SecurityException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {
		Field f = ClassLoader.classLoader.loadClass("II").getField("z");
		f.setAccessible(true);
		return (int) f.getInt(instance);

	}

	/**
	 * 
	 * Gets the NPC count in the minimap.
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static int getCountNPC() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException,
			ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField(
				"valueOf");
		f.setAccessible(true);
		return (int) f.getInt(ClassLoader.applet);
	}
	
	public static void getCurrentHealthNPC() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {		if(Player.isLoggedIn() && NPC.getCountNPC() > 0){
			for(NPC npc : NPC.getLoadedNPC()){
				if(npc.getInteracting() != -1){
					System.out.println("[SYSTEM] NPC health is currently " + npc.getCurrentHealth());
				}
			}
		}
	}
}
