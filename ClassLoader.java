package org.bot.loader;

import java.applet.Applet;
import java.awt.Canvas;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;

import javax.swing.JFrame;

import org.bot.reflection.Camera;
import org.bot.reflection.Mouse;


public class ClassLoader{

	/**
	 * 
	 * Creates variables.
	 * 
	 */
	public static URL url;
	public static URLClassLoader classLoader;
	public static Class<?> clazz;
	public static Applet applet;


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
		 * Proxy
		 * 
		 */
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("183.230.53.163", 8123));
		
		/**
		 * 
		 * Download the original jar from the web.ive
		 * 
		 */
		url = new URL(
				"https://dl.dropboxusercontent.com/u/100076103/AllstarLegends.jar");
		classLoader = new URLClassLoader(new URL[] { url });
		clazz = classLoader.loadClass("client");

		
	
		/**
		 * 
		 * Activate the client.
		 * 
		 */
		
		applet = (Applet) clazz.newInstance();
		frame.add(applet);
		applet.init();
		frame.revalidate();
		
		new Thread(new Handler()).start();
		
		/**
		 * 
		 * While true ( will always be ).
		 * 
		 */
		while(true){
			Thread.sleep(2000);
			System.out.println("CameraX: " + Camera.getCameraX());
			System.out.println("CameraY: " + Camera.getCameraY());
			System.out.println("CameraZ: " + Camera.getCameraZ());
			System.out.println("MouseX: " + Mouse.getMouseX());

		}
	}
	


			//Field f1 = classLoader.loadClass("client").getDeclaredField("UZ");
			//f1.setAccessible(true);
	
			//Thread.sleep(15000);
			//Field f = classLoader.loadClass("client").getDeclaredField("g");
			//f.setAccessible(true);
			//System.out.println(f.get(classLoader.loadClass("client").newInstance()));

