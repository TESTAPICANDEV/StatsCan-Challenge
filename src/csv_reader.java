import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class csv_reader extends data_object {

private static BufferedReader br = null;
private static String line = ""; //initialize line
private static String commasSplit = ","; //parse lines in csv by commas
//BufferedReader filename = new BufferedReader(new FileReader(filename));

	private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

	private static void csvReadReg(String filename) throws IOException{
		br = new BufferedReader(new FileReader(filename)); //open file
		while((line = br.readLine()) != null){ //while the line is not null
			String[] elem = line.split(commasSplit); //split
			System.out.println(Arrays.asList(elem));
		}
	}

	private static void metadataRead(String filename) throws IOException{
		br = new BufferedReader(new FileReader(filename)); //open file
		while((line = br.readLine()) != null){ //while the line is not null
			String[] elem = line.split(commasSplit); //split
				if(isNumeric(line)){
					int intToStr = Integer.parseInt(line);
				}
			System.out.println(Arrays.asList(elem));
		}

	}

	public static void main(String[] args) throws IOException{
		csvReadReg("1610010901_MetaData.csv");
		System.out.print("\n\r");
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.print("\n\r");
		metadataRead("1610010901_MetaData.csv");

	}


}
