package String;

/**
 * Created by guangshuozang on 10/9/15.
 */
public class CompareVersionNumbers_165{
        public int compareVersion(String version1, String version2) {
            String[] levels1 = version1.split("\\.");
            String[] levels2 = version2.split("\\.");
            String[] levels3 = version1.split(".");
            String[] levels4 = version2.split(".");
            String[] levels5 = version1.split("\\.");
            String[] levels6 = version2.split("\\.");

            int length = Math.max(levels1.length, levels2.length);
            for (int i=0; i<length; i++) {
                Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
                Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
                int compare = v1.compareTo(v2);
                if (compare != 0) {
                    return compare;
                }
            }

            return 0;
        }
    public static void main(String arg[]){
        CompareVersionNumbers_165 ins = new CompareVersionNumbers_165();
        ins.compareVersion("1.1","0.2");
    }
}
