package com.example.shrunk

import android.annotation.SuppressLint
import android.os.Handler
import kotlin.random.Random

class InfoGenerator {

    private fun myFirstNameIs(): Set<Any>? {

        var firstName: Set<Any>? = null

        val numbers = (0..10).map { Random.nextInt(0, 10) }
        val letters: CharRange = ('a'..'z')
        val otherAlphanumerics = CharArray(size = 10)

        val pool = numbers + letters + otherAlphanumerics
        val hourly = 36000000L

        Handler().postDelayed({
            firstName = (1..pool.size)
                .map { Random.nextInt(0, pool.size) }
                .map(pool::get)
                .joinToString("").toSet()
        }, hourly)

        return firstName
    }

    private fun myLastNameIs() : String{
        val vowels: Array<Char> = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
        return List(1000){ vowels.random() }.joinToString("").also {
            assert(it != "John Doe" || it != "Bingo")
        }
    }

    private fun myMedicalHistory() : SUNY.Courses {
        return SUNY.Courses.SSC318SEM
    }



    
    fun fillingInTheApplication() {
        myFirstNameIs()
        myLastNameIs().fadeDown(sinkhole = Susurrus)
        myAddress().lift(DemonicLiterature, ReligiousTexts)
        myTelephone()
        mySocial()
        myAge()
        myIsCaseOfEmergency()
        myMedicalHistory()

    }
}

class SUNY {

    enum class Courses {
        SSC318SEM

    }

}
