package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder object = new PizzaOrder();
    PizzaOrder pizzaOrder = null;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }
    @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){
        float actual = object.calculatePriceOfPizza(1,10.0f);
        assertEquals(10.0f,actual,1);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
        float actual = object.calculatePriceOfGarlicBread(1,5.99f);
        assertEquals(5.99f,actual,1);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
        float actual = object.calculatePriceOfBeverage(1,1.99f);
        assertEquals(1.99f,actual,1);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float actual = object.calculatePriceOfPizza(1,5.99f);
        assertNotEquals(4.56,actual,1);}
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
        float actual = object.calculatePriceOfGarlicBread(1,5.99f);
        assertNotEquals(2.45f,actual,1);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        float actual = object.calculatePriceOfBeverage(1,5.99f);
        assertNotEquals(3.67f,actual,1);
    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
        float actual = object.calculatePriceOfPizza(1,10.0f);
        assertEquals(10.0f,actual,1);

    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
        float actual = object.calculateTotalBill(10.0f,5.99f,1.99f);
        assertEquals(17.98f,actual,1);
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
        float actual = object.calculateDiscountAndReturnBillAmount(100.0f);
        assertEquals(90.0f,actual,1);

    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float actual = object.calculateTotalBill(1,5,3);
        assertEquals(9,actual,1);

    }
}
