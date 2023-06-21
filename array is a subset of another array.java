public class ArraySubset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4};
        boolean isSubset = isSubset(arr1, arr2);
        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet set = new HashSet();
        for (int elem : arr1) {
            set.add(elem);
        }
        for (int elem : arr2) {
            if (!set.contains(elem)) {
                return false;
            }
        }
        return true;
    }
}