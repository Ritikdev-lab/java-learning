package io.github.ritikdevlab.learning.ch6.serviceloader;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
	public static void main(String[] args) {
		
		// Step 1: Load all registered Cipher providers
		ServiceLoader<Cipher> loader = ServiceLoader.load(Cipher.class);
		
		// Step 2: Store discovered providers using Iterator
		List<Cipher> providers = new ArrayList<>();
		Iterator<Cipher> iterator = loader.iterator();
		
		while (iterator.hasNext()) {
			Cipher cipher = iterator.next();
			providers.add(cipher);
		}
		
		// Step 3: Display all available implementations
		IO.println("Available Cipher Implementations:");
		
		for (Cipher cipher : providers) {
			IO.println(cipher.getClass().getSimpleName() + " | Strength: " + cipher.strength());
		}
		
		// Step 4: Select a providers based on minimum strength
		int minStrength = 2;
		
		Optional<Cipher> selectedCipher = loader.stream()
						.map(ServiceLoader.Provider::get)
						.filter(cipher -> cipher.strength() >= minStrength)
						.findFirst();
		
		// Step 5: Check whether s suitable provider exits
		if (selectedCipher.isEmpty()) {
			IO.println("NO suitable Cipher found.");
			return;
		}
		
		Cipher cipher = selectedCipher.get();
		
		IO.println("\nSelected Cipher: " + cipher.getClass().getSimpleName());
		
		// Step 6: Prepare original message and key
		String message = "Hello ServiceLoader";
		
		byte[] source = message.getBytes(StandardCharsets.UTF_8);
		byte[] key = "JAVA".getBytes(StandardCharsets.UTF_8);
		
		// Step 7: Encrypt
		byte[] encrypted = cipher.encrypt(source, key);
		IO.println("\nOriginal Message: " + message);
		IO.println("Encrypted Bytes: " + Arrays.toString(encrypted));
		
		// Step 8: Decrypt
		byte[] decrypted = cipher.decrypt(encrypted, key);
		String decryptedMessage = new String(decrypted, StandardCharsets.UTF_8);
		IO.println("Decrypted Message: " + decryptedMessage);
		
		// Step 9: Verify
		IO.println("\nEncrypted Verification: " + Arrays.equals(source, decrypted));
		
	}
}
