package TP3

import java.util.Arrays

//Q=>1 :Créer la classe Module
class Module(val intitule: String,val siRegional: Boolean,val termine: Boolean,val nbHeures: Int)

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
    var m2 = Module("ST345",false,true,17)
    var m3 = Module("QP789",true,true,8)
    var m4 = Module("XW921",false,false,21)
    modules.add(m1)
    modules.add(m2)
    modules.add(m3)
    modules.add(m4)
    for (module in modules) {
        println("Intitulé: ${module.intitule} , Si régional: ${module.siRegional} , Terminé: ${module.termine} , Nombre d'heures: ${module.nbHeures}")
    }
    println()
    modules.forEach{ println("Module => ${it.intitule} ; ${it.siRegional} ; ${it.termine} ; ${it.nbHeures}") }
    println()
    modules.forEach{ println("Intituler  : ${it.intitule}") }
//tester la fonction d’ordre supérieur map() avec expression Lambda
    var menu : List<String> = modules.map { it.intitule }
    menu.forEach { println("${it}") }
    println("menu est ${menu}")
//teste de function filtere
    var numbers = arrayOf<Int>(12,9,10,8,15,1,6)
    val modulesRegionaux = filtrer(numbers,::paire)
    println("les numberes paire est : " + Arrays.toString(modulesRegionaux))

}