import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class csv_reader {

private static BufferedReader br = null; 
private static String[] elem; 
private static String line = ""; //initialize line 
private static String commasSplit = ","; //parse lines in csv by commas 
//BufferedReader filename = new BufferedReader(new FileReader(filename));

	public static boolean isNumeric(String strNum) {
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

		//int number = 0;
		while((line = br.readLine()) != null && (line = br.readLine()) != "[]" ){ //while the line is not null
			elem = line.split(commasSplit); //split
			//number ++;
				//if(isNumeric(line)){
					//int intID = Integer.parseInt(line);
				//}

				for (int i=0; i < elem.length -1; i++){
					if(isNumeric(elem[0]) && isNumeric(elem[elem.length -1])){
						System.out.println((Arrays.asList(elem)));
					}
				}
			}

		//String[] metaA = new String[elem.length()-1];
		//int index = 0;

		/*for (int i=0; i<Arrays.asList(elem).size()-1; i++){
			for(int j=0; j<i; j++){
				if(elem[i][-1].isNumeric){
					metaA[index]=elem[i];
					index++;
			    }
			}
		}*/
		//System.out.println((Arrays.asList(elem)));
		//System.out.println((Arrays.asList(elem)) + "this is number " + number);

	}

	public static void main(String[] args) throws IOException{

		//testing testing . . .
		csvReadReg("1610010901-eng.csv");
		System.out.print("\n\r");
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.print("\n\r");
		metadataRead("1610010901_MetaData.csv");
		
	}
    
}
