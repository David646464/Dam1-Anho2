package practicas;

import java.util.HashMap;
import java.util.Map;

public class PullAhorcado {
        String[] Animales = {
                        "perro",
                        "gato",
                        "cuervo",
                        "tigre",
                        "leon",
                        "elefante",
                        "jirafa",
                        "cebra",
                        "rinoceronte",
                        "hipopotamo",
                        "cocodrilo",
                        "serpiente",
                        "tortuga",
                        "tiburon",
                        "ballena"
        };

        String[] Marvel = {
                        "spider man",
                        "thor",
                        "captain america",
                        "black widow",
                        "hulk",
                        "wolverine",
                        "avengers",
                        "x men",
                        "guardians of the galaxy",
                        "thanos",
                        "infinity stones",
                        "stan lee",
                        "superheroes",
                        "villanos"
        };

        String[] Videojuegos = {
                        "zelda",
                        "halo",
                        "call of duty",
                        "minecraft",
                        "fortnite",
                        "overwatch",
                        "assassin's creed",
                        "final fantasy",
                        "super smash bros",
                        "grand theft auto",
                        "the witcher",
                        "destiny",
                        "league of legends",
                        "dark souls",
                        "fallout"
        };

        String[] Hogar = {
                        "sofa",
                        "silla",
                        "cama",
                        "televisor",
                        "refrigerador",
                        "microondas",
                        "cocina",
                        "lavadora",
                        "escritorio",
                        "lampara",
                        "cortinas",
                        "espejo",
                        "estanteria",
                        "muebles",
                        "vajilla"
        };

        String[] Naturaleza = {
                        "montana",
                        "rio",
                        "mar",
                        "cielo",
                        "flor",
                        "animales",
                        "bosque",
                        "amanecer",
                        "atardecer",
                        "playa",
                        "lago",
                        "cascada",
                        "desierto",
                        "pradera",
                        "glaciar"
        };

        String[] Nombres = {
                        "maria",
                        "pedro",
                        "ana",
                        "luis",
                        "laura",
                        "carlos",
                        "sofia",
                        "daniel",
                        "isabel",
                        "antonio",
                        "marta",
                        "javier",
                        "elena",
                        "diego",
                        "carmen"
        };

        String[] Ubicaciones = {
                        "paris",
                        "tokio",
                        "londres",
                        "roma",
                        "sidney",
                        "barcelona",
                        "cancun",
                        "los angeles",
                        "rio de janeiro",
                        "estambul",
                        "atenas",
                        "ciudad de mexico",
                        "singapur",
                        "toronto",
                        "dubai"
        };

        String[] Animes = {
                        "dragon ball",
                        "one piece",
                        "death note",
                        "attack on titan",
                        "my hero academia",
                        "fullmetal alchemist",
                        "sword art online",
                        "demon slayer",
                        "one punch man",
                        "tokyo ghoul",
                        "hunter x hunter",
                        "neon genesis evangelion",
                        "cowboy bebop",
                        "jojos bizarre adventure",
                        "bleach"
        };

        String[] Deportes = {
                        "baloncesto",
                        "tenis",
                        "beisbol",
                        "golf",
                        "atletismo",
                        "natacion",
                        "ciclismo",
                        "voleibol",
                        "hockey sobre hielo",
                        "rugby",
                        "boxeo",
                        "esqui",
                        "motocross",
                        "ajedrez",
                        "surf"
        };

        String[] Ciudades = {
                        "paris",
                        "londres",
                        "roma",
                        "tokio",
                        "sidney",
                        "barcelona",
                        "cancun",
                        "los angeles",
                        "rio de janeiro",
                        "estambul",
                        "atenas",
                        "ciudad de mexico",
                        "singapur",
                        "toronto",
                        "dubai"
        };

        String[] Escolar = {
                        "profesor",
                        "estudiante",
                        "clase",
                        "escuela",
                        "pizarra",
                        "tarea",
                        "examen",
                        "mochila",
                        "cuaderno",
                        "lapiz",
                        "regla",
                        "calculadora",
                        "biblioteca",
                        "educacion",
                        "recreo"
        };

        String[] Informatica = {
                        "programacion",
                        "software",
                        "hardware",
                        "internet",
                        "redes",
                        "algoritmo",
                        "base de datos",
                        "ciberseguridad",
                        "inteligencia artificial"
        };

        Map<Integer, String> map1 = new HashMap<Integer, String>();
        Map<Integer, String[]> map2 = new HashMap<Integer, String[]>();

        public PullAhorcado() {
                map1.put(0, "Animales");
                map1.put(1, "Marvel");
                map1.put(2, "Videojuegos");
                map1.put(3, "Hogar");
                map1.put(4, "Naturaleza");
                map1.put(5, "Nombres");
                map1.put(6, "Ubicaciones");
                map1.put(7, "Animes");
                map1.put(8, "Deportes");
                map1.put(9, "Ciudades");
                map1.put(10, "Escolar");
                map1.put(11, "Informatica");
                map2.put(0, Animales);
                map2.put(1, Marvel);
                map2.put(2, Videojuegos);
                map2.put(3, Hogar);
                map2.put(4, Naturaleza);
                map2.put(5, Nombres);
                map2.put(6, Ubicaciones);
                map2.put(7, Animes);
                map2.put(8, Deportes);
                map2.put(9, Ciudades);
                map2.put(10, Escolar);
                map2.put(11, Informatica);

        }

        public String categoriaPull(int num) {

                return map1.get(num);
        }

        public String[] palabraPull() {
                int numeroAleatorio1 = (int) (Math.random() * (map2.size() ));
                int numeroAleatorio2 = (int) (Math.random() * (map2.get(numeroAleatorio1).length) );
                String[] Aux = { categoriaPull(numeroAleatorio1), map2.get(numeroAleatorio1)[numeroAleatorio2] };
                return Aux;
        }

}
