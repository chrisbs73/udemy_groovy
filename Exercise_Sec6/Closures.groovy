def someMethod(Closure c) {
    c()
}

def userSaysWhat = {
    println "User says what? "
}

someMethod(userSaysWhat)

List someAnimals = ["Dog", "Cat", "Bird", "Godzilla"]

someAnimals.each { animal ->
    println animal
}

mapDays = [1:"Sunday", 2:"Monday", 3:"Tuesday", 4:"Wednesday", 5:"Thursday", 6:"Friday", 7:"Saturday"]

mapDays.each { d_key, day -> 
    println "$d_key: $day"
}

def insulting = { String insult, String name ->
    println "$name you $insult"
}

insulting("smell like feet.", "Joe")

def defaultInsult = insulting.curry("smell like peanuts.")

defaultInsult("Frank")
defaultInsult("Ann")