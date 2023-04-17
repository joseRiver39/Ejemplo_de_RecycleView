package com.example.reciclerviewejemplo

class SuperHeroProvider {
    companion object{

        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Piter Parker",
                "https://lumiere-a.akamaihd.net/v1/images/marvelspidermanseries-emeagrid_45274dc0.jpeg?region=240,0,480,480",
                "Fuerza, velocidad, durabilidad, agilidad, sentidos, reflejos," +
                        " coordinación, equilibrio y resistencia sobrehumanos. Fisiología de la araña:" +
                        " Precognitiva capacidad de sentido arácnido, se aferra a la mayoría de " +
                        "las superficies sólidas y la capacidad de las redes. Utiliza muñequeras" +
                        " web para disparar material de telaraña."
            ),
            SuperHero(
                " Ironman",
                "Marvel",
                "Tony Stark",
                "https://i.pinimg.com/564x/c3/50/9f/c3509feda69574d1ef9711873940f797.jpg",
                "Como Tony Stark: Intelecto nivel genio. Experto científico e ingeniero." +
                        " Como Iron Man: Superfuerza, durabilidad y resistencia por armadura." +
                        " Vuelo supersónico. Repulsores de energía y misiles de proyección." +
                        " Regenerativo soporte vital. Uso de equipamiento, dispositivos y armamento " +
                        "de alta tecnología."
            ),
            SuperHero(
                "Capitán América",
                "Marvel",
                "Steve Rogers ",
                "https://i.pinimg.com/originals/68/cf/4d/68cf4d0424ebdc454d38398ed26e945b.jpg",
                "El Capitán América es un experto combatiente en todas las formas " +
                        "de artes marciales conocidas en la Tierra. Su especialidad es el " +
                        "manejo del escudo. También tiene experiencia militar, como soldado" +
                        " y oficial, es un líder nato"
            ),
            SuperHero(
                " Thor",
                "Marvel",
                "Thor",
                "https://i.pinimg.com/originals/79/d6/53/79d653b5155be9e5879b531090460aaa.png",
                "Hijo de Odín y Friggaposee una resistencia muy alta a las lesiones físicas " +
                        "que se aproxima a la invulnerabilidad.Incluso ha sobrevivido explosiones " +
                        "de energía de los Celestiales. Thor posee agudos sentidos que le " +
                        "permiten rastrear objetos que viajan más rápido que la luz170" +
                        " y escuchar gritos desde el otro lado del planeta.171 Thor tiene la habilidad" +
                        " de viajar en el tiempo. Su resistencia le permitió luchar contra todo el" +
                        " ejército de Gigantes de Hielo durante nueve meses sin ningún tipo de " +
                        "sustento o descanso; Thor ha demostrado la capacidad de regenerar partes" +
                        " heridas de su cuerpo, Incluyendo miembros u órganos enteros, con la ayuda" +
                        " de fuerzas mágicas como Mjolnir.Thor tiene una velocidad, agilidad y" +
                        " reflejos sobrehumanos, lo que le permite desviar balas con su martillo," +
                        " y balancearlo o lanzarlo muchas veces a la velocidad de la luz."
            ),
            SuperHero(
                "Black Widow",
                "Marvel",
                "Natasha Romanoff",
                "https://i.pinimg.com/564x/02/40/36/02403623d4f822c615a89fd504d94894.jpg",
                "Natasha Romanoff  fue mejorada Biotecnología lo que hace que" +
                        " su cuerpo sea resistente al envejecimiento y las enfermedades y se " +
                        "recupera por encima de la tasa humana; así como el condicionamiento" +
                        " psicológico que suprime su memoria de los eventos verdaderos en lugar " +
                        "de los implantados del pasado sin la ayuda de medicamentos supresores del" +
                        " sistema especialmente diseñados.es una estratega, táctica y comandante " +
                        "de campo muy efectiva. Ella ha dirigido a los Vengadores e" +
                        " incluso a S.H.I.E.L.D. en una ocasión."
            ),
            SuperHero(
                "Hulk",
                "Marvel",
                "Bruce Banner",
                "https://images.wallpapersden.com/image/download/avengers-hulk-game_a21taGmUmZqaraWkpJRpbWWtaW1l.jpg",
                "Hulk no son solo músculos y quienes han seguido al personaje a lo" +
                          " largo de toda su historia sabrán que la importancia del Dr. Bruce " +
                          "Banner es esencial. No estamos hablando de un ser humano normal, sino " +
                          "de una mente científica privilegiada. El famoso Norman Osborn (Duende" +
                          " Verde) dirá de él que es «una mente tan brillante que no se puede medir " +
                          "en ninguna prueba de inteligencia conocida», ya que tiene experiencia y " +
                          "destreza en campos como la biología, la química, la ingeniería, la" +
                          " medicina y la física nuclear. Gracias a ese talento, participará" +
                          " en algunos proyectos junto a Tony Stark"
            ),
            SuperHero(
                "Doctor Strange",
                "Marvel",
                "Stephen Strange",
                "https://i.pinimg.com/564x/9c/a9/a1/9ca9a1c0411adc3fb24238b9215b4f34.jpg",
                "Dr. Strange es el Hechicero Supremo, protector principal de la " +
                        "Tierra contra las amenazas mágicas y místicas. Inspirado en historias de magia negra"
            ),
            SuperHero(
                "Superman ",
                "DC",
                "ClarK Kent",
                "https://i.pinimg.com/564x/96/a2/29/96a229f3bc13b848812f729062762a10.jpg",
                "Superman nació como Kal-El, único sobreviviente de un planeta distante " +
                        "llamado Krypton. Su padre, Jor-El, lo colocó en una nave espacial" +
                        " con rumbo a la Tierra, cuando se dio cuenta de que su planeta sería" +
                        " destruido. Kal-El aterrizó en Estados Unidos y fue criado como un niño " +
                        "normal con el nombre de Clark Kent. Descubrió sus poderes cuando era un " +
                        "adolescente, y decidió dedicarse a la verdad, la justicia y el estilo de" +
                        " vida estadounidense. Bajo la apariencia de Clark Kent, tomó un trabajo" +
                        " como reportero para el Daily Planet, un periódico en la ciudad " +
                        "ficticia de Metropolis."
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                "https://images.wallpapersden.com/image/download/batman-art-2020-dc-comic_bGhqaGuUmZqaraWkpJRpbWWtaW1l.jpg",
                "La identidad secreta de Batman es Bruce Wayne, un multimillonario " +
                        "magnate empresarial y filántropo dueño de Empresas Wayne en Gotham City" +
                        "Es considerado como uno de los mejores detectives del planeta. Batman posee" +
                        " una regla por la cual es conocido y temido por los criminales de la ciudad. " +
                        "Batman no mata, pero si sabe hacer daño, ya que se vale de cualquier método" +
                        " para atrapar a los criminales u obtener la información que necesita de ellos." +
                        " Incluyendo a veces la intimidación y la tortura física."

            ),
            SuperHero(
                " Wonder Woman ",
                "DC",
                "Diana Prince",
                "https://www.elimparcial.com/__export/1603298520818/sites/elimparcial/img/2020/10/21/captura_de_pantalla_2020-10-21_a_las_9_39_52_a_m__1.png_1359985867.png",
                "La Mujer Maravilla es la princesa Diana de Temiscira (Diana Prince)." +
                        " Hija de Hipólita, reina de las Amazonas, y de Zeus, el más poderoso" +
                        " de los dioses del Olimpo"
            ), SuperHero(
                " Linterna Verde",
                "DC",
                "Hal Jordan",
                "https://cdn.shopify.com/s/files/1/0025/9384/9457/files/captura_de_pantalla_2018-08-16_a_laxsx_11_26_16.png_423682103_480x480.png?v=1632781810",
                "Harold Jordan, nació en Ciudad Costera, el nombre de sus padres son Martin " +
                        "Jordan y Jessica Jordan.El anillo de poder eligió a Hal Jordan por su " +
                        "habilidad para superar un gran temor. El anillo de Linterna Verde y sus " +
                        "habilidades le fueron explicados a él en persona, y él heredó el manto de" +
                        " Linterna Verde tras la muerte de Abin-Sur. Actuando como un agente de policía inter-galáctica"
            ),
            SuperHero(
                "Flash",
                "DC",
                "Barry Allen",
                "https://cdn.shopify.com/s/files/1/0025/9384/9457/files/FLASH-EL-COMIC-1-1024x901_480x480.jpg?v=1632781768",
                "Apodado el Corredor Escarlata, todas las encarnaciones del Flash poseen " +
                        "súper velocidad, que incluye la capacidad de correr, moverse y pensar" +
                        " extremadamente rápido, también puede atravesar la materia sólida, usar " +
                        "reflejos sobrehumanos y aparentemente violar ciertas leyes de la física," +
                        " como superar la velocidad de la luz."
            )
        )

    }
}