/*b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
c) Создать Интерфейс Printable с методом void print();
d) Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.

e) В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й
и после создания и задания свойств объекту метод возвращает ссылку на объект (пульт).
Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
Например если в параметре передается “2й” метод должен создать объект именно этого типа.

f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject,
j) Добавить созданных объектов в один массив и c помощью цикла вызвать метод print() который распечатает всю информацию об объекте;*/
public class Main {
    // Метод для создания объектов и возвращения ссылки на них
    public static Printable createObject(String className) {
        switch (className) {
            case "2й":
                return new Car("Ездит", 12);
            case "3й":
                return new Plane("Летит", 2.22);
            case "4й":
                return new Horse("Бежит", true);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // Создаем объекты с помощью метода createObject
        Printable obj1 = createObject("2й");
        Printable obj2 = createObject("3й");
        Printable obj3 = createObject("4й");

        // Создаем массив и добавляем объекты
        Printable[] objects = { obj1, obj2, obj3 };

        // Вызываем метод print() для каждого объекта
        for (Printable obj : objects) {
            obj.print();
        }
    }
}