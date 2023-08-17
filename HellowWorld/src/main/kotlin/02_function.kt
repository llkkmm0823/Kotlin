fun main(){
    // 함수를 만드는 문법
    // fun 함수이름(매개변수) : 리턴값 타입 {
    //      실행 코드
    // }
    
    // 함수는 메인함수의 외부에도, 내부에도 생성이 가능
    // 변수에 지역변수와 전역변수가 존재하듯, 함수도 동일함
    
    test1()
    test2(30, 40.123)

    val k1 = 200;
    val k2 = 12.13
    test2(k1, k2)



}

fun test1(){
    println("test1 함수 호출")
}

fun  test2(a1:Int, a2:Double) {
    println("test2 호출")
    println("a1 : $a1")
    println("a2 : $a2")
}