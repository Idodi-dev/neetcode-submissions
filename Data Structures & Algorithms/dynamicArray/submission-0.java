class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity) {
            resize();
        }
        
        this.array[size] = n;
        this.size++;
        
    }

    public int popback() {
        this.size--;
        return this.array[size];
    }

    private void resize() {
        
        this.capacity *= 2;

        int[] newArr = new int[this.capacity];

        for(int i = 0; i < this.size; i++) {
            newArr[i] = this.array[i];
        }

        this.array = newArr;
        
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
