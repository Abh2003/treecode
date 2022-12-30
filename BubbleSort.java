package Sorting;

public class BubbleSort {
    static void bubblesort(int arr[],int n) {
    	for(int i=0;i<n-1;i++) {
    		for(int j=0;j<n-i-1;j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    }
    static void printArray(int arr[],int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {19,5,6,13,4};
	      bubblesort(arr,arr.length);
	      printArray(arr,arr.length);
	}
// complexity is o(n^2);
}
