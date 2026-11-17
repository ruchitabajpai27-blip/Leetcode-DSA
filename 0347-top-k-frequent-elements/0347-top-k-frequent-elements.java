class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap
        PriorityQueue<Integer> q = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) 
        {
            q.add(num);

            if (q.size() > k) 
            {
                q.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) 
        {
            result[i] = q.poll();
        }

        return result;
    }
}