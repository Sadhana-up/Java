public class array {
    
    public static void main(String[] args) {
        int[] numbers = {70,80,90,20};
        // System.out.println(numbers[0]);
        // numbers[3]=66;

        // //TRAVERSING ARRAYS 
        // for (int i =0 ; i<numbers.length;i++){
        //     System.out.println(numbers[i]);

        // }
        
        for(int nums : numbers){
            System.out.println(nums);
        }

    }
}
