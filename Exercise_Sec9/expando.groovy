Expando ex = new Expando()

ex.name = "Vic"
ex.scare = "BOO"
ex.cry = "boo hoo"

ex.scared = {
    println "SCARE: $ex.name "
    println "$ex.scare"
}

ex.scared()
println ex.cry

@groovy.transform.Canonical
class Monster {
    String name, creator
}

Monster m = new Monster(name: 'Dalek', creator: 'Davros')
m.metaClass.say = "EXTERMINATE"
println m 
println m.say