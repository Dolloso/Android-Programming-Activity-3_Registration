package com.example.registration_dolloso
import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import java.util.*



class MainActivity : AppCompatActivity() {

    lateinit var ContactPerson: EditText
    lateinit var PhoneNumber :EditText
    lateinit var  LimitAge :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//////////////////age
        LimitAge = findViewById(R.id.LimitAge)
        val ageLength = 2
        LimitAge.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(ageLength))


/////////////////contactperson
        title = "KotlinApp"
        ContactPerson = findViewById(R.id.ContactPerson)
        val contactlength = 9
        ContactPerson.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(contactlength))

///////////////////PHONNUMBER
        PhoneNumber = findViewById(R.id.PhoneNumber)
        val maxTextLength = 9
        PhoneNumber.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(maxTextLength))

        //////////////////BIRTHDAY NI NGA PART
        val ev = findViewById<TextView>(R.id.bDate)
        val cal = Calendar.getInstance()
        val myyear = cal.get(Calendar.YEAR)
        val mymonth = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)

        ev.setOnClickListener{

            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayofMonth ->
                ev.text =""+dayofMonth+"/"+(month +1) +"/"+ year
            },myyear,mymonth,day)
            datePickerDialog.show()

        }




        }



    }
