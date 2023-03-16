package controlflowstatements;

public class switchStatements {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchValue2 = 'a';

        switch (switchValue2) {
            case 'a':
                System.out.println("Value was a");
                break;

            case 'b':
                System.out.println("Value was b");
                break;

            case 'c':
                System.out.println("Value was c");
                break;

            case 'd':
                System.out.println("Value was d");
                break;

            case 'e':
                System.out.println("Value was e");
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}
