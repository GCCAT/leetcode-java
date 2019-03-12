class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList();
        String str=new String();
        generate(list,str,n,n);
        return list;
    }

    
    public void generate(List<String> list,String str,int left,int right){
        //System.out.println(str);
        
        if(left==0&&right==0){
            list.add(str);
            //System.out.println("====="+list);
            return;
        }
        if(left>0){
            generate(list,str+'(',left-1,right);
        }
        if(right>left){
            generate(list,str+')',left,right-1);
        }   
    }
    
}
