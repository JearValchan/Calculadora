package valencia.armando.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var datos: String = ""
        var resultados: String = ""
        var operacion: String = ""
        var resultadosInt: Int = 0

        val resultado: TextView = findViewById(R.id.resultado)
        val numero: TextView = findViewById(R.id.numero)

        val cero: Button = findViewById(R.id.cero)
        val uno: Button = findViewById(R.id.uno)
        val dos: Button = findViewById(R.id.dos)
        val tres: Button = findViewById(R.id.tres)
        val cuatro: Button = findViewById(R.id.cuatro)
        val cinco: Button = findViewById(R.id.cinco)
        val seis: Button = findViewById(R.id.seis)
        val siete: Button = findViewById(R.id.siete)
        val ocho: Button = findViewById(R.id.ocho)
        val nueve: Button = findViewById(R.id.nueve)
        val igual: Button = findViewById(R.id.resultado)
        val borrar: Button = findViewById(R.id.borrar)
        val suma: Button = findViewById(R.id.suma)
        val resta: Button = findViewById(R.id.resta)
        val multiplicacion: Button = findViewById(R.id.multiplicacion)
        val division: Button = findViewById(R.id.division)

        cero.setOnClickListener{
            datos += "0"
            numero.setText(""+datos+"")
        }

        uno.setOnClickListener{
            datos += "1"
            numero.setText(""+datos+"")
        }

        dos.setOnClickListener{
            datos += "2"
            numero.setText(""+datos+"")
        }

        tres.setOnClickListener{
            datos += "3"
            numero.setText(""+datos+"")
        }

        cuatro.setOnClickListener{
            datos += "4"
            numero.setText(""+datos+"")
        }

        cinco.setOnClickListener{
            datos += "5"
            numero.setText(""+datos+"")
        }

        seis.setOnClickListener{
            datos += "6"
            numero.setText(""+datos+"")
        }

        siete.setOnClickListener{
            datos += "7"
            numero.setText(""+datos+"")
        }

        ocho.setOnClickListener{
            datos += "8"
            numero.setText(""+datos+"")
        }

        nueve.setOnClickListener{
            datos += "9"
            numero.setText(""+datos+"")
        }

        suma.setOnClickListener{
            operacion = "+"
            resultados += (datos+operacion)
            resultadosInt=datos.toInt()
            resultado.setText(""+resultados+"")
        }

        resta.setOnClickListener{
            operacion = "-"
            resultados += (datos+operacion)
            resultadosInt = datos.toInt()
            resultado.setText(""+resultados+"")

        }

        multiplicacion.setOnClickListener{
            operacion = "*"
            resultados += (datos+operacion)
            resultadosInt = datos.toInt()
            resultado.setText(""+resultados+"")
        }

        division.setOnClickListener{
            operacion = "/"
            resultados += (datos+operacion)
            resultadosInt = datos.toInt()
            resultado.setText(""+resultados+"")
        }

        igual.setOnClickListener{
            when(operacion){
                "+" -> {
                    resultados = (resultadosInt+datos.toInt()).toString()
                }
                "-" -> {
                    resultados = (resultadosInt-datos.toInt()).toString()
                }
                "*" -> {
                    resultados = (resultadosInt*datos.toInt()).toString()
                }
                "/" -> {
                    resultados = (resultadosInt/datos.toInt()).toString()
                }
            }
            resultado.setText(""+resultados+"")
        }
    }
}
