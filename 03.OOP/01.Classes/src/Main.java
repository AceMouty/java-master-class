public class Main {
    public static void main(String[] args) {
        /*
            Creating two instances of the Car class


            NOTE:
            Unlike data types there are NOT default values for classes, you MUST
            initialize a class instance when creating a variable of the class type
            using the 'new' keyword

            The following will throw an error

            EX1.
            Car porsche;
            porsche.getModel();

            EX2.
            Car porsche;
            porsche = null;
            porsche.setModel("Carrera");
         */
        Car porsche = new Car();
        Car mustang = new Car();

        porsche.setModel("Carrera");
        System.out.println("The Porsche model is: " + porsche.getModel());

        // the below should give us unknown since our validation does NOT support
        // a model type of mustang.
        mustang.setModel("Mustang");
        System.out.println("The Mustang model is: " + mustang.getModel());

    }
}
