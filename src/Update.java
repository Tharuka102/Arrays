class Update {
    public static void main(String[] args) {
        int arr[] = {12,78,92,59,56};
        System.out.println("Before Update :-");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        arr[2]=100;
        System.out.println("After Update");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}

