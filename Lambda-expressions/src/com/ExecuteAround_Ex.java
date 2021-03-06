package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface // annotation
interface BufferedReaderProcessor {
	void process(BufferedReader br) throws IOException;
}

public class ExecuteAround_Ex {

	public static void main(String[] args) throws Exception {
		// task-1 : read one menu item
		readFile(br -> System.out.println(br.readLine()));
		readFile(br -> System.out.println(br.readLine() + "" + br.readLine()));
	}

	private static void readFile(BufferedReaderProcessor processor) throws Exception {
		// init/preparation
		File file = new File("menu.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		// ..
		processor.process(br);
		// clean
		br.close();

	}

}
