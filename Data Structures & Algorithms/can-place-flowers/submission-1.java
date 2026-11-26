class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ctr = 0;
        int len = flowerbed.length;

        if(len == 1) {
            if(flowerbed[0] == 0) {
                ctr++;
            }
        }

        if(len == 2) {
            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
                ctr++;
            }
        }

        if(len > 2) {
            if(flowerbed[0] == 0 && flowerbed[1] == 0) {
                ctr++;
            }

            if(flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
                ctr++;
            }
        }

        for(int i = 1; i < flowerbed.length - 2; i++) {
            if(flowerbed[i - 1] == 0 && flowerbed[i] == 0 && 
                    flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                ctr++;
            }
        }

        return n <= ctr;


    }
}