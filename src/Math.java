public class Math {
    public static void main(String[] args) {
        int[] number ={1,2,3,4,5,6,7,8,9};
        int sum =0;
        Double average;

        for (int i :number) {
            sum += i; //sum = sum +i;
        }
        int len = number.length;
        average = ((double)sum /(double)len); //

        System.out.println("Sum :-"+ sum);
        System.out.println("Average:- "+average);

    }
}
