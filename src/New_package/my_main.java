package New_package;

public class my_main {
    public static void main(String[] args){
        int [][] nums = new int[5][8];
        for(int i =0;i<nums.length;i++){
            for(int n=0;n<nums[i].length;n++){
                nums[i][n]=(int)((Math.random()*199)-99);
                System.out.print(nums[i][n]+" ");
            }
        }
        int min=nums[0][0];
        for(int i =0;i<nums.length;i++){
            for(int n=0;n<nums[i].length;n++){
                if(nums[i][n]>min)min=nums[i][n];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = "+min);
    }
}