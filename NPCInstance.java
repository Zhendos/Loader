	
	/**
	 * 
	 * The NPC instance.
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static Object NPCInstance() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		Field f = ClassLoader.classLoader.loadClass("client").getDeclaredField("trim");
		f.setAccessible(true);
		return f.get(null);
	}
