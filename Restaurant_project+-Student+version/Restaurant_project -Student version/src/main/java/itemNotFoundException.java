public class itemNotFoundException extends Throwable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8656535255873723201L;

	public itemNotFoundException(String itemName)
	{
		super(itemName);
	}
}
