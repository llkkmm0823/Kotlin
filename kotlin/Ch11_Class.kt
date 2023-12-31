fun main(){
    // 자바는 프로그램 자체도 클래스 입니다.
    // 클래스로 프로그램의 실행과 자료들이 모두 관리됩니다. -> 객체지향프로그램
    // 객체지향 프로그램의 반대개념이 구조화프로그램 입니다.
    // 이는 함수 중심으로 프로그램 시작과 끝이 관리됩니다
    // 코틀린은 자료들은 클래스로, 프로그램 시간과 끝 관리는 함수로 병행하여 운용되는 형태입니다

    // 생성된 클래스 형태로 객체를 생성합니다
    // 자바문법 : TestClass1 obj1 = new TestClass1()
    // 코틀린 : val 참조변수이름 : 클래스이름 = 클래스이름()
    val obj1:TestClass1 = TestClass1(); // 생성자 호출이 이루어지되  new 라는 말이 사용되지 않습니다.

    // new 를 쓰지 않는다고 새로운 공간이 만들어지지 않는 것이 아니라 사용상 생략되어 사용될 뿐입니다.
    println("obj1 : $obj1")
    // obj1 은 참조 변수이며, 참조값을 다른 참조변수에 복사해서 객체를 공유할 수 있습니다.
    val obj3 = obj1
    println("obj3 : $obj3")

    val obj4 = TestClass2()   // { } 없이 비워져서 생성된 크래스도   새로운 객체를 생성하는데 아무 문제가 없습니다.
    println("obj4 : $obj4")

    val obj5 = TestClass3();
    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    // obj5.a1 = 100 // 에러 : setter 가 없는 a1 변수는 값을 변경할 수 없습니다
    obj5.a2 = 200  // setter 가 200을  a2 멤버 변수에 넣어줍니다
    println("obj5.a2 : ${obj5.a2}")
    obj5.testMethod1()
    obj5.testMethod2()
}
// 멤버 변수 : 멤버변수는 var 또는 val 로 자유롭게 생성이 가능합니다.
// 자료형은 초기값에 따라 결정되도록 생략 가능 합니다.
class TestClass3{
    // 코틀린 클래스에서 생성됨 멤버변수는 기본적으로  private 로 생성됩니다.
    val a1:Int = 0   // getter 만 있는 val 변수는 밑줄이 없습니다.
    var a2 = 0        // getter 와 setter 가 모두 생성되는 var 변수는 밑줄이 표시됩니다.
    fun testMethod1(){
        println("testMethod1")
    }
    fun testMethod2(){
        println("testMethod2")
    }
}


class TestClass1{  }

class TestClass2  // 비어있는 클래스를 생성 & { } 생략
// 비어 있는 클래스를 생성한다면 {} 를 생략할 수 있습니다.


