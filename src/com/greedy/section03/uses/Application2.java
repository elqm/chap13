package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		/* try-with-resource 
		 * JDK 1.7���� �߰��� �����̴�.
		 * close �ؾ� �ϴ� �ν��Ͻ��� ��� try(�ν��Ͻ� ����) {}
		 * �ش� try-catch���� �Ϸ�� �� �ڵ����� close ���ش�.
		 * */
		try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));
				BufferedWriter out = new BufferedWriter(new FileWriter("test.dat"));) {
			String s;
			
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
