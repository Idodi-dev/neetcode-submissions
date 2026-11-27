class Solution {
    public double averageWaitingTime(int[][] customers) {
        int lastEndTime = customers[0][0] + customers[0][1];
        double sum = lastEndTime - customers[0][0];
        int numOfCustomers = customers.length;

        for(int i = 1; i < numOfCustomers; i++) {
            int startTime = customers[i][0];
            int endTime = customers[i][1] + Math.max(lastEndTime, startTime);

            lastEndTime = endTime;

            sum += endTime-startTime;
        }

        return sum / numOfCustomers;

    }
}