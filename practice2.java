class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //simpan tabel untuk mengelompokkan semua anagram bersama
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            //sort the string to get a key
            String key = generateKey(str);
            //add the current string to the current table
            if(map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else
            {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String generateKey(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}