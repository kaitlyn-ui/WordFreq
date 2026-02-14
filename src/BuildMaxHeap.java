public class BuildMaxHeap <T extends Comparable <T>>{
    private T[] heap;
    private int size; //size of heap
    private final int capacity; //capacity

    public BuildMaxHeap(int capacity){
        this.size = 0;
        this.capacity = capacity;
        heap = (T[]) new Comparable[capacity];
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
    private void swap(int a, int b){
        T temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    //add new value into the heap
    public void addNode(T value){
        //inserts the new value
        heap[size] = value;
        int i = size;
        T temp;
        int parentIndex;

        //
        while(i > 0){
            parentIndex = getParentIndex(i);
            //compares parent and current node, swaps up if priority is higher
            if(heap[parentIndex].compareTo(heap[i]) >= 0){
                temp = heap[parentIndex];
                heap[parentIndex] = heap[i];
                heap[i] = temp;
            }else{
                break;
            }
            i = parentIndex;
        }

        size++;

    }




}
