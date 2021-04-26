import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("saranya.txt"));
		String s = "Learning Java";
		byte[] b = s.getBytes();
		fos.write(b);

		FileInputStream fis = new FileInputStream(new File("saranya.txt"));
		int op;
		while ((op = fis.read()) != -1) {
			System.out.print((char) op);
		}
	}

}