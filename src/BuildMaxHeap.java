public class BuildMaxHeap{

    public static void buildMaxHeap(WordFreq[] arr){
        int l = arr.length;
        //last non-leaf node
        for(int i = (l/2)-1; i >=0; i--){
            heapify(arr, i, l); //heapify nodes
        }
    }

    //not used in current program
    //return parent position
    private int getParentIndex(int position){
        return (position - 1) / 2;
    }

    //return left child
    private int getLeftIndex(int position){
        return (position * 2) + 1;
    }

    //return right child
    private int getRightIndex(int position){
        return (position * 2) + 2;
    }


    //swap two nodes
    private static void swap(WordFreq[] arr, int a, int b){
        WordFreq temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void heapify(WordFreq[] arr, int index, int size){
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        //check if left node is greater than root
        if(left < size && arr[left].getFreq() > arr[largest].getFreq()){
            largest = left;
        }
        //check if right node is greater than root
        if(right < size && arr[right].getFreq() > arr[largest].getFreq()){
            largest = right;
        }
        //if largest element is not the root, swap the nodes and call heapify
        if(largest != index){
            swap(arr, index, largest);
            heapify(arr, largest, size);
        }

    }




}
