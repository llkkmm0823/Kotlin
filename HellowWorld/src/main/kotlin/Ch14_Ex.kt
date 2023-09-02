fun main() {
// 코틀린으로 달력 출력하기 _터미널 프롬프트 통해서
    print("연도 입력: ")
    val year: Int = readLine()!!.toInt()
    print("월 입력: ")
    val month: Int = readLine()!!.toInt()

    val first = getFirstDayOfMonth(year, month)
    val day = getDaysInMonth(year, month)

    println("일 월 화 수 목 금 토")

    for (i in 1 until first) {
        print("   ")
    }

    for (day in 1..day) {
        print("${day.toString().padStart(2, ' ')} ")
        if ((first + day - 1) % 7 == 0) {

            println()
        }
    }
}

fun getFirstDayOfMonth(year: Int, month: Int): Int {
    val calendar = java.util.Calendar.getInstance()
    calendar.set(year, month - 1, 1)
    return calendar.get(java.util.Calendar.DAY_OF_WEEK)
}

fun getDaysInMonth(year: Int, month: Int): Int {
    val calendar = java.util.Calendar.getInstance()
    calendar.set(year, month - 1, 1)
    return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH)
}