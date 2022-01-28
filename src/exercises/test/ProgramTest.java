package exercises.test;
import exercises.technology.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {
    Smartphone testPhone;
    @Before
    public void createSmartphoneObject(){
        testPhone = new Smartphone(64, 16, "N/A", 200, 500);
    }
    Laptop testLaptopObject;
    @Before
    public void createLaptopObject(){
        testLaptopObject = new Laptop(1000, 64, "Gforce RX 3070", 12);
    }
    Computer testComputerObject;
    @Before
    public void createComputerObject(){
        testComputerObject  = new Computer(1000, 64, "Gforce RX 3080");
    }

    @Test
    public void emptyTest(){
        assertTrue(true);
    }

    @Test
    public void numOfContactsIncreasesBYContactToAdd(){
        assertEquals(505, testPhone.addContact(5));
    }

    @Test
    public void smartphoneInheritsSuperInConstructor(){
        assertEquals(64, testPhone.getStorage());
    }

    @Test
    public void laptopInheritsSuperInConstructor(){
        assertEquals(64, testLaptopObject.getRam());
    }

    @Test
    public void computerStorageIncreasesByValue(){
        assertEquals(1500, testComputerObject.increaseStorage(500));
    }

    @Test
    public void smartphoneClassCanUseAbstractEntityMethod(){
        assertEquals(testPhone.getId(), testPhone.getId());
    }

    @Test
    public void computerClassExtendsAbstractEntityClassAndGetsAnID(){
        int value = testComputerObject.getId();
        System.out.println(value);
        assertEquals(value,testComputerObject.getId());
    }

    @Test
    public void laptopIDNotEqualToSmartphoneID(){
        assertNotEquals(testLaptopObject.getId(), testPhone.getId());
    }
    @Test
    public void computerIDNotEqualToSmartphoneID(){
        assertNotEquals(testComputerObject.getId(), testPhone.getId());
    }

    @Test
    public void laptopIDNotEqualToComputerID(){
        assertNotEquals(testLaptopObject.getId(), testComputerObject.getId());
    }

    @ Test
    public void checkToSeeIfTheLaptopIsToHeavy(){
        assertFalse(testLaptopObject.toHeavy());
    }


}
