
public abstract class Sort
{
	int[] num;
	
	public Sort(int[] num)
	{
		this.num = num;
	}
	
	protected static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void result()
	{
		for(int i = 0; i < num.length; ++i)
		System.out.printf("%d ,", num[i]);
	}
	
	public abstract void doSort();
}
