/*
 * Program for finding subsequence using recursion
 * Time Complexity: 2^(n)
 * Space Complexity: O(n)
 * for n data there will be 2^(n) subsequence patterns
*/
import java.util.*;

class subsequence_Recursion
{
    static void subsequence(int i,int arr[],int n,List<Integer>list)
    {
        if(i >= n){
            for(int data : list){
                System.out.print(data + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[i]);
        subsequence(i+1, arr, n, list);
        list.remove(list.size()-1);
        subsequence(i+1, arr, n, list);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        subsequence(0,arr,n,list);
    }
}