package Sorting;

public class MergeSort {
	static void merge(int arr[],int temp[],int low,int high,int mid) {
		//int temp[]=new int [high+1];
		//System.out.println(high+1);
		for(int i=0;i<=high;i++) {
			temp[i]=arr[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(temp[i]<=temp[j]) {
				arr[k]=temp[i];
				i++;
				
			}
			else {
				arr[k]=temp[j];
				j++;
				
			}
			k++;
			
		}
		while(i<=mid) {
			arr[k]=temp[i];
			i++;
			k++;
		}
		while(j<=high) {
			arr[k]=temp[j];
			j++;
			k++;
		}
	}
    static void mergesort(int arr[],int temp[],int low,int high){
    	if(low<high) {
    		int mid=(low+high)/2;
    		//System.out.println(mid);
    		mergesort(arr,temp,low,mid);
    		mergesort(arr,temp,mid+1,high);
    		merge(arr,temp,low,high,mid);
    	}
    }
    static void printArray(int arr[],int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {12,8,11,1,5,7,10};
        int n=arr.length-1;
        int temp[]=new int[n+1];
        mergesort(arr,temp,0,n);
        printArray(arr,n+1);
	}
//time complexity of merge sort is o(n*logn)
}
