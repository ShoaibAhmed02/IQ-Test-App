package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "    Which of the following can be arranged  \n into a 5-letter English word?",
            R.drawable.question,
            "R I L S A", "W Q R G S",
            "H R G S T", "M D K A L", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "    Which number should come next in the \n pattern? 37, 34, 31, 28",
            R.drawable.question2,
            "24", "27",
            "25", "21", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "   7, 10, 8, 11, 9, 12, ... \n What number should come next?",
            R.drawable.question3,
            "13", "11",
            "9", "10", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "  which pair of numbers comes next \n 42 40, 38 35, 33 31, 28?",
            R.drawable.question4,
            "25 22", "26 23",
            "26 24", " 25 23", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "  36 31, 29 24, 22 17, 15 \n which pair of numbers comes next ",
            R.drawable.question5,
            "13 , 11", "13 , 8",
            "10 , 8", "12 , 7", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "3 5 35 10 12 35 17 \n what next ? ",
            R.drawable.question6,
            "19 35", "20 22",
            "19 24", "18 19", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "   What would be the next?  \n Sock:foot:: gloves: ?",
            R.drawable.question2,
            "Hand", "Arm",
            "Fingers", "Boxing", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "    Choose the pair which has same \n relation like as  Joke: Laughter ?",
            R.drawable.question2,
            "Death : Life", "Disease : Medicine ",
            "Cry : Sorrow ", "Miracle : Surprise", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "     if PIPE is written as 169165,\n Then what is Last digit of SWAN?",
            R.drawable.question3,
            "3", "4",
            "8", "9", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, " If PAISA:RUPEE:: ? : KILOMETER",
            R.drawable.question6,
            "Decametre", "Meter",
            "Centimeter", "Distance", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}