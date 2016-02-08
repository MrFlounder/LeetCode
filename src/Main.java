class Main {
    /**
     * Write a function that acts like "indexOf", in that it
     * returns the position of a given string within a
     * larger string, and returns -1 if the given string
     * is not found.
     *
     * Two strings are given as arguments. The first
     * argument is the smaller string, and the second argument
     * is the larger string.
     *
     * Do not use either "indexOf" or "search" in this function.
     *
     * Examples:
     *
     *   substrIndex("Francisco", "San Francisco");
     *   => 4
     *   substrIndex("abba", "bbbabbaaa")
     *   => 3
     *   substrIndex("Jose", "San Francisco");
     *   => -1
     *
     * @param {String} needle
     * @param {String} haystack
     * @return integer
     */
    public static int substrIndex (String needle, String haystack) {
        // STUB.
        int j = 0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.length()-i<needle.length()) return -1;
            while(j<needle.length()) {
                if (needle.charAt(j) == haystack.charAt(j + i))
                    j++;
                else break;
            }
            if(j==needle.length()) return i;
            else
                j=0;
        }
        return -1;
    }


    /**
     * Write a function that capitalizes all of the words in
     * a sentence.
     *
     * Examples:
     *
     *   capitalize("Hello world");
     *   => "Hello World"
     *
     *   capitalize("1st thing");
     *   => "1st Thing"
     *
     *   capitalize("javaScript language");
     *   => "JavaScript Language"
     *
     * @param  {String} sentence
     * @return {String}
     */
    public static String capitalize(String sentence) {
        // STUB.
        for(int i=0;i<sentence.length()-1;i++){
            if(sentence.charAt(i)==' '&&sentence.charAt(i+1)<'z'&&sentence.charAt(i+1)>'a') {
                char mid = (char) (sentence.charAt(i + 1) - 32);
                sentence = sentence.substring(0, i+1) + mid + sentence.substring(i + 2);
            }
        }
        return sentence;

    }

    /**
     * Write a function that takes in a sentence as an argument.
     * The sentence always contains one comma, which divides
     * the sentence into two strings.
     *
     * Do not use a the built-in String.endsWith method.
     *
     * The function should return true if the first part of the string
     * (the part before the comma) ends with second part of
     * the string (the part after the comma).
     *
     * Examples:
     *
     *   endsWith("San Francisco,Francisco");
     *   => true
     *   endsWith("San Francisco,San");
     *   => false
     *   endsWith("San Francisco,Jose");
     *   => false
     *   endsWith("San Diego,go");
     *   => true
     *   endsWith("Palo Alto,Palo");
     *   => false
     *   endsWith("Raise.me,Me");
     *   => false
     *
     * @param  {String} sentence
     * @return {Bool} true or false
     */
    public static boolean endsWith(String sentence) {
        // STUB.
        String first;
        String second;
        int index = 0;
        int len = sentence.length();
        for(int i=0;i<len;i++){
            if(sentence.charAt(i)==',') index=i-1;
        }
        while(sentence.charAt(len-1)!=','){
            if(index<0) return false;
            if(sentence.charAt(len-1)!=sentence.charAt(index)) return false;
            index--;
            len--;
        }
        //if the second part is empty, this method returns true
        return true;
    }

    public static void main(String[] args) {
        // Optional tests.
        System.out.println(endsWith("Palo Alto,Palo"));
        System.out.println(endsWith("Palo Alto,Alto"));
        System.out.println(substrIndex("abba", "bbbabbaaa"));
        System.out.println(capitalize("javaScript language"));
    }
}
