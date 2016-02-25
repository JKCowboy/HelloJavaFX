package com.rubiconware.tutorials.javafx;

import java.util.logging.Level;

/**
 * This class Logs to stdout.
 * 
 * <pre>
 * Revision History
 * PCR      Version   Author          Date        Comment
 * CZZZZ    000       jack         Feb 7, 2016     Class Created.
 * </pre>
 * 
 * @author jack
 * @version {@value #VERSION}
 */
public class Logger {
	private static Level level = Level.WARNING;




	/**
	 *
	 * @pre init complete.
	 * @post no change to object.
	 * @param config
	 * @param string
	 */
	public static void log(Level level, String string) {
		if (level.intValue() >= Logger.level.intValue()) {
			StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
			StackTraceElement e = stacktrace[2];
			String methodName = e.getMethodName();
			System.out.println("" + level.getName() + ":" + e.getClassName() + "." + methodName + "["
					+ e.getLineNumber() + "]: " + string);
		}
	}




	/**
	 *
	 * @pre init complete.
	 * @post no change to object.
	 * @param newLevel
	 */
	public static void setLevel(Level newLevel) {
		level = newLevel;
	}
}
