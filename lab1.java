// Класс реализующий конкретную стратегию, должен реализовывать этот интерфейс
// Класс контекста использует этот интерфейс для вызова конкретной стратегии
interface Strategy {
    int execute(int a, int b); 
}

// Реализуем алгоритм с использованием интерфейса стратегии
class Walking implements Strategy {
 
    public void execute() {
        System.out.println("Called walking's execute()");
        //return a + b;  // Do an addition with a and b
    }
}
 
class Horse implements Strategy {
 
    public void execute() {
        System.out.println("Called Horse's execute()");
        //return a - b;  // Do a subtraction with a and b
    }
}
 
class CarpetPlane implements Strategy {
 
    public void execute() {
        System.out.println("Called CarpetPlane's execute()");
        //return a * b;   // Do a multiplication with a and b
    }    
}

// Класс контекста использующий интерфейс стратегии
class Hero {
 
    private Strategy strategy;
 
    // Constructor
    public Hero() {
    }

    // Set new strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int move() {
        return strategy.execute();
    }
}
 
// Тестовое приложение
class StrategyExample {
 
    public static void main(String[] args) {
 
        Hero hero = new Hero();
 
        hero.setStrategy(new Walking());
        hero.move();
 
        hero.setStrategy(new Horse());
        hero.move();
 
        hero.setStrategy(new CarpetPlane());
        hero.move();

    }
}
