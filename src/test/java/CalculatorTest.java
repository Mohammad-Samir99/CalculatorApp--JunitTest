
import com.mycompany.calculatorapp.CalculatorClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MohamadSamir
 */
public class CalculatorTest {

    @Test
    void Add_Return_5() {
        CalculatorClass calculatorClass = new CalculatorClass();
        double result = calculatorClass.Add(4, 1);

        double expect = 5;

        Assertions.assertEquals(expect, result);
    }

    @Test
    void Divid_BEqulatsToZero_Return_Exception() {

        CalculatorClass calculatorClass = new CalculatorClass();
        Assertions.assertThrows(Exception.class, ()->{calculatorClass.Divid(4, 0);});
    }
}
