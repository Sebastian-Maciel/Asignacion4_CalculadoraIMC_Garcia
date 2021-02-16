package sebastian.maciel.asignacion4_calculadoraimc_garcia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random



class MainActivity : AppCompatActivity() {


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edPeso:EditText = findViewById(R.id.edPeso)
        var edAltura:EditText = findViewById(R.id.edEstatura)
        var rango:TextView = findViewById(R.id.rango)
        var resultado:TextView = findViewById(R.id.resultado)
        val botonPresionar: Button = findViewById(R.id.btnCalcular)

        botonPresionar.setOnClickListener(){
        var weight = edPeso.text.toString().toDouble()
        var height = edAltura.text.toString().toDouble()

        var imc: Double = weight / Math.pow(height, 2.0)


            resultado.setText(imc.toString())
            if (imc < 18.5){
                rango.setText("bajo peso")
                rango.setBackgroundResource(R.color.colorGreenish)
            }
            if (imc in 18.5..24.9){
                rango.setText("normal")
                rango.setBackgroundResource(R.color.colorGreen)
            }
            if (imc in 25.0..29.9){
                rango.setText("Sobrepeso")
                rango.setBackgroundResource(R.color.colorBrown)
            }
            if (imc in 30.0..34.9){
                rango.setText("Obesidad grado 1")
                rango.setBackgroundResource(R.color.colorOrange)
            }
            if (imc in 35.0..39.9){
                rango.setText("Obesidad grado 1")
                rango.setBackgroundResource(R.color.colorOrange)
            }
            if (imc >= 40){
                rango.setText("Obesidad grado 3")
                rango.setBackgroundResource(R.color.colorRed)
            }


        }
    }
}