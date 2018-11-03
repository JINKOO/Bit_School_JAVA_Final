package FileIOcloseUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(BufferedReader br, FileReader fr) {
		close(br);
		close(fr);
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer pw, Writer bw, Writer fw) {
		close(pw);
		close(bw);
		close(fw);
	}
}
