package FileRead;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
@SuppressWarnings("all")
public class test1 {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\post.txt");
		FileReader fr =new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("E:\\post1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String str=null;	
		
		byte []b=new byte[1024];
		while((str=br.readLine())!=null) {
			//System.out.println(str);
		//	System.out.println(str.getBytes("GB2312"));
			bw.append(new String(str.getBytes("gbk"),"utf-8"));
			bw.newLine();//huanhang
			bw.flush();//清空缓冲区
		//	System.out.print((char)len);
		}
	}


}
