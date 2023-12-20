package Array;

public class FirstArrayClass {
    public static void main(String[] args) {
        int [] nums = new int [5];
        nums[0] = 5;
        nums [4] = 8;
        nums [1] = 9;
        nums [3] = 6;
        nums [2] = 1;
        nums [4] = 2;

        //System.out.println(nums[4]);

        String[] countries = {"USA", "France", "England", "Algeria", "Belgium", "Canada"};
        //System.out.println(countries[5].length());
        for(int i = 0; i<countries.length; i++){
//            System.out.println(i);
//            System.out.println(countries[i]);
//            System.out.println(countries[i].length());
            if(countries[i].length() > 6){
                System.out.println(countries[i]);
            }
        }
    }
}
