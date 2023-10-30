package com.example.ejercicioentregapedro;

import java.util.ArrayList;

public class FilmDataSource {
    public static ArrayList<Film> films;
    public static void Initialize() {

        films=new ArrayList<>();

        films.add(new Film(R.drawable.endgamee,"End Game","Anthony y Joe Russo",2019,1,2,"https://www.imdb.com/title/tt4154796/?ref_=hm_tpks_tt_i_6_pd_tp1_pbr_ic","Los vengadores viajan en el tiempo para recuperar las gemas del infinito y poder derrotar a Thanos"));
        films.add(new Film(R.drawable.inter,"Interstellar","Christopher Nolan",1984,3,2,"http://www.imdb.com/title/tt0816692","Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento por asegurar la supervivencia de la humanidad."));
        films.add(new Film(R.drawable.regresoalfuturo,"Back to the future","Robert Zemeckis",1985,3,2,"http://www.imdb.com/title/tt0088763","Marty McFly, es enviado 30 años al pasado en un viaje en el tiempo en el DeLorean"));
        films.add(new Film(R.drawable.oppenheimer,"Oppenheimer","Christopher Nolan",2023,2,2,"https://www.imdb.com/title/tt15398776/?ref_=hm_tpks_tt_i_3_pd_tp1_pbr_ic","Oppenheimer es una pelicula biográfica de suspenso británicoestadounidense de 2023, escrita y dirigida por Christopher Nolan. Basada en American Prometheus, una biografía de 2005 escrita por Kai Bird y Martin J."));
        films.add(new Film(R.drawable.joker,"Joker","Todd Phillips",2019,2,1,"https://www.imdb.com/title/tt7286456/?ref_=hm_tpks_tt_i_4_pd_tp1_pbr_ic","Joker es una película de suspense psicológico estadounidense de 2019 dirigida y producida por Todd Phillips, quien coescribió el guion con Scott Silver. La película, basada en personajes de DC Comics, está protagonizada por Joaquin Phoenix como El Joker y proporciona una historia de su origen alternativa para el personaje. "));
        films.add(new Film(R.drawable.ellobowall,"El lobo de Wall Street","Martin Scorsese",2014,1,2,"https://www.imdb.com/title/tt0993846/?ref_=hm_tpks_tt_i_4_pd_tp1_pbr_ic","El lobo de Wall Street —cuyo título original en inglés es The Wolf of Wall Street— es una película estadounidense de comedia negra criminal biográfica de 2013 dirigida por Martin Scorsese y escrita por Terence Winter, basada en las memorias de Jordan Belfort del mismo nombre de 2007."));
       /* films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());
        films.add(new Film());*/

    }
}
