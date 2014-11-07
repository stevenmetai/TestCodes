
public class InsertionSort extends Sort
{

	public InsertionSort(int[] num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSort()
	{
		for(int i = 0; i < num.length; ++i)
		{
			for(int j = 0; j < i; j++)
			{
				if(num[i] < num[j])
				{
					swap(num, i, j);
				}
			}
		}
		
	}
	

}
