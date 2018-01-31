package com.atsistemas.tarjetafidelidad.business.impl;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;

import com.atsistemas.tarjetafidelidad.business.PasswordGenerator;

@Component
public class PasswordGeneratorImpl implements PasswordGenerator {

	private static SecureRandom random = new SecureRandom();

	/** diccionarios */
	private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMERIC = "0123456789";
	private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

	@Override
	public String generatePasswd() {
		String result = "";
		String dic = ALPHA_CAPS + ALPHA + NUMERIC + SPECIAL_CHARS;
		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(dic.length());
			result += dic.charAt(index);
		}
		return result;
	}

}
