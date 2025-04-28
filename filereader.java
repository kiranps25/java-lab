import java.io.FileReader;
import java.io.IOException;

class ReadFileExanple1
{
	public static void main(String[] args)
	{
		try{
			FileReader reader= new FileReader("/home/s2mcabatch2/Downloads/lab cycle");
			int character;
			while((character=reader.read())!=-1){
				System.out.print((char) character);
			}
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
