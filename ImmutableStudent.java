public final class ImmutableStudent 
{

    // TODO: Create two private final fields:
    // 1. name (String)
    private final String name;
    // 2. age (int)
    private final int age;

    // TODO: Create a constructor that receives name and age.
    // The constructor should initialize both fields.
    public ImmutableStudent(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // TODO: Create a getter for name.
    public String getName()
    {return name;}

    // TODO: Create a getter for age.
    public int getAge()
    {return age;}

    // IMPORTANT:
    // Do NOT create setter methods in this class.
    // The object's data should not change after it is created.
    public void displayInfo()
    {
        System.out.println("\nStudent Name: "+name);
        System.out.println("Student Age: "+age);
    }
}
