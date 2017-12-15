package springbootlearning.springbootlearning.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hang")
@Component
public class Hang {

    private String name;

    private int age;

    private String memberName;

    public Hang() {
    }

    public Hang(String name, int age, String memberName) {
        this.name = name;
        this.age = age;
        this.memberName = memberName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Hang{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}
