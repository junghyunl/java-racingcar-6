package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String str = Console.readLine();
        System.out.println("시도할 회수는 몇회인가요?");
		String tryNum = Console.readLine();

        String[] carName = str.split(",");
		
        Car[] car = new Car[carName.length]; 
		
		for(int i = 0; i < car.length; i++) {
			car[i] = new Car(carName[i]);
		}
    }
}
