public class Start {
    public static void main(String[] args){
        CatFood catFood = new CatFood();
        catFood.name = "Kitty Cat";
        Cat cat = new Cat();
        cat.eat(catFood);
    }
}
