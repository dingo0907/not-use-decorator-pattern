public class StarbucksCoffee {

    public static void main(String args[]) {

        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost(10.0));

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost(15.0));

        Beverage beverage3 = new Espresso();
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost(20.0));

        Beverage beverage4 = new HouseBlend();
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost(25.0));

        // comment
        // 문제점 1. 첨가물 가격이 바뀌면 Beverage 클래스의 cost() 메소드에 정의된 첨가물 값을 변경해야 한다.
        // 문제점 2. 첨가물의 종류가 많아지면 Beverage 클래스에 첨가물 boolean 타입 변수 및 set,get 메소드를 추가해야 하고, cost() 메소드도 고쳐야 한다.
        // 문제점 3. 새로운 음료가 출시되면 Beverage를 확장해서 클래스를 추가해야 하는데 새로운 음료가 밀크를 사용하지 않는다 해도, 여전히 상속 받는 문제가 발생한다.
        // 문제점 4. 손님이 모카를 두번 넣어 달라 주문할 시, 기존 코드 수정 이외에는 방법이 없다.

    }

}
