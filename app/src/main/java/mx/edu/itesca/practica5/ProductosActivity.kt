package mx.edu.itesca.practica5

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductosActivity : AppCompatActivity() {
    var menu = arrayListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        val menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        val listView: ListView = findViewById(R.id.litview)
        val adaptador = AdaptadorProductos(this, menu)
        listView.adapter = adaptador
    }

    fun agregarProductos(option: String?) {
        when (option) {
            "Antojitos" -> {
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", 5.69))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, lettuce, fresh cheese and cream.", 7.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two flour tortillas filled with cheese and ham. Served with lettuce, cream and guacamole.", 6.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese and cream.", 5.99))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, cream and tomato.", 4.99))
            }
            "Especialidades" -> {
                menu.add(Product("Mojarra Frita - Fried Fish", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips.", 6.99))
                menu.add(Product("Botana de Camarones al Mojo de Ajo", R.drawable.botanacamarones, "", 19.99))
                menu.add(Product("Botana de Camarones a la Diabla", R.drawable.botanacamarones, "", 19.99))
                menu.add(Product("Torre de Camarón Negro", R.drawable.caldocamaron, "", 16.99))
                menu.add(Product("Botana de Pulpo a la Diabla", R.drawable.botanacamarones, "Servido con totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grilled onions, rice, lettuce and pico de gallo.", 24.99))
                menu.add(Product("Botana de Pulpo al Mojo de Ajo", R.drawable.botanacamarones, "Servido con totopos, cebolla frita, arroz, lechuga y pico de gallo - Served with chips, grilled onions, rice, lettuce and pico de gallo.", 24.99))
                menu.add(Product("Pulpo al Mojo de Ajo", R.drawable.botanacamarones, "", 35.00))
                menu.add(Product("Pulpo Zarandeado", R.drawable.botanacamarones, "", 35.00))
                menu.add(Product("Platillos de Camarón al Mojo de Ajo", R.drawable.botanacamarones, "", 18.99))
                menu.add(Product("Platillos de Camarón a la Diabla", R.drawable.botanacamarones, "", 18.99))
            }
            "Combinaciones" -> {
                menu.add(Product("Traditional Taco Combo", R.drawable.combinationtaco, "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.", 6.99))
                menu.add(Product("Mexican Burritos", R.drawable.cominationburros, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz - Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.", 12.99))
                menu.add(Product("Los Portales Burrito", R.drawable.cominationburros, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.", 13.59))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard shell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.", 9.99))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. Served with a side of rice and beans.", 9.99))
                menu.add(Product("Burrito Pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. Served with a side of rice.", 9.99))
                menu.add(Product("Fajita Burrito", R.drawable.burritos, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole - Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce, guacamole and sour cream.", 13.59))
                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice, beans and salad.", 13.99))
            }
            "Tortas" -> {
                menu.add(Product("Torta Regular", R.drawable.torta, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.", 12.99))
                menu.add(Product("Torta Milanesa de Res o Pollo", R.drawable.tortamilanesa, "Breaded Steak or Chicken", 13.99))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, "Chorizo, asada, jamon, pastor y queso. Mexican sausage, steak, marinated pork, ham, and cheese.", 13.99))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, "Chorizo, asada y pastor. Mexican sausage, steak and marinated pork.", 13.99))
                menu.add(Product("Small Mexican Torta", R.drawable.torta, "Bolillo bread sandwich with your choice of meat, shredded lettuce, avocado, tomato, onion and sour cream.", 0.0))
            }
            "Sopas" -> {
                menu.add(Product("Pozole", R.drawable.pozole, "Weekends only", 5.99))
                menu.add(Product("Menudo", R.drawable.menudo, "Wednesday to Sunday", 5.99))
                menu.add(Product("Caldo de Res", R.drawable.caldores, "Traditional beef soup.", 5.99))
                menu.add(Product("Caldo de Camarón", R.drawable.caldocamaron, "Shrimp soup", 13.99))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 19.99))
            }
            "Drinks" -> {
                menu.add(Product("Soft Drinks 20oz - Sodas 20oz", R.drawable.sodas, "Refrescos de 20oz.", 2.99))
                menu.add(Product("Jarritos", R.drawable.jarritos, "Variedad de sabores tradicionales.", 2.75))
                menu.add(Product("Aguas Frescas", R.drawable.sodas, "Refrescantes aguas frescas de sabores naturales.", 2.99))
            }
        }
    }

    private class AdaptadorProductos(contexto: Context, productos: ArrayList<Product>) : BaseAdapter() {
        var productos = productos
        var contexto = contexto

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val prod = productos[position]
            val inflador = LayoutInflater.from(contexto)
            val vista = inflador.inflate(R.layout.producto_view, null)

            val image: ImageView = vista.findViewById(R.id.producto_img)
            val nombre: TextView = vista.findViewById(R.id.producto_nombre)
            val description: TextView = vista.findViewById(R.id.producto_desc)
            val price: TextView = vista.findViewById(R.id.producto_precio)

            image.setImageResource(prod.image)
            nombre.text = prod.name
            description.text = prod.description
            price.text = prod.price.toString()

            return vista
        }
    }
}
