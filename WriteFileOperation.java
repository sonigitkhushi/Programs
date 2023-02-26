/*1.WAP to Perform Below Operation with 4 methods:
a. Read File
b. Write File------
c. Delete File
d. Search File in given directory*/


import java.io.*;
import java.util.Scanner;
public class WriteFileOperation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
FileOutputStream fos=null;
DataInputStream dis=null;

try
{
System.out.println("Enter Your File Name...");
String s=sc.nextLine();
fos=new FileOutputStream("D:\\javaSession\\s");

System.out.println("Input Your Data....");
dis=new DataInputStream(System.in);

char a;
while((a=(char)dis.read())!='@')
{
fos.write(a);
}


}
catch(Exception e)
{
System.out.println(e);
}


}
}