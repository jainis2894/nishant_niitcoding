
public class MessageUtil
{

	private String message;
	MessageUtil(String message)
	{
		this.message=message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	public String salutationMessage()
	{
		message ="Hi!!!"+this.message;
		System.out.println(message);
		return message;
	}
	
	

}
