public class Main {
    public static void main(String[] args){

        /*
            A char takes up 2 bytes of memory (16 bits). The reason for this is so that
            we can store unicode characters. In doing so we can now represent 65,535 different
            types of characters.
         */
        char myChar = 'K';
        char uniCode = '\u00A9';
        System.out.println(String.format("My character is: %s", myChar));
        System.out.println(String.format("The unicode character is: %s", uniCode));

        /*
            Boolean values are true false values only. Yes or No, that is it
         */
        boolean overTweentyOne = false;
        System.out.println(overTweentyOne);
    }
}
