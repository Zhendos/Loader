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
		for (Object o : (Object[]) f.get(Input.applet)) { //input.applet
			if(o != null){
				npcs.add(new NPC(o));
			}
		}
		return npcs.toArray(new NPC[npcs.size()]);

	}
