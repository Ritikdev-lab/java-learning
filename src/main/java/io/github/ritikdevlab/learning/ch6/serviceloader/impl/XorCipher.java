package io.github.ritikdevlab.learning.ch6.serviceloader.impl;

import io.github.ritikdevlab.learning.ch6.serviceloader.Cipher;

public class XorCipher implements Cipher {

	@Override
	public byte[] encrypt(byte[] source, byte[] key) {
		if (key == null || key.length == 0) {
			throw new IllegalArgumentException("Key cannot be empty");
		}
		
		var result = new byte[source.length];
		
		for (int i = 0; i < source.length; i++) {
			result[i] = (byte) (source[i] ^ key[i % key.length]);
		}
		return  result;
	}

	@Override
	public byte[] decrypt(byte[] source, byte[] key) {
		return encrypt(source, key);
	}

	@Override
	public int strength() {
		return 3;
	}

}
