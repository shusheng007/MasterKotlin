package top.ss007.learn.java.feature;

import top.ss007.learn.kotlin.features.Animal;
import top.ss007.learn.kotlin.features.Dog;

public class GenericDemo {

    private Animal getOutAnimalFromBox(BoxJ<? extends Animal> box) {
       Animal animal = box.getAnimal();
       // box.putAnimal() 没有办法调用修改方法，因为我们不知道“?”究竟是一个什么类型，没法传入值

       return animal;
    }

    private void putAnimalInBox(BoxJ<? super Dog> box){
        box.putAnimal(new Dog());
        Object animal= box.getAnimal();// 可以调用读取方法，但是返回的类型确实Object，因为我们只能确定？的大基类是Object
    }

    public void run(){
        //协变
        BoxJ<Dog> dogBox = new DogBoxJ();
        getOutAnimalFromBox(dogBox);

        //逆变
        BoxJ<Animal> animalBox= new AnimalBoxJ();
        putAnimalInBox(animalBox);

//        String[] strs= new String[]{"ss007"};
//        Object[] objs= strs;
//        objs[0] = 1;
//        String s= strs[0];

    }

    interface BoxJ<T> {
        T getAnimal();
        void putAnimal(T a);
        default void clear(){}
    }

    static class AnimalBoxJ implements BoxJ<Animal>{

        @Override
        public Animal getAnimal() {
            return null;
        }

        @Override
        public void putAnimal(Animal a) {

        }
    }


   static class DogBoxJ implements BoxJ<Dog>{

       @Override
       public Dog getAnimal() {
           return null;
       }

       @Override
       public void putAnimal(Dog a) {

       }
   }
}

