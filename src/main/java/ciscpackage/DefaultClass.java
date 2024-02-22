package ciscpackage;

public class DefaultClass {
    private static String staticStr = "This is a static string";
    private String name = "This class is in the default package";
    public String pubStr = "This is a public string!";
    protected String proStr = "This is a protected string.";
    String defStr = "This is a default access string";

    protected String getProtectedString() {
        return proStr;
    }

    private String getPrivateString() {
        return name;
    }

    String getDefaultString() {
        return defStr;
    }

    public DefaultClass() {
        System.out.println(name);
        System.out.println(pubStr);
        System.out.println(proStr);
        System.out.println(defStr);
    }

    public static void main(String[] args) {
        DefaultClass defClass = new DefaultClass();
        System.out.println(defClass.name);
        System.out.println(defClass.pubStr);
        System.out.println(defClass.proStr);
        System.out.println(defClass.defStr);

        System.out.println(staticStr);
        System.out.println(DefaultClass.staticStr);
    }
}
