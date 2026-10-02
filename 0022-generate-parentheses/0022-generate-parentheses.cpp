class Solution {
public:
    bool valid(string &s)
    {
        int counter=0;
        for(char ch:s)
        {
            if(ch=='(') counter++;
            else counter--;
            if(counter<0) return false;
        }
        return counter==0;
    }
    void solve(int len,vector<string> &ans,string base)
    {
        if(len==0)
        {
            if(valid(base)) ans.push_back(base);
            return;
        }
        len--;
        solve(len,ans,base+'(');
        solve(len,ans,base+')');
    }
    vector<string> generateParenthesis(int n) {
        int len=2*n;
        vector<string> ans;
        solve(len,ans,"");
        return ans;
    }
};