// Fun with lists.... 
dayList = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

println dayList

println "dayList size: ${dayList.size()}"

dayList.remove("Saturday")
println dayList

dayList << "Saturday"
println dayList

println dayList[3]