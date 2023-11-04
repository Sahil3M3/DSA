
public class Try {
	static public void main(String sahil[]) {
		String word1 = "ab", word2 = "pqrs";
		String s = "";
		char word3[], word4[], word5[];
		// word3=word1.toCharArray();
		// word4=word1.toCharArray();
		int f = 1, size;
		size = word1.length() > word2.length() ? word1.length() : word2.length();
		
		
		for(int i=0;i<size;i++)
		{
			if(size>i)
			{
				if(word1.length()>i)
		      	{  
				s+=word1.charAt(i);	
			     }
				s+=word2.charAt(i);
			}
		}
		System.out.println(s);
		
		
//		for (int i = 0, j = 0; j < size ;) {
//
//			if (f == 1) {
//				s += word1.charAt(i);
//				f = 0;
//				i++;
//			} else {
//				s += word2.charAt(j);
//				j++;
//				f = 1;
//			}
//		}
//		System.out.println(s);

	}

}
