public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent muteStudent = new MutableStudent("Bob", 20);

        // TODO: Display the student's original information.
        System.out.println("--Mutable Student Info--");
        muteStudent.displayInfo();

        // TODO: Use the setter methods to change the student's data.
        muteStudent.setName("Carl");
        muteStudent.setAge(18);

        // TODO: Display the student again.
        System.out.println("\n--Mutable Student Changed Info--");
        muteStudent.displayInfo();
        // Question: Did the SAME object change?
        //Yes the same object changed.

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent immuteStudent = new ImmutableStudent("Billy", 24);

        // TODO: Display the student's information.
        System.out.println("--Immutable Student Info--");
        immuteStudent.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
        /*
        You can't change the ImmutableStudent object since there are no set methods to set it to.
        Also in the ImmutableStudent object, final was used which makes variables unable to be 
        changed after being set.
        */

        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        //MutableStudent
        // 2. Which class is immutable?
        //ImmutableStudent
        // 3. What is the biggest difference you noticed?
        //In one class you can change the info after it has been set but can't in the other class.
    }
}
