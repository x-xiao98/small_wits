package org.wits.core.util;

import java.lang.reflect.Type;

/**
 * 类工具类 <br>
 *
 * @author xiaoleilu
 */
public class ClassUtil {
	/**
	 * 获得给定类的第一个泛型参数
	 *
	 * @param clazz 被检查的类，必须是已经确定泛型类型的类
	 * @return {@link Class}
	 */
	public static Class<?> getTypeArgument(Class<?> clazz) {
		return getTypeArgument(clazz, 0);
	}

	public static Class<?> getTypeArgument(Class<?> clazz, int index) {
		final Type argumentType = TypeUtil.getTypeArgument(clazz, index);
		return TypeUtil.getClass(argumentType);
	}

}
