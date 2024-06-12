package course2_part2;

public class StringSplit {
    public static void main(String[] args) {
        String stringArray = "Hello,  World";
        String[] strArray = stringArray.split(",");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

        for(String s : strArray){
            //System.out.println(s.toString());
            System.out.println(s.trim());
        }

    }
}
