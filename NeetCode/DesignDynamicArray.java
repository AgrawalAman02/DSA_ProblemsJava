class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor to initialize with given capacity
    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        } 
        arr[size++] = n;
    }

    public int popback() {
        if (size <= 0) {
        throw new IndexOutOfBoundsException("Array is empty");
        }
        int value = arr[--size];  // Decrement size first, then access the value
        arr[size] = 0;  // Optionally clear the element (not necessary for functionality but useful for debugging)
        return value;
    }

    private void resize() {
        this.capacity = this.capacity*2;
        int [] newArr = new int[capacity];
        for (int  i = 0 ; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        arr= newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
