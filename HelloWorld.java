import java.io.PrintWriter;
import java.io.File;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.lang.System;

class HelloWorld{
	public static void main(String[] args){
		
		System.out.println("hello world!");
		
		File f = new File("test.txt");
		
		if(f.exists()){
			System.out.println("file found..");
			System.out.println("changing content..");
			try{
			//write to file
				PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
				writer.println("this is new text ");
				writer.println("written into an existing file");
				writer.close();
			}catch(IOException ex){
				System.out.println(ex.toString() + "!!!");
			}
		}
		else{
			//create new file
			System.out.println("no such file..");
			System.out.println("creating new file..");
			List<String> lines = Arrays.asList("this is a text ", "written in a new file");
			Path file = Paths.get("test.txt");
			try{
				Files.write(file, lines, Charset.forName("UTF-8"));
			}catch(IOException ex){
				System.out.println(ex.toString() + "!!");
			}
			
		}

	}
}