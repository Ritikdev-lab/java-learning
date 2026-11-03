package io.github.ritikdevlab.learning.ch6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxiesUse {
	public static void main(String[] args) {
		Calculator calulate = new Math();
		
		Calculator proxy = (Calculator) Proxy.newProxyInstance (
								Calculator.class.getClassLoader(), 
								new Class<?>[] {Calculator.class},
								(proxyObject, method, parameters) -> {
									if (method.isDefault()) {
										IO.println("Default method: " + method.getName());
										return InvocationHandler.invokeDefault(proxyObject, method, parameters);
									}
									IO.println("Method name: " + method.getName());
									return method.invoke(calulate, parameters);
								}
							);
		IO.println("is it proxy class: " + Proxy.isProxyClass(proxy.getClass()));
		IO.println(proxy.greet());
		IO.println(proxy.add(12, 23));
		IO.println(proxy.substract(130, 12));
	}
}

interface Calculator {
	int add(int first, int second);
	int substract(int first, int second);
	default String greet() {
		return "Hello";
	}
}

class Math implements Calculator {
	@Override
	public int add(int first, int second) {
		return first + second;
	}

	@Override
	public int substract(int first, int second) {
		return first - second;
	}
}