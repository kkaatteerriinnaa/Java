package practiceProject25;

public class Program {

	 interface Microwavable {
        void heat();
	 }

	  
    static class Pizza implements Microwavable {
        @Override
        public void heat() {
            System.out.println("Піца нагрівається...");
        }
    }

    static class Cat {
        public void meow() {
            System.out.println("Мяу!");
        }
    }

    static class Microwave<T extends Microwavable> {
        public void put(T item) {
            item.heat();
            System.out.println("Річ успішно нагріта!");
        }
    }
	
	public static void main(String[] args) {
		 Pizza pizza = new Pizza();
		 Microwave<Pizza> microwave = new Microwave<>();
		 microwave.put(pizza);
	}

}
