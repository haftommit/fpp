package week1lesson2;
	
/**
 * 
 * @author haftomtesfay
 "horse","dog","cat"
 */
	public class Q5 {
		
	public static void main(String[] args) {
		
		String[] inputArray = {"horse", "dog", "cat", "horse","dog"};
		String[] outputArray = new String[10];
		
		boolean noAdd = false;
		int i = 0;
		int index = 0 ;
		
		for(i=0; i<inputArray.length; i++)
			{
				for(int j=0; j<outputArray.length; j++)
				{
					if(inputArray[i].equals(outputArray[j]))
						noAdd = true;
				}
				if(!noAdd)//we have to add it
				{
					outputArray[index++] = inputArray[i];
				}
			}
			for(int k =0; k<index;k++)
			{
				System.out.print("\""+ outputArray[k]+"\"");
				if(k != index-1)
					System.out.print(",");
			}
			
		}
}