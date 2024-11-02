public class Solution {
	public static boolean isValid(String str) {
		 // Write your code here.
		boolean lower = false, upper = false, len = false,digit = false, special = false;
		if(str.length()<8 && str.length()>15) return false;
		

		for(int  i =0; i <str.length(); i++){
			int ch = (int)str.charAt(i);
			if(ch >= 65 && ch<= 90) upper = true;
			else if(ch >=97 && ch<= 122 ) lower = true;
			else if(ch == 32 ) return false;
			else if(ch >= 48 && ch<= 57) digit = true;
			else special = true;
		}

		if(lower && upper && len && digit && special) return true;
		else return false;
	}
}

