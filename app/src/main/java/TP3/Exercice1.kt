package TP3

import java.util.Arrays

//Q=>1 :Créer la classe Module
class Module(var intitule: String,var siRegional: Boolean,var termine: Boolean,var nbHeures: Int)
//Fonction filter() :
fun filtrer(number: Array<Int>,app:(Int)->Boolean): Array<Int> {
    var listp= mutableListOf<Int>()
    for (e in number){
        if (app(e)){
            listp.add(e)
        }
    }
    return listp.toTypedArray()
}
fun paire(e:Int):Boolean=e%2==0

fun main() {
//créer une liste de modules liste .
    var modules = mutableListOf<Module>()
//Créer plusieurs modules et ajouter les modules  à la liste
    var m1 = Module("AF354",true,false,10)
    var m2 = Module("ZT345",false,true,17)
    var m3 = Module("CP789",true,true,8)
    var m4 = Module("YW921",false,false,21)
//ajouter tout les modules en liste
    modules.add(m1)
    modules.add(m2)
    modules.add(m3)
    modules.add(m4)
//afficher les informations des modules
    for (module in modules) {
        println("Intitulé: ${module.intitule} , Si régional: ${module.siRegional} , Terminé: ${module.termine} , Nombre d'heures: ${module.nbHeures}")
    }
//2)a)i -> afficher les info en forEach
    //modules.forEach{ println("Module => ${it}") } // XXXXXXXX
    modules.forEach { println("Module => ${it.intitule} ; ${it.siRegional} ; ${it.termine} ; ${it.nbHeures}") }
//2)a)ii -> afficher sauf intitule
    modules.forEach{ println("Intituler  : ${it.intitule}") }

//3 -> tester la fonction map() avec expression Lambda
    var menu : List<String> = modules.map { it.intitule }
    menu.forEach { println("${it}") }
    println("menu est ${menu}")

//Q-4 -> teste de function filterer ; afficher les nomberes paire
    var numbers = arrayOf<Int>(12,9,10,8,15,1,6)
    val modulesRegionaux = filtrer(numbers,::paire)
    println("les numberes paire est : " + Arrays.toString(modulesRegionaux))
//Q -> 5- Fonction fold() :



//Q -> 6 Fonction sortedBy() :
    println()
    //trie liste modules par nomber d'Heures
    val listeTriee1 = modules.sortedBy { it.nbHeures }
    println("Liste triée par nomber d'Heures:")
    for (module in listeTriee1) {
        println("Intitulé: ${module.intitule} , Si régional: ${module.siRegional} , Terminé: ${module.termine} , Nombre d'heures: ${module.nbHeures}")
    }
    //trier liste par intitule
    val listeTriee2 = modules.sortedBy { it.intitule }
    println("Liste triée par intitule")
    for (module in listeTriee2){
        println("Intitulé: ${module.intitule} , Si régional: ${module.siRegional} , Terminé: ${module.termine} , Nombre d'heures: ${module.nbHeures}")
    }
}