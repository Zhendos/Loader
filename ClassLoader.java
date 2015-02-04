package org.bot.loader;

import java.applet.Applet;
import java.awt.Menu;
import java.awt.MenuBar;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.bot.reflection.*;

public class ClassLoader{

	/**
	 * 
	 * Creates variables.
	 * 
	 */
	static URL url;
	static URLClassLoader classLoader;

	/**
	 * 
	 *
	 * Our main method.
	 * 
	 * @throws ClassNotFoundException
	 * @throws NoSuchFieldException 
	 * @throws IOException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws InterruptedException 
	 * @throws NoSuchMethodException
	 */
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, MalformedURLException, NoSuchFieldException, SecurityException, InterruptedException, NoSuchMethodException{
		/**
		 * 
		 * Creates our frame.
		 * 
		 */
		JFrame frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(780, 650);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		
		/**
		 * 
		 * Download the original jar from the web.ive
		 * 
		 */
		url = new URL(
				"https://dl.dropboxusercontent.com/u/100076103/AllstarLegends.jar");
		classLoader = new URLClassLoader(new URL[] { url });
		Class<?> clazz = classLoader.loadClass("client");
		
	
		/**
		 * 
		 * Activate the client.
		 * 
		 */
		
		Applet applet = (Applet) clazz.newInstance();
		frame.add(applet);
		applet.init();
		frame.revalidate();
		
		
		/**
		 * 
		 * While true ( will always be )
		 * 
		 */
		while(true){
			Thread.sleep(25000);
			System.out.println(getCameraX());
			
			
		}

	
	}
	public static Object getCameraX() throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException{
		Field f = classLoader.loadClass("client").getDeclaredField("e");
		f.setAccessible(true);
		return (Object) f.get(null);
	}


}


			//Field f1 = classLoader.loadClass("client").getDeclaredField("UZ");
			//f1.setAccessible(true);
	
			//Thread.sleep(15000);
			//Field f = classLoader.loadClass("client").getDeclaredField("g");
			//f.setAccessible(true);
			//System.out.println(f.get(classLoader.loadClass("client").newInstance()));

