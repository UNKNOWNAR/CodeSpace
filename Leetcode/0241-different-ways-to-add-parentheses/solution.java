class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        int n=expression.length();
        HashMap<String,List<Integer>> map= new HashMap<>();

        return solve(expression,map);
    }

    public List<Integer> solve(String ex,HashMap<String,List<Integer>> map)
    {
        if(map.containsKey(ex))
        {
            return map.get(ex);
        }

        List<Integer> result= new ArrayList<>();

        for(int i=0;i<ex.length();i++)
        {
            char ch= ex.charAt(i);

            if(ch=='+' || ch=='-' || ch=='*')
            {
                String left=ex.substring(0,i);
                String right=ex.substring(i+1);

                List<Integer> leftResult=solve(left,map);
                List<Integer> rightResult=solve(right,map);

                for(int l: leftResult)
                {
                    for(int r: rightResult)
                    {
                        switch(ch){
                            case '+':
                            result.add(l+r);
                            break;
                            case '-':
                            result.add(l-r);
                            break;
                            case '*':
                            result.add(l*r);
                            break;
                            default:
                        }
                    }
                }
            }
        }

        if(result.isEmpty())
        result.add(Integer.parseInt(ex));

        map.put(ex,result);
        return result;
    }
}
