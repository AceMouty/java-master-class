
/*
    the word 'public' is an access modifier, this allows everyone access to use this class.

    There are 4 types of Java access modifiers:

    * Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

    * Default: The access level of a default modifier is only within the package.
             It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

    * Protected: The access level of a protected modifier is within the package and outside the package through child class.
                 If you do not make the child class, it cannot be accessed from outside the package.

    * Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
              outside the class, within the package and outside the package.

    Most of the time we will be using the public access modifier.
 */
public class Car {
    /*
        class fields / variables.
        Class fields will also require that you assign an access modifier to them. A general rule is that
        your class fields will be give private access meaning that they can only be accessed by the class itself, nobody else.
        This follows the rule of Encapsulation in OOP

       - Encapsulation: Encapsulation is the practice of hiding class fields / object state from the outside world or other classes.
            When an instance of an object gets created we dont want the outside world to access data / state of an object using dot notation like
            theCat.height, notice the dot yea...we dont want to be able to do that.

            Instead we encapsulate our data by setting private access, we then create what are known as getters and setters that can
            read and update the class fields. This works bc the class methods will alter the class fields. This allows us to validate
            and enforce rules within our class that the outside world must adhere to.

            The internal workings of a class are only able to be accessed by the class itself, not the world outside of the class.
     */

    // access  type var name
    //  v     v      v
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    /*
        We now have a basic template for what our car is.
    */

    /*
        We create getters and setters in order to read and update data within a class.
        we can make these public since we can restrict the outside world and force the
        outside world to adhere to certain rules when interacting with our classes
     */
    public void setModel(String model){

        String validModel = model.toLowerCase();
        // validate the model sent in to the class
        if(validModel.equals("carrera") || validModel.equals("holden")){

            // 'this' refers to the object instance / class field itself.
            // make the first letter in the model nam uppercase.
            this.model = model.substring(0,1).toUpperCase() + model.substring(1).toLowerCase();
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return model;
    }

}
