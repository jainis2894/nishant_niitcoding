import java.io.*;
class FileHan
{

public static void main(String args[]) throws Exception
{
	//File f=new File("nis.txt");
	FileInputStream fin=new FileInputStream("nis.txt");
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Training\\Desktop\\trainee\\nis\\hi.txt");
	int temp;
	while((temp=fin.read())!=-1)
	{
		fout.write(temp);	

	}

}


}