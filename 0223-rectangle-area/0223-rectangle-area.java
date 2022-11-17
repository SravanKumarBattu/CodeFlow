class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int a1=(ax2-ax1)*(ay2-ay1);
        int a2=(bx2-bx1)*(by2-by1);
        
        
        int x1=Math.max(ax1,bx1);
        int x2=Math.min(ax2,bx2);
        
        
        int x3=Math.max(ay1,by1);
        int x4=Math.min(ay2,by2);
                
        
        int l= x2-x1;
        int b= x4-x3;
        int com= l*b;
        
        if(l<0 || b<0)
        {
            com=0;
        }
        return (a1+a2-com);
    }
}