package sebastian.maciel.asignacion4_calculadoraimc_garcia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weight:Double = findViewById(R.id.edPeso)
        var height:Double = findViewById(R.id.edEstatura)
        var resultado:TextView = findViewById(R.id.resultado)

        val botonPresionar: Button = findViewById(R.id.btnCalcular)

        botonPresionar.setOnClickListener(){
        var imc: Double = weight * Math.pow(2.0, height)
            if (imc < 18.5){
                resultado.setText(imc.toString())
                resultado.setBackgroundColor(R.color.colorBrown)
            }
            if (imc >= 18.5 && imc <= 24.9){
                resultado.setText(imc.toString())
                resultado.setBackgroundColor(R.color.colorGreen)
            }
            if (imc >= 25 && imc <= 29.9){
                resultado.setText(imc.toString())
                resultado.setBackgroundColor(R.color.colorGreenish)
            }
            if (imc >= 30 && imc <= 34.9){
                resultado.setText(imc.toString())
                resultado.setBackgroundColor(R.color.colorOrange)
            }
            if (imc >= 40){
                resultado.setText(imc.toString())
                resultado.setBackgroundColor(R.color.colorRed)
            }


        }
    }
}