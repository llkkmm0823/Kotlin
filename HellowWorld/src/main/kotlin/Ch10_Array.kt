fun main() {
    //코틀린의 배열생성은 arrayOf를 자주 이용
    val array1 = arrayOf(10,20,30,40,50)
    println("array1 : $array1") // 클래스 이름과 해쉬코드등이 출력됨

    //코틀린의 배열은 일단 자료형의 제약이 없음
    //자바의 ArrayList등 처럼 여러 자료형 데이터를 하나의 배열에 넣어서 사용할 수 있음
    //자바의 배열과 ArrayList가 합쳐진 형태로 이해할 수 있음
    //다만 그것이 권장할 만한 동작은 아니기때문에 자료형을 제한하는 코드가 제공되어 사용됨
    println("\n-------------------------------------------------")
    //자료형 제약없이 사용
    val array2 = arrayOf(100,11.11,"문자열",true)
    println("array2 : ${array2.contentToString()}")
    println("\n-------------------------------------------------")
    //하나의 자료로 제한하여 사용
    val array3 = intArrayOf(10,20,30,40,50) // 기본자료형은 ArrayOf앞에 자료형을 붙여쓰고
    val array4 = doubleArrayOf(11.11,22.22,33.33,44.44,55.55)
    val array5 = arrayOf<String>("문자열1","문자열2","문자열3")//객체형 자료는 제네릭 사용
    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

}