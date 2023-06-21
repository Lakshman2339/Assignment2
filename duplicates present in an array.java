import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        HashSet<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates);
    }

    public static HashSet<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();

        for (int elem : arr) {
            if (unique.contains(elem)) {
                duplicates.add(elem);
            } else {
                unique.add(elem);
            }
        }

        return duplicates;
    }
}

