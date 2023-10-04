public class Student extends Human
{
    private String department;
    public Student( String firstName, String middleName, String lastName, String department,int age)
    {
        super(firstName, middleName, lastName, age);
        if(department == null)
        {
            throw new IllegalArgumentException("Department is null");
        }
        this.department = department;
    }

    public Student(String firstName, String middleName, String department, int age)
    {
        super(firstName, middleName, age);
        if(department == null)
        {
            throw new IllegalArgumentException("Department is null");
        }
        this.department = department;
    }

    public Student()
    {
        super();
        department = "";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department == null)
            throw new IllegalArgumentException("Department is null");
        this.department = department;
    }
}
