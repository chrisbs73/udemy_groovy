// Create enum of days of the week
enum weekDays{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
println weekDays.values()

// Create a range from the days of the week
Range weekRange = weekDays.Tuesday..weekDays.Friday
println weekRange

// Range size
println "Range Size = ${weekRange.size()}"

if ( weekRange.contains(weekDays.Wednesday) ) {
    println "Wednesday is in the range"
}

println "weekRange From / To: ${weekRange.from} ${weekRange.to}"