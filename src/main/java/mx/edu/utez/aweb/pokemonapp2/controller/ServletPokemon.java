package mx.edu.utez.aweb.pokemonapp2.controller;


import mx.edu.utez.aweb.pokemonapp2.model.pokemon.BeanPokemon;
import mx.edu.utez.aweb.pokemonapp2.service.pokemon.ServicePokemon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name="ServletPokemon",
urlPatterns = {
        "/get-pokemons",
        "/add-pokemon",
        "/create-pokemon",
        "/update-pokemon",
        "/get-pokemon"
        })
public class ServletPokemon extends HttpServlet {
    Logger logger = Logger.getLogger("ServletPokemon");
    String action;
    String urlRedirect = "/get-pokemons";
    ServicePokemon servicePokemon = new ServicePokemon();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        action = request.getServletPath();
        logger.log(Level.INFO, "Path ->" + action);
        switch (action) {
            case "/get-pokemons":
                List<BeanPokemon> pokemons = servicePokemon.getAll();
                System.out.println(pokemons.size());
                request.setAttribute("pokemons", servicePokemon.getAll());
                urlRedirect = "/views/pokemon/index.jsp";
                break;

            case "/create-pokemon":
                urlRedirect = "/views/pokemon/create.jsp";
                break;

            default:
                request.setAttribute("pokemons", servicePokemon.getAll());
                urlRedirect = "/get-pokemons";
                break;
        }
        request.getRequestDispatcher(urlRedirect).forward(request, response);
    }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                request.setCharacterEncoding("UTF-8");
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html");
                action = request.getServletPath();

                switch (action) {
                    case "/add-pokemon":
                        String nombre = request.getParameter("name");
                        String salud = request.getParameter("health");
                        String poder = request.getParameter("power");
                        String peso = request.getParameter("weight");
                        String altura = request.getParameter("height");
                        String tipo = request.getParameter("pokemonType");
                        System.out.println(nombre);
                        System.out.println(salud);
                        System.out.println(poder);
                        System.out.println(peso);
                        System.out.println(altura);
                        System.out.println(tipo);
                        break;
                    default:
                        urlRedirect = "/get-pokemons";
                        break;
                }
                response.sendRedirect(request.getContextPath() + urlRedirect);
            }
        }

