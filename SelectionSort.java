package Sorting;

public class SelectionSort {
    static void selectionsort(int arr[],int n) {
    	for(int i=0;i<n-1;i++) {
    		int min=i;
    		for(int j=i+1;j<n;j++) {
    			if(arr[j]<arr[min]) {
    				min=j;
    			}
    		}
    		int temp=arr[min];
    		arr[min]=arr[i];
    		arr[i]=temp; 
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
      selectionsort(arr,arr.length);
      printArray(arr,arr.length);
	}
	//complexity is o(n^2);
}
