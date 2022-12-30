package com.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.quizapp.R

// TODO (STEP 3: Create a result activity for showing the score.)
// START
class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val congrats = findViewById<TextView>(R.id.tv_congratulations)
        val message = findViewById<TextView>(R.id.tv_score)
        val userName=findViewById<TextView>(R.id.tv_name)
        val correctAnswers= intent.getStringExtra("score")
        val name = intent.getStringExtra("name")

        if (correctAnswers != null) {
            if(correctAnswers.toInt() > 9){
                congrats.text="Congratulations Mr/Ms. "
                userName.text=name
                message.text="You are genius : ( "

            }
            else if(correctAnswers.toInt() in 7..9){
                congrats.text="Congratulations Mr/Ms. "
                userName.text=name
                message.text="Excellent"
            }
            else if(correctAnswers.toInt() in 5..6){
                congrats.text="Congratulations Mr/Ms. "
                userName.text=name
                message.text="Just Pass"
            }
            else{
                congrats.text="Sorry Mr/Ms. "
                userName.text=name
                message.text="Failed ... "
            }
        }



        val finish = findViewById<Button>(R.id.btn_finish)
        finish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }


    }
}
// END