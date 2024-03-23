import java.util.Scanner;

public class MainTests {

    public static void main(String[] args) throws InterruptedException {
// Try calling one object
        LoginTestCases testCaseOne = new LoginTestCases();
        LoginTestCases testCaseTwo = new LoginTestCases();
        LoginTestCases testCaseThree = new LoginTestCases();
        LoginTestCases testCaseFour = new LoginTestCases();

        System.out.println("There are four test cases, please choose which testcase to check. Select your answer by typing in a number");
        System.out.println("1. Wrong Username and wrong password");
        System.out.println("2. Correct Username and wrong password");
        System.out.println("3. Wrong Username and correct password");
        System.out.println("4. Correct Username and correct password");
        Scanner testCaseChoice = new Scanner(System.in);
        int choice = testCaseChoice.nextInt();
        switch (choice) {
            case 1:
                testCaseOne.testCaseOne();
                break;
            case 2:
                testCaseTwo.testCaseTwo();
                break;
            case 3:
                testCaseThree.testCaseThree();
                break;
            case 4:
                testCaseFour.testCaseFour();
                break;
            default:
                System.out.println("Please select the right number. Only the options above allowed!");
                break;
        }



    }
}
