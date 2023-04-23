import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter extends Object {

	private static MorseCodeTree mct = new MorseCodeTree();

	public static String printTree(){

		String output="";
		int i;

		for(i=0;i<mct.toArrayList().size()-1;++i){
			if(mct.toArrayList().get(i)!=null){
				output+=mct.toArrayList().get(i)+" ";
			}
		}
		output+=mct.toArrayList().get(i);
		return output;

	}

	public static String convertToEnglish(String code){

		String[] words = code.split(" / ");
		StringBuilder output = new StringBuilder();
		for (String word : words) {
			String[] letters = word.split(" ");
			for (String letter : letters) {
				if (letter.equals(" ")) {
					output.append(" ");
				} else {
					output.append(mct.fetch(letter));
				}
			}
			output.append(" ");
		}
		return output.toString().trim();

	}

	public static String convertToEnglish(File codeFile) throws FileNotFoundException{
		StringBuilder output = new StringBuilder();
		ArrayList<String> sentence = new ArrayList<String>();
		String[] word=null; 
		String[] letter; 

		Scanner inputFile = new Scanner(codeFile);

		while (inputFile.hasNext()){
			sentence.add(inputFile.nextLine());
		}
		inputFile.close();


		for(int i = 0; i < sentence.size(); i++){
			
			word = sentence.get(i).split(" / ");
			
		}
		

		for(int j = 0; j < word.length; j++){
			letter = word[j].split(" ");

			for(int k = 0; k < letter.length; k++){

				output.append( mct.fetch(letter[k]));
			}

			
			output.append( " ");
		}
		
		return output.toString().trim();


	}


}
