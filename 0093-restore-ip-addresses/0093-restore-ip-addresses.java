class Solution {
    public List<String> restoreIpAddresses(String s) {
        
    List<String> list = new ArrayList<>();
    dfs(s, 0, 0, "", list);
    return list;
        
    }
    
    private void dfs(String s, int idx, int c, String path, List<String> list) {
    if (c >= 4) {
        if (idx == s.length()) {
            list.add(path.substring(0, path.length()-1));
        }
        return;
    }
    for (int i = idx+1; i <= s.length(); i++) {
        if (isValid(s.substring(idx, i))) {
            dfs(s, i, c+1, path + s.substring(idx, i) + '.', list);
        }
    }
}

private boolean isValid(String s) {
    if (s.startsWith("0") && !s.equals("0")) {
        return false;
    }
    return s.length() < 4 && 0 <= Integer.valueOf(s) && Integer.valueOf(s) < 256;
}
    
    
    
    
    
    
    
}