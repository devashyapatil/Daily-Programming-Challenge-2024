class Day14 {
    public int SubstringOfKlength(String s, int k) {

        int left = 0, right = 0, n = s.length(), distinctCount = 0, substringCount = 0;
        int[] charFreq = new int[26];

        while (right < n) {
            int charIndex = s.charAt(right) - 'a';
            charFreq[charIndex]++;

            if (charFreq[charIndex] == 1) {
                distinctCount++;
            }

            while (distinctCount > k) {
                charFreq[s.charAt(left) - 'a']--;

                if (charFreq[s.charAt(left) - 'a'] == 0) {
                    distinctCount--;
                }

                left++;
            }
            substringCount += (right - left + 1);
            right++;
        }
        return substringCount;
    }

    public int countSubstringsWithExactlyKDistinctChars(String str, int k) {

        int countAtMostK = SubstringOfKlength(str, k);
        int countAtMostKMinus1 = SubstringOfKlength(str, k - 1);
        return countAtMostK - countAtMostKMinus1;
    }
}
