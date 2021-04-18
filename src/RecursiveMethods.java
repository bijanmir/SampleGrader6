public class RecursiveMethods {
    public static void main(String[] args) {
        RecursiveMethods rm = new RecursiveMethods();

        String str1 = "abcabcdabcde",
                str2 = "abc";
        System.out.println(rm.subCount(str1, str2));

    }
    public int byLeapsAndBounds(int n) {
        {
            if (n == 1 || n == 0)
                return 1;
            else if (n == 2)
                return 2;
            else
                return byLeapsAndBounds(n - 2) + byLeapsAndBounds(n - 1);
        }
    }


    public int subCount(String str, String subStr) {
            int n1 = str.length();
            int n2 = subStr.length();

            // Base Case
            if (n1 == 0 || n1 < n2)
                return 0;

            // Recursive Case
            // Checking if the first
            // substring matches
            if (str.substring(0, n2).equals(subStr))
                return subCount(str.substring(n2 - 1), subStr) + 1;

            // Otherwise, return the count
            // from the remaining index
            return subCount(str.substring(n2 - 1),
                    subStr);
    }
    public int binarySearch(int[]array, int target, int left, int right) {
        //Part III code goes here
        return target;
    }
}
