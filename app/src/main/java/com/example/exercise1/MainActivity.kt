package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var carloan : TextView
    lateinit var interest : TextView
    lateinit var  monthlyPayment : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carloan = findViewById(R.id.textViewLoan)
        interest = findViewById(R.id.textViewInterest)
        monthlyPayment = findViewById(R.id.textViewMonthlyRepayment)

        buttonCalculate.setOnClickListener{view : View ->

            val Price = editTextCarPrice.text.toString().toDouble()
            val downPayment = editTextDownPayment.text.toString().toDouble()
            val interestRate = editTextInterestRate.text.toString().toDouble()
            val loanPeriod = editTextLoanPeriod.text.toString().toDouble()

            val loan = Price - downPayment
            val inter = (loan * interestRate * loanPeriod)/100
            val montly = (loan + inter)/ loanPeriod / 12


            carloan.setText("Loan : " + "%.2f".format(loan).toDouble())
            interest.setText("Interest : " + "%.2f".format(inter).toDouble())
            monthlyPayment.setText("Monthly Payment : " + "%.2f".format(montly).toDouble())


        }

        buttonReset.setOnClickListener{view : View ->

            carloan.setText("Loan:")
            interest.setText("Interest:")
            monthlyPayment.setText("Monthly Payment:")

            editTextCarPrice.setText("")
            editTextDownPayment.setText("")
            editTextInterestRate.setText("")
            editTextLoanPeriod.setText("")

        }


    }






    }

