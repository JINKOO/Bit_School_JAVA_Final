package FileIO_FileClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import FileIOcloseUtil.FileClose;

/*
 * ObjectInput,OutputStream.
 * 객체 직렬화 사용하기 이전 배경.. 
 */

class User {
	
	private String name;
	private int age;
	private String addr;
	
	User(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return "name : " + name + ", age : " + age + ", Addr : " + addr;
	}
}

public class FileIOMain09 {

	public static void write() {
		
		User user = new User("홍길동", 25, "서울 서초동");
		
		try (
				FileWriter fw = new FileWriter("iotest/Userinfo.txt");
				BufferedWriter bw = new BufferedWriter(fw);
		) {
			bw.write(user.getName() + ", " + user.getAge() + ", " + user.getAddr());
			bw.newLine();
			bw.flush();
			
			System.out.println("userInfo에 저장 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("iotest/Userinfo.txt");
			br = new BufferedReader(fr);
			
			String str = br.readLine();
			String[] data = str.split(", ");
			
			User user = new User(data[0], Integer.parseInt(data[1]), data[2]);
			
			System.out.println(user);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
	}
	
	public static void main(String[] args) {
		
//		write();
		read();
	}
}
