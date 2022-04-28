public class OfficeUser {
    private String firstName;
    private String middleName;
    private String lastName;
    private String post;
    private int phoneNumber;
    private String email;
    private int salary;
    private int age;

    public OfficeUser(String firstName, String middleName, String lastName, String post, int phoneNumber, String email, int salary, int age) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.post = post;
        setPhoneNumber(phoneNumber);
        this.email = email;
        this.salary = salary;
        setAge(age);
    }

    public String toString() {
        return firstName + ", " + middleName + ", " + lastName + ", " + post + ", " + phoneNumber + ", " + email + ", " + salary + ", " + age + ", ";
    }

    public void print() {

        System.out.println("firstName = " + firstName+"middleName = " + middleName+"lastName = " + lastName+"post = " + post+"phoneNumber = " + phoneNumber+"email = " + email+"salary = " + salary+"age = " + age);
        
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber <= 899999999 && phoneNumber > 800000000)
            this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 300) {
            this.age = age;
        }
    }
}
