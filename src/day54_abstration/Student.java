package day54_abstration;
/*we add abstract keyword to a class to make it an abstruct class.
* */

public abstract class Student {


        public void code(String language) {
            System.out.println("Student is coding using " + language);
        }

        /**
         * we can add abstract methods into abstract class.
         * abstract method -> is created using abstract keyword
         * and does not have the implementation/method body
         * <p>
         * So abstract class only shows WHAT it can do, but not HOW by using abstract methods.
         */
        public abstract void attendClass();

    }

