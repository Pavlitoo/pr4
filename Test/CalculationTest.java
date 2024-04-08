package Test;

import pr2.CalculationResult;
import pr2.TextTableResultDisplay;

public class CalculationTest {
    public static void main(String[] args) {
        // Создаем объект CalculationResult с заданными параметрами
        CalculationResult result = new CalculationResult(5, 10, 50);

        // Тестирование результатов вычислений
        if (result.getResult() != 50) {
            throw new AssertionError("Calculation result is incorrect");
        } else {
            System.out.println("Calculation result is correct: " + result.getResult());
        }

        // Создание объекта для отображения результатов в виде таблицы
        TextTableResultDisplay resultDisplay = new TextTableResultDisplay();
        resultDisplay.displayTable(result, 1, 3);
    }
}
