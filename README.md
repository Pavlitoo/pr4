### Використання командного рядка Java для обчислення кількість повних тетрад у двійковому поданні заданого

Даний Java-застосунок дозволяє обчислювати кількість повних тетрад у двійковому поданні заданого
десяткового числа, та тестувати різноманітні функції через командний рядок.

## TableResultDisplay.java

```java
package pr2;

public interface TableResultDisplay {
    void displayTable(CalculationResult result, int rows, int cols);
}
```

## TextTableResultDisplay.java

```java
package pr2;

public class TextTableResultDisplay implements TableResultDisplay {

    @Override
    public void displayTable(CalculationResult result, int rows, int cols) {
        // Реализация вывода таблицы
        String header = "+------------+------------+------------+\n";
        String separator = "+------------+------------+------------+\n";
        
        System.out.println(header + "| Parameter1 | Parameter2 |   Result   |\n" + separator);
        System.out.printf("| %10d | %10d | %10d |\n", result.getParameter1(), result.getParameter2(), result.getResult());
        System.out.println(separator);
    }
}
```

## CalculationTest.java

```java
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
```

### Ось результат ↓

![Результат](/screenshot/pr4.jpg)




