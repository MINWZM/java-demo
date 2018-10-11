package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;




public class TextInputOuput {
	//BufferedReader读取键盘输入内容
	public static String testkey() throws IOException {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		//返回输入值
		return bufferedReader.readLine();
	}

	public static void main(String[] args) throws IOException {
		//1.流程：程序输入内容 => 创建文本tex1.txt并输出程序输入内容
		System.out.println("请输入:");
		//新建文件夹
		File file = new File("src/JDBC.min/io/text1.txt");
		//低端流,ture表示将字节写入文件的末尾而不是开头
		OutputStream outputStream = new FileOutputStream(file,true);
		//高端流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		//将键盘的输入内容写入文件
		outputStreamWriter.write(testkey());
		//清空高端流缓存区,否则数据保证数据写入文件中
		//		outputStreamWriter.flush();
		outputStreamWriter.close();
		outputStream.close();

		//2.流程:=>读取打印文本text1.text输入内容
		InputStream inputStream =new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String inString = bufferedReader.readLine();
		System.out.println("inputStream:"+inString);
		inputStream.close();
		inputStreamReader.close();
	}

}
