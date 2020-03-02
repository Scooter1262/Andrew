package class1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalFactoryTest {
    @Test
    public void testCreateAnimal_isDog() {
        AnimalType a = AnimalType.DOG;//класс енама проверяем собаку
        Animal b = AnimalFactory.СreateAnimal(a);// класс анималфактори создаёт животное(метод с анимал фактори)
        assertTrue(b instanceof DOG);// проверяет b, если собака то тру
    }
    @Test
    public  void  testCreateAnimal_isCAT(){
        AnimalType a = AnimalType.CAT;
        Animal b = AnimalFactory.СreateAnimal(a);
        assertTrue(b instanceof CAT);
    }
    @Test
    public  void  testCreateAnimal_isBIRD(){
        AnimalType a = AnimalType.BIRD;
        Animal b = AnimalFactory.СreateAnimal(a);
        assertTrue(b instanceof BIRD);
    }
    @Test(expected =  IllegalArgumentException.class)
    public  void  testCreateAnimal_withIllegalArgumentException(){// вкидываем название екзепшена который ловим
        AnimalType a = AnimalType.HT;//
        Animal b = AnimalFactory.СreateAnimal(a);

    }


}