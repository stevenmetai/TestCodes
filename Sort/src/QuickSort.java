
public class QuickSort extends Sort
{

	public QuickSort(int[] num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSort()
	{
		doSort(num, 0, num.length-1);
	}

	private void doSort(int[] num, int start, int end)
	{
		if(end <= start)
		{
			return;
		}
		int i = start;
		int j = end;	
		int pivot = num[start];
		while(j > i)
		{
			while(num[i] <= pivot && i < end) // ����J��j��pivot��
			{
				i++;
			}
			while(num[j] > pivot && j > start) // ����J��p��pivot��
			{
				j--;
			}
			if(j > i)
			{
				swap(num, i, j); //������m
			}
		}
		swap(num, start, j); //
		doSort(num, start, j-1);
		doSort(num, j+1, end);
		
	}

}
