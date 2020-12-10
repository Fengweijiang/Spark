package Name;

import java.util.Scanner;
import java.io.*;

public class randomDemo {
	public static void main(String[] args) {
		try {
            BufferedWriter out1 = new BufferedWriter(new FileWriter("first.txt",true));
            out1.write("Id		Name		Chinese		English		Physics");
            out1.write("\n");
            out1.close();
		}catch (IOException e) { e.printStackTrace();}
		
		String name;
		char[] NameChar;
		String[] RandomName = null;
		String IdNumber;
		String ChineseScord;
		String EnglishScord;
		String PhysicsScord;
		int m=0,E=0,P=0,C=0;
		String Finall;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入要生成的姓名的长度：");
		int nameLength=scanner.nextInt();
				
		for(int n=0;n<10000;n++){
			m=m+1;
			IdNumber = String.valueOf(m);
			
			E=(int)(Math.random()*(100-1)+1);
			EnglishScord=String.valueOf(E);
			P=(int)(Math.random()*(100-1)+1);
			PhysicsScord=String.valueOf(P);
			C=(int)(Math.random()*(100-1)+1);
			ChineseScord=String.valueOf(C);
			
			
			NameChar=new char[nameLength];
			NameChar[0]=(char)(Math.random()*26+65);
				for(int i=1;i<nameLength;i++){
					NameChar[i]=(char)(Math.random()*26+97);
				}
				name =new String(NameChar);
				System.out.println(name);
			
			Finall=IdNumber+"\t\t"+name+"\t"+ChineseScord+"\t"+EnglishScord+"\t"+PhysicsScord;
				
			try {
	            BufferedWriter out2 = new BufferedWriter(new FileWriter("first.txt",true));
	            out2.write(Finall);
	            out2.write("\n");
	            out2.close();
	            System.out.println("文件创建成功！");
			}catch (IOException e) {
				e.printStackTrace();
	        }
			
		  }
//		for(int n=0;n<10;n++){
//		NameChar=new char[nameLength];
//		NameChar[0]=(char)(Math.random()*26+65);
//			for(int i=1;i<nameLength;i++){
//				NameChar[i]=(char)(Math.random()*26+97);
//			}
//			name =new String(NameChar);
//			System.out.println(name);
//	
//		try {
//            BufferedWriter out = new BufferedWriter(new FileWriter("first.txt",true));
//            out.write(name);
//            out.write("\n");
//            out.close();
//            System.out.println("文件创建成功！");
//		}catch (IOException e) {
//			e.printStackTrace();
//        }
//		
//	  }

//		for(int n=0;n<10;n++){
//			NameChar=new char[nameLength];
//			NameChar[0]=(char)(Math.random()*26+65);
//				for(int i=1;i<nameLength;i++){
//					NameChar[i]=(char)(Math.random()*26+97);
//				}
//				name ="\t\t"+new String(NameChar);
//				System.out.println(name);
//		
//			try {
//	            BufferedWriter out = new BufferedWriter(new FileWriter("first.txt",true));
//	            out.write(name);
//	            out.write("\n");
//	            out.close();
//	            System.out.println("文件创建成功！");
//			}catch (IOException e) {
//				e.printStackTrace();
//	        }
//			
//		  }
//		for(int n=0;n<10;n++){
//			NameChar=new char[nameLength];
//			NameChar[0]=(char)(Math.random()*26+65);
//				for(int i=1;i<nameLength;i++){
//					NameChar[i]=(char)(Math.random()*26+97);
//				}
//				name ="\t\t"+new String(NameChar);
//				System.out.println(name);
//		
//			try {
//	            BufferedWriter out = new BufferedWriter(new FileWriter("first.txt",true));
//	            out.write(name);
//	            out.write("\n");
//	            out.close();
//	            System.out.println("文件创建成功！");
//			}catch (IOException e) {
//				e.printStackTrace();
//	        }
//			
//		  }
//		for(int n=0;n<10;n++){
//			NameChar=new char[nameLength];
//			NameChar[0]=(char)(Math.random()*26+65);
//				for(int i=1;i<nameLength;i++){
//					NameChar[i]=(char)(Math.random()*26+97);
//				}
//				name ="\t\t"+new String(NameChar);
//				System.out.println(name);
//		
//			try {
//	            BufferedWriter out = new BufferedWriter(new FileWriter("first.txt",true));
//	            out.write(name);
//	            out.write("\n");
//	            out.close();
//	            System.out.println("文件创建成功！");
//			}catch (IOException e) {
//				e.printStackTrace();
//	        }
//			
//		  }
    }
}		
