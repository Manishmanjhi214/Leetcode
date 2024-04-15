public class Main {
    public static void main(String[] args) {

        char s1[] = {'a', 'e', 'i', 'o', 'u', 'a', 'a', 'a'};
        int count = 1;
        for (int i = 0; i < s1.length; i++) {
            char f = s1[i];
            for (int j = i + 1; j < s1.length; j++) {

                if (s1[j] == s1[i]) {
                    count += 1;
                } 
                System.out.println(s1[i] + "=" + count);
                count = 1;
            }

            System.out.println(s1);
            System.out.println(String.valueOf(s1));
        }
    }
}