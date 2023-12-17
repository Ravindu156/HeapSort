


/*
Pseudo Code

Heapify (A sa array,n as int, i as int){
    largest=i
    leftchild=2*i+1
    rightchild=2*i+2


    if(leftchild<=n and A[i]<A[leftchild]){
        max=leftchild
    }

    if(rightchild<=n and A[i]<A[rightchild]){
        max=rightchild
    }

    if(max !=i){
        swap(A[i],A[largest])
        Heapify(A,n,largest)
    }

} 


HeapSort(A as array){
    n=length(A)
    for i=n/2 downto 1
        Heapify(A,n,i)
    
    for i=n downto 2
        Swap A[1] with A[i]
        A.heapsize=A.heapsize-1
        Heapify(A,i,0)
}









 */



















public class HeapSort{

    public void heapify(int arr[],int n,int i){
        //Find the largest amount root,left child, right child
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;


        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }

        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }

        //swap and continue heapifying if root is not largest

        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapify(arr,n,largest);
        }

    }

    public void sort(int arr[]){
        int n=arr.length;

        //Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
          }

          for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
      
            // Heapify root element
            heapify(arr, i, 0);
          }



    }

public static void main(String args[]){
    int arr1[]={89,32,54,65,64};
    
    HeapSort hs=new HeapSort();

    hs.sort(arr1);


    for (int i : arr1) {
        System.out.print(i+" ");
    }
    



}


}