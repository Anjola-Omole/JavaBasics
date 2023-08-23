public class fourthTask {
    public static void main(String[] args) {
        int [][] num = {
                {421,512,41,56,71},
                {412,5,76,53,65},
                {21,42,51,9,24}
        };

        int evenSum = 0;
        int oddSum = 0;

        for(int [] i:num){
            for (int number:i){
                if (number % 2 ==0){
                    evenSum = evenSum + number;
                } else{
                    oddSum = oddSum + number;
                }
            }
        }
        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);

    }
}
