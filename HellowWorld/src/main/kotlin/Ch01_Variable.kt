fun main() {
    // 리터널
    // 코드 작성시 값을 작성 하는 문법
    // 정수(Int, Long) : 100, 100L, 1_000_000
    // 정수형 자료에 L 이 붙으면 Long 형 자료를 의미함
    // 큰 값의 정수를 구분 하기 편하게 하기 위해 천단위 구분 기호(,) 와 같은 기능 으로 '_' 를 중간에 넣을 수 있음

    // 실수(Double, Float) : 11.11, 22.22F
    // F 가 사용 되면 Float 형 자료임

    // 문자(Char) : 'A', 'B'
    // 문자열(String) : "문자열"
    // 진위형(Boolean) : true, false

    // 정수 리터럴
    println(100); println(100000000000); println(10000000000000L); println(938_492_934_823);
    // 실수 리터럴
    println(11.11); println(22.22F);
    // 문자 리터럴
    println("A"); println("가");
    // 문자열 리터럴
    println("문자열");
    // 진위형 논리 리터럴
    println(true); println(false);

    // 복수행 String
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세\n")

    println("""동해물과 백두산이
            |마르고 닳도록
            |보우하사
            |우리나라 만세""".trimMargin())
    // trimMargin() : 호출객체가 되는 문자열에서 각행의 앞뒤공백 및 행의 시작문자를 제거해주는 함수
    // 큰따옴표 세개를 이용하여 복수행의 문자열을 사나의 데이터로 다룰 수 있음
    // Nothing : 함수가 정상적으로 끊나지 않는다를 의미
    // Unit : void 를 의미

    println("값 : ${100}")
    println("값 : ${100}")
    println("값 : ${100+100}")

    // 변수와 자료형
    // 정수 : Long(8), Int(4), Short(2), Byte(1)
    // 부호가 없는 정수형 : ULong(8), UInt(4), UShort(2), UByte(1)
    // 실수 : Double(8), Float(4)
    // 논리 : Boolean(1)
    // 문자 : Char(2)
    // 문자열 String
    // 자바의 자료형이랑 같지만 앞글자가 대문자임
    // U 가 붙은 자료형은 Insingned 를 의미하며, 음수가 없는 자료형을 의미
    
    // 변수의 선언
    // Kotlin은 변수선언 시 val, var 두 가지 키워드를 사용함
    // var : 선언이후 값을 수정할 수 있음
    // val : 선언이후 값을 수정할 수 없음
    // 변수의 선언 양식 : var/val 변수명 : 타입 = 값
    // 타입을 생략시 젖아하는 값에 따라 자료형이 자동으로 결정 됨\
    val a1:Int = 1;

    println("a1 = ${a1}")
    // 출력할 변수가 하나라면 중괄호 생략 가능함
    println("a1 = $a1")

    // 변수선언시 자바 스크립트처럼 자료형을 생략하면 알아서 자료형을 결정 함
    val a2 = 200
    println("a2 = $a2")
    
    // val 로 선언한 함수는 값을 수정할 수 없음
    // a2 = 300; // 에러

    // null 을 허용하거나 허용하지 않는 변수
    // 코틀린 변수는 선언할때 그 변수가 null 값을 가질 수 있는지 없는지 선택할 수 이씅ㅁ
    // 기본값은 허용x
    // 프로그래밍시 null 값이 저장되어서 오는 에러를 방지하기 위함
    // 일부 예외처리는 가능함
    // var/val 변수명:자료형 = 값 // null 허용 안함
    // var/val 변수명:자료형? = 값 // null 허용 함

    var a5 = 100;
    var a6:Int? = null;
    println("${a5}, ${a6 }")
    
    // 코틀린은 모든 기본타임 변수 및 값을 객체로 변환하여 사용 함

}