public class seventhTask {
    public static void main(String[] args) {
        int num = 0;
        int secondNum = 1;
        
        for (int i = 0; i<11; i++){
            int nextNumber = num + secondNum;
            num = secondNum;
            secondNum = nextNumber;

            System.out.println(nextNumber);

        }
    }
}
