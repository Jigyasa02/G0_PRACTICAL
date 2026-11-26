
/*
Lab 14
Experiment 29: Collections and Functional Transformations
*/

// Student class
data class Student(
    val name: String,
    val percentage: Double
)

fun main() {

    // =========================================
    // PART 1: MUTABLE AND READ-ONLY COLLECTIONS
    // =========================================

    println("========== PART 1: COLLECTIONS ==========")

    // 1. MUTABLE LIST
    println("\n--- Mutable List ---")

    val mutableList = mutableListOf(10, 20, 30, 40)

    mutableList.add(50)
    mutableList.remove(20)

    println("Mutable List: $mutableList")
    println("Contains 30: ${mutableList.contains(30)}")
    println("Element at index 1: ${mutableList[1]}")

    // 2. READ-ONLY LIST
    println("\n--- Read-Only List ---")

    val readOnlyList = listOf(10, 20, 30, 40)

    println("Read-Only List: $readOnlyList")
    println("Contains 20: ${readOnlyList.contains(20)}")
    println("Element at index 2: ${readOnlyList[2]}")

    // 3. MUTABLE SET
    println("\n--- Mutable Set ---")

    val mutableSet = mutableSetOf(10, 20, 30)

    mutableSet.add(40)
    mutableSet.remove(20)

    println("Mutable Set: $mutableSet")
    println("Contains 30: ${mutableSet.contains(30)}")

    // 4. READ-ONLY SET
    println("\n--- Read-Only Set ---")

    val readOnlySet = setOf(10, 20, 30)

    println("Read-Only Set: $readOnlySet")
    println("Contains 20: ${readOnlySet.contains(20)}")

    // 5. MUTABLE MAP
    println("\n--- Mutable Map ---")

    val mutableMap = mutableMapOf(
        1 to "Amit",
        2 to "Rahul",
        3 to "Priya"
    )

    mutableMap[4] = "Neha"
    mutableMap.remove(2)

    println("Mutable Map: $mutableMap")
    println("Contains key 1: ${mutableMap.containsKey(1)}")
    println("Value of key 3: ${mutableMap[3]}")

    // 6. READ-ONLY MAP
    println("\n--- Read-Only Map ---")

    val readOnlyMap = mapOf(
        1 to "Amit",
        2 to "Rahul",
        3 to "Priya"
    )

    println("Read-Only Map: $readOnlyMap")
    println("Contains key 2: ${readOnlyMap.containsKey(2)}")
    println("Value of key 1: ${readOnlyMap[1]}")


    // =========================================
    // PART 2: FUNCTIONAL TRANSFORMATIONS
    // =========================================

    println("\n========== PART 2: TRANSFORMATIONS ==========")

    val numbers = listOf(1, 2, 3, 4, 5)

    println("Original List: $numbers")

    // MAP: Multiply each number by 2
    val mappedList = numbers.map { it * 2 }

    println("After map: $mappedList")

    // FILTER: Select even numbers
    val filteredList = numbers.filter { it % 2 == 0 }

    println("After filter: $filteredList")

    // REDUCE: Calculate the sum
    val reducedResult = numbers.reduce { total, number ->
        total + number
    }

    println("After reduce (Sum): $reducedResult")


    // =========================================
    // PART 3: SORTING AND GROUPING
    // =========================================

    println("\n========== PART 3: SORTING AND GROUPING ==========")

    // Creating Student objects
    val students = listOf(
        Student("Amit", 85.5),
        Student("Rahul", 72.0),
        Student("Priya", 92.0),
        Student("Neha", 65.5),
        Student("Karan", 78.0)
    )

    println("\nOriginal Student List:")

    students.forEach {
        println("${it.name} - ${it.percentage}%")
    }

    // SORT STUDENTS BY PERCENTAGE
    val sortedStudents = students.sortedByDescending {
        it.percentage
    }

    println("\nStudents Sorted by Percentage:")

    sortedStudents.forEach {
        println("${it.name} - ${it.percentage}%")
    }

    // GROUP STUDENTS BY PERCENTAGE
    val groupedStudents = students.groupBy {
        when {
            it.percentage >= 80 -> "Distinction"
            it.percentage >= 70 -> "First Division"
            else -> "Second Division"
        }
    }

    println("\nStudents Grouped by Percentage:")

    groupedStudents.forEach { (category, studentList) ->

        println("\n$category:")

        studentList.forEach {
            println("${it.name} - ${it.percentage}%")
        }
    }

    println("\n========== PROGRAM COMPLETED ==========")
}
