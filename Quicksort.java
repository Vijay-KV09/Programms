public class Quicksort {

    static int pivot_finder(int arr[])
    {
        int pivot = arr[0];
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
        while (arr[i] <= pivot && i <= j) {
            i++;
        }
        while(arr[j] > pivot && j > i){
            j--;
        }
        if(i < j)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
        return j-1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,0,5};
        int pivot = pivot_finder(arr);
        System.out.println("Pivot : " + pivot);
    }   
}
