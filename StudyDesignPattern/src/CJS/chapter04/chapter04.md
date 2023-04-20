# CHAPTER 04 - 객체지향 빵 굽기
## 팩토리 패턴
"new" 연산자를 사용하면 구상 클래스의 인스턴스가 만들어짐
하지만 문제 투성이~ 
변화에 취약
종류가 추가되고 바뀔때마다 코드를 계속 수정해야함

> 다형성 : 인터페이스만 구현해도 어떤 클래스도 맞춰서 여러 변화에 대응 할 수 있음

> 팩토리(Factory) : 객체 생성을 처리하는 클래스