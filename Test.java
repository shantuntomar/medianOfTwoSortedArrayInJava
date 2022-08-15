class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = mergeTwoSortedArray(nums1, nums2);
        if(ans.length%2 == 0) {
            int mid = ans.length/2;
            return (ans[mid-1]+ans[mid])/2;
        }
        return ans[ans.length/2];
    }
    public static int[] mergeTwoSortedArray(int[] a , int[] b) {
        int i=0 , j=0 , k=0;
        int[] res = new int[a.length+b.length];
        while(i < a.length && j < b.length) {
           if(a[i] < b[j]) res[k++] = a[i++];
            else res[k++] = b[j++];
        }
        while(i < a.length) {
            res[k++] = a[i++];
        }
        while(j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }
}

//leetcode challenges
