package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	private String path;

	public OutputService(String path) {
		this.path = path;
	}
	
	public void writeInfo(String info) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(info);
		pw.close();
	}
}
