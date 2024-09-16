class Solution {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        int timeStamps[] = new int[timePoints.size()];
        int k = 0;
        for (String s : timePoints) {
            String split[] = s.split(":");
            timeStamps[k++] = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        }
        Arrays.sort(timeStamps);
        for (int i = 1; i < timePoints.size(); i++) {
            min = Math.min(min, timeStamps[i] - timeStamps[i - 1]);
        }
        min=Math.min(min,1440-timeStamps[timeStamps.length-1]+timeStamps[0]);
        return min;
    }
}