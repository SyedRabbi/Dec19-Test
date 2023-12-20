package str;

public class StringClass {
    public static void main(String[] args) {
//        String city = "New York";
//        System.out.println(city.length());
//
//        String anything = "555555gh5t456yth5%$*#$*";
//
//        System.out.println(city.contains("york"));
//        String city2 = "New York";
//        System.out.println(city.equals(city2));
//        System.out.println(city.charAt(5));
//
//        String name = "Fadla";
//        System.out.println(name.charAt(3));
//
//        String name2 = name.replace('d', 'j');
//        System.out.println(name2);
//
//        for(int i=0; i<anything.length(); i++){
//            System.out.println(anything.charAt(i));
//        }

        boolean isPresent = false;
        String country = "bangladesh";
        for (int i=0; i<country.length(); i++){
            if(country.charAt(i) == 'l'){
                isPresent = true;
            }
        }
        System.out.println(isPresent);

        System.out.println(country.indexOf('a'));


    }
}
