public class BuildMaxHeap{
    /*private T[] heap;
    private int size; //size of heap
    private final int capacity; //capacity

    public BuildMaxHeap(int capacity){
        this.size = 0;
        this.capacity = capacity;
        heap = (T[]) new Comparable[capacity];
    }*/
    public static void buildMaxHeap(WordFreq[] arr){
        int l = arr.length;
        for(int i = l/2-1; i >=0; i--){
            heapify(arr, l ,i);
        }
    }

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

    //add new value into the heap
    public static void heapify(WordFreq[] arr, int index, int size){
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if(left < size && arr[left].getFreq() > arr[largest].getFreq()){
            largest = left;
        }

        if(right < size && arr[right].getFreq() > arr[largest].getFreq()){
            largest = right;
        }

        if(largest != index){
            swap(arr, index, largest);
            heapify(arr, size, largest);
        }

    }




}
