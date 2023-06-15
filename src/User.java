/**
 * ClassName: User<br/>
 * Description: TODO Description. <br/>
 * date: 2022/9/2 10:13<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class User {

    public String userName;

    public int age;

    public int gender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public User(String userName, int age, int gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }
    public User(){}


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
