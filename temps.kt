/* Author: Yves Guillaume A Messy
 * 
 * This is a basic demonstration of a Kotlin program that takes time inputs
 * meaning using the Kotlin standard library's 'time' element, and adds it with
 * another like it, instead of a regular float or int or double, and returns a sum
 * of the amount of time waited. 
 * 
 */

package timeadder

data class Temps(val heures: Int, val mins: Int ) {
	
    	infix fun ajouteTemps(temps: Temps): Temps {

//	operator infix fun ajouteTemps(temps: Temps): Temps {

        val minutes = this.mins + temps.mins
        val tempsEnMinutes = minutes / 60
        val minutesQuiRestent = minutes % 60
        val heures = this.heures + temps.heures + tempsEnMinutes
        return Temps(heures, minutesQuiRestent)
        
        
        
    }
    
}


fun main(args: Array<String>) {
    
    val heureActuelle = Temps(21, 40) ajouteTemps Temps(3, 20)
    
    println("Temps total vu les donnees soumises: $heureActuelle")
    
//    val heureActuelle = Temps(10, 40) + Temps(3, 20)
    
//    println(heureActuelle)
//    
 	println("donc, il fait en total ${heureActuelle.heures} heures et ${heureActuelle.mins} minutes. Passez une bonne Journee!")
}
