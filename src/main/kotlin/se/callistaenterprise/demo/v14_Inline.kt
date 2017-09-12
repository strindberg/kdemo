package se.callistaenterprise.demo

inline fun functionParameter2(value: Int, operator: (Int) -> String): String {
    return operator(value)
}
