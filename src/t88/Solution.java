package t88;

//先合并，然后排序就行了，没限制时间空间，是个简单题，直接冒泡了
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}