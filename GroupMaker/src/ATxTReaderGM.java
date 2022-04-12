import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ATxTReaderGM
	{

		
		//random array size
		static String[] student = new String[100];
		
		
		
		public static void readTxtYo() throws FileNotFoundException 
			{
				
				//reads TxT File
			Scanner file = new Scanner(new File("DATEXT.txt" ));
			int numberOfLines = file.nextInt();
		     
		      for( int i = 0; i < numberOfLines; i++ )
		          {
		        	  
		        	  String type = file.next(); 
		        	  
	//reads Students and puts them into an array 			        	  
		        	  if(type.equals("STUDENT????????"))
		        		  {
		        			 
		        			  		//something here
		        		  }
		          }
			
		}
		
	}
