package mockSystem;
import java.io.File;
import java.io.FilNotFoundException;
import java.util.Scanner;

public class Main {

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


}
