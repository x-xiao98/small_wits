package org.wits.core.util;

public class CharUtil {
	/**
	 * 给定对象对应的类是否为字符类，字符类包括：
	 *
	 * <pre>
	 * Character.class
	 * char.class
	 * </pre>
	 *
	 * @param value 被检查的对象
	 * @return true表示为字符类
	 */
	public static boolean isChar(Object value) {
		//noinspection ConstantConditions
		return value instanceof Character || value.getClass() == char.class;
	}

	public static String toString(char c) {
		return ASCIIStrCache.toString(c);
	}
}
