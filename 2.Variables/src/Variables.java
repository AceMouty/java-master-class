public class Variables {
    public static void main(String[] args){

/*
       Declaration statement: used to define a variable by passing...
       data type: int, bool, float etc
       var name: our variable name here is number
       var value: the  data stored in our var

       data type   name    value
           V       V        v
           int    age =    23;
 */
        int number = (10 + 15) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = mySecondNumber * 2;
        int total = number + myThirdNumber;
        int myLastOne = total - 1000;


        System.out.println("This is our number");
        System.out.println(myLastOne);
    }
}
