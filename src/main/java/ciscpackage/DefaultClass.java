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
        Dog[] dogs = new Dog[3];
        dogs[0] = new Corgi("Bill", "Corgi", "Squeaking Sheep");
        dogs[1] = new Dog("Vin", "Chihuahua", "Slithering Snake");
        dogs[2] = new Dog("Ted", "German Shephard", "Tennis Ball");

        int l = 0;
        do {
            System.out.println(l++);
        } while(l < 100);

        int k = 0;
        while(true) {
            System.out.println(k++);
            if(k == 100) break;
        }

        int j = 0;
        while(j < dogs.length) {
            System.out.println(dogs[j].getName());
            j++;
        }
        System.exit(0);
        for(Dog dog: dogs) {
            System.out.println(dog.getName());
        }
        int i;
        for(i = 0; i < dogs.length; i++) {
            if(dogs[i].getName().equals("Vin")) {
                break;
            }
            System.out.println(dogs[i].getName());
        }

        System.out.println(i);

    }
}
