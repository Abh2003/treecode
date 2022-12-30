package Sorting;

public class QuickSort {
	static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low;
		int j=low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
 	 static void Quicksort(int arr[],int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			Quicksort(arr,low,pi-1);
			Quicksort(arr,pi+1,high);
		}
	}
	static void printArray(int arr[],int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {25,2,20,10,5,8};
        int n=arr.length-1;
        Quicksort(arr,0,n);
        printArray(arr,n+1);
	}

}
