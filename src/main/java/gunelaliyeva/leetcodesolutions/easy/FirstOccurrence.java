package gunelaliyeva.leetcodesolutions.easy;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(version1(haystack, needle));
        System.out.println(version2(haystack, needle));

    }


    public static int version1(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (needle.isEmpty()) return 0;
        int index = -1;

        if (haystack.length() < needle.length()) {
            System.out.println(index);
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                boolean found = true;

                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static int version2(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        if (needle.isEmpty()) return 0;

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            } //j is updated as long as letters in haystack substring is SAME as letters in needle

            if (j == needle.length()) { //j is updated so we check the value
                index = i;
                break;
            }
        }
        return index;
    }
}

