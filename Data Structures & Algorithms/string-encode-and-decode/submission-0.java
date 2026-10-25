class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
         List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String strs = str.substring(j + 1, j + 1 + len);
            result.add(strs);

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return result;
    
    }
}
