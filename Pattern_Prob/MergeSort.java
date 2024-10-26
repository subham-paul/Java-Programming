public class MergeSort {
    public static void merge(int arr[], int s, int mid, int e) {
        int mergeArr[] = new int[e - s + 1];

        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) { // 1
                mergeArr[x] = arr[idx1];
                x++;
                idx1++;
            } else { // 2
                mergeArr[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid) { // 3
            mergeArr[x++] = arr[idx1++];
        }
        while (idx2 <= e) { // 4
            mergeArr[x++] = arr[idx2++];
        }
        for (int i = 0, j = s; i < mergeArr.length; i++, j++) {
            arr[j] = mergeArr[i];
        }
    }

    public static void divide(int arr[], int s, int e) {
        if (s >= e)
            return;

        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 3, 10, 11 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}