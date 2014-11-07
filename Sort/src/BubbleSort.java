
public class BubbleSort extends Sort{

	public BubbleSort(int[] num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSort()
	{
		for(int i = 0; i < num.length; ++i)
		{
			for(int j = 0; j < num.length - i - 1; ++j)
			{
				if(num[j] > num[j+1])
				{
					swap(num, j, j+1);
				}
			}
		}
		
	}

}
