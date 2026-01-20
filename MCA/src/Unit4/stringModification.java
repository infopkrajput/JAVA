package Unit4;

/*
As string object are immutable we have to copy a string into StringBuffer whenever we need to
modify it. We can also use some predefined string methods; it will construct a modified copy of
the string and returns the same. Methods which we can use for the purpose are stated below: 
substring()
This method is used to extract a substring from the given string. There are two types of substring.
The first one is:
String substring(int startIndex); 
Where the startIndex defines the starting point of the substring that is to be extracted from the
given string. 
The second type is:
String substring(int startIndex, int endIndex); 
Here we mention both the starting index and the end index.  
*/
public class stringModification {
    public static void main(String[] args) {
        String org = "This is Manipal University of Jaipur, Directorate of Distance Education";
        String search = "is";
        String sub = "at";
        String result = "";
        int i;
        do { // replace all matching substrings
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
                System.out.println(result);
            }
        } while (i != -1);
        System.out.println(result);
    }

}
