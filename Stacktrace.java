started

Exception in thread "main" java.lang.IllegalArgumentException: Can not set int field BZ.MI to client
	at sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(Unknown Source)
	at sun.reflect.UnsafeFieldAccessorImpl.throwSetIllegalArgumentException(Unknown Source)
	at sun.reflect.UnsafeFieldAccessorImpl.ensureObj(Unknown Source)
	at sun.reflect.UnsafeIntegerFieldAccessorImpl.getInt(Unknown Source)
	at java.lang.reflect.Field.getInt(Unknown Source)
	at org.bot.reflection.Player.getCombatLevel(Player.java:75)
	at org.bot.loader.ClassLoader.main(ClassLoader.java:105)
	
	  public int MI; // not static.
	
	
