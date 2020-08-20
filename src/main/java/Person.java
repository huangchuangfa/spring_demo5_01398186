public class Person {
	
	String personName;
	
	Integer age; //用户1写的
	
	String hobby; //用户1编写了hobby

	/**
	 * 窗口2在22:45做了修改
	 */
	public void print(){
		System.out.println("用户1");
	}
	
	
	private void add(){

	}

	/**
	 * 窗口2在22:46做了修改
	 * @param age
	 */


	private void setAge(Integer age) {
		this.age = age;
	}
	
	private BigDecimal money;
	
}
