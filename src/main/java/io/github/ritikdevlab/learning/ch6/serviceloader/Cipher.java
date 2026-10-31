package io.github.ritikdevlab.learning.ch6.serviceloader;

public interface Cipher {
	byte[] encrypt(byte[] source, byte[] key);
	byte[] decrypt(byte[] source, byte[] key);
	int strength();
}