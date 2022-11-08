package main.java.com.example.security;

import org.springframework.

public class PassEncrypt {
	public static void main(String[] args){
		String password = "123456";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);
	}	
}
