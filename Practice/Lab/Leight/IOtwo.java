package Leight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOtwo {

	public static void main(String[] args) {
		File file = new File("C:\\Java8\\Naren.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String numbers = sc.nextLine();
				String[] nums = numbers.split(",");
				for (String digit : nums) {
					if (Integer.parseInt(digit) % 2 == 0)
						System.out.println(digit);
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}