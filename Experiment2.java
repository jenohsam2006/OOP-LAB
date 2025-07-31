public class FrequencyCount {
    public static int frequencyCount(char[] arr, char ch) {
        int count = 0;
        for (char c : arr) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'a', 'b', 'a'};
        System.out.println(frequencyCount(chars, 'a'));  // Output: 3
    }
}



