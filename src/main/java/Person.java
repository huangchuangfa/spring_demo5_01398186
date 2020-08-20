import java.math.BigDecimal;

public class Person {
	
	String personName;
	
	Integer age; //用户1写的
	
	String hobby; //用户1编写了hobby


	/**
	 * Allocates a new {@code String} constructed from a subarray of an array
	 * of 8-bit integer values.
	 *
	 * <p> The {@code offset} argument is the index of the first byte of the
	 * subarray, and the {@code count} argument specifies the length of the
	 * subarray.
	 *
	 * <p> Each {@code byte} in the subarray is converted to a {@code char} as
	 * specified in the method above.
	 *
	 * @deprecated This method does not properly convert bytes into characters.
	 * As of JDK&nbsp;1.1, the preferred way to do this is via the
	 * {@code String} constructors that take a {@link
	 * java.nio.charset.Charset}, charset name, or that use the platform's
	 * default charset.
	 *
	 * @param  ascii
	 *         The bytes to be converted to characters
	 *
	 * @param  hibyte
	 *         The top 8 bits of each 16-bit Unicode code unit
	 *
	 * @param  offset
	 *         The initial offset
	 * @param  count
	 *         The length
	 *
	 * @throws  IndexOutOfBoundsException
	 *          If the {@code offset} or {@code count} argument is invalid
	 *
	 * @see  #String(byte[], int)
	 * @see  #String(byte[], int, int, java.lang.String)
	 * @see  #String(byte[], int, int, java.nio.charset.Charset)
	 * @see  #String(byte[], int, int)
	 * @see  #String(byte[], java.lang.String)
	 * @see  #String(byte[], java.nio.charset.Charset)
	 * @see  #String(byte[])
	 */


























	public void print(){
		System.out.println("用户1");
	}


	private void add(){

	}

	private void setAge(Integer age) {
		this.age = age;
	}
	
	private BigDecimal money;



}
