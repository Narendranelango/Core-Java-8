package Ltwo;
class Demo {
public String firstName;
public String lastName;
public String gender;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public void gender() {

if (gender == "M" || gender == "F")
	System.out.println("Done");
else
	System.out.println("Wrong Details");
}

public String toString() {
return firstName + " : " + lastName + " " + gender;
}

public void calc() {

}
}

public class PersonMain {
enum Gen{
M,F	;
}
public static void main(String args[]) {
Demo d = new Demo();
d.setFirstName("Naren");
d.setLastName("E");
d.setGender("M");
d.gender();
System.out.println("Person Details");
System.out.println("______________________");
System.out.println(d.getFirstName());
System.out.println(d.getLastName());System.out.println(d.getGender());
}
}

