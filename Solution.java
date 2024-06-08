class Solution {
    public int[] sumZero(int n) {
        int[] out = new int[n];

        if(n%2 == 0){
            int b = 1;
            for(int i=0; i<n; i=i+2){
                out[i] = b;
                out[i+1] = -1*b;
                b++;
            }
        }else{
            if(n==1){
                out[0] = 0;
            }else{
                int a = 1;
                for(int i=0; i<n-1; i=i+2){
                    out[i] = a*1;
                    out[i+1] = -1*a;
                    a++;
                }
                out[n-1] = 0;
            }
        }
        return out;
    }
}
