class Solution {
    public int[] replaceElements(int[] arr) {
        
        int length = arr.length;

        int localMax = arr[length - 1];
        arr[length - 1] = -1;

        for(int i = length - 2; i >= 0; i--) {
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