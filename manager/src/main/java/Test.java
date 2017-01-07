import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		ZipInputStream zis = new ZipInputStream(new FileInputStream("E:/Desktop.zip"));
		ZipEntry ze = null;
		while((ze = zis.getNextEntry()) != null) {
			System.out.println(ze.getName());
		}
	}
}
