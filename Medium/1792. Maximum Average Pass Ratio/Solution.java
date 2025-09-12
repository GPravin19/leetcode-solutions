import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> tempPQ = new PriorityQueue<>((a, b) -> Double.compare(b[2], a[2]));
        for (int[] cls : classes) {
            double pass = cls[0];
            double total = cls[1];
            double diff = (pass + 1) / (total + 1) - pass / total;
            tempPQ.offer(new double[]{pass, total, diff});
        }

        while (extraStudents > 0) {
            double[] top = tempPQ.poll();
            double pass = top[0];
            double total = top[1];
            pass += 1;
            total += 1;
            double diff = (pass + 1) / (total + 1) - pass / total;
            tempPQ.offer(new double[]{pass, total, diff});
            extraStudents--;
        }

        double totalRatio = 0.0;
        while (!tempPQ.isEmpty()) {
            double[] cls = tempPQ.poll();
            totalRatio += cls[0] / cls[1];
        }

        return totalRatio / classes.length;
    }
}