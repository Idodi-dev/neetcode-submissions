class Solution {
    public int[] replaceElements(int[] arr) {
        
        int localMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > localMax) {
                int temp = arr[i];
                arr[i] = localMax;
                localMax = temp;
            } else {
                arr[i] = localMax;
            }
        }

        return arr;
    }
}