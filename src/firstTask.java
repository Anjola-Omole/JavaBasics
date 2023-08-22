public class firstTask {

    public static void main(String[] args) {
        int [] temp = {47,42,51,64,91,42,22};
        int sum = 0;
        int lowest = 200;

        for(int i:temp){
            if (i >=sum){
                sum = i;
            } else if(i <=lowest){
                lowest = i;
            }

        }
        System.out.println( sum );
        System.out.println(lowest);
    }
}
