package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
//        given
        Person person = new Person(11l, "Joe", "Buck");
//        then
        assertAll("Test That Properties are Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck"));
    }    @Test
    void groupedAssertionsMsgs() {
//        given
        Person person = new Person(11l, "Joe", "Buck");
//        then
        assertAll("Test That Properties are Set",
                () -> assertEquals(person.getFirstName(), "Joe", "**** First name fails ****"),
                () -> assertEquals(person.getLastName(), "Buck" ,"**** Last name fails  ****"));
    }
}