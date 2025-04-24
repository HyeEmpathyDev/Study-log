package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자: model만 받음
    Car(String model) {
        this(model, "검정", 500);  // 다른 생성자 호출!
    }

    // 생성자: model, color 받음
    Car(String model, String color) {
        this(model, color, 500);  // 다른 생성자 호출!
    }

    // 생성자: 모든 필드 초기화
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
