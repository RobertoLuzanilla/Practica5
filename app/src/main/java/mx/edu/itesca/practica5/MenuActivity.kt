package mx.edu.itesca.practica5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAntojitos: Button = findViewById(R.id.Antojitos)
        val btnEspecialidades: Button = findViewById(R.id.button_especialidades)
        val buttonCombinations: Button = findViewById(R.id.button_combinations)
        val buttonTortas: Button = findViewById(R.id.button_tortas)
        val buttonSopas: Button = findViewById(R.id.button_Sopas)
        val buttonDrinks: Button = findViewById(R.id.button_Drinks)

        btnAntojitos.setOnClickListener {
            startProductosActivity("Antojitos")
        }

        btnEspecialidades.setOnClickListener {
            startProductosActivity("Especialidades")
        }

        buttonCombinations.setOnClickListener {
            startProductosActivity("Combinaciones")
        }

        buttonTortas.setOnClickListener {
            startProductosActivity("Tortas")
        }

        buttonSopas.setOnClickListener {
            startProductosActivity("Sopas")
        }
        buttonDrinks.setOnClickListener {
            startProductosActivity("Drinks")
        }
    }

    private fun startProductosActivity(menuType: String) {
        val intent = Intent(this, ProductosActivity::class.java)
        intent.putExtra("menuType", menuType)
        startActivity(intent)
    }
}
