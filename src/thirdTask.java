public class thirdTask {
    public static void main(String[] args) {
        int [][]numbers = {
                {124,532,61,41324,},
                {23,19,24,131,},
                {1,42,47,24,}

        };
        for(int [] i:numbers){
            for (int num:i){
                if (num % 2 ==0){
                    System.out.println(num);
                }
            }
        }
    }
}
