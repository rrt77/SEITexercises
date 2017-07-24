import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question3{
	File file;
	Scanner sc;

	public void doesFileExist(String path) {

		try {
			String path1 = path;
			file = new File(path1);
			sc = new Scanner(file).useDelimiter("\\Z");
			System.out.println("THE FILE IS EXIST AT THAT PATH");
			System.out.println("-------------------------------------------------");
		}

		catch (Exception e) {
			System.out.println("THE FILE IS NOT EXIST AT THAT PATH");
			System.out.println(e.getMessage());
						
		}
		String contents = sc.next();

		sc.close();

		String[] line = contents.split("-");

		// To display
		for (String line1 : line) {
			String[] splitelines = line1.split(",");
			for (String m : splitelines) {

				System.out.println(m);
			}

		}
	}

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\rrt.txt";

		Question3 qsb = new Question3();

		qsb.doesFileExist(path);

	}

}
