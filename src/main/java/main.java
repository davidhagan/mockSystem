package mockSystem;
import java.io.File;
import java.io.FilNotFoundException;
import java.util.Scanner;

public class Main {

		public static void main(string[] args){
			Main m = new Main();
			String[] numbers = m.importPhoneNumbers("src/main/resources/phonenumbers.txt");
			List<PhoneNumber> phoneNumbers = numbers.toStream().map(n -> {
				return parsePhoneNumber(n);
			}).collect(toList());
		}
 
    Main() {
        
    }

    public String[] importPhoneNumbers(String fileName) {
        String[] phoneNumbers;
        
        File phoneNumbersFile = new File(fileName);
        Scanner sc = new Scanner(phoneNumbersFile);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            phoneNumbers.append(data);
        }

        return phoneNumbers;
    }

		public PhoneNumber parsePhoneNumber(string input){
			throw new NotImplementedException("Luke has to do this!");
		}

}
