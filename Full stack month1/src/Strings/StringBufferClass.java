package Strings;
import java.util.*;
public class StringBufferClass {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,3,"Java").append("hello").replace(1, 2, "uzz");  
		System.out.println(sb);//prints HJavalo  
		}  
}
