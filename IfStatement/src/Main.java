public class Main {
    public static void main(String[] args) {

        boolean isCoffeeGood = true;
        if (isCoffeeGood == true){
            System.out.println(" Coffee is good :) ");
            System.out.println(" Let s have a coffee break!");
        }

        int topScore = 100;
        if (topScore == 100)
            System.out.println(" High Score!");
        int secondTopScore = 70;
        if (topScore > secondTopScore && secondTopScore < 100)
            System.out.println( " Second High Score! ");
        if (topScore > secondTopScore || secondTopScore > 70)
            System.out.println(" Between First and Second");

        boolean isBreakFinished = false;
        if (!isBreakFinished)
            System.out.println(" back to study");

        boolean isStudyOver = false;
        boolean wasStudyOver = isStudyOver ? false:true;
        if (wasStudyOver){
            System.out.println(" Study was not over");
        }



    }
}