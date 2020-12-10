package Name;
import java.io.*;

public class nameTest {
	public static void main(String[] args) throws Exception {
	  try {
	     BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
	     out.write("菜鸟教程");
	     out.close();
	     System.out.println("文件创建成功！");
	   } catch (IOException e) {
	     }
	  }
 }

