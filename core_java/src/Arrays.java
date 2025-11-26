public class Arrays {

    public static void main(String[] args){
        int nums[] = new int[10];  //this is dynamic array
        nums[0] = 9;
        nums[1] = 4;
        nums[2] = 5;
        nums[3] = 0;
        System.out.println(nums[2]);
        System.out.println(nums[8]); //if value is not assigned in array then it is zero

        for(int i=0; i <= 3; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
