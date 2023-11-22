public class SelectionSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {

        String[]  arrayOfStrings = {"samarth","latika","anshika","nikhil","muskan"};
        SelectionSortGeneric<String> stringSorter   = new SelectionSortGeneric<>();
        stringSorter.selectionSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        Integer[] arrayOfInt = { 25,32,56,12,31};
        SelectionSortGeneric<Integer> IntSorter   = new SelectionSortGeneric<>();
        IntSorter.selectionSort(arrayOfInt);
        System.out.println(java.util.Arrays.toString(arrayOfInt));
    }

    void selectionSort(T[] array)
    {
for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++)
     {
    int minIndex = currentIndex;
    for (int i = currentIndex + 1; i < array.length; i++)
            {
        if (array[i].compareTo(array[minIndex]) < 0)
                {
                
                    minIndex = i;
                }
            }

            if (minIndex != currentIndex)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}