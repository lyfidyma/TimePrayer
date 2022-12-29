package time.prayer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception{
		//PGraph pgr = new PGraph();
		Scanner scanner = new Scanner(new File("config.txt"));
		String pgraphClassName = scanner.next();
		Class pGraph = Class.forName(pgraphClassName);
		IGraph ipg = (IGraph) pGraph.getDeclaredConstructor().newInstance();

	}

}
