import java.io.*;
import java.util.Scanner;

public class Commands {
	void showCommands() {
		boolean toUpdate = false;
		String hs = null;
		String command;
		Scanner input = new Scanner(System.in);

		System.out
				.println("What would you like to do? (1=Update Z HS, q=quit)");
		command = input.next();

		Processing process = new Processing();

		switch (command) {
		case "1":
			toUpdate = true;
			hs = "zplayers.txt";

			break;
		case "q":
			System.out.println("Program is terminating!");
			break;

		default:
			System.out.println("What's that mean?");
			break;
		}

		
		if (toUpdate = true) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(hs));

				for (String line = br.readLine(); line != null; line = br
						.readLine()) {
					process.updateCML(line);
				}

				br.close();
			} catch (IOException ex) {

			}
		}

		input.close();
	}
}
