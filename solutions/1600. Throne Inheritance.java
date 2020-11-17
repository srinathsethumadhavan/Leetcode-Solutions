class ThroneInheritance {
​
    
    private HashMap<String,List<String>> map;
    private HashSet<String> set ;
    private String root;
    public ThroneInheritance(String kingName) {
        map = new HashMap<>();
        set= new HashSet<>();
        this.root = kingName;
        map.putIfAbsent(root,new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
​
        
        map.get(parentName).add(childName);
        map.putIfAbsent(childName,new ArrayList<>());
    }
    
    public void death(String name) {
        
            set.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> hierarchyList = new ArrayList<>();
        dfs(root,hierarchyList);
        return hierarchyList;
    }
    
    
    private void dfs(String root, List<String> hierarchyList){
        if(!set.contains(root))
            hierarchyList.add(root);
        for(String child : map.get(root))
            dfs(child,hierarchyList);
    }
}
​
​
