public class restaurantNotFoundException extends Throwable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6860141217337981L;

	public restaurantNotFoundException(String restaurantName)
	{
		super(restaurantName);
	}
}
