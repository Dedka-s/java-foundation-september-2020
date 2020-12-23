package ru.itsjava.allhomework.hw18_12_set_and_hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Создать множество фруктов
        Set<Fruit> fruits = new HashSet<>();
        Fruit apple = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange", 150);
        Fruit mango = new Fruit("Mango", 200);
        Fruit melon = new Fruit("Melon", 400);
        Fruit tangerine = new Fruit("Tangerine",50);
        //2. Добавить фрукт. Добавить его же
        fruits.add(apple);
        fruits.add(apple);
        //3. Удалить фрукт из множества
        fruits.remove(apple);
        //4. Проверить содержится ли фрукт в множестве фруктов
        System.out.println("fruits.contains(apple) = " + fruits.contains(apple));
        //5. Пробежаться с помощью итератора циклом while и вывести все фрукты на экран
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//HashMap
//0. Создание
        Map<String, Fruit> children = new HashMap<>();
//2. Вставка элементов
        children.put("Ivan",apple);
        children.put("Arina",orange);
        children.put("Daniel",mango);
        children.put("Arka",melon);
        children.put("Bob",tangerine);
//1. Получение элемента по ключу (Получить любой фрукт по покупателю)
        System.out.println(children.get("Maria"));

        Map <String, Fruit> newChildren = new HashMap<>();

        newChildren.putAll(children);
//3. Удаление элемента
        children.remove("Ivan");
//4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)
        System.out.println("children.containsKey(\"Ivan\") = " + children.containsKey("Ivan"));
        System.out.println("newChildren.containsValue(apple) = " + newChildren.containsValue(apple));
//5. Вывод Map на экран
        System.out.println();
        for (String key: children.keySet()){
            System.out.print(key + " ");
        }

        System.out.println();
        for (String key: children.keySet()){
            System.out.print(children.get(key) + " ");
        }

        System.out.println();
        for (String key: children.keySet()){
            System.out.println(key + ":" + children.get(key) + " ");
        }
//6. Отфильтровать Map вернуть записи по некоторому условию:
//а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)
//б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)
        System.out.println();
        int numberOfKey = 0;
        for (String key: children.keySet()){
            if (key.length()>5){
               numberOfKey++;
           }
        }
        System.out.println("количество ключей длина которых больше 5: " + numberOfKey);

        System.out.println();
        int numberOfValue = 0;
        for (String key: children.keySet()){
            if (children.get(key).equals(melon)){
                numberOfValue++;
            }
        }
        System.out.println("фруктов, которые равны дыне: " + numberOfValue);

// 7. Пропустить несколько элементов
// а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.
// б) Вывести все кроме 2 элементов, ключи которых начинаются на А

       children.put("Ivan", new Fruit("Watermelon",5000));
       children.put("Artem", new Fruit("Watermelon",5500));
       children.put("Ben", new Fruit("Watermelon",6500));
       children.put("Andre", new Fruit("Watermelon",6000));

        System.out.println();
        int numberOfWatermelon = 0;
        for (String key: children.keySet()){
            if ((numberOfWatermelon<2)&&(children.get(key).getName().equalsIgnoreCase("Watermelon"))){
                numberOfWatermelon++;
            } else {
                System.out.println(key + ":" + children.get(key) + " ");
            }
        }
        System.out.println();


        int numberOfNamesStartingWithA = 0;
        for (String key: children.keySet()){
            if ((numberOfNamesStartingWithA<2)&&(key.charAt(0)=='A')){
                numberOfNamesStartingWithA++;
            } else {
                System.out.println(key + ":" + children.get(key) + " ");
            }
        }
        System.out.println();

//8. Вернуть первый подходящий элемент:
//а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз
        for (String key: children.keySet()){
            if (children.get(key).getName().equalsIgnoreCase("Watermelon")){
                System.out.println(key + ":" + children.get(key) + " ");
                break;
            }
        }
        System.out.println();

//9. Возвращаем все элементы удовлетворяющие условию:
//а) Возвращаем все элементы в другую карту, которые являются melon
        children.put("Vova", melon);
        newChildren.clear();
        for (String key: children.keySet()){
            if (children.get(key).getName().equalsIgnoreCase("Melon")){
                newChildren.put(key,children.get(key));
            }
        }
        System.out.println();

        for (String key: newChildren.keySet()){
            System.out.println(key + ":" + newChildren.get(key) + " ");
        }

//10. Найти средний вес всех фруктов.
        int sum = 0;
        for (String key: children.keySet()){
            sum = sum + children.get(key).getWeight();
        }
        double middleWeight = sum/children.size();
        System.out.println("Средний вес = " + middleWeight);

    }
}
