package kulkov.JavaCore.lesson1;

/**
 * Kulkov Mikhail.
 *
 * Задание 1. Создать пустой проект с методом main().
 */

public class Main {
    public static void main(String[] args) {

        /*
            Задание 2. Проинициализировать переменные всех основных типов.
         */
        boolean valTestBool     = false;
        char valTestChar        = 'c';
        byte valTestByte        = 13;
        short valTestShort      = 13;
        int valTestInt          = 13;
        long valTestLong        = 13L;
        float valTestFloat      = 13.0f;
        double valTestDouble    = 13.0;
        String valTestString    = "test string";

        System.out.println(evaluationFunc(10, 13, 21, 32));
        System.out.println(checkSum(2, 6));
        checkSign(0);
        System.out.println(invertedSignCheck(-18));
        helloName("Михаил");
        checkYear(300);
    }

    /*
        Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
                    где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    static float evaluationFunc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*
        Задание 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
                    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    static boolean checkSum(int inputValue1, int inputValue2)    {
        return 10 <= (inputValue1 + inputValue2) && 20 >= (inputValue1 + inputValue2);
    }

    /*
        Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен
                    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
                    ноль считаем положительным числом.

     */
    static void checkSign(int intputValue)    {
        if(intputValue >= 0)    {
            System.out.println("Положительное число.");
            return;
        }
        System.out.println("Отрицательное число.");
    }

    /*
        Задание 6. Написать метод, которому в качестве параметра передается целое число. Метод должен
                    вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    static boolean invertedSignCheck(int inputValue1)    {
        return !(inputValue1 >= 0);
    }

    /*
        Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
                    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

     */
    static void helloName(String inputName)    {
        System.out.println("Привет, " + inputName + "!");
    }

    /*
        Задание 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в
                    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
                    високосный.
     */
    static void checkYear(int inputYear)    {
        if (inputYear % 400 == 0)   {
            // сразу на входе проверяем, что год - високосный.
            System.out.println("Год " + inputYear + " - високосный.");
        }
        else if (inputYear % 100 == 0)  {
            // этот - точно не високосный.
            System.out.println("Год " + inputYear + " - не високосный.");
        }
        else if (inputYear % 4 == 0)  {
            // год - високосный.
            System.out.println("Год " + inputYear + " - високосный.");
        } else {
            // ни одно из условий не прошло, год - не високосный.
            System.out.println("Год " + inputYear + " - не високосный.");
        }
    }
}