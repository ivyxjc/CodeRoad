package xyz.ivyxjc.annotation.databases;

/**
 * Created by jc on 1/7/2017.
 */


@DBTable(name="MEMBER")
public class Member {

    @SQLInteger Integer age;
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;

    @SQLString(value = 30,
                constraints = @Constraints(primaryKey = true)) String handle;


    static int memberCount;

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return handle;
    }
}
