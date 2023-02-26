import java.util.*;
import java.io.*;

public class WriteF{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos=null;
		DataInputStream dis=null;
		
try{
		System.out.println("enter your file name: ");
		String a=sc.nextLine();

		fos=new FileOutputStream(a);
		
		System.out.println("enter your data: ");

		dis=new DataInputStream(System.in);
		
		char ch;
		while((ch=(char)dis.read())!='@'){
			

				fos.write(ch);

			
}
}
catch(Exception e){
	System.out.println(e);
}
finally{
try{
fos.close();
dis.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
}
