public class VowelChecker 
{
	static boolean isVowel(char alpha)
	{
		switch(alpha)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(isVowel('t'));
		System.out.println(isVowel('u'));
		System.out.println(isVowel('v'));
		System.out.println(isVowel('a'));
		System.out.println(isVowel('e'));
	}
}
