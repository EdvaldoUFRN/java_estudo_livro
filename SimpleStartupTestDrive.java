
public class SimpleStartupTestDrive {

    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

        String testResult = "failed"; //já considera que ta errado.
        if (result.equals("hit")) {
            testResult = "passed";
        }
        //ou seja ele fez um teste de modo que realmente a pessoa acerta-se, assim ele altera a variável de testresult

        System.out.println(testResult);
    }
}
