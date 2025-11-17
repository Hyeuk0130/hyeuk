class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int t = 0;
        int a = denom1;
        int b = denom2;
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            t = a;
        }
        int s = denom1 * denom2 / t;
        
        int upnumer1 = s / denom1 * numer1;
        int upnumer2 = s / denom2 * numer2;
        
        int upnumer3 = upnumer1 + upnumer2;
        
        int aa = upnumer3;
        int bb = s;
        int tt = 0;
        while(bb != 0){
            int temp = bb;
            bb = aa % bb;
            aa = temp;
            tt = aa;
        }
        upnumer3 /= tt;
        s /= tt;
        
        int[] answer = {upnumer3,s};
        
        return answer;
    }
}