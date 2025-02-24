public class PracticeProblem {

	public static void main(String args[]) {

	}
public static int[] createIntArray(){
	int[] intArr = new int[5];
	for (int i = 0; i < intArr.length; i++){
		intArr[i] = i + 1;
	}
	return intArr;
}
public static String[] createArray (String word, String word2, String word3, String word4){
	String strArr[] = {word, word2, word3, word4};
	return strArr;
	}

public static int findValue(int num,int[] intArr){
	for (int i =0; i< intArr.length; i++){
		if (intArr[i] == num){
			return i;
		}
	}
	return -1;
}

public static int findThirdValue(String word, String[] strArr){
	int counter = 0;
	for(int i = 0; i < strArr.length; i++){
if (word.equals(strArr[i])){
	counter++;
}
if (counter == 3){
	return i;
}
	}
	return -1;
}
}


