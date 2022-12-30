package Sorting;

public class InsertionSort {
    static void insertionsort(int arr[],int n) {
    	for(int i=1;i<n;i++) {
    		int key=arr[i];
    		int j=i-1;
    		while(j>=0 && arr[j]>key) {
    			arr[j+1]=arr[j];
    			j=j-1;
    		}
    		arr[j+1]=key;
    	}
    }
    static void printArray(int arr[],int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {12,11,5,6,13};
        insertionsort(arr,arr.length);
        printArray(arr,arr.length);
	}
//complexity is o(n^2);
}
