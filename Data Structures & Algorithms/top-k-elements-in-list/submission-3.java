class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(freqMap);
        List<Map.Entry<Integer, Integer>> list = freqMap.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue()
        .reversed())
        .collect(Collectors.toList());
        System.out.println(freqMap);

        int count = 0;
        for(Map.Entry<Integer, Integer> entry: list) {
            if(count == k) 
                break;
            result.add(entry.getKey());
            count++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
