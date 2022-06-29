package mx.edu.utez.aweb.pokemonapp2.controller;


import mx.edu.utez.aweb.pokemonapp2.service.pokemon.ServicePokemon;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.logging.Logger;

@WebServlet(name="ServletPokemon",
urlPatterns = {
        "/get-pokemons",
        "/add-pokemon",
        "/update-pokemon",
        "/get-pokemon"
        })
public class ServletPokemon extends HttpServlet {
    Logger logger = Logger.getLogger("ServletPokemon");
    String action;
    String urlRedirect = "/get-pokemons";
    ServicePokemon servicePokemon = new ServicePokemon();

    @Override
    protected void doGet(HttpServlettRequest request, HttpServeltResponse response)
        throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        action = request.getServletPath();
        logger.log(Level.INFO,"Path ->"+action);
        switch (action) {
            case "/get-pokemons":
                request.setAttribute("pokemons",servicePokemon.getAll());
                urlRedirect = "/WEB-INF/views/pokemos/index.jsp";
                break;
            default:
                request.setAttribute("pokemons",servicePokemon.getAll());
                urlRedirect = "/get-pokemons";
                break;
        }
    }
}
