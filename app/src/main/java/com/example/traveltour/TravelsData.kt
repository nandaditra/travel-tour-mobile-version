package com.example.traveltour

object TravelsData {

    private val namePlaceTravel = arrayOf("Ubud Indonesia Temple",
          "Eiffel Tower",
          "Gyeongbokgung",
          "Borobudur Temple",
          "Pizza Tower",
          "Disneyland",
          "Great Wall Of China",
          "Kuta Beach",
          "Taj Mahal",
          "Railay Beach",
          "Mount Fujiyama",
          "Vondelpark"
        )

    private var locPlace = arrayOf("Bali",
    "Paris",
    "Gyeongbokgung",
    "Magelang",
    "Roma",
    "London",
    "Huairou District",
    "Kuta Regency",
    "Agra, Uttar Pradesh",
    "Krabi",
    "South Tokyo",
    "Amsterdam")

    private val descTravel = arrayOf("The palace was the official residence of the royal family of Ubud. It was on his travels that Rsi Markandya received a divine revelation that in Bali he was to bury five precious metals on a mountain slope where the mother temple of Besakih now stands today. Along with a group of followers, Rsi Markandya was magnetically attracted to a destination located in the central foothills of the island that radiated light and energy. This place was Campuhan in Ubud at a junction in the Wos River and it was here that he felt compelled to build a temple by the name of Pura Gunung Lebah",
    "Locally nicknamed 'La dame de fer' (French for 'Iron Lady'), it was constructed from 1887 to 1889 as the centerpiece of the 1889 World's Fair. Although initially criticised by some of France's leading artists and intellectuals for its design, it has since become a global cultural icon of France and one of the most recognisable structures in the world.[3] The Eiffel Tower is the most visited monument with an entrance fee in the world; 6.91 million people ascended it in 2015. It was designated a monument historique in 1964, and was named part of a UNESCO World Heritage Site in 1991",
    "Gyeongbokgung (Korean: 경복궁; Hanja: 景福宮), also known as Gyeongbokgung Palace or Gyeongbok Palace, was the main royal palace of the Joseon dynasty. Built in 1395, it is located in northern Seoul, South Korea. The largest of the Five Grand Palaces built by the Joseon dynasty, Gyeongbokgung served as the home of Kings of the Joseon dynasty, the Kings' households, as well as the government of Joseon.",
    "Borobudur, also transcribed Barabudur (Indonesian: Candi Borobudur, Javanese: ꦕꦤ꧀ꦝꦶꦧꦫꦧꦸꦝꦸꦂ, romanized: Candhi Barabudhur) is a 9th-century Mahayana Buddhist temple in Magelang Regency, not far from the town of Muntilan, in Central Java, Indonesia. It is the world's largest Buddhist temple.[1][2][3] The temple consists of nine stacked platforms, six square and three circular, topped by a central dome. It is decorated with 2,672 relief panels and originally 504 Buddha statues. The central dome is surrounded by 72 Buddha statues, each seated inside a perforated stupa",
    "Borobudur, also transcribed Barabudur (Indonesian: Candi Borobudur, Javanese: ꦕꦤ꧀ꦝꦶꦧꦫꦧꦸꦝꦸꦂ, romanized: Candhi Barabudhur) is a 9th-century Mahayana Buddhist temple in Magelang Regency, not far from the town of Muntilan, in Central Java, Indonesia. It is the world's largest Buddhist temple.[1][2][3] The temple consists of nine stacked platforms, six square and three circular, topped by a central dome. It is decorated with 2,672 relief panels and originally 504 Buddha statues. The central dome is surrounded by 72 Buddha statues, each seated inside a perforated stupa",
    "Disneyland has a larger cumulative attendance than any other theme park in the world, with 726 million visits since it opened (as of December 2018). In 2018, the park had approximately 18.6 million visits, making it the second most visited amusement park in the world that year, behind only Magic Kingdom, the very park it inspired.[3] According to a 2005 Disney report, 65,700 jobs are supported by the Disneyland Resort, including about 20,000 direct Disney employees and 3,800 third-party employees (independent contractors or their employees).[4] Disney announced 'Project Stardust' in 2019, which included major structural renovations to the park to account for higher attendance numbers.",
    "The Great Wall of China (traditional Chinese: 萬里長城; simplified Chinese: 万里长城; pinyin: Wànlǐ Chángchéng) is a series of fortifications that were built across the historical northern borders of ancient Chinese states and Imperial China as protection against various nomadic groups from the Eurasian Steppe. Several walls were built from as early as the 7th century BC,[4] with selective stretches later joined by Qin Shi Huang (220–206 BC), the first emperor of China. Little of the Qin wall remains.[5] Later on, many successive dynasties built and maintained multiple stretches of border walls. The best-known sections of the wall were built by the Ming dynasty (1368–1644).",
    "On the Kuta Beach beach, people enjoy parasailing, banana boat trips or swimming. Women offer traditional Indonesian massage on the beach, others are seen plaiting hair. Before sunset, crowds rush to the beach waiting to watch Kuta's legendary sunsets. Then as darkness falls, Kuta's nightlife starts to throb with loud music from bars and restaurants, while shops stay open till late at night. Kuta's main attraction is that everyone can enjoy the town without any prescribed dress code",
    "The Taj Mahal ('Crown of the Palace'),[4][5][6] is an Islamic ivory-white marble mausoleum on the right bank of the river Yamuna in the Indian city of Agra. It was commissioned in 1631 by the Mughal emperor Shah Jahan (r. 1628–1658) to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself. The tomb is the centrepiece of a 17-hectare (42-acre) complex, which includes a mosque and a guest house, and is set in formal gardens bounded on three sides by a crenellated wall",
    "Railay Beach in Krabi is located on the Railay Peninsula of the same name and is certainly one of the most spectacular places in all of Thailand. This paradise is especially famous for its imposing limestone cliffs, which together with the turquoise sea, the tall palm trees and the powder-sugar fine white sandy beaches conjure up a true picture-postcard setting. In addition, unforgettable activities and incredibly beautiful attractions await you during a visit on Railay Beach. Climbing, kayaking, snorkeling, hiking and of course swimming at Thailand’s most beautiful beaches are just some of the best things to do",
    "Mount Fuji is an active stratovolcano that last erupted from 1707 to 1708.[4][5] The mountain is located about 100 km (62 mi) southwest of Tokyo and is visible from there on clear days. Mount Fuji's exceptionally symmetrical cone, which is covered in snow for about five months of the year, is commonly used as a cultural icon of Japan and it is frequently depicted in art and photography, as well as visited by sightseers and climbers.",
    "The Vondelpark is a public urban park of 47 hectares in Amsterdam, Netherlands. It is part of the borough of Amsterdam-Zuid and situated west from the Leidseplein and the Museumplein. The park was opened in 1865 and originally named Nieuwe Park, but later renamed Vondelpark, after the 17th-century playwright and poet Joost van den Vondel. The park has around 10 million visitors annually. Within the park is an open-air theatre, a playground and several food service facilities")

    private var photoTravel = intArrayOf(R.drawable.ubud,
        R.drawable.paris,
        R.drawable.gyeboboung,
        R.drawable.borobudur,
        R.drawable.pizza_tower,
        R.drawable.disneyland,
        R.drawable.great_wall,
        R.drawable.kuta_beach,
        R.drawable.tajmahal,
        R.drawable.railay_beach,
        R.drawable.fuji,
        R.drawable.voundelpark
    )

    private var priceTravel   = arrayOf(125, 505, 201, 10,  178, 202, 300, 150, 148, 50, 390, 289)
    private var countryTravel = arrayOf("Indonesia", "France","South Korea", "Indonesia", "Italia","England","China","Indonesia","India","Thailand","Japan","Netherland")
    private var categoryTravel = arrayOf("history","art","nature","history","history","Adventure","History","Nature","Landscape","Holiday","Adventure","Holiday")

    val listData: ArrayList<Travel>
      get() {
          val listTravel = arrayListOf<Travel>()

          for(position in namePlaceTravel.indices) {
              val travel = Travel()
                  travel.name = namePlaceTravel[position]
                  travel.location = locPlace[position]
                  travel.description = descTravel[position]
                  travel.photo = photoTravel[position]
                  travel.price = priceTravel[position]
                  travel.country = countryTravel[position]
                  travel.categories = categoryTravel[position]
              listTravel.add(travel)
          }
          return listTravel
      }
}