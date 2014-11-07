
public class MainClass
{

	public static void main(String[] argv)
	{
		Sort sort =  new QuickSort(new int[]{52,68,59,40,52,99,12,77});
		sort.doSort();
		sort.result();
	}
}
