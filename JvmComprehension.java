package JavaCoreJVM;

public class JvmComprehension {

    public static void main(String[] args) {
        // Класс JvmComprehension передается для загрузки в подистему ClassLoader
        // В момент вызова метода main создается фрейм main в Stack.
        int i = 1;                      // 1 Во фрейме main создается переменная i и присваивается значение 1.
        Object o = new Object();        // 2 В Куче (heap) создается объект Object и во фрейме main создается переменная o,
        // которой присваивается ссылка на этот объект
        Integer ii = 2;                 // 3 В Куче (heap) создается объект Integer и  присваивается значение 2,
        //во фрейме main появляется переменная ii со ссылкой на этот объект
        printAll(o, i, ii);             // 4 В Stack создается фрейм printAll
        // и в нем записываются переменные Object o, int i и Integer ii.
        System.out.println("finished"); // 7 В Stack создается фрейм println,
        // которому передается ссылка на созданный в Куче (heap) объект String со значением "finished".
        // В ходе выполнения работы программы отрабатывает мусорщик Garbage Collection.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 В Куче (heap) создается объект Integer со значением 700,
        // и во фрейме printAll появляется переменная uselessVar со ссылкой на этот объект.
        System.out.println(o.toString() + i + ii);  // 6 В Stack создаются фреймы println и toString,
        //В фрейм println передаются переменные i со значением 1, ii, o,
    }
}


