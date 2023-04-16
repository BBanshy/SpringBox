package springbox.api.spring.entity;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
