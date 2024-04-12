package com.example.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Inf extends AppCompatActivity {

    private CheckBox chec;
    private Spinner sep;
    private TextView txt;

    private String res ;

    private String Inf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inf);

        chec = findViewById(R.id.che);

        sep = findViewById(R.id.sep);

        txt = findViewById(R.id.txt3);

        chec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                     res = sep.getSelectedItem().toString();

                     Inf="";

                    if (!res.isEmpty()) {


                        if (res.equals("Palestine")) {

                            Inf = "The total area of historic Palestine is 27,009 square kilometers, " + "while the area of the proposed State of Palestine on the territories occupied in 1967 (the West Bank and Gaza Strip) is 6,209 square kilometers, " + "representing 22.95% of the area of historical Palestine, as follows:" + "1)The area of the West Bank is 5,844 km2, and constitutes 21.6% of the total area of historical Palestine." + "2)The area of the Gaza Strip is 365 square kilometers, and it constitutes 1.35% of the total area of historical Palestine." + "*the site:" + "Astronomical location: Historical Palestine is located between latitudes 29.30 - 33.15 north and longitudes 34.15 - 35.40 east.\n" + "\n" + "Geographical location: Palestine is located in the southwest of the continent of Asia, " + "on the south of the eastern coast of the Mediterranean Sea," + " and thus it is located in the heart of the ancient world (Asia, Africa, and Europe), " + "making it a land bridge linking Asia with Africa, the Mediterranean with the Red Sea, " + "and then the Atlantic and Indian oceans." + "*Palestine climate:" + "The climate of Palestine is affected by factors of surface and location. In general, Palestine is located within the region of the Mediterranean climate, which is characterized by its moderation, but the most important characteristic of it is that it is hot and dry in the summer and cold and rainy in the winter.\n" + "\n" + "In Palestine, the climate varies with the diversity of surface features, and this difference appears in:\n" + "\n" + "The average annual temperature is 25°C in the Jordan Valley, 15°C in the mountainous areas, and 20°C in the coastal areas. Also, the amount of rain varies from one region to another and from year to year.\n" + "\n" + "There are many springs in Palestine, about 860 springs spread in the mountainous areas and the valley.\n" + "\n" + "- As for the rivers of Palestine, most of them are short and seasonal in flow. The most important of Palestine’s rivers is the Jordan River, which has a length of 320 km. There are a number of short rivers that descend on the western slopes of the mountain highlands to flow into the Mediterranean Sea, the most important of which are the Maqta River, Wadi al-Qarn, the Zarqa River, and the Auja River.\n" + "\n" + "*Water bodies in Palestine:\n" + "\n" + "Palestine overlooks the Mediterranean coast for a distance of up to 224 km and the Gulf of Aqaba for a distance of up to 10.5 km. There is the Lake of Galilee, which is the only body of water inside Palestine, with a length of 21.5 km and a width of 12.3 km.";

                            txt.setText(Inf);


                            chec.setChecked(false);

                        } else if (res.equals("Jordan")) {

                             Inf = "Jordan is located in the Middle East, bordered by Syria to the north, " + "Iraq to the northeast, Saudi Arabia to the east and south, " + "and Israel and Palestine to the west. " + "Its location makes it a crossroads of Asia, " + "Africa, and Europe.\n" + "\n" + "In terms of geography, Jordan is characterized by its diverse landscapes. " + "The western part of the country is dominated by the Jordan Valley and the Dead Sea," + " which is the lowest point on Earth. To the east, " + "the land rises into the rugged mountains of the eastern desert, " + "which extends into Saudi Arabia.\n" + "\n" + "The climate in Jordan varies from arid desert in the east to more moderate Mediterranean conditions in the west. " + "Summers are hot and dry, with temperatures often exceeding 40°C (104°F), especially in the desert regions. " + "Winters are generally mild, " + "but temperatures can drop below freezing, " + "particularly in the mountains.\n" + "\n" + "Jordan's geography and climate have played a significant role in shaping its history and culture. " + "The country is home to several important archaeological sites, " + "including the ancient city of Petra and the Roman ruins at Jerash," + " which reflect its rich history as a crossroads of civilizations.";

                            txt.setText(Inf);

                            chec.setChecked(false);

                        } else if (res.equals("America")) {
                            Inf = "America, also known as the United States of America, is located in North America, bordered by Canada to the north, Mexico to the south, the Atlantic Ocean to the east, and the Pacific Ocean to the west. It is the third-largest country in the world by land area.\n" + "\n" + "The geography of America is incredibly diverse. It includes vast plains in the Midwest, rugged mountains in the west (such as the Rocky Mountains and the Sierra Nevada), and deserts in the southwest (like the Mojave Desert). The country also has extensive coastlines along the Atlantic and Pacific Oceans, as well as the Gulf of Mexico.\n" + "\n" + "America's climate varies widely due to its size and diverse geography. The northeast experiences hot summers and cold winters, with heavy snowfall in some areas. The southeast has a subtropical climate with hot, humid summers and mild winters. The Midwest has a continental climate, with hot summers and cold winters. The west coast, particularly California, has a Mediterranean climate with mild, wet winters and hot, dry summers. The southwest is arid, with hot summers and mild winters.\n" + "\n" + "America's geography and climate have influenced its development and economy. The country is rich in natural resources, including oil, coal, and agricultural land, which have contributed to its status as a global economic power. The diverse geography also provides a range of recreational opportunities, from skiing in the mountains to surfing on the coasts.";
                            txt.setText(Inf);

                            chec.setChecked(false);

                        } else if (res.equals("Türkiye")) {
                           Inf= "Turkey is located at the crossroads of Europe and Asia, with a small portion of its territory in southeastern Europe and the majority in southwestern Asia. It is bordered by eight countries: Greece and Bulgaria to the northwest, Georgia to the northeast, Armenia, Azerbaijan, and Iran to the east, and Iraq and Syria to the south. The country is surrounded by four seas: the Aegean Sea to the west, the Black Sea to the north, and the Mediterranean Sea to the south, with the Sea of Marmara separating European Turkey from Asian Turkey.\n" + "\n" + "Turkey's geography is diverse, with mountains, plains, and coastal areas. The country is home to several mountain ranges, including the Pontic Mountains in the north, the Taurus Mountains in the south, and the Armenian Highlands in the east. The central Anatolian Plateau is a vast, arid region with fertile valleys and is surrounded by mountains.\n" + "\n" + "The climate in Turkey varies depending on the region. The coastal areas have a Mediterranean climate with hot, dry summers and mild, wet winters. The interior regions have a more continental climate, with hot summers and cold winters. The eastern part of the country experiences a harsher climate, with cold winters and hot summers, while the Black Sea coast is characterized by high rainfall and mild temperatures.\n" + "\n" + "Turkey's geography has played a significant role in its history and culture. The country has been a crossroads of civilizations for centuries, and its diverse landscapes have shaped its economy and lifestyle. The mountains provide valuable resources such as minerals and timber, while the coastal areas are important for tourism and agriculture.";
                            txt.setText(Inf);

                            chec.setChecked(false);
                        } else if (res.equals("Russia")) {
                            Inf = "Russia is the largest country in the world, spanning eastern Europe and northern Asia. It is bordered by Norway, Finland, Estonia, Latvia, Lithuania, Belarus, Ukraine, Georgia, Azerbaijan, Kazakhstan, China, Mongolia, and North Korea, as well as the Arctic and Pacific Oceans.\n" + "\n" + "Russia's geography is incredibly diverse, featuring vast plains, mountain ranges, and extensive forests. The Ural Mountains divide European Russia from Asian Russia, and the country is home to several major rivers, including the Volga, Yenisei, and Lena.\n" + "\n" + "The climate in Russia varies widely due to its size and diverse geography. In general, the country experiences long, cold winters and short, mild summers. However, the climate can be significantly different between regions. The northern regions experience Arctic conditions, with extremely cold temperatures and long periods of darkness in the winter. In contrast, the southern regions have a more moderate climate, with hot summers and mild winters.\n" + "\n" + "Russia's geography has influenced its history and culture. The country's vast size and harsh climate have shaped its development, leading to a strong emphasis on self-sufficiency and resilience. The diverse landscapes also provide valuable natural resources, including oil, gas, and minerals, which have played a significant role in Russia's economy.";
                            txt.setText(Inf);
                            chec.setChecked(false);

                        } else if (res.equals("France")) {
                          Inf = "France is located in Western Europe, bordered by Belgium, Luxembourg, Germany, Switzerland, Italy, Monaco, Spain, and Andorra. It also has coastlines along the Atlantic Ocean to the west and the Mediterranean Sea to the south.\n" + "\n" + "The geography of France is diverse, with coastal plains, mountain ranges, and fertile valleys. The northern part of the country is characterized by flat plains, while the south is more mountainous, with the Alps in the east and the Pyrenees in the southwest.\n" + "\n" + "France has a variety of climates, ranging from oceanic in the west to Mediterranean in the south. The oceanic climate is characterized by mild temperatures, moderate rainfall, and relatively high humidity. The Mediterranean climate is characterized by hot, dry summers and mild, wet winters. In the mountainous regions, the climate varies depending on altitude, with colder temperatures and more precipitation at higher elevations.\n" + "\n" + "France's geography has played a significant role in its history and culture. The country's fertile land and moderate climate have made it ideal for agriculture, and it is known for its wine, cheese, and other agricultural products. The diverse landscapes also provide opportunities for outdoor activities such as skiing, hiking, and beach vacations.";
                            txt.setText(Inf);
                            chec.setChecked(false);

                        } else if (res.equals("SouthAfrica")) {

                            Inf = "South Africa is located at the southern tip of the African continent, bordered by Namibia, Botswana, Zimbabwe, Mozambique, and Swaziland. It also surrounds the small country of Lesotho. The country has a long coastline along the Atlantic Ocean to the west and the Indian Ocean to the south and east.\n" + "\n" + "The geography of South Africa is diverse, with a variety of landscapes ranging from coastal plains to inland mountains and plateaus. The Drakensberg Mountains run along the eastern part of the country, while the Great Escarpment separates the coastal plains from the interior plateau. The country is also home to several major rivers, including the Orange River and the Limpopo River.\n" + "\n" + "South Africa has a range of climates, from Mediterranean in the southwest to desert in the northwest and subtropical in the east. The coastal areas generally have milder temperatures due to the influence of the ocean, while the interior experiences more extreme temperatures, with hot summers and cold winters.\n" + "\n" + "The geography of South Africa has played a significant role in its history and culture. The country's natural resources, including minerals such as gold and diamonds, have been important drivers of its economy. The diverse landscapes also provide habitats for a wide variety of plant and animal species, making South Africa a popular destination for ecotourism.";
                            txt.setText(Inf);
                            chec.setChecked(false);
                        } else if (res.equals("Lebanon")) {
                            Inf = "Lebanon is located in the Middle East, bordered by Syria to the north and east and Israel to the south. It has a coastline along the Mediterranean Sea to the west.\n" + "\n" + "The geography of Lebanon is characterized by coastal plains, mountain ranges, and the fertile Bekaa Valley. The country is dominated by the Lebanon Mountains, which run parallel to the coast. The highest point in Lebanon, Qurnat as Sawda', is located in these mountains. To the east of the Lebanon Mountains lies the Bekaa Valley, which is known for its agricultural productivity.\n" + "\n" + "Lebanon has a Mediterranean climate, with hot, dry summers and mild, wet winters. The coastal areas have more moderate temperatures due to the influence of the sea, while the inland areas experience more extreme temperatures.\n" + "\n" + "The geography of Lebanon has influenced its history and culture. The mountainous terrain has historically provided protection and isolation for various ethnic and religious groups. The country's location along the Mediterranean coast has made it a hub for trade and cultural exchange. The fertile valleys and mild climate have also made agriculture an important part of the economy.";
                            txt.setText(Inf);
                            chec.setChecked(false);
                        }
                    }
                }
            }
        });
    }
}
