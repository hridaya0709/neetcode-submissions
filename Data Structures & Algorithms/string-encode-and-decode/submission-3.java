class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_result = new StringBuilder();

       for(int i = 0; i < strs.size(); i++) {

            if(strs.get(i).equals("\""))
                encoded_result.append("@!");
            else 
                encoded_result.append(strs.get(i));
            
            encoded_result.append("#!");
        }

        System.out.println(encoded_result);
        return encoded_result.toString();
    }

    public List<String> decode(String str) {
        // List<String> decoded_result = Arrays.asList(str.split("#@"));
        List<String> decoded_result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] cArr = str.toCharArray();

        for(int i = 0; i < cArr.length; i++) {
            if(cArr[i] == '@' && cArr[i+1] == '!') {
                sb.append("\"");
                i++;
            }
            else if(cArr[i] == '#' && cArr[i+1] == '!') {
                decoded_result.add(sb.toString());
                i++;
                sb.setLength(0);
            }   
            else
                sb.append(cArr[i]);

        }
        System.out.println(decoded_result);
        return decoded_result;
    }
}
