package exercice1;

import exercice1.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getFullNameandlastnameSeparatedbyespace() {
        Person p1 = new Person("zerrad", "med_tahar", 14);
        String result = p1.getFullName();
        Assertions.assertEquals("zerrad med_tahar",result);

    }

    @Test
    void isAdultShouldReturnTrueifAgeISSupOregalTo18() {
        Person p1 = new Person("zerrad", "med_tahar", 19);
        boolean result= p1.isAdult();
        Assertions.assertEquals(true,result);

    }
    @Test
    void isAdultShouldReturnFalseifAgeISInfTo18() {
        Person p1 = new Person("zerrad", "med_tahar", 14);

        boolean result= p1.isAdult();

        Assertions.assertEquals(false,result);


    }
}