package Array;

public class ArrayClass3 {
    public static void main(String[] args) {
        String[] colors = {"Blue", "Orange", "White", "Black", "Red", "Yellow", "Purple"};

//        for (int i = 0; i < colors.length; i++) {
//            if (colors[i].contains("a")) {
//                System.out.println(colors[i]);
//                //System.out.println(colors[i]);
//
//            }
//
//        }
//
//        int max = 0;
//        String col = "";
//        for(int i = 0; i<colors.length; i++){
//            if(colors[i].length()>max){
//                max = colors[i].length();
//                col = colors[i];
//            }
//        }
//        System.out.println(col);

        for(int i = colors.length-1; i>=0; i--){
            //System.out.println(colors[i]);
        }

        for (String color: colors) {
            System.out.println(color);
        }

        int[] nums = {2,6,9,8};
        for (int num: nums) {
            if(num%2==0)
            System.out.println(num);
        }
    }
}
