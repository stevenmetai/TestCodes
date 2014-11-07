
public class SelectionSort extends Sort
{

	public SelectionSort(int[] num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSort()
	{
		int min;
		int minIndex = 0;
		for(int i = 0; i < num.length - 1; ++i)
		{
			min = num[i];
			for(int j = i; j < num.length; ++j)
			{
				if(num[j] < min)
				{
					min = num[j];
					minIndex = j;
				}
			}
			swap(num, minIndex, i);
			
		}
	}
	

}
