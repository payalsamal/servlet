package com.example.servlet.java.design.patter.creational;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSingletoneUsingSerialization {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		EgarSingletone s1 = EgarSingletone.getInstance();
		// serialize
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
		oos.writeObject(s1);

		// deserialize
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj"));
		EgarSingletone s2 = (EgarSingletone) ois.readObject();

		System.out.println(s1 == s2); // false ❌
	}
}
