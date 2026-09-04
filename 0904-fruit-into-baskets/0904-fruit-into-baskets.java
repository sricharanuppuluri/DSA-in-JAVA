class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int res = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int right = 0; right < n; right++) {
            int num = fruits[right];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            while (freq.size() > 2) {
                int leftele = fruits[left];
                freq.put(leftele, freq.getOrDefault(leftele, 0) - 1);
                if (freq.get(leftele) == 0) {
                    freq.remove(leftele);
                }
                left++;
            }
            int len = right - left + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}