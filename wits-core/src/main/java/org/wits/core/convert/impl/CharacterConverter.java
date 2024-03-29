package org.wits.core.convert.impl;

import org.wits.core.convert.AbstractConverter;
import org.wits.core.util.BooleanUtil;
import org.wits.core.util.StrUtil;

/**
 * 字符转换器
 *
 * @author Looly
 *
 */
public class CharacterConverter extends AbstractConverter<Character> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Character convertInternal(Object value) {
		if (value instanceof Boolean) {
			return BooleanUtil.toCharacter((Boolean) value);
		} else {
			final String valueStr = convertToStr(value);
			if (StrUtil.isNotBlank(valueStr)) {
				return valueStr.charAt(0);
			}
		}
		return null;
	}

}
