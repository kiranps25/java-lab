class exceptiondemo
{
	public static void main(String args[])
	{
		try{
			int result=10/0;
			System.out.println("result: "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught: ArithmeticException-Cannot divide by zero!");
		}
	
		try{
		int[] arr={1,2,3};
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception caught: ArrayIndexOutOfBoundsException-index out of bouds!");
		}
		System.out.println("Program continues to run normally after handling exceptions.");
	}
}
