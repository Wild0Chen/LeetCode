package leetcode.day_6_4;

/**
 * ����������СΪ m �� n ���������� nums1 �� nums2��
 * �����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��
 * ����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�
 */
public class Leet0604004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int pos1 = -1, pos2 = -1;
        if (len % 2 != 0) {
            pos1 = len / 2;
        } else {
            pos2 = len / 2;
            pos1 = pos2 - 1;
        }

        int s1 = -1;
        int s2 = -1;

        int v1 = 0, v2 = 0;

        int cnt = len / 2;
        for (int i = 0; i <= cnt; ++i) {
            int val = 0;
            if (v1 >= nums1.length) {
                val = nums2[v2++];
            } else if (v2 >= nums2.length) {
                val = nums1[v1++];
            } else if (nums1[v1] > nums2[v2]) {
                val = nums2[v2++];
            } else {
                val = nums1[v1++];
            }

            if (pos2 != -1 && i == pos2) {
                s2 = val;
            } else if (i == pos1) {
                s1 = val;
            }
        }
        return pos2 == -1 ? s1 : (s1 + s2) / 2.0;
    }
}
