import java.io.File;
public class FileSample{
	public static void main(String args[]){
		File parent = new File("/home/valens");
		File file = new File(parent,"/Documents/vim/file1.txt");
		System.out.println(file.exists());
	}
}
