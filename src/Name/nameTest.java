package Name;
import java.io.*;

public class nameTest {
	public static void main(String[] args) throws Exception {
	  try {
	     BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
	     out.write("����̳�");
	     out.close();
	     System.out.println("�ļ������ɹ���");
	   } catch (IOException e) {
	     }
	  }
 }

