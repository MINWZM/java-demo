package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputMethod {

	//从键盘获取输入值并打印到控制台
	//方式1:Scanner	- java.util.Scanner
	public static Scanner ScannerMethod() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	//方式2:BufferedReader
	public static BufferedReader BufferedReadMethod() {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader;
	}
	//方式3:System.in.read()  - 只能输入字节
	public static char SystemInRead() throws IOException {
		return (char)System.in.read();
	}

	public static void main(String[] args) throws IOException {
	/*	System.out.println("方式1:Scanner:"+ScannerMethod().nextLine());
		System.out.println("方式2:Buffered:"+BufferedReadMethod().readLine());
		System.out.println("方式3:SystemInRead:"+SystemInRead());*/
		System.out.print("age:");
		int age=ScannerMethod().nextInt();
		System.out.print("name:");
		String name=ScannerMethod().nextLine();
		System.out.print("salary:");
		float salary=ScannerMethod().nextFloat();
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
	}
}
