package sebastian.maciel.asignacion4_calculadoraimc_garcia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var weight:Double = findViewById(R.id.edPeso)
        var height:Double = findViewById(R.id.edEstatura)
        var rango:TextView = findViewById(R.id.rango)
        var resultado:TextView = findViewById(R.id.resultado)


        val botonPresionar: Button = findViewById(R.id.btnCalcular)

        botonPresionar.setOnClickListener(){
        var imc: Double = weight / Math.pow(height, 2.0)
            if (imc < 18.5){
                resultado.setText(imc.toString())
                rango.setText("bajo peso")
                rango.setBackgroundColor(R.color.colorBrown)
            }
            if (imc >= 18.5 && imc <= 24.9){
                resultado.setText(imc.toString())
                rango.setText("normal")
                rango.setBackgroundColor(R.color.colorGreen)
            }
            if (imc >= 25 && imc <= 29.9){
                resultado.setText(imc.toString())
                rango.setText("Sobrepeso")
                rango.setBackgroundColor(R.color.colorGreenish)
            }
            if (imc >= 30 && imc <= 34.9){
                resultado.setText(imc.toString())
                rango.setText("Obesidad grado 1")
                rango.setBackgroundColor(R.color.colorOrange)
            }
            if (imc >= 35 && imc <= 39.9){
                resultado.setText(imc.toString())
                rango.setText("Obesidad grado 1")
                rango.setBackgroundColor(R.color.colorOrange)
            }
            if (imc >= 40){
                resultado.setText(imc.toString())
                rango.setText("Obesidad grado 3")
                rango.setBackgroundColor(R.color.colorRed)
            }


        }
    }
}