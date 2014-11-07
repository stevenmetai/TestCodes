
public class MergeSort extends Sort{

	public MergeSort(int[] num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSort()
	{
		num = mergeSort(num);		
	}

	private int[] mergeSort(int sort[])
	{
		if(sort.length == 1)
		{
			return sort;
		}
		int half = sort.length/2;
		int arr1[] = new int[half];
		int arr2[] = new int[sort.length - half];
		System.arraycopy(sort, 0, arr1, 0, half);
		System.arraycopy(sort, half, arr2, 0, sort.length - half);
		
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		return mergeSub(arr1, arr2);
		
		
	}
	
	private int[] mergeSub(int a1[], int a2[])
	{
		int[] result = new int[a1.length + a2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < a1.length && j < a2.length)
		{
			if(a1[i] < a2[j])
			{
				result[k] = a1[i];
				i++;
			}
			else 
			{
				result[k] = a2[j];
				j++;
			}
			k++;
		}
		
		while(i < a1.length)
		{
			result[k++] = a1[i++];
		}
		while(j < a2.length)
		{
			result[k++] = a2[j++];
		}
		return result;
	}
}
