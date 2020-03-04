package com.example.startup

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_food_details.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.food_ticket.view.*

class MainActivity : AppCompatActivity() {
    var adapter:FoodAdapter?=null
    var listOfFoodItems=ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfFoodItems.add(Food("Coffeemaker","In this article, we'll look inside a typical drip coffee maker so you can understand exactly what's happening when you make coffee. We'll also look at the possible problems that might cause your coffee maker to stop working. By the end of this article, you may look at your old friend in a completely new way.\n" +
                "\n" +
                "\u00ADBefore we get into that, however, let's do a quick coffee rundown. Coffee plants are\u00AD evergreen tropical shrubs and small trees, and they grow best between the Tropic of Cancer and the Tropic of Capricorn (often referred to in the coffee world as the Bean Belt) \u00ADwhich mak\u00ADes sense because the plants enjoy lots of rain and gentle temperatures. Coffee beans as we know them are actually the seeds of the fruit of the coffee plant -- called coffee cherries -- and these popular plants have been cultivated by man for hundreds of years. The two most commonly grown species of coffee plants are Coffee arabica (Arabica coffee) and Coffea canephora (Robusta coffee). For more about details about what's in your morning cup, check out the article How Coffee Works.\n" +
                "\n" +
                "There are lots of coffee makers on the market that can arguably make a better pot of Joe, but in this article, we'll be focusing on the trusty drip. If your tastes do run fancier, check out the article How the Clover Coffee Maker Works. On the other hand, if you're gunning for an insider's look at your kitchen's appliance of the year, we'll crack it open and take a peek on the next page.\u00AD",R.drawable.coffee_pot))
        listOfFoodItems.add(Food("Espresso ","Espresso, (Italian: “fast, express”) a strong brew of coffee produced by forcing boiled water under pressure through finely ground coffee. The finely ground coffee beans means an increased amount of surface contact with the water, resulting in a highly flavoured and aromatic brew. The nuances of brewing and enjoying the drink have spurred international barista championships and detailed discussions of the drink by aficionados worldwide. Espresso is especially associated with Italy, where it is woven into the fabric of daily life.A culture of refinement has long surrounded this dark, rich, and exotic beverage, an aura doubtless tied to the beginning of coffeehouses in the Middle East in the 15th and 16th centuries, when such establishments attracted the leading thinkers and writers of the day. But the surprising truth is that espresso is an innovation of the late 19th and early 20th centuries. In fact, espresso is arguably the first example of “fast food,” its very name meaning speed.\n" +
                "\n" +
                "Drinking coffee was very popular in Europe in the 19th century, but the boiled-water process of brewing it was laborious and time-consuming, especially for workers on a “coffee break.” To accelerate its production, Italian inventor Angelo Moriondo patented in 1884 a “new steam machinery for the economic and instantaneous confection of coffee beverage.” In short, he invented the prototype of the espresso machine, albeit one that produced the beverage only in bulk. To orient the process toward quick individualized servings, Italian inventor and businessman Luigi Bezzera created the first known machine to force, by pressure, steam and hot water through ground coffee into an individual cup so that each customer could have the freshest possible brew in the fastest possible way, reducing the brewing time from a few minutes to 30 seconds. Bezzera’s 1902 patents were then purchased the following year by Desiderio Pavoni, who made improvements to Bezzara’s brewing machine by devising the pressure-release valve and the steam wand for frothing beverages by tapping into the system’s built-up steam. Working together, Pavoni and Bezzera introduced their new coffee machine, called the Ideale (because they had mastered the “ideal” temperature and pressure for brewing coffee), and their fast new product, caffè espresso, at the 1906 World’s Fair in Milan. By mid-century there were espresso systems in use that resemble many of the machines still in use today.",R.drawable.espresso))
        listOfFoodItems.add(Food("French Fries","French fries, or simply fries (North American English), chips (British and Commonwealth English, Hiberno-English),[1] finger chips (Indian English)[2], or french-fried potatoes, are batonnet or allumette-cut deep-fried potatoes.\n" +
                "\n" +
                "French fries are served hot, either soft or crispy, and are generally eaten as part of lunch or dinner or by themselves as a snack, and they commonly appear on the menus of diners, fast food restaurants, pubs, and bars. They are usually salted and, depending on the country, may be served with ketchup, vinegar, mayonnaise, tomato sauce, or other local specialties. Fries can be topped more heavily, as in the dishes of poutine or chili cheese fries. Chips can be made from kumara or other sweet potatoes instead of potatoes. A baked variant, oven chips, uses less oil or no oil.[3] One very common fast food dish is fish and chips.",R.drawable.french_fries))
        listOfFoodItems.add(Food("Honey","Honey is a sweet, viscous food substance made by bees and some related insects.[1] Bees produce honey from the sugary secretions of plants (floral nectar) or from secretions of other insects (such as honeydew), by regurgitation, enzymatic activity, and water evaporation. Bees store honey in wax structures called honeycombs.[1][2] The variety of honey produced by honey bees (the genus Apis) is the best-known, due to its worldwide commercial production and human consumption.[3] Honey is collected from wild bee colonies, or from hives of domesticated bees, a practice known as beekeeping or apiculture.\n" +
                "\n" +
                "Honey gets its sweetness from the monosaccharides fructose and glucose, and has about the same relative sweetness as sucrose (table sugar).[4][5] It has attractive chemical properties for baking and a distinctive flavor when used as a sweetener.[4] Most microorganisms do not grow in honey, so sealed honey does not spoil, even after thousands of years.[6][7]\n" +
                "\n" +
                "One tablespoonful (15 ml) of honey provides 46 calories (kcal) of energy.[8] Honey is regarded as safe when not taken in excessive amounts.\n" +
                "\n" +
                "Honey use and production have a long and varied history as an ancient activity. Several cave paintings in Cuevas de la Araña in Spain depict humans foraging for honey at least 8,000 years ago.[9][10]",R.drawable.honey))
        listOfFoodItems.add(Food("Ice cream","Ice cream (derived from earlier iced cream or cream ice)[1] is a sweetened frozen food typically eaten as a snack or dessert. It may be made from dairy milk or cream and is flavored with a sweetener, either sugar or an alternative, and any spice, such as cocoa or vanilla. Colourings are usually added, in addition to stabilizers. The mixture is stirred to incorporate air spaces and cooled below the freezing point of water to prevent detectable ice crystals from forming. The result is a smooth, semi-solid foam that is solid at very low temperatures (below 2 °C or 35 °F). It becomes more malleable as its temperature increases.\n" +
                "\n" +
                "The meaning of the name \"Ice cream\" varies from one country to another. Terms such as \"frozen custard,\" \"frozen yogurt,\" \"sorbet,\" \"gelato,\" and others are used to distinguish different varieties and styles. In some countries, such as the United States, \"ice cream\" applies only to a specific variety, and most governments regulate the commercial use of the various terms according to the relative quantities of the main ingredients, notably the amount of cream.[2] Products that do not meet the criteria to be called ice cream are sometimes labelled \"frozen dairy dessert\" instead.[3] In other countries, such as Italy and Argentina, one word is used for all variants. Analogues made from dairy alternatives, such as goat's or sheep's milk, or milk substitutes (e.g., soy, cashew, coconut, almond milk or tofu), are available for those who are lactose intolerant, allergic to dairy protein, or vegan.\n" +
                "\n" +
                "Ice cream may be served in dishes, for eating with a spoon, or licked from edible cones. Ice cream may be served with other desserts, such as apple pie, or as an ingredient in ice cream floats, sundaes, milkshakes, ice cream cakes and even baked items, such as Baked Alaska.",R.drawable.strawberry_ice_cream))
        listOfFoodItems.add(Food("Sugar","Sugar is the generic name for sweet-tasting, soluble carbohydrates, many of which are used in food. Simple sugars, also called monosaccharides, include glucose, fructose, and galactose. Compound sugars, also called disaccharides or double sugars, are molecules composed of two monosaccharides joined by a glycosidic bond. Common examples are sucrose (glucose + fructose), lactose (glucose + galactose), and maltose (two molecules of glucose). In the body, compound sugars are hydrolysed into simple sugars. Table sugar, granulated sugar or regular sugar refers to sucrose, a disaccharide composed of glucose and fructose.\n" +
                "\n" +
                "Longer chains of monosaccharides are not regarded as sugars, and are called oligosaccharides or polysaccharides. Some other chemical substances, such as glycerol and sugar alcohols, may have a sweet taste, but are not classified as sugar.\n" +
                "\n" +
                "Sugars are found in the tissues of most plants. Honey and fruit are abundant natural sources of unbounded simple sugars. Sucrose is especially concentrated in sugarcane and sugar beet, making them ideal for efficient commercial extraction to make refined sugar. In 2016, the combined world production of those two crops was about two billion tonnes. Maltose may be produced by malting grain. Lactose is the only sugar that cannot be extracted from plants. It can only be found in milk, including human breast milk, and in some dairy products. A cheap source of sugar is corn syrup, industrially produced by converting corn starch into sugars, such as maltose, fructose and glucose.",R.drawable.sugar_cubes))
        adapter= FoodAdapter(this,listOfFoodItems)
        gvListFood.adapter=adapter
    }
    class FoodAdapter:BaseAdapter{
        var listOfFood=ArrayList<Food>()
        var context:Context?=null
        constructor(context: Context,listOfFood:ArrayList<Food>):super(){
            this.context=context
            this.listOfFood=listOfFood
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val food=listOfFood[position]
            var inflater=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView=inflater.inflate(R.layout.food_ticket,null)
            foodView.ivFoodImage.setImageResource(food.image!!)
            foodView.ivFoodImage.setOnClickListener(){
                val intent=Intent(context,foodDetails::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("des",food.des!!)
                intent.putExtra("image",food.image!!)
                context!!.startActivity(intent)
            }
            foodView.tvFood.text=food.name!!
            return foodView
        }

        override fun getItem(position: Int): Any {
            return listOfFood[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listOfFood.size
        }

    }
}
