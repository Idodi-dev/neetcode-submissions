class Solution {
    public double averageWaitingTime(int[][] customers) {
        long lastEndTime = 0;
        double sum = 0;

        for(int[] customer : customers) {
            int startTime = customer[0];
            long endTime = customer[1] + Math.max(lastEndTime, startTime);

            lastEndTime = endTime;

            sum += endTime - startTime;
        }

        return sum / customers.length;

    }
}