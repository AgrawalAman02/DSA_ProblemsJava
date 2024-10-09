static int cnt;

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        List<Integer> temp = new ArrayList<>();

        // Merging two sorted halves and counting inversions
        while (i <= mid && j <= hi) {
            if (arr[i] <= arr[j]) {  // Use <= to avoid unnecessary inversions
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                cnt += (mid - i + 1);  // Count inversions
                j++;
            }
        }

        // Copy remaining elements from the left half (if any)
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        // Copy remaining elements from the right half (if any)
        while (j <= hi) {
            temp.add(arr[j]);
            j++;
        }

        // Copy sorted elements back into the original array
        for (i = lo; i <= hi; i++) {
            arr[i] = temp.get(i - lo);
        }
    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;

        int mid = lo + (hi - lo) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    public static int numberOfInversions(int[] a, int n) {
        cnt = 0;  // Reset inversion count before each calculation
        mergeSort(a, 0, n - 1);
        return cnt;
    }
