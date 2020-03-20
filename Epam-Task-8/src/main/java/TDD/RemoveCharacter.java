package TDD;
public class RemoveCharacter {
	
public String RCString(String Str)
	{
		StringBuilder string=new StringBuilder(Str);
		if(string.charAt(1)=='A')
			string.deleteCharAt(1);
		if(string.charAt(0)=='A')
			string.deleteCharAt(0);
		return String.valueOf(string);
	}

}
