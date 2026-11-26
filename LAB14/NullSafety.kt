
/*
Lab 14
Experiment 28: Null Safety in Kotlin
*/

fun main() {

    println("========== KOTLIN NULL SAFETY ==========")

    // =====================================
    // 1. NULLABLE AND NON-NULLABLE VARIABLES
    // =====================================

    println("\n--- 1. Nullable and Non-Nullable Variables ---")

    // Non-nullable variable
    var name: String = "Jigyasa"

    // Nullable variable
    var nickname: String? = null

    println("Non-nullable String: $name")
    println("Nullable String: $nickname")

    // Uncomment the following line to see a compile-time error:
    // name = null

    // Nullable variable can be assigned a string
    nickname = "Zigxx"

    println("Updated Nullable String: $nickname")


    // =====================================
    // 2. SAFE CALL OPERATOR (?.)
    // =====================================

    println("\n--- 2. Safe Call Operator ---")

    var city: String? = "Delhi"

    // Safe call: accesses length only if city is not null
    println("City length: ${city?.length}")

    // Assigning null
    city = null

    // Returns null instead of throwing an exception
    println("City length when null: ${city?.length}")


    // =====================================
    // 3. ELVIS OPERATOR (?:)
    // =====================================

    println("\n--- 3. Elvis Operator ---")

    var studentName: String? = null

    // Provides a default value when studentName is null
    val result = studentName ?: "Unknown Student"

    println("Student Name: $result")

    // Example when value is not null
    studentName = "Rahul"

    val result2 = studentName ?: "Unknown Student"

    println("Student Name: $result2")


    // =====================================
    // 4. NOT-NULL ASSERTION OPERATOR (!!)
    // WITH TRY-CATCH
    // =====================================

    println("\n--- 4. Not-Null Assertion Operator ---")

    var message: String? = null

    try {

        // !! forces Kotlin to treat message as non-null
        // Since message is null, it throws NullPointerException
        val length = message!!.length

        println("Message Length: $length")

    } catch (e: NullPointerException) {

        println("Exception Caught: ${e::class.simpleName}")
        println("Error Message: ${e.message}")
    }

    println("\n========== PROGRAM COMPLETED ==========")
}
