public class App {


        public static String reverseString(String input){

            

            StringBuilder sb = new StringBuilder(input);
            sb.reverse();

            String str = sb.toString();
            

            

            return str;
        }
    public static void main(String[] args) throws Exception {
        
        String hello = reverseString("ABC");

        System.out.println(hello);

        



    }
}
