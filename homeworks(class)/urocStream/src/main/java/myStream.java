
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter

public class myStream {
    public static class Human {
      private   int age;
       private String name;
       private List<Child> childs = new ArrayList<>();

        public String getName(String name) {
            return name;
        }

        public int getAge(int age) {
            return age;
        }

        public List<Child> getChilds(List<Child> childs) {
            return childs;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;

        }


        public void addChild(Child child) {
            childs.add(child);
        }

        @Override
        public String toString() {
            return "Child{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }


    }

    public static class Child {
      private   int age;
       private String name;

        public int getAge(int age) {
            return age;
        }

        public String getName(String name) {
            return name;
        }

        public Child(int age, String name) {
            this.age = age;
            this.name = name;
        }


        public static void main(String[] args) {
            List<Human> list = new ArrayList<>();
            list.add(new Human(25, "Петя"));
            list.add(new Human(34, "Аня"));
            list.add(new Human(56, "Саша"));
            list.add(new Human(29, "Света"));


            List<Child> child = new ArrayList<>();
            child.add(new Child(14, "Маша"));
            child.add(new Child(19, "Катя"));
            child.add(new Child(21, "Юля"));
            child.add(new Child(12, "Света"));
            child.add(new Child(17, "Кристина"));
            child.add(new Child(15, "Антон"));

            list.get(0).addChild(child.get(1));
            list.get(0).addChild(child.get(3));
            list.get(1).addChild(child.get(5));
            list.get(1).addChild(child.get(0));
            list.get(2).addChild(child.get(2));
            list.get(3).addChild(child.get(4));


            List<Human> human = list.stream()
                      .filter(e -> e.childs.size() >= 2).peek(System.out::println)
                      .filter(e -> e.name.contains("Аня")  && e.age>30).peek(System.out::println)
                      .filter(e -> e.childs.size() >= 1 && e.age >= 18).peek(System.out::println)
                      .filter(e -> e.childs.size()>=2 && e.age>= 18).peek(System.out::println)
                      .collect(Collectors.toList());




        }
    }
}

 